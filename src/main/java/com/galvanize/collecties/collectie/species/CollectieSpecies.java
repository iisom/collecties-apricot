package com.galvanize.collecties.collectie.species;
import com.galvanize.collecties.collectie.Collectie;

/*
 * This enum is used as a master list for all species
 * If the species is not set up here it will not be seen
 * in the wild and thus un-catchable during gameplay
 * Tracking species this way is a bit cleaner than
 * alternatives for aggregating a list of all species
 * Basically we are creating a static list for all species
 */
public enum CollectieSpecies {

  // Each element in this enum requires
  // a reference instance of the class
  // it represents
  // SPECIES(new Species()) / KEY(ReferenceValue)
  REXTORE(new Rextore()),
  DODUD(new Dodud()),
  MERMAID(new Mermaid()),
  SOCKMONSTER(new SockMonster()),
  IVYSAUROUS(new Ivysaurous()),
  NYXALON(new Nyxalon()),
  Triceratops(new Triceratops()),
  ALKAZOR(new Alkazor()),
  DiddleDee(new DiddleDee()),
  KAMON(new Kamon()),
  NOMNOMMONSTER(new NomNomMonster()),
  TAZMAN(new Tazman()),
  EAGLE(new Eagle()),
  PEACOCK(new Peacock()),
  LION(new Lion());

  /*
   * Enums can actually have a constructor
   * and instance data/methods. In this case
   * we just need to keep a reference object
   * for the consumable each enum represents
   * This allows us to easy create clones of
   * those reference objects attached to each enum
   * Check out the code in the Consumables enum for
   * usage examples
   */

  private final Collectie reference;

  CollectieSpecies(Collectie reference) {
    this.reference = reference;
  }

  public Collectie getReference() {
    return reference;
  }
}
