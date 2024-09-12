package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Triceratops extends Collectie {
    public Triceratops() {
        super(CollectieType.DINOSAUR, "Meow");}

    @Override
    public String getGraphic() {
        return "                           __.--'~~~~~`--.\n" +
                "         ..       __.    .-~               ~-.\n" +
                "         ((\\     /   `}.~                     `.\n" +
                "          \\\\\\  .{     }               /     \\   \\\n" +
                "      (\\   \\\\~~       }              |       }   \\\n" +
                "       \\`.-~ -@~     }  ,-,.         |       )    \\\n" +
                "       (___     ) _}  (    :        |    / /      `._\n" +
                "        `----._-~.     _\\ \\ |_       \\   / /-.__     `._\n" +
                "               ~~----~~  \\ \\| ~~--~~~(  + /     ~-._    ~-._\n" +
                "                         /  /         \\  \\          ~--.,___~_-_.\n" +
                "                      __/  /          _\\  )\n" +
                "                    .<___.'         .<___/    ";
    }

    @Override
    public Biome getPreferredBiome(){
        return Biome.PLAINS;}

    @Override
    public int performAttack(){
        return 15; }

    @Override
    public boolean defend(int attackStrength) {
        if(Game.TEST_MODE) return false;
        int randomNumber = Game.randogen.nextInt(100);
        return randomNumber < 20;
    }

    @Override
    public Triceratops clone() {
        return new Triceratops();
    }

}
