package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;


import java.util.HashMap;


/*
 * This enum is used as a master list for all consumables
 * If the consumable is not set up here it will not be obtainable
 * during gameplay
 * Tracking consumable types this way is a bit cleaner than
 * alternatives for aggregating a list of all consumables
 * Basically creating a static map for all consumables here
 */
public enum Consumables {

  // Each element in this enum requires
  // a reference instance of the class
  // it represents
  // CONSUMABLE(new Consumable()) / KEY(VALUE)
  ENERGY_DRINK(new EnergyDrink()),
  PIZZA(new Pizza()),
  OYSTER(new Oyster()),
  MANGO(new Mango()),
  DIRTYGYMSOCK(new DirtyGymSock()),
  PIXIE_PUFFS(new PixiePuffs()),
  PORKCHOPS(new PorkChops()),
  ETHEREAL_JUICE(new EtherealJuice()),
  BANANA(new Banana()),
  PEANUTBUTTERSHAKE(new PeanutButterShake()),
  COOKIE(new Cookie()),
  CURRY(new Curry()),
  DINORIBS(new DinoRibs()),
  TAZTREATS(new TazTreats()),
  REVIVEPILL(new RevivePill()),
  BERRIES(new Berries());

  // Create a static array of all the Consumables
  private static final Consumables[] consumablesArray = Consumables.values();

  static HashMap<Biome, Integer> BiomeList = new HashMap<Biome, Integer>() {{
    put(Biome.RAINFOREST,0);
    put(Biome.TAIGA,0);
    put(Biome.WOODLAND,0);
    put(Biome.SAVANNA,0);
    put(Biome.PLAINS,0);
    put(Biome.TUNDRA,0);
    put(Biome.DESERT,0);
    put(Biome.BOG,0);
    put(Biome.OCEANIC,0);
    put(Biome.BEACH,0);
    put(Biome.MOUNTAIN_RANGE,0);
    put(Biome.VOLCANIC,0);
  }};

  public static void findUnusedBiome(){
   for (int i = 0; i < consumablesArray.length; i++)  {
    if (BiomeList.containsKey(consumablesArray[i].getReference().getContainingBiome())) {
      BiomeList.put(consumablesArray[i].getReference().getContainingBiome(), BiomeList.get(consumablesArray[i].getReference().getContainingBiome()) + 1);
    }
  }
  }



  /*
   * Use the consumables array to easily get a random consumable
   */
  public static Consumable getRandomConsumable(Biome biomeType) {
    Consumable result = null;
    findUnusedBiome();
    if (BiomeList.get(biomeType) == 0) {
      return result;
    } else {
      int x = 0;
      while (x == 0) {
        int randomConsumable;
        randomConsumable = Game.randogen.nextInt(consumablesArray.length);
        Biome biome = consumablesArray[randomConsumable].getReference().getContainingBiome();
        if (biomeType == biome) {
          x = 1;
          result = consumablesArray[randomConsumable]
                  .getReference()
                  .clone();
          return result;
        }
      }
      return result;
    }
  }


  /*
   * Enums can actually have a constructor
   * and instance data/methods. In this case
   * we just need to keep a reference object
   * for the consumable each enum represents
   * This allows us to easy create clones of
   * those reference objects attached to each enum
   * Basically we are creating a static list for all
   * consumables
   */

  private final Consumable reference;

  Consumables(Consumable reference) {
    this.reference = reference;
  }


  public Consumable getReference() {
    return reference;
  }
}