package com.company;

import java.util.ArrayList;

public class MainProcessing {

    public void processMain(ArrayList<Come> come, ArrayList<Person> person){

        int total = 0; // lates counter

        for (Come value : come) {
            int ID = value.id;
            boolean f = false;

            for (Person item : person) { // if person with come.get(i).id exist
                if (ID == item.id) {
                    f = true;
                    if (value.time > 0) {
                        total += 1;
                        item.Calc(value.time);
                    }
                }
            }

            if (!f & (ID % 10 != 0)) { // if person with come.get(i).id not exist (!f) & (id % 10 != 0)
                if (value.time > 0) {
                    person.add(new Student(ID, 1, value.time, value.time));
                    total += 1;
                } else {
                    person.add(new Student(ID, 0, 0, 0));
                }
            } else if (!f & (ID % 10 == 0)) { // if person with come.get(i).id not exist (!f) & (id % 10 == 0)
                if (value.time > 0) {
                    person.add(new Teacher(ID, 1, value.time));
                    total += 1;
                } else {
                    person.add(new Teacher(ID, 0, 0));
                }
            }
        }
        System.out.println("Total number of delays: " + total + "\n");
    }
}
