package pucmm.eitc.room_livedata.database;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

import pucmm.eitc.room_livedata.Product;

@Dao
public interface ProductDao {

    @Insert
    void insert(Product product);

    @Query("SELECT * FROM tbl_products")
    LiveData<List<Product>> getProducts();
}
