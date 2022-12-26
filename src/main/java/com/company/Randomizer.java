package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Randomizer {

    Random r = new Random();

    public ArrayList<Come> createPerson(int studNum, int teachNum){

        ArrayList<Come> come = new ArrayList<>();

        for (int i = 0; i < studNum; i++){
            come.add(new Come(i, r.nextInt(9) + 1, r.nextInt(21) - 10));
        }
        for (int i = studNum; i < teachNum + studNum; i++){
            come.add(new Come(i, (r.nextInt(3) + 1) * 10, r.nextInt(21) - 10));
        }

        return come;
    }

    public ArrayList<Device> createDevice(int devNum){

        String[] model = new String[]{"ROBO", "AKAI", "DELL", "BOBA"};
        ArrayList<Device> devices = new ArrayList<>();

        for (int i = 0; i < devNum; i++){
            devices.add(new Device(i, r.nextInt(12), r.nextInt(5) + 2010, model[r.nextInt(model.length)]));
        }

        return devices;
    }

}
