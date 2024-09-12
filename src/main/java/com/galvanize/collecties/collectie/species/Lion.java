package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Lion extends Collectie {

    public Lion() {
        super(CollectieType.DOMESTIC, "RAWR");
    }

//    public void Peacock(){
//
//    };

    @Override
    public String getGraphic() {
        return  "      /\";;:;;\"\\\n" +
                "    (:;/\\,-,/\\;;)\n" +
                "   (:;{  d b  }:;)\n" +
                "    (:;\\__Y__/;;)-----------,,_\n" +
                "     ,..\\  ,..\\      ___/___)__`\\\n" +
                "    (,,,)~(,,,)`-._##____________)";

    }


    @Override
    public Biome getPreferredBiome() {
        return Biome.OCEANIC;
    }

    @Override
    public int performAttack() {
        return 0;
    }

    @Override
    public boolean defend(int attackStrength) {
        return false;
    }

    @Override
    public Lion clone() {
        return new Lion();
    }


}

