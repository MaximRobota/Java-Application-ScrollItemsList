package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        List<String> items = new ArrayList<>();
        for (int i = 0; i < 990; i++) {
            items.add("This is item #"+i);
        }
        recyclerView.setAdapter(new MyAdapter(items));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
