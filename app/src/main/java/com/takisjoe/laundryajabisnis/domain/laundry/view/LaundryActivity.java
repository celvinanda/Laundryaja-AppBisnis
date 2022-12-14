package com.takisjoe.laundryajabisnis.domain.laundry.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.takisjoe.laundryajabisnis.R;
import com.takisjoe.laundryajabisnis.domain.laundry.view.ui.add.AddLaundryFragment;
import com.takisjoe.laundryajabisnis.domain.laundry.view.ui.main.LaundryFragment;

public class LaundryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laundry);
        getSupportActionBar().setTitle("Laundry");
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, AddLaundryFragment.newInstance())
                    .commitNow();
        }
    }
}