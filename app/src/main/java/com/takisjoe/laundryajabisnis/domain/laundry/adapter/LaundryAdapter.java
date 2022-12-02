package com.takisjoe.laundryajabisnis.domain.laundry.adapter;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.takisjoe.laundryajabisnis.R;
import com.takisjoe.laundryajabisnis.domain.customer.adapter.CustomerAdapter;
import com.takisjoe.laundryajabisnis.domain.laundry.entity.Laundry;

import java.util.List;

public class LaundryAdapter extends RecyclerView.Adapter<LaundryAdapter.ViewHolder> {
    private Application application;
    private final List<Laundry> laundryList;

    public LaundryAdapter(Application application, List<Laundry> laundryList) {
        this.application = application;
        this.laundryList = laundryList;
    }

    @NonNull
    @Override
    public LaundryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_laundry, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LaundryAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return laundryList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
