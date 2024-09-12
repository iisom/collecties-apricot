package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class PixiePuffs implements Consumable{

    @Override
    public String getName() { return "Pixie Puffs";}

    @Override
    public boolean consume() {return true;}

    @Override
    public Consumable clone() {return new PixiePuffs();}

    @Override
    public Biome getContainingBiome() {
        return Biome.PLAINS;
    }
}
