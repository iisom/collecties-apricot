package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class TazTreats implements Consumable {
    @Override
    public String getName() {
        return "Tasty Taz Treats";
    }

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Consumable clone() {
        return new TazTreats();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.TUNDRA;
    }
}
