package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DirtyGymSockTest {
    DirtyGymSock sock;

    @BeforeEach
    public void testSetup() {
        sock = new DirtyGymSock();
    }

    @Test
    public void shouldHaveTheRightName() {
        assertEquals("Dirty Gym Sock", sock.getName());
    }

    @Test
    public void shouldOnlyHaveOneUsage() {
        assertTrue(sock.consume());
    }
}


