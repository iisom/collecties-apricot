package com.galvanize.collecties.consumable;

import com.galvanize.collecties.Biome;

public class DinoRibs implements Consumable
{
    private int ribs = 5;

    @Override
    public String getName()
    {
        return String.format(
    "Half rack of Dino Ribs with BBQ Sauce (%d)",
                ribs
        );
    }

    @Override
    public boolean consume()
    {
        if(ribs == 0) return true;

        ribs--;
        return ribs == 0;
    }

    @Override
    public Consumable clone()
    {
        return new DinoRibs();
    }

    @Override
    public Biome getContainingBiome() {
        return Biome.BOG;
    }

}
