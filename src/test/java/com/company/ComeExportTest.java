package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComeExportTest {

    @Test
    void getInfo() {
        ComeExport come = new ComeExport(1, 3);
        assertEquals("Come " + 2 + " : was " + 3 + " minutes late", come.getInfo());
    }
}