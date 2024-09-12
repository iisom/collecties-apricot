package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Alkazor extends Collectie {

    public Alkazor() {
        super(CollectieType.SPECIAL, "ALKKKKK-up");
    }

    @Override
    public String getGraphic() {
        return "                \\||/\n" +
                "                |  @___oo\n" +
                "      /\\  /\\   / (__,,,,|\n" +
                "     ) /^\\) ^\\/ _)\n" +
                "     )   /^\\/   _)\n" +
                "     )   _ /  / _)\n" +
                " /\\  )/\\/ ||  | )_)\n" +
                "<  >      |(,,) )__)\n" +
                " ||      /    \\)___)\\\n" +
                " | \\____(      )___) )___\n" +
                "  \\______(_______;;; __;;;";
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
    public Alkazor clone() {
        return new Alkazor();
    }

}
