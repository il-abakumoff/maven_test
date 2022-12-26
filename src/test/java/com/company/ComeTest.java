package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComeTest {

    @Test
    void getInfo() {
        Come come1 = new Come(1, 1, 1);
        Come come2 = new Come(1, 1, 0);
        Come come3 = new Come(1, 1, -1);

        assertEquals("Come " + 2 + " : ID - " + 1 + ", was " + 1 + " minutes late", come1.getInfo());
        assertEquals("Come " + 2 + " : ID - " + 1 + ", arrived on time", come2.getInfo());
        assertEquals("Come " + 2 + " : ID - " + 1 + ", came with a margin of " + 1 + " minutes", come3.getInfo());

    }
}