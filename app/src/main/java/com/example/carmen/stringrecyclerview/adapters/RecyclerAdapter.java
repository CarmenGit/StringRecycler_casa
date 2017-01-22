package com.example.carmen.stringrecyclerview.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.carmen.stringrecyclerview.R;

import java.util.List;

/**
 * Created by Carmen on 21/01/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter {
private List<String> datos;

    public RecyclerAdapter (List<String> datos){
        this.datos=datos;
    }

    public static class nameViewHolder extends RecyclerView.ViewHolder {
        // Campos respectivos de un item

        public TextView txtPersona;

        public nameViewHolder(View v) {
            super(v);
            txtPersona = (TextView) v.findViewById(R.id.persona);

        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.persona_row, parent, false);
        // set the view's size, margins, paddings and layout parameters
        nameViewHolder vh = new nameViewHolder(v);
        return vh;

    }
    public void add(int position, String item) {
       datos.add(position, item);
        notifyItemInserted(position);
    }

    public void remove(String item) {
        int position = datos.indexOf(item);
        datos.remove(position);
        notifyItemRemoved(position);
    }


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        final String name = datos.get(position);
        nameViewHolder h= (nameViewHolder)holder;
        h.txtPersona.setText(datos.get(position));
        h.txtPersona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(name);
            }
        });


    }

    @Override
    public int getItemCount() {

        return datos.size();
    }
}
