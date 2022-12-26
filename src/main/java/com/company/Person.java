package com.company;

public abstract class Person implements Info, Calculation {
    int id;
    int late;
    int totalTime;

    public abstract String getInfo();

    public abstract void Calc(int time);
}
