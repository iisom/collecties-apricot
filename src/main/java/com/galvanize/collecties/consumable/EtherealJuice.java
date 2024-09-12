package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class EtherealJuice implements Consumable {
    @Override
    public String getName() {
        return "Nyxalon's Ethereal Juice";
    }

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Consumable clone() {
        return new EtherealJuice();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.RAINFOREST;
    }
}
