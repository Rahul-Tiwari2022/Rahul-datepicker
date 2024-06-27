package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyListAdapter extends ArrayAdapter<String>
{
    Activity context;    String nameoflist[];    String price[];    int image[];
    public MyListAdapter(Activity context, String[] nameoflist, String[] price, int[] image) {
        super(context,R.layout.custom_toast,nameoflist);
        this.context = context;
        this.nameoflist = nameoflist;
        this.price = price;
        this.image = image;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater inflater= context.getLayoutInflater();
            View obj= inflater.inflate(R.layout.custom_layout,null);
            ImageView im= obj.findViewById(R.id.image);
            TextView tvname= obj.findViewById(R.id.nametext);
            TextView tvprice= obj.findViewById(R.id.pricetext);
        im.setImageResource(image[position]);
        tvname.setText(nameoflist[position]);
        tvprice.setText(price[position]);

        return obj;
    }
}

















