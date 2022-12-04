package com.takisjoe.laundryajabisnis.domain.layanan.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.takisjoe.laundryajabisnis.domain.layanan.view.ui.main.LayananFragment;

public class LayananActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layanan);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, LayananFragment.newInstance())
                    .commitNow();
        }
    }
}