package com.example.lesson2.boarding;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.lesson2.R;
import com.example.lesson2.databinding.FragmentMainBoardBinding;
import com.example.lesson2.model.ViewPagerModel;

import java.util.ArrayList;


public class MainBoardFragment extends Fragment {
    private FragmentMainBoardBinding binding;
    ViewPagerAdapter adapter;
    ArrayList<ViewPagerModel> list = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMainBoardBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        list.add(new ViewPagerModel("1", "1", R.drawable.todo_illustration));
        list.add(new ViewPagerModel("2", "2", R.drawable.todo_illustration));
        list.add(new ViewPagerModel("3", "3", R.drawable.todo_illustration));
        adapter = new ViewPagerAdapter(list);
        binding.viewpager.setAdapter(adapter);
        binding.springDotsIndicator.setViewPager2(binding.viewpager);
    }
}