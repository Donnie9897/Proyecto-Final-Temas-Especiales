package pucmm.eitc.room_livedata.models;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import pucmm.eitc.room_livedata.Product;
import pucmm.eitc.room_livedata.database.ProductRepository;

public class ProductViewModel extends AndroidViewModel {
    private ProductRepository productRepository;
    private LiveData<List<Product>> products;

    public ProductViewModel(Application application) {
        super(application);
        this.productRepository = new ProductRepository(application);
        this.products = productRepository.getProducts();
    }

    public LiveData<List<Product>> getProducts(){
        return products;
    }

    public void insert(Product product){
        productRepository.insert(product);
    }
}
