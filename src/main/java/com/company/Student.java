package com.company;

public class Student extends Person {

    int midTime;

    public Student(int id, int late, int midTime, int totalTime){
        this.id = id;
        this.late = late;
        this.midTime = midTime;
        this.totalTime = totalTime;
    }

    public String getInfo(){
        return "Student " + this.id + " : delays - " + this.late + ", average time - " + this.midTime;
    }

    public void Calc(int time){
        this.late += 1;
        this.totalTime += time;
        this.midTime = totalTime / late;
    }
}

