package net.lxlennox.terranova.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.lxlennox.terranova.world.ModPlacedFeatures;
import net.lxlennox.terranova.world.biome.ModBiomes;
import net.minecraft.world.gen.GenerationStep;

public class ModTreeGeneration{
    public static void generateTrees(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.REDWOOD_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MEGA_REDWOOD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.REDWOOD_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDWOOD_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.LAVENDER_FIELDS),
                GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.LAVENDER_PLACED_KEY);

BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.LAVENDER_FIELDS),
     GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.BEE_LAVENDER_PLACED_KEY);

BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.SHADOW_FOREST),
        GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.SHADOW_TREE_PLACED_KEY);

BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.SHADOW_FOREST),
        GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.GLOWING_MUSHROOM_PLACED_KEY);



    }
}
