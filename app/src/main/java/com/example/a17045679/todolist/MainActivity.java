package com.example.a17045679.todolist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<todoItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar date1 = Calendar.getInstance();
        date1.set(2018,7,1);

        Calendar date2 = Calendar.getInstance();
        date2.set(2018,9,22);

        lvMovie = findViewById(R.id.listView);
        alMovieList = new ArrayList<>();

        todoItem item1 = new todoItem("MSA", date1);
        todoItem item2 = new todoItem("Go for haircut", date2);

        alMovieList.add(item1);
        alMovieList.add(item2);

        caMovie = new CustomAdapter(this, R.layout.todo_item, alMovieList);

        lvMovie.setAdapter(caMovie);
    }
    }

