package com.example.hw7.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.hw7.R;
import com.example.hw7.model.Tabs;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    private ArrayList<Tabs> fragments;
    private int NumbOfTabs;

    public ViewPagerAdapter(@NonNull Fragment fragment) {
        super(fragment);
    }
    public void setFragments (ArrayList<Tabs> fragments){
        this.fragments=new ArrayList<>();
        this.fragments.addAll(fragments);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return fragments.get(position).getFragments();
    }

    @Override
    public int getItemCount() {
        return fragments.size();
    }
}
