package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Consumable: Oyster")
public class OysterTest {

    Oyster oyster;

    @BeforeEach
    public void testSetup() {
        oyster = new Oyster();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Oyster", oyster.getName());
    }

    @Test
    public void shouldOnlyHaveOneUsage() {
        assertTrue(oyster.consume());
    }
}
