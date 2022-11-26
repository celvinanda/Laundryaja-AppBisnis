package com.takisjoe.laundryajabisnis.domain.customer.view.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.takisjoe.laundryajabisnis.R;
import com.takisjoe.laundryajabisnis.domain.customer.adapter.CustomerAdapter;

import org.jetbrains.annotations.Contract;


public class CustomerFragment extends Fragment {
    private CustomerAdapter customerAdapter ;

    private CustomerViewModel mViewModel;
    private FloatingActionButton fabAdd;
    private RecyclerView rvListCustomer;

    @NonNull
    @Contract(" -> new")
    public static CustomerFragment newInstance() {
        return new CustomerFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_customer, container, false);

        fabAdd = view.findViewById(R.id.fabInsertCustomer);
        rvListCustomer = view.findViewById(R.id.rvListCustomer);
        rvListCustomer.setLayoutManager(new LinearLayoutManager(getContext()));

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(CustomerViewModel.class);

        fabAdd.setOnClickListener(v -> mViewModel.addCustomer());
        mViewModel.getAllCustomer().observe(getViewLifecycleOwner(), customers -> {
            customerAdapter = new CustomerAdapter(getActivity().getApplication(),customers);

            rvListCustomer.setAdapter(customerAdapter);
        });
    }
}