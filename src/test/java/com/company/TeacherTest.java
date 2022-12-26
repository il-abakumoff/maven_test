package com.company;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeacherTest {

    @DisplayName("Teacher description")
    @Test

    void info() {
        Teacher teacher = new Teacher(5, 56, 2349);
        assertEquals("Teacher " + 5 + " : delays - " + 56, teacher.getInfo());
    }
}