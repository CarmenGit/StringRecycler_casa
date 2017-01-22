package com.example.carmen.stringrecyclerview;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.carmen.stringrecyclerview.adapters.RecyclerAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recy;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> lista = new ArrayList<>();
        lista.add("Pepa");
        lista.add("Juan");
        lista.add("Juanita");
        lista.add("Lola");
        lista.add("Pepa");
        lista.add("Juan");
        lista.add("Juanita");
        lista.add("Lola");


        adapter = new RecyclerAdapter(lista);

        recy = (RecyclerView)findViewById(R.id.ReList);

        recy.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(this);
        recy.setLayoutManager(mLayoutManager);
        recy.setAdapter(adapter);

    }
    public addPersona(){

    }
}
