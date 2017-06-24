package com.dl.recycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.dl.recycleview.WellRecycleView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mWellRecycleView;
    private LinearLayoutManager layoutManager;
    private MainAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWellRecycleView = (WellRecycleView) findViewById(R.id.well_recycleview);
        layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mWellRecycleView.setLayoutManager(layoutManager);
        adapter = new MainAdapter(this, DataUtils.getPeoples());
        mWellRecycleView.setAdapter(adapter);
    }
}
