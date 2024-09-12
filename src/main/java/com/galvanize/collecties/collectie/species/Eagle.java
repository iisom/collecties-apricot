package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Eagle extends Collectie {

    public Eagle() {
        super(CollectieType.SPECIAL, "KAWH-KAWH");
    }

    public String getGraphic() {
        return "           ///,        ////\n" +
                "           \\  /,      /  >.\n" +
                "            \\  /,   _/  /.\n" +
                "             \\_  /_/   /.\n" +
                "              \\__/_   <\n" +
                "              /<<< \\_\\_\n" +
                "             /,)^>>_._ \\\n" +
                "             (/   \\\\ /\\\\\\\n" +
                "                  // ````\n" +
                "                 ((`";
    }

    @Override
    public Biome getPreferredBiome() {
        return Biome.MOUNTAIN_RANGE;
    }

    @Override
    public int performAttack() {
        return 5;
    }

    @Override
    public boolean defend(int attackStrength) {
        if(Game.TEST_MODE) return false;
        return Game.randogen.nextInt(100) > 50;
    }

    @Override
    public Eagle clone() {
        return new Eagle();
    }
}
