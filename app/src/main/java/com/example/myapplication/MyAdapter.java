package com.example.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by моуо on 06.07.2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyReryclerViewHolder> {

    private List<String> items = new ArrayList<>();

    public MyAdapter(List<String> items) {
        this.items = items;
    }

    @Override
    public MyReryclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row,null);
        MyReryclerViewHolder viewHolder = new MyReryclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyReryclerViewHolder holder, int position) {
        holder.setText(items.get(position));
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
