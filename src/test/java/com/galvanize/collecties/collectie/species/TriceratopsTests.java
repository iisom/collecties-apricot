package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Collectie: Triceratops")
public class TriceratopsTests {

    Triceratops triceratops;

    @BeforeEach
    public void testSetup() {triceratops = new Triceratops();}

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Triceratops";
        triceratops.setName(newName);
        assertEquals(newName, triceratops.getName());
    }

    @Test
    public void shouldBeTriceratopsSpecies() {
        assertEquals("Triceratops", triceratops.getSpecies());
    }

    @Test
    public void shouldBeTypeDinosaur() {
        Assertions.assertEquals(CollectieType.DINOSAUR, triceratops.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = triceratops.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("MEOW", triceratops.speak());
    }

    @Test
    public void shouldPreferPlainsBiomes() {
        assertEquals(Biome.PLAINS, triceratops.getPreferredBiome());
    }

    @Test
    public void shouldHaveSomeAttackPower() {
        assertEquals(15, triceratops.performAttack());
    }

    @Test
    public void shouldSuccessfullyDefend20PercentOfTheTime() {
        int wins = 0;
        for (int i = 0; i < 1000; i++) {
            if (triceratops.defend(0)) {
                wins++;
            }
        }
        System.out.println("Wins: " + wins);
        assertTrue(wins > 160 && wins < 240); // Adjusted range for 20% success rate
    }

    @Test
    public void shouldGetNewTriceratopsOnClone() {
        Triceratops clone = triceratops.clone();
        assertNotEquals(clone, triceratops);
    }





}
