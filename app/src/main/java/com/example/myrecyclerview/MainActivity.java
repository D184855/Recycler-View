package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyAdapter myAdapter;
    List<Model> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        list = new ArrayList<Model>();

        list.add(new Model(R.drawable.img3,"title1"));
        list.add(new Model(R.drawable.img2, "Title 2"));
        list.add(new Model(R.drawable.img4, "Title 3"));
        list.add(new Model(R.drawable.img5, "Title 4"));
        list.add(new Model(R.drawable.img6, "Title 5"));
        list.add(new Model(R.drawable.img7, "Title 6"));
        list.add(new Model(R.drawable.img5, "Title 7"));
        list.add(new Model(R.drawable.img1, "Title 1"));
        list.add(new Model(R.drawable.img2, "Title 2"));
        list.add(new Model(R.drawable.img4, "Title 3"));
        list.add(new Model(R.drawable.img5, "Title 4"));
        list.add(new Model(R.drawable.img6, "Title 5"));
        list.add(new Model(R.drawable.img7, "Title 6"));
        list.add(new Model(R.drawable.img3, "Title 7"));

        myAdapter = new MyAdapter(MainActivity.this, list);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.setAdapter(myAdapter);
    }
}