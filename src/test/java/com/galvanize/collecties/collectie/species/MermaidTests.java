package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: Mermaid")
public class MermaidTests {

    Mermaid mermaid;

    @BeforeEach
    public void testSetup() {
        mermaid = new Mermaid();
    }

    @Test
    public void shouldBeAbleToRename() {
        String newName = "Arial";
        mermaid.setName(newName);
        assertEquals(newName, mermaid.getName());
    }

    @Test
    public void shouldBeMermaidSpecies() {
        assertEquals("Mermaid", mermaid.getSpecies());
    }

    @Test
    public void shouldBeTypeSpecial() {
        Assertions.assertEquals(CollectieType.SPECIAL, mermaid.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = mermaid.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("SHELL-O", mermaid.speak());
    }

    @Test
    public void shouldPreferOceanicBiomes() {
        assertEquals(Biome.OCEANIC, mermaid.getPreferredBiome());
    }

    @Test
    public void shouldHave10AttackPower() {
        assertEquals(10, mermaid.performAttack());
    }

    @Test
    public void shouldSuccessfullyDefend50pOfTheTime() {
        int wins =  0;
        for(int i = 0; i < 1000; i++) {
            if(mermaid.defend(0)) wins++;
        }

        System.out.println("Wins: " + wins);
        assertTrue(wins > 450 && wins < 550);
    }

    @Test
    public void shouldNewMermaidOnClone() {
        Mermaid clone = mermaid.clone();
        assertNotEquals(clone, mermaid);
    }
}
