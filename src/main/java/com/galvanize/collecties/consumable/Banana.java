package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class Banana implements Consumable {

    @Override
    public String getName() {
        return "Banana";
    }

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Consumable clone() {
        return new Banana();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.RAINFOREST;
    }
}
