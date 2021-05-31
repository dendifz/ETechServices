package com.latihan.etechservices;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class personadapter extends ArrayAdapter<person> {
    private Context mcontext;
    private int mresource;
    public personadapter(@NonNull Context context, int resource, @NonNull ArrayList<person> objects) {
        super(context, resource, objects);
        this.mcontext = context;
        this.mresource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(mcontext);

        convertView =  layoutInflater.inflate(mresource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.image);

        TextView textname = convertView.findViewById(R.id.name);

        TextView txtDes = convertView.findViewById(R.id.sub);

        imageView.setImageResource(getItem(position).getImage());

        textname.setText(getItem(position).getName());

        txtDes.setText(getItem(position).getDes());

        return convertView;

    }
}
