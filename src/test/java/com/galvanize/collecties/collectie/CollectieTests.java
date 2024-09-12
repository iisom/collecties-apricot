package com.galvanize.collecties.collectie;

import com.galvanize.collecties.Biome;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DisplayName("Collectie Base Class")
public class CollectieTests {

  @Test
  public void shouldBeAbleToGetRandomCollectieFromBiome() {
    Collectie randomCollectie = Collectie.getRandomCollectieForBiome(Biome.OCEANIC);
    assertEquals(Biome.OCEANIC, randomCollectie.getPreferredBiome());
  }

  @Test
  public void shouldBeAbleToGetABiomeWithCollectiesAssignedToIt() {
    Biome randomBiome = Collectie.getRandomNonEmptyBiome();
    assertNotEquals(0, Collectie.speciesByBiomeReference.get(randomBiome).size());
  }
}
