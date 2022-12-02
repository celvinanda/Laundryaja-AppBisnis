package com.takisjoe.laundryajabisnis.domain.laundry.view.ui.add;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.takisjoe.laundryajabisnis.R;

import org.jetbrains.annotations.Contract;

public class AddLaundryFragment extends Fragment {

    private AddLaundryViewModel mViewModel;

    private FloatingActionButton fabAddLaundry;
    private TextView tvNameCustomer, tvAddressCustomer, tvWhatsappCustomer;
    private RecyclerView rvListLayanan;
    private Switch swFast;

    @NonNull
    @Contract(" -> new")
    public static AddLaundryFragment newInstance() {
        return new AddLaundryFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_laundry, container, false);
        
        tvNameCustomer = view.findViewById(R.id.tvNameCustomer);
        tvAddressCustomer = view.findViewById(R.id.tvAddressCustomer);
        tvWhatsappCustomer = view.findViewById(R.id.tvWhatsappCustomer);
        rvListLayanan = view.findViewById(R.id.rvListLayanan);
        swFast = view.findViewById(R.id.swFast);
        fabAddLaundry = view.findViewById(R.id.fabAddLaundry);
        
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddLaundryViewModel.class);
        
        fabAddLaundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getContext(), "Click", Toast.LENGTH_SHORT).show();
            }
        });

    }
}