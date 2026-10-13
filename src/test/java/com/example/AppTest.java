
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testGreeting() {
        assertEquals("Hello, Tanya!", App.greet("Tanya"));
    }

    @Test
    void testEmptyName() {
        assertEquals("Hello, World!", App.greet(""));
    }

    @Test
    void testNullName() {
        assertEquals("Hello, World!", App.greet(null));
    }
}
