package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class Mango implements Consumable {
    @Override
    public String getName() {
        return "yummy mango";
    }

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Consumable clone() {
        return new Mango();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.MOUNTAIN_RANGE;
    }
}
