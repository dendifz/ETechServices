package com.latihan.etechservices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class AdapterData extends RecyclerView.Adapter<AdapterData.HolderData> {
    private ArrayList<aksesoris> listData;

    public AdapterData(ArrayList<aksesoris> list) {
        this.listData = list;
    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_data,parent,false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull  AdapterData.HolderData holder, int position) {
        aksesoris akses = listData.get(position);
        Glide.with(holder.itemView.getContext())
                .load(akses.getImage())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imageView);
        holder.tvName.setText(akses.getName());
        holder.tvDes.setText(akses.getDes());



    }

    @Override
    public int getItemCount() {

        return (listData != null) ? listData.size() : 0;
    }

    public class HolderData extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView tvName,tvDes;

        public HolderData(@NonNull  View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_sport);
            tvName = itemView.findViewById(R.id.txtname_sport);
            tvDes = itemView.findViewById(R.id.txtDes_sport);


        }

    }


}

