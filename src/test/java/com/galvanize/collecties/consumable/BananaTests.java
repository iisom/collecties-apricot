package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


    @DisplayName("Consumable: Banana")
    public class BananaTests {

        Banana banana;

        @BeforeEach
        public void testSetup() {
            banana = new Banana();
        }

        @Test
        public void shouldHaveTheRightName() {
            assertEquals("Banana", banana.getName());
        }

        @Test
        public void shouldOnlyHaveOneUsage() {
            assertTrue(banana.consume());
        }
    }

