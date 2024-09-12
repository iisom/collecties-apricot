package com.galvanize.collecties.collectie.species;
import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class NomNomMonster extends Collectie {

    public NomNomMonster() {
        super(CollectieType.DINOSAUR, "Muuunch-Muuuunch");
    }

    @Override
    public String getGraphic() {
        return "    |\\     ____  \n" +
                "    | \\.-./ .-'  \n" +
                "     \\ _  _(     \n" +
                "     | .)(./     \n" +
                "     |   \\(      \n" +
                "     |     \\   | \n" +
                "     |  \\vvv   | \n" +
                "     |  |__    | \n" +
                "    /      `-. | ";
    }

    @Override
    public Biome getPreferredBiome() {
        return Biome.BOG;
    }

    @Override
    public int performAttack() {
        return 4;
    }

    @Override
    public boolean defend(int attackStrength) {
        return false;
    }

    @Override
    public NomNomMonster clone() {
        return new NomNomMonster();
    }
}
