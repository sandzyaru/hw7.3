package com.example.hw7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7.databinding.FragmentGridBinding;
import com.example.hw7.databinding.FragmentTagsBinding;

import java.util.ArrayList;


public class TagsFragment extends Fragment implements OnClick {
    private FragmentTagsBinding binding;
    private ArrayList<ImageView> imageViews;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentTagsBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        MainPhotoAdapter adapter=new MainPhotoAdapter(imageViews,this);
        binding.recyclerTags.setAdapter(adapter);
    }

    private void LoadData() {
        imageViews=new ArrayList<>();
        imageViews.add(new ImageView(R.drawable.ic_group1));
        imageViews.add(new ImageView(R.drawable.ic_group2));
        imageViews.add(new ImageView(R.drawable.ic_group3));
        imageViews.add(new ImageView(R.drawable.ic_group4));
        imageViews.add(new ImageView(R.drawable.ic_group5));
        imageViews.add(new ImageView(R.drawable.ic_group6));
        imageViews.add(new ImageView(R.drawable.ic_group7));
        imageViews.add(new ImageView(R.drawable.ic_group8));
        imageViews.add(new ImageView(R.drawable.ic_group9));
    }

    @Override
    public void onClick() {

    }
}