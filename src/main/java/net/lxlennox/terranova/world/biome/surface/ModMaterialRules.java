package net.lxlennox.terranova.world.biome.surface;

import net.lxlennox.terranova.world.biome.ModBiomes;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.world.gen.noise.NoiseParametersKeys;
import net.minecraft.world.gen.surfacebuilder.MaterialRules;



public class ModMaterialRules {
    private static final MaterialRules.MaterialRule PODZOL = makeStateRule(Blocks.PODZOL);
    private static final MaterialRules.MaterialRule COARSE_DIRT = makeStateRule(Blocks.COARSE_DIRT);
    private static final MaterialRules.MaterialRule GRASS_BLOCK = makeStateRule(Blocks.GRASS_BLOCK);



        public static MaterialRules.MaterialRule overworld () {

            MaterialRules.MaterialCondition isAtOrAboveWaterLevel = MaterialRules.water(-1, 0);

            MaterialRules.MaterialRule biomesSurface =
                    MaterialRules.condition(
                            MaterialRules.biome(ModBiomes.REDWOOD_FOREST),
                    MaterialRules.condition(
                            MaterialRules.STONE_DEPTH_FLOOR,
                            MaterialRules.condition(
                                    isAtOrAboveWaterLevel,
                                            MaterialRules.sequence(
                                                    MaterialRules.condition(surfaceNoiseAbove(1.75), COARSE_DIRT),
                                                    MaterialRules.condition(surfaceNoiseAbove(-0.95), PODZOL)
                                            )
                                    )
                            )
                    );


            return MaterialRules.condition(MaterialRules.surface(), biomesSurface);
        }


        private static MaterialRules.MaterialCondition surfaceNoiseAbove ( double min){
            return MaterialRules.noiseThreshold(NoiseParametersKeys.SURFACE, min / 8.25, Double.MAX_VALUE);
        }

        private static MaterialRules.MaterialRule makeStateRule (Block block){
            return MaterialRules.block(block.getDefaultState());
        }

    }
