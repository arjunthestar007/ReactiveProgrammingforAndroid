package com.example.arjun27.rxjava;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class StockDataAdapter extends RecyclerView.Adapter<StockUpdateViewHolder> {
    private final List<Category> data = new ArrayList<>();

    @Override
    public StockUpdateViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.stock_update_item, parent, false);
        StockUpdateViewHolder vh = new StockUpdateViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(StockUpdateViewHolder holder, int position) {
        Category stockUpdate = data.get(position);
        holder.setStockSymbol(stockUpdate.getBody());
//        holder.setPrice(stockUpdate.getTitle());
//        holder.setDate(stockUpdate.getDate());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

//    public void add(StockUpdate stockSymbol) {
//        this.data.add(stockSymbol);
//        notifyItemInserted(data.size() - 1);
//    }

    public void add(Category category) {
        this.data.add(category);
        notifyItemInserted(data.size() - 1);
    }
}
