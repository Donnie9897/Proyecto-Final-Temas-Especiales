package pucmm.eitc.room_livedata.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import pucmm.eitc.room_livedata.Product;

@Database(entities = {Product.class}, version = 1, exportSchema = false)
public abstract class ProductDatabase extends RoomDatabase {

    public abstract ProductDao productDao();
    private static  ProductDatabase instance;

    public static ProductDatabase getInstance(final Context context){
        if(instance == null){
            synchronized (ProductDatabase.class){
                if(instance == null){
                    instance = Room.databaseBuilder(context.getApplicationContext(),
                            ProductDatabase.class,"tbl_products")
                            .fallbackToDestructiveMigration()
                            .build();
                }
            }
        }
        return instance;
    }

}
