package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class Cookie implements Consumable {

    private int cookies = 3;

    @Override
    public String getName() {
        return String.format(
                "Small cookies (%d)",
                cookies);
    }

    @Override
    public boolean consume() {
        if(cookies == 0) return true;

        cookies--;
        return cookies == 0;
    }

    @Override
    public Consumable clone() {
        return new Cookie();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.TUNDRA;
    }

}
