package com.takisjoe.laundryajabisnis.domain.customer.adapter;

import android.annotation.SuppressLint;
import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.takisjoe.laundryajabisnis.R;
import com.takisjoe.laundryajabisnis.domain.customer.entity.Customer;
import com.takisjoe.laundryajabisnis.domain.customer.repository.CustomerImplRepository;
import com.takisjoe.laundryajabisnis.domain.customer.repository.CustomerRepository;

import java.util.List;

public class CustomerAdapter extends RecyclerView.Adapter<CustomerAdapter.ViewHolder> {

    private Application application;
    private final List<Customer> customers;
    private int selectCustomer;

    public CustomerAdapter(Application application, List<Customer> customers) {
        this.application = application;
        this.customers = customers;
    }

    @NonNull
    @Override
    public CustomerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_customer, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomerAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.tvNameCustomer.setText(customers.get(position).getNameCustomer());
        holder.tvAddressCustomer.setText(customers.get(position).getAddressCustomer());
        holder.tvStatusCustomer.setText(customers.get(position).getWhatsappCustomer());

        holder.cardCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCustomer = position;
                new CustomerImplRepository().deleteRoom(application,customers.get(position));
            }
        });
    }



    public Customer getSelectCustomer() {
        return customers.get(selectCustomer);
    }

    @Override
    public int getItemCount() {
        return customers.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        CardView cardCustomer;
        ImageView ivProfileCustomer;
        LinearLayout llTextCustomer;
        TextView tvNameCustomer;
        TextView tvAddressCustomer;
        TextView tvStatusCustomer;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            cardCustomer = itemView.findViewById(R.id.cardCustomer);
            ivProfileCustomer = itemView.findViewById(R.id.ivProfileCustomer);
            llTextCustomer = itemView.findViewById(R.id.llTextCustomer);
            tvNameCustomer = itemView.findViewById(R.id.tvNameCustomer);
            tvAddressCustomer = itemView.findViewById(R.id.tvAddressCustomer);
            tvStatusCustomer = itemView.findViewById(R.id.tvStatusCustomer);
        }
    }
}
