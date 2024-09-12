package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class Curry implements Consumable {

    @Override
    public String getName() {
        return "Nom Nom's Hot and Spicy Curry";
    }

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Curry clone() {
        return new Curry();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.OCEANIC;
    }

}
