package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Consumable: Cookie")
public class CookiesTest {

    Cookie cookie;

    @BeforeEach
    public void testSetup() {
        cookie = new Cookie();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Small cookies (3)", cookie.getName());
    }

    @Test
    public void shouldHave4SlicesToConsume() {
        assertFalse(cookie.consume());
        assertFalse(cookie.consume());
        assertTrue(cookie.consume());
    }

    @Test
    public void shouldShowSliceCountInName() {
        assertTrue(cookie.getName().contains("(3)"));
        cookie.consume();
        assertTrue(cookie.getName().contains("(2)"));
    }

}
