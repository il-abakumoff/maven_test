package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {

    @DisplayName("Device Description")
    @Test
    void info() {
        Device device = new Device(2, 8, 2015, "SONIC");
        assertEquals("Device ID : " + 2 + ", model: " + "SONIC" + ", purchase date: " + "Sep" + " " + 2015, device.getInfo());
    }
}