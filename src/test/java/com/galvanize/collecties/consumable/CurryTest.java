package com.galvanize.collecties.consumable;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Consumable: Hot Curry")
public class CurryTest {

    Curry curry;

    @BeforeEach
    public void testSetup() {
        curry = new Curry();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Nom Nom's Hot and Spicy Curry", curry.getName());
    }

    @Test
    public void shouldOnlyHaveOneUsage() {
        assertTrue(curry.consume());
    }

    @Test
    public void shouldGetCurryClone() {
        Curry clone = curry.clone();
        assertNotEquals(clone, curry);
    }
}
