package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void greetingIncludesProjectName() {
        App app = new App();

        assertTrue(app.greeting().contains("${{ values.name }}"));
    }
}
