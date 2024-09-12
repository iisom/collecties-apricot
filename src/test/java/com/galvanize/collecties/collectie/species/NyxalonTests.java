package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: Nyxalon")
public class NyxalonTests {

    Nyxalon nyxie;

    @BeforeEach
    public void testSetup() {
        nyxie = new Nyxalon();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Nyxie";
        nyxie.setName(newName);
        assertEquals(newName, nyxie.getName());
    }

    @Test
    public void shouldBeNyxalonSpecies() {
        assertEquals("Nyxalon", nyxie.getSpecies());
    }

    @Test
    public void shouldBeTypeGhost() {
        Assertions.assertEquals(CollectieType.GHOST, nyxie.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = nyxie.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("NYX", nyxie.speak());
    }

    @Test
    public void shouldPreferForestBiomes() {
        assertEquals(Biome.RAINFOREST, nyxie.getPreferredBiome());
    }

    @Test
    public void shouldHave15AttackPower() {
        assertEquals(15, nyxie.performAttack());
    }

    @Test
    public void shouldSuccessfullyDefend60pOfTheTime() {
        int wins =  0;
        for(int i = 0; i < 1000; i++) {
            if(nyxie.defend(0)) wins++;
        }

        System.out.println("Wins: " + wins);
        assertTrue(wins > 550 && wins < 650);
    }

    @Test
    public void shouldNewNyxalonOnClone() {
        Nyxalon clone = nyxie.clone();
        assertNotEquals(clone, nyxie);
    }
}
