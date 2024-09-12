package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: Eagle")
public class EagleTests {

    Eagle eagle;

    @BeforeEach
    public void testSetup() {
        eagle = new Eagle();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Baldy";
        eagle.setName(newName);
        assertEquals(newName, eagle.getName());
    }

    @Test
    public void shouldBeEagleSpecies() {
        assertEquals("Eagle", eagle.getSpecies());
    }

    @Test
    public void shouldBeTypeSPECIAL() {
        Assertions.assertEquals(CollectieType.SPECIAL, eagle.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = eagle.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("KAWH-KAWH", eagle.speak());
    }

    @Test
    public void shouldPreferMOUNTAIN_RANGEBiomes() {
        assertEquals(Biome.MOUNTAIN_RANGE, eagle.getPreferredBiome());
    }

    @Test
    public void shouldHave5AttackPower() {
        assertEquals(5, eagle.performAttack());
    }

    @Test
    public void shouldSuccessfullyDefend50pOfTheTime() {
        int wins =  0;
        for(int i = 0; i < 1000; i++) {
            if(eagle.defend(0)) wins++;
        }

        System.out.println("Wins: " + wins);
        assertTrue(wins > 450 && wins < 550);
    }

    @Test
    public void shouldNewEagleOnClone() {
        Eagle clone = eagle.clone();
        assertNotEquals(clone, eagle);
    }
}
