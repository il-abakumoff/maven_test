package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @DisplayName("Student description")
    @Test
    void info() {
        Student stud = new Student(3, 2, 4, 8);
        assertEquals("Student " + 3 + " : delays - " + 2 + ", average time - " + 4, stud.getInfo());
    }
}