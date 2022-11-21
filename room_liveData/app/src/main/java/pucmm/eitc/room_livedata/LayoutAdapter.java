package pucmm.eitc.room_livedata;

import android.app.Application;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import pucmm.eitc.room_livedata.database.ProductRepository;

public class LayoutAdapter extends RecyclerView.Adapter<LayoutAdapter.ItemViewHolder>{
    private final LayoutInflater inflater;
    private List<Product> products;

    LayoutAdapter(Context context) {
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public LayoutAdapter.ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = inflater.inflate(R.layout.item_layout, parent, false);
        return new ItemViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull LayoutAdapter.ItemViewHolder holder, int position) {
        /*if(products != null){
            Product product = products.get(position);
            holder.wordItemView.setText(product.getDescription());
            //Cambiar por name
            holder.wordItemView.setText(product.getDescription());
            //Cambiar por price
            holder.wordItemView.setText(product.getDescription());
        }else{
            holder.wordItemView.setText("No products added");
        }*/
    }

    @Override
    public int getItemCount() {
        if(products != null) {
            return products.size();
        }
        return 0;
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {
        //private final TextView wordItemView;

        private ItemViewHolder(View itemView) {
            super(itemView);
            //wordItemView = itemView.findViewById(R.id.button_first);
            //wordItemView = itemView.findViewById(R.id.button_first);
            //wordItemView = itemView.findViewById(R.id.button_first);
        }
    }
}
