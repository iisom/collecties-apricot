package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class PeanutButterShake implements Consumable {
    @Override
    public String getName() {
        return "Peanut Butter Shake Drink";
    }

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Consumable clone() {
        return new PeanutButterShake();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.TAIGA;
    }
}