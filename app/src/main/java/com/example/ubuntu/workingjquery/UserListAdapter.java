package com.example.ubuntu.workingjquery;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class UserListAdapter extends ArrayAdapter<UserInfo> {
    Context context;
    public UserListAdapter(@NonNull Context context, ArrayList<UserInfo> list) {
        super(context, 0, list);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_layout, null);
        TextView name = view.findViewById(R.id.tv);
        TextView address = view.findViewById(R.id.tv1);
        ImageView image = view.findViewById(R.id.iv);


        final UserInfo info = getItem(position);

        name.setText(info.username);
        address.setText(info.address);


        return view;
    }
}
