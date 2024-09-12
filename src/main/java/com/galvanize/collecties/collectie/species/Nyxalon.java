package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Nyxalon extends Collectie {

    public Nyxalon() {
        super(CollectieType.GHOST, "nyx");
    }

    public String getGraphic() {
        return "                         .       .\n" +
                "                        / `.   .' \\\n" +
                "                .---.  <    > <    >  .---.\n" +
                "                |    \\  \\ - ~ ~ - /  /    |\n" +
                "                 ~-..-~             ~-..-~\n" +
                "             \\~~~\\.'                    `./~~~/\n" +
                "   .-~~^-.    \\__/                        \\__/\n" +
                " .'  O    \\     /               /       \\  \\\n" +
                "(_____,    `._.'               |         }  \\/~~~/\n" +
                " `----.          /       }     |        /    \\__/\n" +
                "       `-.      |       /      |       /      `. ,~~|\n" +
                "           ~-.__|      /_ - ~ ^|      /- _      `..-'   f: f:\n" +
                "                |     /        |     /     ~-.     `-. _||_||_\n" +
                "                |_____|        |_____|         ~ - . _ _ _ _ _>\n";
    }

    @Override
    public Biome getPreferredBiome() {
        return Biome.RAINFOREST;
    }

    @Override
    public int performAttack() {
        return 15;
    }

    @Override
    public boolean defend(int attackStrength) {
        if(Game.TEST_MODE) return false;
        return Game.randogen.nextInt(100) > 40;
    }

    @Override
    public Nyxalon clone() {
        return new Nyxalon();
    }
}

