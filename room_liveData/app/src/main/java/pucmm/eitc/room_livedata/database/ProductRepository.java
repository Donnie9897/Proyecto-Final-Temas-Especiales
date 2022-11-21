package pucmm.eitc.room_livedata.database;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import java.util.List;

import pucmm.eitc.room_livedata.Product;

public class ProductRepository {

    private ProductDao productDao;
    private LiveData<List<Product>> products;

    public ProductRepository(Application application) {
        ProductDatabase db = ProductDatabase.getInstance(application);
        productDao = db.productDao();
        products = productDao.getProducts();
    }

    public LiveData<List<Product>> getProducts() {
        return products;
    }

    public void insert (Product product) {
        new insertAsyncTask(productDao).execute(product);
    }

    private class insertAsyncTask extends AsyncTask<Product, Void, Void> {
        private ProductDao asyncTaskDao;

        insertAsyncTask(ProductDao dao) {
            asyncTaskDao = dao;
        }

        @Override
        protected Void doInBackground(final Product... params) {
            asyncTaskDao.insert(params[0]);
            return null;
        }
    }
}
