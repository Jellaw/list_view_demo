package com.example.ex2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ListAdapter extends ArrayAdapter<String> {
    private Activity context;
    private int[] icon;
    private String[] title;
    private String[] subtitle;
    private String[] content;


    public ListAdapter(@NonNull Context context, int[] icon, String[] title, String[] subtitle, String[] content) {
        super(context, R.layout.list_item, title);
        this.context = (Activity) context;
        this.icon = icon;
        this.title = title;
        this.subtitle = subtitle;
        this.content = content;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View v = inflater.inflate(R.layout.list_item, null, true);

        ImageView img = v.findViewById(R.id.imageView);
        img.setImageResource(icon[position]);
        return v;
    }
    private void getTitle(){

    }
}
