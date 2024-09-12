package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Consumable: Dino Ribs")
public class DinoRibsTest {

    DinoRibs ribs;

    @BeforeEach
    public void testSetup() {
        ribs = new DinoRibs();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Half rack of Dino Ribs with BBQ Sauce (5)", ribs.getName());
    }

    @Test
    public void shouldHave5RibsToConsume() {
        assertFalse(ribs.consume());
        assertFalse(ribs.consume());
        assertFalse(ribs.consume());
        assertFalse(ribs.consume());
        assertTrue(ribs.consume());
    }

    @Test
    public void shouldShowSliceCountInName() {
        assertTrue(ribs.getName().contains("(5)"));
        ribs.consume();
        assertTrue(ribs.getName().contains("(4)"));
    }
}
