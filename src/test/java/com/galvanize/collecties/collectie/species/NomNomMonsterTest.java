package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: NomNomMon")
public class NomNomMonsterTest {
    NomNomMonster nomNomMon;

    @BeforeEach
    public void testSetup() {
        nomNomMon = new NomNomMonster();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Chompers";
        nomNomMon.setName(newName);
        assertEquals(newName, nomNomMon.getName());
    }

    @Test
    public void shouldBeNomNomSpecies() {
        assertEquals("NomNomMonster", nomNomMon.getSpecies());
    }

    @Test
    public void shouldBeTypeDinosaur() {
        Assertions.assertEquals(CollectieType.DINOSAUR, nomNomMon.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = nomNomMon.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("MUUUNCH-MUUUUNCH", nomNomMon.speak());
    }

    @Test
    public void shouldPreferBogBiomes() {
        assertEquals(Biome.BOG, nomNomMon.getPreferredBiome());
    }

    @Test
    public void shouldHaveFourAttackPower() {
        assertEquals(4, nomNomMon.performAttack());
    }

    @Test
    public void shouldAlwaysLoseDefense() {
        assertFalse(nomNomMon.defend(4));
        assertFalse(nomNomMon.defend(4));
        assertFalse(nomNomMon.defend(4));
    }

    @Test
    public void shouldGetNewNomNomMonsterOnClone() {
        NomNomMonster clone = nomNomMon.clone();
        assertNotEquals(clone, nomNomMon);
    }
}
