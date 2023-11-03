package com.example.pgpbacara7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.pgpbacara7.databinding.ActivityExploreBinding;

import java.util.ArrayList;
import java.util.List;

public class ExploreActivity extends AppCompatActivity {
    private ActivityExploreBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityExploreBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<Destination> destinationList = new ArrayList<>();

        Destination surabaya1 = new Destination("Surabaya", "Economy Class Ticket");
        Destination surabaya2 = new Destination("Surabaya", "Business Class Ticket");
        Destination jakarta1 = new Destination("Jakarta", "Economy Class Ticket");
        Destination jakarta2 = new Destination("Jakarta", "Business Class Ticket");
        Destination bandung1 = new Destination("Bandung", "Economy Class Ticket");
        Destination bandung2 = new Destination("Bandung", "Business Class Ticket");
        Destination yogyakarta1 = new Destination("Yogyakarta", "Economy Class Ticket");
        Destination yogyakarta2 = new Destination("Yogyakarta", "Business Class Ticket");
        Destination medan1 = new Destination("Medan", "Economy Class Ticket");
        Destination medan2 = new Destination("Medan", "Business Class Ticket");
        Destination semarang1 = new Destination("Semarang", "Economy Class Ticket");
        Destination semarang2 = new Destination("Semarang", "Business Class Ticket");

        destinationList.add(surabaya1);
        destinationList.add(surabaya2);
        destinationList.add(jakarta1);
        destinationList.add(jakarta2);
        destinationList.add(bandung1);
        destinationList.add(bandung2);
        destinationList.add(yogyakarta1);
        destinationList.add(yogyakarta2);
        destinationList.add(medan1);
        destinationList.add(medan2);
        destinationList.add(semarang1);
        destinationList.add(semarang2);
        DestinationAdapter adapterDestination = new DestinationAdapter(destinationList);
        binding.rvDestination.setAdapter(adapterDestination);
        binding.rvDestination.setLayoutManager(new LinearLayoutManager(this));


    }
}