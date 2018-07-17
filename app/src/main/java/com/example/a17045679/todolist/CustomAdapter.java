package com.example.a17045679.todolist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<todoItem> movieList;

    public CustomAdapter(@NonNull Context context, int resource, @NonNull ArrayList<todoItem>  objects) {
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
    }

    //Right-Click generate Override Method
    //It runs the roll everytime it runs
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(layout_id, parent, false);
        TextView tvName = rowView.findViewById(R.id.textViewList);
        TextView tvDate = rowView.findViewById(R.id.textViewDate);
        todoItem currentItem = movieList.get(position);
        String list = currentItem.getList();
        String date = currentItem.getDateString();

        tvName.setText(list);
        tvDate.setText(date);

        return rowView;
    }
}
