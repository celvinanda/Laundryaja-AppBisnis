package com.takisjoe.laundryajabisnis.domain.customer.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.takisjoe.laundryajabisnis.domain.customer.view.ui.main.CustomerFragment;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, CustomerFragment.newInstance())
                    .commitNow();
        }
    }
}