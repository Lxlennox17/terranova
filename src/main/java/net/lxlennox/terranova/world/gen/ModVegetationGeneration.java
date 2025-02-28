package net.lxlennox.terranova.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.lxlennox.terranova.world.ModPlacedFeatures;
import net.lxlennox.terranova.world.biome.ModBiomes;
import net.minecraft.world.gen.GenerationStep;

public class ModVegetationGeneration {
    public static void generateVegetation(){

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.REDWOOD_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDWOOD_EXTRA_FERN_PLACED_KEY);
   BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.REDWOOD_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDWOOD_PLACED_BUSH_KEY);
BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.REDWOOD_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REDWOOD_MUSHROOMS_PLACED_KEY);
BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.LAVENDER_FIELDS),GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.PATCH_LAVENDER_FLOWER_PLACED_KEY);
BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.LAVENDER_FIELDS),GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.PATCH_LAVENDER_BUSH_PLACED_KEY);
BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.SHADOW_FOREST),GenerationStep.Feature.VEGETAL_DECORATION,ModPlacedFeatures.PATCH_NIGHTBLOOM_PLACED_KEY);




    }
}
