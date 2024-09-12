package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Consumable: Berries")
public class BerriesTests {

    Berries berries;

    @BeforeEach
    void testSetUp() {
        berries = new Berries();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Berries 5", berries.getName());
    }

    @Test
    public void shouldHave5BerriesToConsume() {
        assertTrue(berries.consume());
        assertTrue(berries.consume());
        assertTrue(berries.consume());
        assertTrue(berries.consume());
        assertTrue(berries.consume());
        assertFasle(berries.consume());
    }

    private void assertFasle(boolean consume) {
    }

    @Test
    void shouldShowQuantityWIthName() {
        assertTrue(berries.getName().contains("5"));
         berries.consume();
        int newQuantity = berries.setQuantity(0);
        assertFasle(berries.consume());
    }
}
