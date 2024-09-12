package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: Kamon")
public class KamonTests {

    Kamon kamon;

    @BeforeEach
    public void testSetup() {
        kamon = new Kamon();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Kamon";
        kamon.setName(newName);
        assertEquals(newName, kamon.getName());
    }

    @Test
    public void shouldBeKamonSpecies() {
        assertEquals("Kamon", kamon.getSpecies());
    }

    @Test
    public void shouldBeTypeDinosaur() {
        Assertions.assertEquals(CollectieType.ELEMENTAL, kamon.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = kamon.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("GRRAWARA", kamon.speak());
    }

    @Test
    public void shouldPreferVolcanicBiomes() {
        assertEquals(Biome.TUNDRA, kamon.getPreferredBiome());
    }

    @Test
    public void shouldHaveZeroAttackPower() {
        assertEquals(12, kamon.performAttack());
    }

    @Test
    public void shouldAlwaysWinDefense() {
        assertTrue(kamon.defend(12));
        assertTrue(kamon.defend(12));
        assertTrue(kamon.defend(12));
    }

    @Test
    public void shouldGetNewKamonOnClone() {
        Kamon clone = kamon.clone();
        assertNotEquals(clone, kamon);
    }
}
