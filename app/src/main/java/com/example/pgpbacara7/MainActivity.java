package com.example.pgpbacara7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.example.pgpbacara7.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());


        NavController navController =
                NavHostFragment.findNavController(getSupportFragmentManager()
                        .findFragmentById(R.id.nav_host_fragment));
        NavigationUI.setupWithNavController(binding.bottomNavigationView,
                navController);

        setContentView(binding.getRoot());

    }
}