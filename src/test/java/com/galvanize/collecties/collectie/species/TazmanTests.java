package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@DisplayName("Collectie: Tazman")
public class TazmanTests {

    Tazman tazman;

    @BeforeEach
    public void testSetup() {
        tazman = new Tazman();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Tazzy";
        tazman.setName(newName);
        assertEquals(newName, tazman.getName());
    }

    @Test
    public void shouldBeTazmanSpecies() {
        assertEquals("Tazman", tazman.getSpecies());
    }

    @Test
    public void shouldBeTypeDinosaur() {
        Assertions.assertEquals(CollectieType.DINOSAUR, tazman.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = tazman.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("RIP RAP ZOOM", tazman.speak());
    }

    @Test
    public void shouldPreferVolcanicBiomes() {
        assertEquals(Biome.WOODLAND, tazman.getPreferredBiome());
    }

    @Test
    public void shouldHave10AttackPower() {
        assertEquals(10, tazman.performAttack());
    }

    @Test
    public void shouldSuccessfullyDefend50pOfTheTime() {
        int wins =  0;
        for(int i = 0; i < 1000; i++) {
            if(tazman.defend(0)) wins++;
        }

        System.out.println("Wins: " + wins);
        assertTrue(wins > 450 && wins < 550);
    }

    @Test
    public void shouldNewTazmanOnClone() {
        Tazman clone = (Tazman) tazman.clone();
        assertNotEquals(clone, tazman);
    }

}
