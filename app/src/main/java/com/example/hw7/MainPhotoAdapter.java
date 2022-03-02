package com.example.hw7;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.hw7.databinding.ItemPhotosBinding;

import java.util.ArrayList;

public class MainPhotoAdapter extends RecyclerView.Adapter<MainPhotoAdapter.MainPhotoViewHolder> {
    private ArrayList<ImageView> imageViews;
    private OnClick onClick;

    public MainPhotoAdapter(ArrayList<ImageView> imageViews, OnClick onClick) {
        this.imageViews=imageViews;
        this.onClick=onClick;
    }

    @NonNull
    @Override
    public MainPhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MainPhotoAdapter.MainPhotoViewHolder(ItemPhotosBinding.
                inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainPhotoViewHolder holder, int position) {
        holder.bind(imageViews.get(position));
    }

    @Override
    public int getItemCount() {
        return imageViews.size();
    }

    public class MainPhotoViewHolder extends RecyclerView.ViewHolder{
        private ItemPhotosBinding binding;
        public MainPhotoViewHolder( @NonNull ItemPhotosBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(com.example.hw7.ImageView imageView) {
            binding.itemPhotoGroup.setImageResource(imageView.getImageview());
        }
    }
}
