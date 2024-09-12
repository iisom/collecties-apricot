package com.galvanize.collecties.collectie.species;

import com.galvanize.collecties.Biome;
import com.galvanize.collecties.collectie.Collectie;
import com.galvanize.collecties.collectie.CollectieType;

public class Peacock extends Collectie {

    public Peacock() {
        super(CollectieType.DOMESTIC, "Squawk");
    }


//    @Override
//    public String getGraphic() {
//        return  "  (\n" +
//                "  `-`-.\n" +
//                "  '( @ >\n" +
//                "   _) (\n" +
//                "  /    )\n" +
//                " /_,'  / \n" +
//                "   \\  / \n" +
//                "===m\"\"m===";
//    }

    @Override
    public String getGraphic() {
        return  "                                                             o\n" +
                "                                                            o%\n" +
                "                                                           //\n" +
                "                                                      -=\"~\\\n" +
                "                                                        ~\\\\\\\n" +
                "                                                          \\\\\\\n" +
                "                                                           \\\\\\\n" +
                "                                                            );\\\n" +
                "                                                           /|;;\\\n" +
                "                                                      \"\"\";;;;;;;\\\n" +
                "                                                ///\"\"\"\"\"\"\"\";;;;;;\\\n" +
                "                                    ___////+++++\"\"\"\"\"\"\"\"\"\"\"\"\";;;@@\\\n" +
                "                      __________///////++++++++++++++\"\"\"\"\"\"\"\"@@@@%)\n" +
                "           ....__/0)///0)//0)//0)/++////////++++++++++\"\"\"@@@%%%%%/\n" +
                "     ..---0)/--------////////////////+++++++/////+++++@@%%%%%%%/\n" +
                "      ..///---0)---0)///0)//0)///0)/////////+++++====@%%%%%%/\n" +
                "   ...0)....//----///------////////////+++++///\"     \\/\\\\//\n" +
                "      //../0)--0)///0)///0)///0)//++++/////          /  \\/\n" +
                "      --///--------///////////+++/////             _/   /\n" +
                ".-//..0).-/0)--0)--0)--0)--..                      /\\  /\n" +
                "       .......--/////////.                            /\\_\n" +
                "            .0)..0)..";
    }

    @Override
    public Biome getPreferredBiome() {
        return Biome.WOODLAND;
    }

    @Override
    public int performAttack() {
        return 0;
    }

    @Override
    public boolean defend(int attackStrength) {
        return false;
    }

    @Override
    public Peacock clone() {
        return new Peacock();
    }


}
