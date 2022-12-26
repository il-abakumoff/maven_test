package com.company;

public class Device implements Info{
    String model;
    String month;
    int year;
    int id;

    public Device(int id, int monthId, int year, String model){
        String[] months = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        this.id = id;
        this.month = months[monthId];
        this.model = model;
        this.year = year;
    }

    public String getInfo(){
        return "Device ID : " + id + ", model: " + this.model + ", purchase date: " + month + " " + year;
    }
}
