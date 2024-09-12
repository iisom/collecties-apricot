package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Consumable: Mango")
public class MangoTest {

    Mango mango;

    @BeforeEach
    public void testSetup() {
        mango = new Mango();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("yummy mango", mango.getName());
    }

    @Test
    public void shouldOnlyHaveOneUsage() {
        assertTrue(mango.consume());
    }
}
