package com.example;

import org.junit.jupiter.api.Test; // JUnit 5 import
import static org.junit.jupiter.api.Assertions.assertTrue; // JUnit 5 assertion

public class AppTest {

    @Test // JUnit 5 annotation (instead of extending TestCase)
    public void testApp() {
        assertTrue(true); // JUnit 5 assertion
    }
}