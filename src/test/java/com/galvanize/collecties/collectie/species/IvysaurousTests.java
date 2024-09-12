package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.CollectieType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Collectie: Ivysaurous")
public class IvysaurousTests {
    Ivysaurous ivykins;

    @BeforeEach
    public void testSetUp() {ivykins = new Ivysaurous();}

    @Test
    public void shouldBeAbleToRename() {
        String newName = "ivykins";
        ivykins.setName(newName);
        assertEquals(newName, ivykins.getName());
    }

    @Test
    public void shouldBeRextoreSpecies() {
        assertEquals("Ivysaurous", ivykins.getSpecies());
    }

    @Test
    public void shouldBeTypeDinosaur() {
        Assertions.assertEquals(CollectieType.SPECIAL, ivykins.getType());
    }

    @Test
    public void shouldProvideAGraphic() {
        String graphic = ivykins.getGraphic();
        System.out.println(graphic);
        assertNotEquals(0, graphic.length());
    }

    @Test
    public void shouldHaveTheCorrectSound() {
        assertEquals("SPARKLE CHIME", ivykins.speak());
    }

    @Test
    public void shouldPreferVolcanicBiomes() {
        assertEquals(Biome.WOODLAND, ivykins.getPreferredBiome());
    }

    @Test
    public void shouldHave10AttackPower() {
        assertEquals(10, ivykins.performAttack());
    }

    @Test
    public void shouldSuccessfullyDefend50pOfTheTime() {
        int wins =  0;
        for(int i = 0; i < 1000; i++) {
            if(ivykins.defend(0)) wins++;
        }

        System.out.println("Wins: " + wins);
        assertTrue(wins > 450 && wins < 550);
    }

    @Test
    public void shouldNewIvysaurousOnClone() {
        Ivysaurous clone = ivykins.clone();
        assertNotEquals(clone, ivykins);
    }

}
