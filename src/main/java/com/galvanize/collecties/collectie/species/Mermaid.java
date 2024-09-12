package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Mermaid extends Collectie {

    public Mermaid() {
        super(CollectieType.SPECIAL, "Shell-o");
    }

    public String getGraphic() {
        return  "                             .--'` .-,)\n" +
                "                           .'     /\n" +
                "            ,             /      /\n" +
                "           /\\            ;      ;\n" +
                "           | `.__..__    |      |\n" +
                "           |         `''-\\      ;\n" +
                "            \\             `      \\\n" +
                "             '.                   `.\n" +
                "               '--.,__   __..-'-.   '. \n" +
                "                      ```        `.   '.\n" +
                "                                   `.   `\\\n" +
                "                   _.._              \\    `\\\n" +
                "                _.'    '-._ .__       |     `\\\n" +
                "              .'/        .-'   `\\     |       \\\n" +
                "            .'  :           .-.  |    /        \\\n" +
                "  _        /     \\         /_  | /_..-`\"-.     ;\n" +
                " / '.     |  .    )  .-')_/` \\.'`         \\    |\n" +
                ";    \\    /_.'  .'_.' .-. .-./       .--._/    ;\n" +
                "|   _ '-'`      ` /  /o )(o (       (   __    /\n" +
                ";  ( '           ///     _) |'.      `'`  `'-;\n" +
                " \\  `   _       ////  ,__   /  `,            _)\n" +
                "  '. ' ( `--.__.\\  '.  `\"` /              .-'\n" +
                "    '.  '      .-)  /-.__.'`-.  (     .  /\n" +
                "      \\  ' __.' /  /          \\  '---'  |\n" +
                "       `-.'-=\\.'  /     _._\\   \\        /\n" +
                "         '===/   /`'._.'   _\\_  \\-.__.-'\n" +
                "           `|   /`-...--'''      |\n" +
                "            \\__/`-._       __.-'`\n" +
                "                    `\"\"\"\"\"`";
    }

    @Override
    public Biome getPreferredBiome() {
        return Biome.OCEANIC;
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
    public Mermaid clone() {
        return new Mermaid();
    }
}
