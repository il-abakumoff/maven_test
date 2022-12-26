package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        DataProcessor data = new DataProcessor();
        MainProcessing process = new MainProcessing();
        Randomizer randomizer = new Randomizer();

        int x = 3;
        int studentComesNumber = 8, teacherComesNumber = 5, deviceNumber = 4;
        int min = 0, max = 5;

        ArrayList<Come> come = randomizer.createPerson(studentComesNumber, teacherComesNumber);
        ArrayList<Device> devices = randomizer.createDevice(deviceNumber);

        ArrayList<Person> person = new ArrayList<>();
        ArrayList<Info> obj = new ArrayList<>();

        System.out.println();

        process.processMain(come, person);

        obj.addAll(come);
        obj.addAll(person);
        obj.addAll(devices);
        for (Info info : obj){
            System.out.println(info.getInfo());
        }

        try {
            List<ComeExport> export = data.streamFilter(come, min, max);
            if (export.isEmpty()) {
                System.out.println("\nStream has no results :((\n-------------");
            }
            else {
                System.out.println("\nStream results: \n-------------");
                for (ComeExport comeExport : export) {
                    System.out.println(comeExport.getInfo());
                }
            }
        }
        catch (FilterException E) {
            System.out.println(E.getExceptionMessage());
        }
        catch (Exception e) {
            System.out.println("\nERROR FILTER: Incorrect input data type\n");
        }

        try {
            System.out.println("\nSearch results: \n-------------");
            Optional<Come> export = data.streamSearch(come, x);
            if (export.isPresent()){
                System.out.println(export.get().getInfo());
            }
            else{
                System.out.println("Not found...");
            }
        }
        catch (Exception e) {
            System.out.println("ERROR SEARCHING: Incorrect input data type\n");
        }
    }
}
