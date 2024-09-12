package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class DirtyGymSock implements Consumable {@Override
public String getName() {
    return "Dirty Gym Sock";
}

    @Override
    public boolean consume() {
        return true;
    }

    @Override
    public Consumable clone() {
        return new DirtyGymSock();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.BOG;
    }
}
