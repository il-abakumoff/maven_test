package com.company;

public class Teacher extends Person {

    public Teacher(int id, int late, int totalTime){
        this.id = id;
        this.late = late;
        this.totalTime = totalTime;
    }

    public String getInfo(){
        return "Teacher " + this.id + " : delays - " + this.late;
    }

    public void Calc(int time){
        this.late += 1;
        this.totalTime += time;
    }

}