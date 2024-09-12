package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RevivePillTest {

    RevivePill revivePill;

    @BeforeEach
    public void testSetup() {
        revivePill = new RevivePill();
    }

    @Test
    public void shouldHave1PillToConsume() {
        assertTrue(revivePill.consume());
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Revive Pill (1)", revivePill.getName());
    }

    @Test
    public void shouldShowPillCountInName() {
        assertTrue(revivePill.getName().contains("(1)"));
        revivePill.consume();
        assertTrue(revivePill.getName().contains("(0)"));
    }

}
