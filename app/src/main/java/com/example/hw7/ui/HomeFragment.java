package com.example.hw7.ui;

import android.graphics.ColorSpace;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7.HomeAdapter;
import com.example.hw7.OnClick;
import com.example.hw7.Publication;
import com.example.hw7.R;
import com.example.hw7.databinding.FragmentHomeBinding;

import java.util.ArrayList;


public class HomeFragment extends Fragment implements OnClick {
    private FragmentHomeBinding binding;
    private ArrayList<Publication> publications;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        LoadData();
        HomeAdapter adapter=new HomeAdapter(publications,this);
        binding.recyclerPublication.setAdapter(adapter);
    }

    private void LoadData() {
        publications=new ArrayList<>();
        publications.add(new Publication("joshua_l The game in Japan " +
                "was amazing and I want to share some photos","September 19",R.drawable.ic_photo));
        publications.add(new Publication("joshua_l The game in Japan " +
                "was amazing and I want to share some photos","September 19",R.drawable.ic_photo));
    }

    @Override
    public void onClick() {

    }


}