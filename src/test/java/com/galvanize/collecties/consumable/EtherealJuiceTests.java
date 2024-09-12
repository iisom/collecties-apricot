package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Consumable: Ethereal Juice")
public class EtherealJuiceTests {

    EtherealJuice juice;

    @BeforeEach
    public void testSetup() {
        juice = new EtherealJuice();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Nyxalon's Ethereal Juice", juice.getName());
    }

    @Test
    public void shouldOnlyHaveOneUsage() {
        assertTrue(juice.consume());
    }
}
