package com.aziz.miniapp.ui;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.aziz.miniapp.R;

import java.util.ArrayList;
import java.util.List;

class FristActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    List<String> strings;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_recycle_);
        strings = new ArrayList<>();
        strings.add("Bikes Neme");
        strings.add("Catagory");
        strings.add("Description");
        strings.add("Price");
        mAdapter = new MyAdapter(strings);
        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(FristActivity.this));
        strings.notify();
    }
}