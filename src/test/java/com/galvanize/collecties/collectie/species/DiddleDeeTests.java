package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: DiddleDee")
public class DiddleDeeTests {

  DiddleDee diddler;

  @BeforeEach
  public void testSetup() {
    diddler = new DiddleDee();
  }

  @Test
  public void shouldBeAbleToRename() {
    String newName = "DiddleDeeDer";
    diddler.setName(newName);
    assertEquals(newName, diddler.getName());
  }

  @Test
  public void shouldBeDiddleDeeSpecies() {
    assertEquals("DiddleDee", diddler.getSpecies());
  }

  @Test
  public void shouldBeTypeelemental() {
    Assertions.assertEquals(CollectieType.ELEMENTAL, diddler.getType());
  }

  @Test
  public void shouldProvideAGraphic() {
    String graphic = diddler.getGraphic();
    System.out.println(graphic);
    assertNotEquals(0, graphic.length());
  }

  @Test
  public void shouldHaveTheCorrectSound() {
    assertEquals("GWAAKRRRYA", diddler.speak());
  }

  @Test
  public void shouldPreferVolcanicBiomes() {
    assertEquals(Biome.TAIGA, diddler.getPreferredBiome());
  }

  @Test
  public void shouldHave10AttackPower() {
    assertEquals(30, diddler.performAttack());
  }

  @Test
  public void shouldSuccessfullyDefend50pOfTheTime() {
    int wins =  0;
    for(int i = 0; i < 1000; i++) {
      if(diddler.defend(0)) wins++;
    }

    System.out.println("Wins: " + wins);
    assertTrue(wins > 450 && wins < 550);
  }

  @Test
  public void shouldNewDiddleDeeOnClone() {
    DiddleDee clone = diddler.clone();
    assertNotEquals(clone, diddler);
  }
}