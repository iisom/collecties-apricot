package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: Alkazor")
public class AlkazorTests {

    Alkazor alkazor;

    @BeforeEach
    public void testSetup() {
        alkazor = new Alkazor();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Alkazor";
        alkazor.setName(newName);
        assertEquals(newName, alkazor.getName());
    }

    @Test
    public void shouldBeAlkazorSpecies() {
        assertEquals("Alkazor", alkazor.getSpecies());
    }

    @Test
    public void shouldBeTypeDinosaur() {
        Assertions.assertEquals(CollectieType.SPECIAL, alkazor.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = alkazor.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("ALKKKKK-UP", alkazor.speak());
    }

    @Test
    public void shouldPreferVolcanicBiomes() {
        assertEquals(Biome.OCEANIC, alkazor.getPreferredBiome());
    }

    @Test
    public void shouldHaveZeroAttackPower() {
        assertEquals(0, alkazor.performAttack());
    }

    @Test
    public void shouldAlwaysLoseDefense() {
        assertFalse(alkazor.defend(0));
        assertFalse(alkazor.defend(0));
        assertFalse(alkazor.defend(0));
    }

    @Test
    public void shouldGetNewDodudOnClone() {
        Alkazor clone = alkazor.clone();
        assertNotEquals(clone, alkazor);
    }

}
