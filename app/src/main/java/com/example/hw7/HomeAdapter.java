package com.example.hw7;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hw7.databinding.ItemPublicationBinding;
import com.example.hw7.ui.HomeFragment;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.HomeViewHolder> {
    private ArrayList<Publication> publications;
    private OnClick onClick;
    public  HomeAdapter (ArrayList<Publication> publications,OnClick onClick){
        this.publications=publications;
        this.onClick=onClick;
    }


    @NonNull
    @Override
    public HomeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HomeViewHolder(ItemPublicationBinding.
                inflate(LayoutInflater.from(parent.getContext()),parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder holder, int position) {
        holder.bind(publications.get(position));
    }

    @Override
    public int getItemCount() {
        return publications.size();
    }

    class HomeViewHolder extends RecyclerView.ViewHolder {
        private ItemPublicationBinding binding;
        public HomeViewHolder(@NonNull ItemPublicationBinding itemView) {
            super(itemView.getRoot());
            binding=itemView;
        }

        public void bind(Publication publication) {
            binding.postText.setText(publication.getPostText());
            binding.postData.setText(publication.getPostData());
            binding.photo.setImageResource(publication.getImage());
        }
    }
}
