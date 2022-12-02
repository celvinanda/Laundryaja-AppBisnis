package com.takisjoe.laundryajabisnis;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.takisjoe.laundryajabisnis.domain.customer.view.CustomerActivity;
import com.takisjoe.laundryajabisnis.domain.laundry.view.LaundryActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startActivity(new Intent(this, LaundryActivity.class));
        finish();
    }
}