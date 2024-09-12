package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TazTreatsTests {

    TazTreats tastyTaz;

    @BeforeEach
    public void testSetup() {
        tastyTaz = new TazTreats();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Tasty Taz Treats", tastyTaz.getName());
    }

    @Test
    public void shouldOnlyHaveOneUsage() {
        assertTrue(tastyTaz.consume());
    }
}
