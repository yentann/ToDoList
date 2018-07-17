package com.example.a17045679.todolist;

import java.util.Calendar;

public class todoItem {

    private String list;
    private Calendar date;

    public todoItem(String list, Calendar date) {
        this.list = list;
        this.date = date;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }


    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);
        return str;
   }

    //toString()
    @Override
    public String toString() {
        return "todoItem{" +
                "list='" + list + '\'' +
                ", date='" + getDateString() + '\'' +
                '}';
    }

}
