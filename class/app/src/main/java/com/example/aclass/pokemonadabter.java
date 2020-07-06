package com.example.aclass;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class pokemonadabter extends RecyclerView.Adapter {

    ArrayList<pokmon> s;

    public pokemonadabter(ArrayList<pokmon> s) {
        this.s = s;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return s.size();
    }

    public static class viewHolder extends RecyclerView.ViewHolder{

        public viewHolder(@NonNull View itemView) { super(itemView); }
    }
}




