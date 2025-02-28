package net.lxlennox.terranova.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.lxlennox.terranova.world.ModPlacedFeatures;
import net.lxlennox.terranova.world.biome.ModBiomes;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModOreGeneration {
    public static void generateOres(){
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.SHADOW_FOREST), GenerationStep.Feature.UNDERGROUND_ORES,
                ModPlacedFeatures.ECLIPSE_ORE_PLACED_KEY);
    }
}
