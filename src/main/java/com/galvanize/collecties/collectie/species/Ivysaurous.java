package com.galvanize.collecties.collectie.species;
import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Ivysaurous extends Collectie {

    public Ivysaurous() { super(CollectieType.SPECIAL, "sparkle chime");}

    @Override
    public String getGraphic() {
        return "           .-----.\n" +
                " \\ ' /   _/    )/\n" +
                "- ( ) -('---''--)\n" +
                " / . \\((()\\^_^/)()\n" +
                "  \\\\_\\ (()_)-((()()\n" +
                "   '- \\ )/\\._./(()\n" +
                "     '/\\/( X   ) \\\n" +
                "     (___)|___/ ) \\\n" +
                "          |.#_|(___)\n" +
                "         /\\    \\ ( (_\n" +
                "         \\/\\/\\/\\) \\\\\n" +
                "         | / \\ |\n" +
                "         |(   \\|\n" +
                "        _|_)__|_\\_\n" +
                "        )...()...(\n" +
                "         | (   \\ |     \n" +
                "      .-'__,)  (  \\\n" +
                "  mrf           '\\_-,";
    }

    @Override
    public Biome getPreferredBiome() {return Biome.WOODLAND;}

    @Override
    public int performAttack() {return 10;}

    @Override
    public boolean defend(int attackStrength) {
        if(Game.TEST_MODE) return false;
        return Game.randogen.nextInt(100) > 50;
    }

    @Override
    public Ivysaurous clone() {return new Ivysaurous();}
}
