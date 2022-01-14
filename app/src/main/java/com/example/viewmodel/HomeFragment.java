package com.example.viewmodel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewmodel.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    private HomeViewModel homeViewModel;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater);
        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        binding.nameTv.setText(homeViewModel.getName());
        binding.changeNameBtn.setOnClickListener(view -> {
            final String name = binding.nameEt.getText().toString();
            homeViewModel.setName(name);
            binding.nameTv.setText(homeViewModel.getName());
        });
        return binding.getRoot();
    }
}