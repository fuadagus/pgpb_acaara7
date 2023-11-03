package com.example.pgpbacara7;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavAction;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pgpbacara7.databinding.FragmentOrderBinding;
import com.example.pgpbacara7.databinding.FragmentOrderBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link OrderFragment} factory method to
 * create an instance of this fragment.
 */
public class OrderFragment extends Fragment {

    private FragmentOrderBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentOrderBinding.inflate(getLayoutInflater());
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SavedStateHandle savedStateHandle = NavHostFragment.findNavController(this).getCurrentBackStackEntry().getSavedStateHandle();

        if (savedStateHandle != null) {

            LiveData<String> jenisTiketLiveData = savedStateHandle.getLiveData("jenisTiket");


            jenisTiketLiveData.observe(getViewLifecycleOwner(), new Observer<String>() {
                        @Override
                        public void onChanged(String jenisTiket) {

                            binding.jenisTiket.setText(jenisTiket);
                        }

        });}

        binding.jenisTiket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavDirections action = OrderFragmentDirections.actionOrderFragmentToChooseTicketFragment();
                NavHostFragment.findNavController(OrderFragment.this).navigate(action);

            }
        });


        binding.btnOrder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                NavHostFragment.findNavController(OrderFragment.this).navigateUp();

            }
        });
    }


}

