package com.company;

public class ComeExport extends ComeAbstract {

    public String getInfo(){
        return "Come " + (comeId + 1) + " : was " + time + " minutes late";
    }

    public ComeExport(int id, int time) {
        this.comeId = id;
        this.time = time;
    }
}
