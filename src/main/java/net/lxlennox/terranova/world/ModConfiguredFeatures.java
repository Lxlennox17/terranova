package net.lxlennox.terranova.world;

import com.google.common.collect.ImmutableList;
import net.fabricmc.fabric.mixin.datagen.loot.BlockLootTableGeneratorAccessor;
import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.block.ModBlocks;


import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.MushroomBlock;
import net.minecraft.registry.*;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.intprovider.WeightedListIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.treedecorator.AlterGroundTreeDecorator;
import net.minecraft.world.gen.treedecorator.BeehiveTreeDecorator;
import net.minecraft.world.gen.trunk.*;

import java.util.List;
import java.util.OptionalInt;

import static net.minecraft.util.math.intprovider.ConstantIntProvider.*;


public class ModConfiguredFeatures {


    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_KEY = registerKey("redwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MEGA_REDWOOD_KEY = registerKey("mega_redwood");
    public static final RegistryKey<ConfiguredFeature<?, ?>> EXTRA_TAIGA_GRASS_KEY = registerKey("extra_taiga_grass");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_BUSH_KEY = registerKey("redwood_bush");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REDWOOD_MUSHROOMS_KEY = registerKey("redwood_mushrooms");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LAVENDER_KEY = registerKey("lavender");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_LAVENDER_BUSH_KEY = registerKey("patch_lavender_bush");
   public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_LAVENDER_FLOWER_KEY = registerKey("patch_lavender_flower");
   public static final RegistryKey<ConfiguredFeature<?, ?>> BEE_LAVENDER_KEY = registerKey("bee_lavender");
 public static final RegistryKey<ConfiguredFeature<?, ?>> PATCH_NIGHTBLOOM_KEY = registerKey("patch_nightbloom");
public static final RegistryKey<ConfiguredFeature<?, ?>> ECLIPSE_ORE_KEY = registerKey("eclipse_ore");
public static final RegistryKey<ConfiguredFeature<?, ?>> SHADOW_TREE_KEY = registerKey("shadow_tree");
public static final RegistryKey<ConfiguredFeature<?, ?>> GLOWING_MUSHROOM_KEY = registerKey("glowing_mushroom");









    private static TreeFeatureConfig.Builder lavender() {
        return (new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.LAVENDER_LOG), new CherryTrunkPlacer(7, 1, 0,
                new WeightedListIntProvider(DataPool.<IntProvider>builder().add(ConstantIntProvider.create(1), 1).add(ConstantIntProvider.create(2), 1)
                        .add(ConstantIntProvider.create(3), 1).build()), UniformIntProvider.create(2, 4), UniformIntProvider.create(-4, -3),
                UniformIntProvider.create(-1, 0)), BlockStateProvider.of(ModBlocks.LAVENDER_LEAVES), new CherryFoliagePlacer(ConstantIntProvider.create(4),
                ConstantIntProvider.create(0), ConstantIntProvider.create(5), 0.25F, 0.5F, 0.16666667F,
                0.33333334F), new TwoLayersFeatureSize(1, 0, 2))).ignoreVines();
    }

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {

        RuleTest stoneReplaceables= new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
RuleTest deepslateReplaceables=new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);


List<OreFeatureConfig.Target> overworldEclipseOres=
        List.of(OreFeatureConfig.createTarget(stoneReplaceables,ModBlocks.ECLIPSE_ORE.getDefaultState()),
        OreFeatureConfig.createTarget(deepslateReplaceables,ModBlocks.DEEPSLATE_ECLIPSE_ORE.getDefaultState()));

register(context,ECLIPSE_ORE_KEY,Feature.ORE,new OreFeatureConfig(overworldEclipseOres,8));


       register(context, SHADOW_TREE_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.SHADOW_LOG),
                new DarkOakTrunkPlacer(6, 2, 1), BlockStateProvider.of(ModBlocks.SHADOW_LEAVES), new DarkOakFoliagePlacer(ConstantIntProvider.create(0),
                ConstantIntProvider.create(0)), new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())))
                .ignoreVines().build());




       ConfiguredFeatures.register(context, GLOWING_MUSHROOM_KEY, Feature.HUGE_BROWN_MUSHROOM, new HugeMushroomFeatureConfig
                (BlockStateProvider.of((BlockState)((BlockState)ModBlocks.GLOWING_MUSHROOM_BLOCK.getDefaultState().with(MushroomBlock.UP, true))
                        .with(MushroomBlock.DOWN, false)), BlockStateProvider.of((BlockState)((BlockState)Blocks.MUSHROOM_STEM.getDefaultState()
                        .with(MushroomBlock.UP, false)).with(MushroomBlock.DOWN, false)), 3));




        register(context, PATCH_NIGHTBLOOM_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of(ModBlocks.NIGHTBLOOM))));





       register(context, PATCH_LAVENDER_BUSH_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of(ModBlocks.LAVENDER_BUSH))));


        register(context, PATCH_LAVENDER_FLOWER_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig
                        (BlockStateProvider.of(ModBlocks.LAVENDER))));


        register(context,REDWOOD_MUSHROOMS_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.RED_MUSHROOM
                                .getDefaultState())),
                        List.of(Blocks.PODZOL,Blocks.COARSE_DIRT)));



        register(context, EXTRA_TAIGA_GRASS_KEY, Feature.RANDOM_PATCH,
                ConfiguredFeatures.createRandomPatchFeatureConfig(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(Blocks.FERN
                                .getDefaultState())),
                        List.of(Blocks.PODZOL)));

        ConfiguredFeatures.register(context, REDWOOD_BUSH_KEY, Feature.TREE, (new TreeFeatureConfig.Builder(BlockStateProvider.of(ModBlocks.REDWOOD_LOG),
                new StraightTrunkPlacer(1, 0, 0), BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES), new BushFoliagePlacer(create(2),
                create(1), 2), new TwoLayersFeatureSize(0, 0, 0))).build());



        register(context, REDWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.REDWOOD_LOG),
                new StraightTrunkPlacer(5, 2, 1),
                BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                new SpruceFoliagePlacer(UniformIntProvider.create(2, 3), UniformIntProvider.create(0,2),UniformIntProvider.create(1,2)),

                new TwoLayersFeatureSize(2, 0, 2))

                .ignoreVines()
                .build());


        register(context, MEGA_REDWOOD_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.REDWOOD_LOG),
                new GiantTrunkPlacer(16, 2, 14),
                BlockStateProvider.of(ModBlocks.REDWOOD_LEAVES),
                new MegaPineFoliagePlacer(create(0), create(0),UniformIntProvider.create(13,17)),

                new TwoLayersFeatureSize(1, 1, 2))
                .decorators(ImmutableList.of( new AlterGroundTreeDecorator(BlockStateProvider.of(Blocks.PODZOL))))
                .ignoreVines()
                .build());



        BeehiveTreeDecorator modBeehiveTreeDecorator = new BeehiveTreeDecorator(0.9F);


      register(context, LAVENDER_KEY, Feature.TREE, lavender().build());
register(context,BEE_LAVENDER_KEY,Feature.TREE,lavender().decorators(List.of(modBeehiveTreeDecorator)).build());






    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Terranova.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));





    }
}
