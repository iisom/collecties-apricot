package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Tazman extends Collectie {

    public Tazman() {
        super(CollectieType.DINOSAUR, "rip rap zoom");
    }

    public String getGraphic() {
        return
                "               ,   .-' '=;_  ,               \n " +
                "               |\\.'-~`-.`-`;/|              \n " +
                "               \\.` '.'~-.` './             \n " +
                "               (\\`,__=-'__,'/)             \n " +
                "            _.-'-.( d\\_/b ).-'-._          \n " +
                "           /'.-'   ' .---. '   '-.`\\       \n " +
                "         /'  .' (=    (_)    =) '.  `\\     \n " +
                "        /'  .',  `-.__.-.__.-'  ,'.  `\\    \n " +
                "       (     .'.   V       V  ; '.     )    \n " +
                "       (    |::  `-,__.-.__,-'  ::|    )    \n " +
                "        |   /|`:.               .:'|\\   |  \n " +
                "        |  / | `:.              :' |`\\  |  \n " +
                "        | |  (  :.             .:  )  | |   \n " +
                "        | |   ( `:.            :' )   | |   \n " +
                "        | |    \\ :.           .: /    | |  \n " +
                "        | |     \\`:.         .:'/     | |  \n " +
                "        ) (      `\\`:.     .:'/'      ) (  \n " +
                "        (  `)_     ) `:._.:' (     _(`  )   \n " +
                "        \\  ' _)  .'           `. (_ `  /  \n " +
                "         \\  '_) /    .'```'.  \\ (_`  /     \n " +
                "         `'`   \\    (        ) /  `'`                   \n " +
                "          `.`.                  .'.'         \n " +
                "     .`   `` '' '--`_)      (_'-- '' '``    `.  \n" +
        "       (_(_(___...--' '`       `' '--...___)_)_)    \n ";

    }

    @Override
    public Biome getPreferredBiome() {
        return Biome.WOODLAND;
    }

    @Override
    public int performAttack() {
        return 10;
    }

    @Override
    public boolean defend(int attackStrength) {
        if(Game.TEST_MODE) return false;
        return Game.randogen.nextInt(100) > 50;
    }

    @Override
    public Collectie clone() {
        return new Tazman();
    }


}
