package com.galvanize.collecties.collectie.species;
import com.galvanize.collecties.Biome;
import com.galvanize.collecties.Game;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Kamon extends Collectie
{
    public Kamon()
    {
        super(CollectieType.ELEMENTAL, "GRRAWARA");
    }

    public String getGraphic()
    {
        return ""
                + "                     /\\          \n"
                + "            ________/  \\____     \n"
                + "           /                \\   \n"
                + "          /    _       _     \\   \n"
                + "   ____  /   _/ \\___/ \\_    \\  \n"
                + "  /    \\ \\___/         \\____/  \n"
                + " /       \\___\\__\\_\\_/__/___/      \n"
                + "|       /       /o\\/o\\        \\    \n"
                + " \\     /                 \\       \\   \n"
                + "  \\    |   o             o|       |   \n"
                + "  |     \\                 /     /    \n"
                + "   \\    \\_   -----______/    /    \n"
                + "    \\      \\____/    \\_____/    \n"
                + "     \\       /            /     \n"
                + "      \\_____/            /      \n"
                + "         \\      /\\      /         \n"
                + "          \\____/  \\____/          \n";
    }

    @Override
    public Biome getPreferredBiome()
    {
        return Biome.TUNDRA;
    }

    @Override
    public int performAttack()
    {
        return 12;
    }

    @Override
    public boolean defend(int attackStrength) {
        if(Game.TEST_MODE)
        {
            return false;
        }
        return true;
//        return Game.randogen.nextInt(100) > 50;
    }

    @Override
    public Kamon clone()
    {
        return new Kamon();
    }

}
