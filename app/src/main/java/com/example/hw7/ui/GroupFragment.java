package com.example.hw7.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hw7.GridFragment;
import com.example.hw7.R;
import com.example.hw7.TagsFragment;
import com.example.hw7.adapter.ViewPagerAdapter;
import com.example.hw7.databinding.FragmentGroupBinding;
import com.example.hw7.databinding.FragmentHeartBinding;
import com.example.hw7.model.Tabs;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;


public class GroupFragment extends Fragment {
    private FragmentGroupBinding binding;
    private ViewPagerAdapter adapter;
    private ArrayList<Tabs> fragments;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding= FragmentGroupBinding.inflate(LayoutInflater.from(getContext()),container,false);
        return binding.getRoot();


    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fragments=new ArrayList<>();
        fragments.add(new Tabs(new GridFragment(),R.drawable.ic_grid));
        fragments.add(new Tabs(new TagsFragment(),R.drawable.ic_tags));

        adapter=new ViewPagerAdapter(this);
        adapter.setFragments(fragments);
        binding.viewPager.setAdapter(adapter);
       /* binding.tabLayout.getTabAt(0).setIcon(R.drawable.ic_grid);
        binding.tabLayout.getTabAt(1).setIcon(R.drawable.ic_tags);*/
        /*binding.tabLayout.addTab(binding.tabLayout.newTab().setIcon(R.drawable.ic_grid));
        binding.tabLayout.addTab(binding.tabLayout.newTab().setIcon(R.drawable.ic_tags));*/

        new TabLayoutMediator(binding.tabLayout, binding.viewPager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                tab.setIcon(fragments.get(position).getIcon());

            }
        }).attach();
    }


}