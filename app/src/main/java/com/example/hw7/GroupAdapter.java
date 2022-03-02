package com.example.hw7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw7.databinding.ItemPublicationBinding;

public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.GroupViewHolder>{

    @NonNull
    @Override
    public GroupViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;//new TrackListViewHolder(.inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroupViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class GroupViewHolder extends RecyclerView.ViewHolder {
         public GroupViewHolder(@NonNull View itemView) {
             super(itemView);
         }
     }
}