package com.galvanize.collecties.consumable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DisplayName("Consumable: Energy Drink")
public class PeanutButterShakeTests {

  PeanutButterShake drink;

  @BeforeEach
  public void testSetup() {
    drink = new PeanutButterShake();
  }

  @Test
  public void shouldHaveTheRightName() {
    assertEquals("Peanut Butter Shake Drink", drink.getName());
  }

  @Test
  public void shouldOnlyHaveOneUsage() {
    assertTrue(drink.consume());
  }
}