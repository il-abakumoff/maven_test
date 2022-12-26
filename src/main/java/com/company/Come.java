package com.company;

public class Come extends ComeAbstract implements Info{

    int id;

    public String getInfo(){
        String str = "";
        if (time > 0){
            str = "Come " + (comeId + 1) + " : ID - " + id + ", was " + time + " minutes late";
        }
        else if (time == 0){
            str = "Come " + (comeId + 1) + " : ID - " + id + ", arrived on time";
        }
        else if (time < 0){
            str = "Come " + (comeId + 1) + " : ID - " + id + ", came with a margin of " + -time + " minutes";
        }
        return str;
    }

    public Come(int comeID, int id, int time) {
        this.comeId = comeID;
        this.id = id;
        this.time = time;
    }
}
