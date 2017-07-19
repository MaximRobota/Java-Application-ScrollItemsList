package com.example.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by моуо on 06.07.2017.
 */

public class MyReryclerViewHolder extends RecyclerView.ViewHolder {
    private TextView textView;
    public MyReryclerViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.text_view);
    }
    public void setText(String text){
        textView.setText(text);
    }
}
