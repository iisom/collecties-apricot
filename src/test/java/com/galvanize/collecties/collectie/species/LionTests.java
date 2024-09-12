package com.galvanize.collecties.collectie.species;


import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Collectie: Lion")
public class LionTests {

    Lion lion;

    @BeforeEach
    void testSetUp() {
        lion = new Lion();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Peak";
        lion.setName(newName);
        assertEquals(newName, lion.getName());
    }
    @Test
    public void shouldBeLionSpecies() {
        assertEquals("Lion", lion.getSpecies());
    }

    @Test
    void shouldBeTypeDomestic() {
        assertEquals(CollectieType.DOMESTIC, lion.getType());
    }

    @Test
    void shouldProvideAGraphic() {
        String graphic = lion.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    void shouldHaveTheCorrectSound() {
        assertEquals("RAWR", lion.speak());
    }

    @Test
    void shouldPreferWoodLandBiomes() {
        assertEquals(Biome.OCEANIC, lion.getPreferredBiome() );
    }

    @Test
    void shouldHaveZeroAttackPower() {
        assertEquals(0, lion.performAttack());
    }

    @Test
    void shouldAlwaysLoseDefense() {
        assertFalse(lion.defend(1));
        assertFalse(lion.defend(2));
        assertFalse(lion.defend(0));
    }

    @Test
    void shoulGetNewLionOnClone() {

        assertNotEquals(lion, lion.clone());
    }
}

