package pucmm.eitc.room_livedata;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "tbl_products")
public class Product{

    @PrimaryKey
    private long id;

    @NonNull
    private String description;
    @NonNull
    private String name;
    @NonNull
    private float price;

    public Product(long id, @NonNull String description, @NonNull String name, float price) {
        this.id = id;
        this.description = description;
        this.name = name;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
