package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieStatus;

public class RevivePill implements Consumable {

    private int pills = 1;

    @Override
    public String getName() {
        return String.format(
                "Revive Pill (%d)",
                pills);
    }

    @Override
    public boolean consume() {
        if(pills == 0) return true;

        pills--;
        return pills == 0;
    }

    @Override
    public Consumable clone() {
        return new RevivePill();
    }
    @Override
    public Biome getContainingBiome() {
        return Biome.VOLCANIC;
    }

}
