package com.example.pgpbacara7;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavHostController;
import androidx.navigation.fragment.NavHostFragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.pgpbacara7.databinding.FragmentChooseTicketBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChooseTicketFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChooseTicketFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ChooseTicketFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ChooseTicketFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChooseTicketFragment newInstance(String param1, String param2) {
        ChooseTicketFragment fragment = new ChooseTicketFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private final String[] tiket = {
            "First Class Ticket",
            "Business Class Ticket",
            "Economy Class Ticket"
    };
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        FragmentChooseTicketBinding binding = FragmentChooseTicketBinding.inflate(inflater, container, false);
        ArrayAdapter<String> adapterTiket =
                new ArrayAdapter<>(requireContext(), android.R.layout.simple_spinner_item, tiket);
        adapterTiket.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        binding.spinnerTiket.setAdapter(adapterTiket);
        binding.btnOrder3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               NavController navController = NavHostFragment.findNavController(ChooseTicketFragment.this);
                NavBackStackEntry previousBackStackEntry = navController.getPreviousBackStackEntry();
                if (previousBackStackEntry != null) {
                    SavedStateHandle savedStateHandle = previousBackStackEntry.getSavedStateHandle();
                    if (savedStateHandle != null) {
                        savedStateHandle.set("jenisTiket", binding.spinnerTiket.getSelectedItem().toString());
                        Log.d("Jenis", "saved: " + binding.spinnerTiket.getSelectedItem().toString());
                    }
                }
                navController.navigateUp();
            }
        });
        return binding.getRoot();
    }
}