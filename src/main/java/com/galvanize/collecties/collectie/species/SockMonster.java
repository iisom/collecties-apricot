package com.galvanize.collecties.collectie.species;
import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class SockMonster extends Collectie {

    public SockMonster() {
        super(CollectieType.SPECIAL, "Rip Rip Nam Nam");
    }

    @Override
    public String getGraphic() {
        return "                           .-----.\n" +
                "                            /7  .  (\n" +
                "                           /   .-.  \\\n" +
                "                          /   /   \\  \\\n" +
                "                         / `  )   (   )\n" +
                "                        / `   )   ).  \\\n" +
                "                      .'  _.   \\_/  . |\n" +
                "     .--.           .' _.' )`.        |\n" +
                "    (    `---...._.'   `---.'_)    ..  \\\n" +
                "     \\            `----....___    `. \\  |\n" +
                "      `.           _ ----- _   `._  )/  |\n" +
                "        `.       /\"  \\   /\"  \\`.  `._   |\n" +
                "          `.    ((O)` ) ((O)` ) `.   `._\\\n" +
                "            `-- '`---'   `---' )  `.    `-.\n" +
                "               /                  ` \\      `-.\n" +
                "             .'                      `.       `.\n" +
                "            /                     `  ` `.       `-.\n" +
                "     .--.   \\ ===._____.======. `    `   `. .___.--`     .''''.\n" +
                "    ' .` `-. `.                )`. `   ` ` \\          .' . '  8)\n" +
                "   (8  .  ` `-.`.               ( .  ` `  .`\\      .'  '    ' /\n" +
                "    \\  `. `    `-.               ) ` .   ` ` \\  .'   ' .  '  /\n" +
                "     \\ ` `.  ` . \\`.    .--.     |  ` ) `   .``/   '  // .  /\n" +
                "      `.  ``. .   \\ \\   .-- `.  (  ` /_   ` . / ' .  '/   .'\n" +
                "        `. ` \\  `  \\ \\  '-.   `-'  .'  `-.  `   .  .'/  .'\n" +
                "          \\ `.`.  ` \\ \\    ) /`._.`       `.  ` .  .'  /\n" +
                "           |  `.`. . \\ \\  (.'               `.   .'  .'\n" +
                "        __/  .. \\ \\ ` ) \\                     \\.' .. \\__\n" +
                " .-._.-'     '\"  ) .-'   `.                   (  '\"     `-._.--.\n" +
                "(_________.-====' / .' /\\_)`--..__________..-- `====-. _________)\n" +
                "                 (.'(.'";


    }

    @Override
    public Biome getPreferredBiome() {
        return Biome.WOODLAND;
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
    public SockMonster clone() {
        return new SockMonster();
    }
}
