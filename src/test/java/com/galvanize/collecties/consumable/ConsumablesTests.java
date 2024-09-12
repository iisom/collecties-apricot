package com.galvanize.collecties.consumable;
import com.galvanize.collecties.Biome;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DisplayName("Consumables Enum")
public class ConsumablesTests {

  Biome testBiome;


  @Test
  public void shouldBeAbleToGetConsumableFromBiome() {
    testBiome = Biome.getRandomBiome();
    Consumable consumable = Consumables.getRandomConsumable(testBiome);
    Biome result;
    if (consumable == null) {
      result = null;
      testBiome = null;
    } else {
      result = consumable.getContainingBiome();
    }
    assertEquals(testBiome, result);
  }
}


