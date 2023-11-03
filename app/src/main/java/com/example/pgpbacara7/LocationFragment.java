package com.example.pgpbacara7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pgpbacara7.databinding.FragmentHomeBinding;
import com.example.pgpbacara7.databinding.FragmentLocationBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LocationFragment} factory method to
 * create an instance of this fragment.
 */
public class LocationFragment extends Fragment {

    private FragmentLocationBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentLocationBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        NavDirections action = LocationFragmentDirections.
                actionLocationFragmentToOrderFragment();
        binding.btnOrder2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(LocationFragment.this).navigate(action);
            }
        });
    }
}