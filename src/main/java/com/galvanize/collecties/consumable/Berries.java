package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class Berries implements Consumable {

    private int quantity = 5;

    @Override
    public String getName() {
        return String.format("Berries %d", quantity);
    }

    @Override
    public boolean consume() {
        return quantity != 0;
    }

    @Override
    public Consumable clone() {
        return new Berries();
    }

    int setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.WOODLAND;
    }
}
