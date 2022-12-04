package com.takisjoe.laundryajabisnis.domain.layanan.view.ui.add;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.takisjoe.laundryajabisnis.R;

public class AddLayananFragment extends Fragment {

    private AddLayananViewModel mViewModel;

    public static AddLayananFragment newInstance() {
        return new AddLayananFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_add_layanan, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(AddLayananViewModel.class);


    }
}