package net.lxlennox.terranova.world.tree;

import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;
import net.minecraft.world.gen.feature.TreeConfiguredFeatures;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator REDWOOD = new SaplingGenerator(Terranova.MOD_ID + ":redwood",
            Optional.of(ModConfiguredFeatures.MEGA_REDWOOD_KEY), Optional.of(ModConfiguredFeatures.REDWOOD_KEY), Optional.empty());

    public static final SaplingGenerator LAVENDER=new SaplingGenerator(Terranova.MOD_ID+":lavender",
        Optional.empty(),Optional.of(ModConfiguredFeatures.LAVENDER_KEY),Optional.of(ModConfiguredFeatures.BEE_LAVENDER_KEY));

    public static final SaplingGenerator SHADOW=new SaplingGenerator(Terranova.MOD_ID+":shadow",
        Optional.of(ModConfiguredFeatures.SHADOW_TREE_KEY),Optional.empty(),Optional.empty());

     public static final SaplingGenerator GLOWING_MUSHROOM=new SaplingGenerator(Terranova.MOD_ID+":glowing_mushroom",
        Optional.of(ModConfiguredFeatures.GLOWING_MUSHROOM_KEY),Optional.empty(),Optional.empty());





}
