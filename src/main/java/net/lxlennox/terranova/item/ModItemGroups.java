package net.lxlennox.terranova.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.jpountz.lz4.LZ4FrameOutputStream;
import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {



    public static final ItemGroup REDWOOD_FOREST_BLOCKS_GROUP= Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Terranova.MOD_ID,"redwood_forest_blocks"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModBlocks.REDWOOD_LOG))
                    .displayName(Text.translatable("itemgroup.terranova.redwood_forest"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.REDWOOD_LOG);
                        entries.add(ModBlocks.REDWOOD_WOOD);
                        entries.add(ModBlocks.STRIPPED_REDWOOD_LOG);
                        entries.add(ModBlocks.STRIPPED_REDWOOD_WOOD);
                        entries.add(ModBlocks.REDWOOD_PLANKS);
                        entries.add(ModBlocks.REDWOOD_LEAVES);
                        entries.add(ModBlocks.REDWOOD_SAPLING);
                        entries.add(ModBlocks.REDWOOD_STAIRS);
                        entries.add(ModBlocks.REDWOOD_SLAB);
                        entries.add(ModBlocks.REDWOOD_BUTTON);
                        entries.add(ModBlocks.REDWOOD_PRESSURE_PLATE);
                        entries.add(ModBlocks.REDWOOD_FENCE);
                        entries.add(ModBlocks.REDWOOD_FENCE_GATE);
                        entries.add(ModItems.REDWOOD_BOAT);
                        entries.add(ModItems.REDWOOD_CHEST_BOAT);
                        entries.add(ModItems.REDWOOD_SIGN);
                        entries.add(ModItems.REDWOOD_HANGING_SIGN);
                        entries.add(ModBlocks.REDWOOD_DOOR);
                        entries.add(ModBlocks.REDWOOD_TRAPDOOR);
                        entries.add(ModItems.DEER_SPAWN_EGG);
                    }).build());

    public static final ItemGroup LAVENDER_FIELDS_BLOCKS_GROUP= Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Terranova.MOD_ID,"lavender_fields_blocks"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModBlocks.LAVENDER_LOG))
                    .displayName(Text.translatable("itemgroup.terranova.lavender_fields"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.LAVENDER_LOG);
                        entries.add(ModBlocks.LAVENDER_WOOD);
                        entries.add(ModBlocks.STRIPPED_LAVENDER_LOG);
                        entries.add(ModBlocks.STRIPPED_LAVENDER_WOOD);
                        entries.add(ModBlocks.LAVENDER_PLANKS);
                        entries.add(ModBlocks.LAVENDER_LEAVES);
                        entries.add(ModBlocks.LAVENDER_SAPLING);
                        entries.add(ModBlocks.LAVENDER_STAIRS);
                        entries.add(ModBlocks.LAVENDER_SLAB);
                        entries.add(ModBlocks.LAVENDER_BUTTON);
                        entries.add(ModBlocks.LAVENDER_PRESSURE_PLATE);
                        entries.add(ModBlocks.LAVENDER_FENCE);
                        entries.add(ModBlocks.LAVENDER_FENCE_GATE);
                        entries.add(ModItems.LAVENDER_BOAT);
                        entries.add(ModItems.LAVENDER_CHEST_BOAT);
                        entries.add(ModItems.LAVENDER_SIGN);
                        entries.add(ModItems.LAVENDER_HANGING_SIGN);
                        entries.add(ModBlocks.LAVENDER_DOOR);
                        entries.add(ModBlocks.LAVENDER_TRAPDOOR);
                   entries.add(ModBlocks.LAVENDER_BUSH);
                        entries.add(ModBlocks.LAVENDER);


                    }).build());

    public static final ItemGroup SHADOW_FOREST_BLOCKS_GROUP= Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Terranova.MOD_ID,"shadow_forest_blocks"),
            FabricItemGroup.builder().icon(()->new ItemStack(ModBlocks.SHADOW_LOG))
                    .displayName(Text.translatable("itemgroup.terranova.shadow_forest"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.SHADOW_LOG);
                        entries.add(ModBlocks.SHADOW_WOOD);
                        entries.add(ModBlocks.STRIPPED_SHADOW_LOG);
                        entries.add(ModBlocks.STRIPPED_SHADOW_WOOD);
                        entries.add(ModBlocks.SHADOW_PLANKS);
                       entries.add(ModBlocks.SHADOW_LEAVES);
                        entries.add(ModBlocks.SHADOW_SAPLING);
                       entries.add(ModBlocks.SHADOW_STAIRS);
                        entries.add(ModBlocks.SHADOW_SLAB);
                        entries.add(ModBlocks.SHADOW_BUTTON);
                        entries.add(ModBlocks.SHADOW_PRESSURE_PLATE);
                        entries.add(ModBlocks.SHADOW_FENCE);
                        entries.add(ModBlocks.SHADOW_FENCE_GATE);
                        entries.add(ModItems.SHADOW_BOAT);
                        entries.add(ModItems.SHADOW_CHEST_BOAT);
                        entries.add(ModItems.SHADOW_SIGN);
                        entries.add(ModItems.SHADOW_HANGING_SIGN);
                        entries.add(ModBlocks.SHADOW_DOOR);
                        entries.add(ModBlocks.SHADOW_TRAPDOOR);
                        entries.add(ModBlocks.SHADOW_TORCH);
                        entries.add(ModBlocks.SHADOW_LANTERN);
                        entries.add(ModBlocks.NIGHTBLOOM);
                        entries.add(ModBlocks.GLOWING_MUSHROOM);
                        entries.add(ModBlocks.GLOWING_MUSHROOM_BLOCK);
                        entries.add(ModBlocks.ECLIPSE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_ECLIPSE_ORE);
                        entries.add(ModItems.ECLIPSE_QUARTZ);
                        entries.add(ModBlocks.ECLIPSE_QUARTZ_BLOCK);
                        entries.add(ModBlocks.ECLIPSE_QUARTZ_BRICKS);
                    }).build());






                    public static void registerItemGroups () {
                            Terranova.LOGGER.info("Registering Item Groups for" + Terranova.MOD_ID);
                        }}



