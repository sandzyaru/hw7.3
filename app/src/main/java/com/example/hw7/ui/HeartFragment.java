package com.example.hw7.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7.HeartAdapter;
import com.example.hw7.HomeAdapter;
import com.example.hw7.OnClick;
import com.example.hw7.Publication;
import com.example.hw7.R;
import com.example.hw7.YourPostsLiked;
import com.example.hw7.databinding.FragmentHeartBinding;
import com.example.hw7.databinding.FragmentHomeBinding;

import java.util.ArrayList;

public class HeartFragment extends Fragment implements OnClick {
    private FragmentHeartBinding binding;
    private ArrayList<YourPostsLiked> postsLiked;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentHeartBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        HeartAdapter adapter=new HeartAdapter(postsLiked,this);
        binding.recyclerPostsLiked.setAdapter(adapter);
    }

    private void LoadData() {
        postsLiked = new ArrayList<>();
        postsLiked.add(new YourPostsLiked(R.drawable.ic_woman,R.drawable.ic_liked_photo,R.drawable.ic__rectangle_heart));
        postsLiked.add(new YourPostsLiked(R.drawable.ic_woman,R.drawable.ic_liked_photo,R.drawable.ic__rectangle_heart));
        postsLiked.add(new YourPostsLiked(R.drawable.ic_woman,R.drawable.ic_liked_photo,R.drawable.ic__rectangle_heart));
        postsLiked.add(new YourPostsLiked(R.drawable.ic_woman,R.drawable.ic_liked_photo,R.drawable.ic__rectangle_heart));
    }

    @Override
    public void onClick() {

    }

}