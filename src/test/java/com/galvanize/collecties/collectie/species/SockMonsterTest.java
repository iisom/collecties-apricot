package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: SockMonster")
public class SockMonsterTest {

    SockMonster socky;

    @BeforeEach
    public void testSetup() {
        socky = new SockMonster();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Socky";
        socky.setName(newName);
        assertEquals(newName, socky.getName());
    }

    @Test
    public void shouldBeRextoreSpecies() {
        assertEquals("SockMonster", socky.getSpecies());
    }

    @Test
    public void shouldBeTypeDinosaur() {
        Assertions.assertEquals(CollectieType.SPECIAL, socky.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = socky.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("RIP RIP NAM NAM", socky.speak());
    }

    @Test
    public void shouldPreferVolcanicBiomes() {
        assertEquals(Biome.WOODLAND, socky.getPreferredBiome());
    }

    @Test
    public void shouldHaveZeroAttackPower() {
        assertEquals(0, socky.performAttack());
    }

    @Test
    public void shouldAlwaysLoseDefense() {
        assertFalse(socky.defend(0));
        assertFalse(socky.defend(0));
        assertFalse(socky.defend(0));
    }

    @Test
    public void shouldGetNewSockMonsterOnClone() {
        SockMonster clone = socky.clone();
        assertNotEquals(clone, socky);
    }
}
