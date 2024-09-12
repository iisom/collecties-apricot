package com.galvanize.collecties;

import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static com.galvanize.collecties.GameHelper.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTests {

    public static final String NEW_LINE_SEPARATOR_REGEX = "\\R";

    @BeforeAll
    public static void setupOnce() {
        Collectie.buildSpeciesBiomeMap();
    }

    @BeforeEach
    public void setup() {
    }

    @Test
    public void canExitGame() {
        String input = "n\n4\n";
        disableGameSleep();
        String output = runGameWithInput(input);
        enableGameSleep();
        System.out.println(output);
        displayOutputLines(output);
        assertEquals("?: Thank you for playing!", output.split(NEW_LINE_SEPARATOR_REGEX)[13]);
    }

    @Test
    public void showCollectionThenExit() {
        List<String> gameInput = new ArrayList<>(Arrays.asList("n", "3", "1", "6", "4"));
        String output = runGameWithInput(gameInput);
        System.out.println(output);
        Assertions.assertTrue(output.contains("Collectie Collection"));
    }

    @Test
    public void showNoConsumablesOnGameStartThenExit() {
        String output = runGameWithInput("n", "3", "2", "6", "4");
        System.out.println(output);
        Assertions.assertTrue(output.contains("No consumables available"));
    }

    @Test
    public void canRenameCollectie() {
        String output = runGameWithInput("n", "3", "4", "1", "Rexter", "y", "1", "6", "4");
        displayOutputLines(output);
        assertEquals("[1] Rexter (Rextore)", output.split(NEW_LINE_SEPARATOR_REGEX)[34]);
    }

    @Test
    public void testProtectorBecomesUnconscious() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 51 - our Rextore misses
        // 51 - other Rextore misses
        hookIntoRandom(11, 10001, 1, 0, 10002, 51, 1, 1);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "1", "2", "4");
        enableGameSleep();
        displayOutputLines(output);
        assertEquals("You cheese it the heck' out of there.! You have encountered a wild !", output.split(NEW_LINE_SEPARATOR_REGEX)[88]);
        assertEquals("You are still unconscious.", output.split(NEW_LINE_SEPARATOR_REGEX)[89]);
    }

    @Test
    public void testProtectorBecomesUnconsciousAndConsciousAfterConsumingPill() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 51 - our Rextore misses
        // 51 - other Rextore misses
        hookIntoRandom(11, 10001, 1, 0, 10002, 51, 1, 51, 13);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "1", "2", "3", "3", "1", "1", "6", "4");
        enableGameSleep();
        displayOutputLines(output);
        assertEquals("Rextore 10001 has been revived", output.split(NEW_LINE_SEPARATOR_REGEX)[81]);
        assertEquals("Looks like Rextore 10001 consumed all of the Revive Pill (0).", output.split(NEW_LINE_SEPARATOR_REGEX)[82]);
    }

    @Test
    public void canRenameCollectieNotHappyWithName() {
        String output = runGameWithInput("n", "3", "4", "1", "Rexter", "n", "Rexy", "y", "1", "6", "4");
        displayOutputLines(output);
        assertEquals("[1] Rexy (Rextore)", output.split(NEW_LINE_SEPARATOR_REGEX)[37]);
    }

    @Test
    public void attemptToFeedCollectieWithNoConsumables() {
        String output = runGameWithInput("y", "Rextor", "y", "3", "3", "1", "6", "4");
        displayOutputLines(output);
        assertEquals("?: You have no consumables to feed Rextor!", output.split(NEW_LINE_SEPARATOR_REGEX)[26]);
    }

    @Test
    public void collectConsumable() {
        // 4 - PLAINS is picked as BIOME
        //     This BIOME has to be one with a Collectie in it on Game start
        // 10001 - Random number given to first Collectie
        // 51 - Exploring goes to findConsumable logic
        // 0 - Finds first Consumable in this BIOME
        List<Integer> numberSequence = new ArrayList<>(Arrays.asList(4, 10001, 51, 0));
        hookIntoRandom(numberSequence);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "4");
        enableGameSleep();
        displayOutputLines(output);
        Assertions.assertEquals("You found a Pixie Puffs while exploring.", output.split(NEW_LINE_SEPARATOR_REGEX)[14]);
    }

    @Test
    public void fightCollectieAndWin() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 11 - Roll below 50 for Rextor to win
        hookIntoRandom(11, 10001, 1, 0, 10002, 11);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "1", "n", "4");
        enableGameSleep();
        displayOutputLines(output);
        assertEquals("Would you like to capture the wild Rextore?", output.split(NEW_LINE_SEPARATOR_REGEX)[50]);
    }

    @Test
    public void bothMiss() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 51 - our Rextore misses
        // 51 - other Rextore misses
        hookIntoRandom(11, 10001, 1, 0, 10002, 51, 51);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "1", "4");
        enableGameSleep();
        displayOutputLines(output);
        assertEquals("The wild Rextore manages to survive the blow!", output.split(NEW_LINE_SEPARATOR_REGEX)[49]);
        assertEquals("Rextore 10001 survives the blow!", output.split(NEW_LINE_SEPARATOR_REGEX)[52]);
    }

    @Test
    public void fightWithMissThenGetHit() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 51 - our Rextore misses
        // 1 - other Rextore hits
        hookIntoRandom(11, 10001, 1, 0, 10002, 51, 1);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "1", "4");
        enableGameSleep();
        displayOutputLines(output);
        assertEquals("The wild Rextore manages to survive the blow!", output.split(NEW_LINE_SEPARATOR_REGEX)[49]);
        assertEquals("Rextore 10001 has fallen!", output.split(NEW_LINE_SEPARATOR_REGEX)[52]);
    }



    @Test
    public void attackWithKnockOut() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 51 - our Rextore misses
        // 1 - other Rextore hits
        hookIntoRandom(11, 10001, 1, 0, 10001, 51, 1);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "1", "y", "n", "4");
        enableGameSleep();
        displayOutputLines(output);
        Assertions.assertEquals("The wild Rextore manages to survive the blow!", output.split(NEW_LINE_SEPARATOR_REGEX)[49]);
        Assertions.assertEquals("Rextore 10001 has fallen!", output.split(NEW_LINE_SEPARATOR_REGEX)[52]);
    }

    @Test
    public void attackWithOpportunityAndSuccessfullRunaway() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 51 - our Rextore misses
        // 1 - other Rextore hits
        hookIntoRandom(11, 10001, 1, 0, 10001, 51, 1);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "2", "y", "n", "4");
        enableGameSleep();
        displayOutputLines(output);
        Assertions.assertEquals("There has been an attack of opportunity", output.split(NEW_LINE_SEPARATOR_REGEX)[47]);
        Assertions.assertEquals("The wild Rextore attacks Rextore 10001!", output.split(NEW_LINE_SEPARATOR_REGEX)[48]);
        Assertions.assertEquals("Rextore 10001 knocks out the wild Rextore!", output.split(NEW_LINE_SEPARATOR_REGEX)[50]);
    }

    @Test
    public void successfullRunWithoutRandomAttack() {
        // 11 - VOLCANIC is picked as BIOME
        // 10001 - Random number given to first Collectie
        // 1 - Exploring goes to encounter logic
        // 0 - Finds first Collectie in this BIOME
        // 10002 - Random number given to cloned Collectie
        // 51 - our Rextore misses
        // 1 - other Rextore hits
        hookIntoRandom(11, 10001, 1, 0, 10001, 50, 1);
        disableGameSleep();
        String output = runGameWithInput("n", "2", "2", "4");
        enableGameSleep();
        displayOutputLines(output);
        Assertions.assertEquals("?: You cheese it the heckin' out of there.", output.split(NEW_LINE_SEPARATOR_REGEX)[46]);
    }
}
