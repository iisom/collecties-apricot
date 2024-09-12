package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Consumable: Pixie Puffs")
public class PixiePuffsTests {

    PixiePuffs puffs;

    @BeforeEach
    public void testSetup() {
        puffs = new PixiePuffs();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Pixie Puffs", puffs.getName());
    }

    @Test
    public void shouldOnlyHaveOneUsage() {
        assertTrue(puffs.consume());
    }

}
