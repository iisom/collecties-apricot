package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class Oyster implements Consumable {
    @Override
    public String getName() {
        return "Oyster";
    }

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Consumable clone() {
        return new Oyster();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.OCEANIC;
    }
}
