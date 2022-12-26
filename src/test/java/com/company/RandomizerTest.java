package com.company;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class RandomizerTest {

    Randomizer randomizer = new Randomizer();

    @DisplayName("Person creation")
    @Test
    void createPerson() {

        ArrayList<Come> comeList = new ArrayList<>();
        int studNum = 3, teachNum = 5;

        comeList = randomizer.createPerson(studNum, teachNum);
        assertEquals(studNum + teachNum, comeList.size());

        Come come = new Come(2, 2, 2);
        for (Come comes : comeList){
            assertEquals(come.getClass(), comes.getClass());
        }
    }

    @DisplayName("Device creation")
    @Test
    void createDevice() {

        ArrayList<Device> devices = new ArrayList<>();
        int deviceNum = 3;

        devices = randomizer.createDevice(deviceNum);
        assertEquals(deviceNum, devices.size());

        Device device = new Device(2, 2, 2, "MODEL");
        for (Device dev : devices){
            assertEquals(device.getClass(), dev.getClass());
        }
    }
}