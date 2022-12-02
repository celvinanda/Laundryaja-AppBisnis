package com.takisjoe.laundryajabisnis.domain.layanan.adapter;

import android.app.Application;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.takisjoe.laundryajabisnis.domain.layanan.entity.Layanan;

import java.util.List;

public class LayananAdapter extends RecyclerView.Adapter<LayananAdapter.ViewHolder> {

    private Application application;
    private final List<Layanan> layanans;

    public LayananAdapter(Application application, List<Layanan> layanans) {
        this.application = application;
        this.layanans = layanans;
    }

    @NonNull
    @Override
    public LayananAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull LayananAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return layanans.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
