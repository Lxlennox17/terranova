package net.lxlennox.terranova.world.gen;



public class ModWorldGeneration {

    public static void generateModWorldGen() {
   ModTreeGeneration.generateTrees();
ModVegetationGeneration.generateVegetation();
ModOreGeneration.generateOres();
ModEntitiesSpawns.addSpawns();
    }
}

