package com.takisjoe.laundryajabisnis.domain.customer.view.ui.add;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.takisjoe.laundryajabisnis.R;
import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.domain.customer.entity.CustomerBuilder;
import com.takisjoe.laundryajabisnis.domain.customer.view.ui.main.CustomerFragment;
import com.takisjoe.laundryajabisnis.util.timestamp.TimestampUtil;

import org.jetbrains.annotations.Contract;

public class AddCustomerFragment extends Fragment {

    private AddCustomerViewModel mViewModel;
    private TextInputEditText addNameCustomer, addWhatsappCustomer;
    private RadioButton rbPria, rbWanita;
    private Button btnSave;

    @NonNull
    @Contract(" -> new")

    public static AddCustomerFragment newInstance() {
        return new AddCustomerFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_add_customer, container, false);
        addNameCustomer = view.findViewById(R.id.addNameCustomer);
        addWhatsappCustomer = view.findViewById(R.id.addWhatsappCustomer);
        rbPria = view.findViewById(R.id.rbPria);
        rbWanita = view.findViewById(R.id.rbWanita);
        btnSave = view.findViewById(R.id.btnSave);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddCustomerViewModel.class);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Customer customer = new CustomerBuilder()
                        .setNameCustomer(addNameCustomer.getText().toString())
                        .setWhatsappCustomer(addWhatsappCustomer.getText().toString())
                        .setGenderCustomer(gender())
                        .build();


                mViewModel.setCustomer(customer);
                mViewModel.insertCustomer();
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.container, CustomerFragment.newInstance())
                        .commitNow();
            }
        });
    }

    private int gender() {
        if (rbPria.isChecked()) {
            return 1;
        } else if (rbWanita.isChecked()) {
            return 2;
        } else {
            return 0;
        }
    }

}