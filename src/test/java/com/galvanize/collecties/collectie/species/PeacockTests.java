package com.galvanize.collecties.collectie.species;


import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

@DisplayName("Collectie: Peacock")
public class PeacockTests {

    Peacock peacock;

    @BeforeEach
    void testSetUp() {
        peacock = new Peacock();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Peak";
        peacock.setName(newName);
        assertEquals(newName, peacock.getName());
    }
    @Test
    public void shouldBePeacockSpecies() {
        assertEquals("Peacock", peacock.getSpecies());
    }

    @Test
    void shouldBeTypeDomestic() {
        assertEquals(CollectieType.DOMESTIC, peacock.getType());
    }

    @Test
    void shouldProvideAGraphic() {
        String graphic = peacock.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    void shouldHaveTheCorrectSound() {
        assertEquals("SQUAWK", peacock.speak());
    }

    @Test
    void shouldPreferWoodLandBiomes() {
        assertEquals(Biome.WOODLAND, peacock.getPreferredBiome() );
    }

    @Test
    void shouldHaveZeroAttackPower() {
        assertEquals(0, peacock.performAttack());
    }

    @Test
    void shouldAlwaysLoseDefense() {
        assertFalse(peacock.defend(1));
        assertFalse(peacock.defend(2));
        assertFalse(peacock.defend(0));
    }

    @Test
    void shoulGetNewPeacockOnClone() {
        //assertNotSame(peacock, clone);
        assertNotEquals(peacock, peacock.clone());
    }
}
