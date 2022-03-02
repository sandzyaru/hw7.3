package com.example.hw7;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw7.databinding.ItemHeartBinding;
import com.example.hw7.databinding.ItemPublicationBinding;
import com.example.hw7.ui.HeartFragment;

import java.util.ArrayList;

public class HeartAdapter extends RecyclerView.Adapter<HeartAdapter.HeartViewHolder> {
    private ArrayList<YourPostsLiked> postsLiked;
    private OnClick onClick;

    public HeartAdapter(ArrayList<YourPostsLiked> postsLiked, OnClick onClick) {
        this.postsLiked=postsLiked;
        this.onClick=onClick;
    }

    @NonNull
    @Override
    public HeartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HeartAdapter.HeartViewHolder(ItemHeartBinding.
                inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HeartViewHolder holder, int position) {
        holder.bind(postsLiked.get(position));
    }

    @Override
    public int getItemCount() {
        return postsLiked.size();
    }

    class HeartViewHolder extends RecyclerView.ViewHolder {
        private ItemHeartBinding binding;
        public HeartViewHolder(@NonNull ItemHeartBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(YourPostsLiked yourPostsLiked) {
            binding.woman.setImageResource(yourPostsLiked.getWoman());
            binding.likedPhoto.setImageResource(yourPostsLiked.getLikedPhoto());
            binding.rectangleHeart.setImageResource(yourPostsLiked.getRectangleHeart());
        }
    }
}
