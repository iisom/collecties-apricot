package com.galvanize.collecties;

import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieStatus;
import com.galvanize.collecties.utils.terminal.Printer;
import com.galvanize.collecties.utils.terminal.Prompt;

import static com.galvanize.collecties.Game.randogen;

/*
 * Manages a single encounter
 */
public class Encounter {

  //----------------------------------------------------
  // ENCOUNTER STATICS
  //----------------------------------------------------

  // Just a static array of the choices players have in an encounter
  private static final String[] battleChoices = {
          "Attack",
          "Run"
  };

  //----------------------------------------------------
  // ENCOUNTER INSTANCES
  //----------------------------------------------------

  private final Printer printer;
  private final Prompt prompt;
  private final Collectie opponent;
  private final Collectie challenger;
  private String skirmishType;
  /*
   * Basic constructor, expect we take in a bio then use the
   * static helper on Collectie to get a random Collectie for that biome
   */
  public Encounter(Printer printer, Prompt prompt, Collectie challenger, Biome biome) {
    this.printer = printer;
    this.prompt = prompt;
    this.challenger = challenger;
    this.opponent = Collectie.getRandomCollectieForBiome(biome);
  }

  /*
   * It is best to give the user of this class the option to decide when to
   * start the encounter instead of implicitly starting it in the constructor
   * This returns true if the player knocks out the wild Collectie AND decides to keep it
   * and false otherwise
   * This return type was a design decision based on how encounters work and their
   * usage in the main Game class.
   */
  public boolean start() {
    printer.print(opponent.getGraphic());
    // This is for running away from battle when challenger is still unconscious
    if (challenger.getStatus() == CollectieStatus.UNCONSCIOUS) {
      printer.multiline(
              "%s! You have encountered a wild %s!"
      );
      printer.print("You cheese it the heck' out of there.");
      printer.print("You are still unconscious.");
      return false;
    }
    printer.multiline(
                    "%s! You have encountered a wild %s!",
                    "What would you like to do?"
            )
            .print(
                    opponent.speak(),
                    opponent.getSpecies()
            );

    // Notice the static choices defined above are passed here
    printer.formatAsList(battleChoices).print();

    // If the player chooses to attack, do a skirmish
    // otherwise cheese it
    if (prompt.getChoice(battleChoices.length) == 1) {

      // skirmish returns true if the player wins
      skirmishType = "battle";
      if (skirmish(skirmishType)) {
        printer.multiline(
                        "", // Add space before
                        "Would you like to capture the wild %s?"
                )
                .print(opponent.getSpecies());

        // return the choice the player gives for keeping the wild Collectie
        return prompt.getYesNo();
      }
    } else {
      printer.print("You cheese it the heckin' out of there.");
      //  Do random number generator to deterime if we kick off another skirmish
      if(randogen.nextInt(100) > 50) {
        printer.print("There has been an attack of opportunity");
        skirmishType = "opportunity";
        if (skirmish(skirmishType)) {
          printer.multiline(
                          "", // Add space before
                          "Would you like to capture the wild %s?"
                  )
                  .print(opponent.getSpecies());

          // return the choice the player gives for keeping the wild Collectie
          return prompt.getYesNo();
        } else {
          printer.print("You got away!!!!");
        }
      }
    }

    // If you loose (or run) you cannot keep the wild Collectie
    // So false is returned for those cases
    return false;
  }

  /*
   * This looks more complex than it really it
   * Just attack, if the opponent survives it counter-attacks
   * return true if the player wins, false otherwise
   */
  private boolean skirmish(String skirmishType)  {
    if (skirmishType.equals("battle")) {
      printer.print(
              "%s attacks the wild %s!",
              challenger.getName(),
              opponent.getSpecies()
      );

      printer.wait(3);

      // The opponent is defending against the player's attack
      // This if is true if the opponent SURVIVES
      // (defend returns true to denote successful defense)

      if (opponent.defend(challenger.performAttack())) {
        printer.multiline(
                        "", // Add space before
                        "The wild %s manages to survive the blow!",
                        "It counter-attacks!"
                )
                .print(opponent.getSpecies());

        //Prompt.fakeWait(3);

        // The player defends against the wild attack
        // The if is true the player SURVIVES
        if (challenger.defend(opponent.performAttack())) {
          printer.multiline(
                          "", //Add space before
                          "%s survives the blow!"
                  )
                  .print(challenger.getName());
        } else {

        printer.multiline(
                        "", //Add space before
                        "%s has fallen!"
                )
                .print(challenger.getName());
                challenger.setStatus(CollectieStatus.UNCONSCIOUS);
      }

      // Regardless of surviving the counter attack
      // if the wild Collectie survives the player lost
      return false;
    } else {

      // This is the branch where the player's attack lands
      printer.print(
              "%s knocks out the wild %s!",
              challenger.getName(),
              opponent.getSpecies());

      return true;
    }
  } else {
    // opportunity
    printer.print(
            "The wild %s attacks %s!",
            opponent.getSpecies(),
            challenger.getName()
    );

    printer.wait(3);

    // The opponent is defending against the player's attack
    // This if is true if the opponent SURVIVES
    // (defend returns true to denote successful defense)

    if (challenger.defend(opponent.performAttack())) {
      printer.multiline(
                      "", // Add space before
                      "%s manages to survive the blow!",
                      "You counter-attack!"
              )
              //.print(opponent.getSpecies());
              .print(challenger.getName());

      //Prompt.fakeWait(3);

      // The player defends against the wild attack
      // The if is true the player SURVIVES
      if (opponent.defend(challenger.performAttack())) {
        printer.multiline(
                        "", //Add space before
                        "The wild %s survives the blow!"
                )
                //.print(challenger.getName());
                .print(opponent.getSpecies());
      } else {

        printer.multiline(
                        "", //Add space before
                        "The wild %s has fallen!"
                )
                //.print(challenger.getName());
                .print(opponent.getSpecies());
                challenger.setStatus(CollectieStatus.UNCONSCIOUS);
      }

        // Regardless of surviving the counter attack
        // if the wild Collectie survives the player lost
        return false;
      } else {

        // This is the branch where the player's attack lands
        printer.print(
                "%s knocks out the wild %s!",
                challenger.getName(),
                opponent.getSpecies());

        return true;
      }
    }
  }

  /*
   * The main Game needs access to the opponent
   * so it can be added to the player's collection
   * if applicable
   */
  public Collectie getOpponent() {
    return opponent;
  }
}
