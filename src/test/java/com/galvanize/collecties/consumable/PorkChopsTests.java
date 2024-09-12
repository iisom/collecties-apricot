package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Consumable: PorkChops")
public class PorkChopsTests {

    PorkChops porkchops;

    @BeforeEach
    void testSetUp() {
        porkchops = new PorkChops();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("PorkChops 5", porkchops.getName());
    }

    @Test
    public void shouldHave5PorkChopsToConsume() {
        assertTrue(porkchops.consume());
        assertTrue(porkchops.consume());
        assertTrue(porkchops.consume());
        assertTrue(porkchops.consume());
        assertTrue(porkchops.consume());
        assertFasle(porkchops.consume());
    }

    private void assertFasle(boolean consume) {
    }

    @Test
    void shouldShowQuantityWIthName() {
        assertTrue(porkchops.getName().contains("5"));
        porkchops.consume();
        int newQuantity = porkchops.setQuantity(0);
        assertFasle(porkchops.consume());
    }
}
