package net.lxlennox.terranova.world;

import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.block.ModBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;
import java.util.List;



public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> MEGA_REDWOOD_PLACED_KEY = registerKey("mega_redwood_placed");
    public static final RegistryKey<PlacedFeature> REDWOOD_EXTRA_FERN_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Terranova.MOD_ID, "redwood_extra_fern"));
public static final RegistryKey<PlacedFeature>REDWOOD_PLACED_BUSH_KEY=registerKey("redwood_placed_bush");
public static final RegistryKey<PlacedFeature>REDWOOD_PLACED_KEY=registerKey("redwood_placed");
public static final RegistryKey<PlacedFeature>REDWOOD_MUSHROOMS_PLACED_KEY=registerKey("redwood_mushrooms_placed");
    public static final RegistryKey<PlacedFeature>LAVENDER_PLACED_KEY=registerKey("lavender_placed");
    public static final RegistryKey<PlacedFeature>PATCH_LAVENDER_FLOWER_PLACED_KEY=registerKey("patch_lavender_flower_placed");
    public static final RegistryKey<PlacedFeature>PATCH_LAVENDER_BUSH_PLACED_KEY=registerKey("patch_lavender_bush_placed");
     public static final RegistryKey<PlacedFeature>BEE_LAVENDER_PLACED_KEY=registerKey("bee_lavender_placed");
 public static final RegistryKey<PlacedFeature>PATCH_NIGHTBLOOM_PLACED_KEY=registerKey("patch_nightbloom_placed");
 public static final RegistryKey<PlacedFeature>ECLIPSE_ORE_PLACED_KEY=registerKey("eclipse_ore_placed");
public static final RegistryKey<PlacedFeature>SHADOW_TREE_PLACED_KEY=registerKey("shadow_tree_placed");
public static final RegistryKey<PlacedFeature>GLOWING_MUSHROOM_PLACED_KEY=registerKey("glowing_mushroom_placed");





    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatures = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

register(context,ECLIPSE_ORE_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.ECLIPSE_ORE_KEY),
     ModOrePlacement.modifiersWithCount(10,
             HeightRangePlacementModifier.trapezoid(YOffset.fixed(-30),YOffset.fixed(60))));



        register(context, GLOWING_MUSHROOM_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.GLOWING_MUSHROOM_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(1, 0.1f, 0), ModBlocks.GLOWING_MUSHROOM));




        register(context, PATCH_NIGHTBLOOM_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.PATCH_NIGHTBLOOM_KEY),
                new PlacementModifier[]{   RarityFilterPlacementModifier.of(8), SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});



        register(context, PATCH_LAVENDER_BUSH_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.PATCH_LAVENDER_BUSH_KEY),
                new PlacementModifier[]{   RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});

      register(context, PATCH_LAVENDER_FLOWER_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.PATCH_LAVENDER_FLOWER_KEY),
              new PlacementModifier[]{   RarityFilterPlacementModifier.of(2), SquarePlacementModifier.of(),
                        PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});



        register(context,REDWOOD_MUSHROOMS_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.REDWOOD_MUSHROOMS_KEY),
                RarityFilterPlacementModifier.of(32),SquarePlacementModifier.of(),PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,BiomePlacementModifier.of());


        register(context,REDWOOD_EXTRA_FERN_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.EXTRA_TAIGA_GRASS_KEY),
        RarityFilterPlacementModifier.of(16),SquarePlacementModifier.of(),PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,BiomePlacementModifier.of());

register(context,REDWOOD_PLACED_BUSH_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.REDWOOD_BUSH_KEY),
        VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(2, 0.1f, 1), ModBlocks.REDWOOD_SAPLING));


       register(context, SHADOW_TREE_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.SHADOW_TREE_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1f, 1), ModBlocks.SHADOW_SAPLING));





        register(context, MEGA_REDWOOD_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.MEGA_REDWOOD_KEY),
                VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                        PlacedFeatures.createCountExtraModifier(10, 0.1f, 1), ModBlocks.REDWOOD_SAPLING));




 register(context,REDWOOD_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.REDWOOD_KEY),
     VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
         PlacedFeatures.createCountExtraModifier(2,0.1f,1), ModBlocks.REDWOOD_SAPLING));


register(context,LAVENDER_PLACED_KEY,configuredFeatures.getOrThrow(ModConfiguredFeatures.LAVENDER_KEY),
        VegetationPlacedFeatures.treeModifiersWithWouldSurvive(
                PlacedFeatures.createCountExtraModifier(5,0.1f,1),ModBlocks.LAVENDER_SAPLING));


        PlacedFeatures.register(context, BEE_LAVENDER_PLACED_KEY, configuredFeatures.getOrThrow(ModConfiguredFeatures.BEE_LAVENDER_KEY),
                new PlacementModifier[]{PlacedFeatures.wouldSurvive(Blocks.CHERRY_SAPLING)});









    }


    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of(Terranova.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key,
                                                                                   RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                                                                   PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));

    }
}



