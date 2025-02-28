package net.lxlennox.terranova.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.lxlennox.terranova.block.ModBlocks;
import net.lxlennox.terranova.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
  public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {





      //Redwood
        addDrop(ModBlocks.REDWOOD_LOG);
        addDrop(ModBlocks.REDWOOD_WOOD);
        addDrop(ModBlocks.REDWOOD_PLANKS);
        addDrop(ModBlocks.STRIPPED_REDWOOD_LOG);
        addDrop(ModBlocks.STRIPPED_REDWOOD_WOOD);
        addDrop(ModBlocks.REDWOOD_SAPLING);
        addDrop(ModBlocks.REDWOOD_STAIRS);
        addDrop(ModBlocks.REDWOOD_BUTTON);
        addDrop(ModBlocks.REDWOOD_PRESSURE_PLATE);
        addDrop(ModBlocks.REDWOOD_FENCE);
        addDrop(ModBlocks.REDWOOD_FENCE_GATE);
        addDrop(ModBlocks.REDWOOD_LEAVES, leavesDrops(ModBlocks.REDWOOD_LEAVES, ModBlocks.REDWOOD_SAPLING, 0.0625f));
        addDrop(ModBlocks.REDWOOD_SLAB,slabDrops(ModBlocks.REDWOOD_SLAB));
        addDrop(ModBlocks.REDWOOD_SIGN, ModItems.REDWOOD_SIGN);
        addDrop(ModBlocks.REDWOOD_WALL_SIGN, ModItems.REDWOOD_SIGN);
        addDrop(ModBlocks.REDWOOD_HANGING_SIGN, ModItems.REDWOOD_HANGING_SIGN);
        addDrop(ModBlocks.REDWOOD_WALL_HANGING_SIGN, ModItems.REDWOOD_HANGING_SIGN);
addDrop(ModBlocks.REDWOOD_TRAPDOOR);
addDrop(ModBlocks.REDWOOD_DOOR,doorDrops(ModBlocks.REDWOOD_DOOR));
addPottedPlantDrops(ModBlocks.POTTED_REDWOOD_SAPLING);






//Lavender
        addDrop(ModBlocks.LAVENDER_LOG);
        addDrop(ModBlocks.LAVENDER_WOOD);
        addDrop(ModBlocks.LAVENDER_PLANKS);
        addDrop(ModBlocks.STRIPPED_LAVENDER_LOG);
        addDrop(ModBlocks.STRIPPED_LAVENDER_WOOD);
        addDrop(ModBlocks.LAVENDER_SAPLING);
        addDrop(ModBlocks.LAVENDER_STAIRS);
        addDrop(ModBlocks.LAVENDER_BUTTON);
        addDrop(ModBlocks.LAVENDER_PRESSURE_PLATE);
        addDrop(ModBlocks.LAVENDER_FENCE);
        addDrop(ModBlocks.LAVENDER_FENCE_GATE);
        addDrop(ModBlocks.LAVENDER_LEAVES, leavesDrops(ModBlocks.LAVENDER_LEAVES, ModBlocks.LAVENDER_SAPLING, 0.0625f));
        addDrop(ModBlocks.LAVENDER_SLAB,slabDrops(ModBlocks.LAVENDER_SLAB));
        addDrop(ModBlocks.LAVENDER_SIGN, ModItems.LAVENDER_SIGN);
        addDrop(ModBlocks.LAVENDER_WALL_SIGN, ModItems.LAVENDER_SIGN);
        addDrop(ModBlocks.LAVENDER_HANGING_SIGN, ModItems.LAVENDER_HANGING_SIGN);
        addDrop(ModBlocks.LAVENDER_WALL_HANGING_SIGN, ModItems.LAVENDER_HANGING_SIGN);
        addDrop(ModBlocks.LAVENDER_TRAPDOOR);
        addDrop(ModBlocks.LAVENDER_DOOR,doorDrops(ModBlocks.LAVENDER_DOOR));
addDrop(ModBlocks.LAVENDER_BUSH,tallPlantDrops(ModBlocks.LAVENDER_BUSH,ModBlocks.LAVENDER_BUSH));
addDrop(ModBlocks.LAVENDER);
addPottedPlantDrops(ModBlocks.POTTED_LAVENDER);
addPottedPlantDrops(ModBlocks.POTTED_LAVENDER_SAPLING);



//Shadow Forest




        addDrop(ModBlocks.SHADOW_LOG);
        addDrop(ModBlocks.SHADOW_PLANKS);
        addDrop(ModBlocks.SHADOW_WOOD);
        addDrop(ModBlocks.STRIPPED_SHADOW_LOG);
        addDrop(ModBlocks.STRIPPED_SHADOW_WOOD);
        addDrop(ModBlocks.SHADOW_SAPLING);
        addDrop(ModBlocks.SHADOW_STAIRS);
        addDrop(ModBlocks.SHADOW_BUTTON);
        addDrop(ModBlocks.SHADOW_PRESSURE_PLATE);
        addDrop(ModBlocks.SHADOW_FENCE);
        addDrop(ModBlocks.SHADOW_FENCE_GATE);
        addDrop(ModBlocks.SHADOW_LEAVES, leavesDrops(ModBlocks.SHADOW_LEAVES, ModBlocks.SHADOW_SAPLING, 0.0625f));
        addDrop(ModBlocks.SHADOW_SLAB,slabDrops(ModBlocks.SHADOW_SLAB));
        addDrop(ModBlocks.SHADOW_SIGN, ModItems.SHADOW_SIGN);
        addDrop(ModBlocks.SHADOW_WALL_SIGN, ModItems.SHADOW_SIGN);
        addDrop(ModBlocks.SHADOW_HANGING_SIGN, ModItems.SHADOW_HANGING_SIGN);
        addDrop(ModBlocks.SHADOW_WALL_HANGING_SIGN, ModItems.SHADOW_HANGING_SIGN);
        addDrop(ModBlocks.SHADOW_TRAPDOOR);
        addDrop(ModBlocks.SHADOW_DOOR,doorDrops(ModBlocks.SHADOW_DOOR));
        addDrop(ModBlocks.GLOWING_MUSHROOM_BLOCK, leavesDrops(ModBlocks.GLOWING_MUSHROOM_BLOCK, ModBlocks.GLOWING_MUSHROOM, 0.0625f));




addDrop(ModBlocks.ECLIPSE_QUARTZ_BLOCK);
addDrop(ModBlocks.ECLIPSE_QUARTZ_BRICKS);



addDrop(ModBlocks.ECLIPSE_ORE,multipleOreDrops(ModBlocks.ECLIPSE_ORE,ModItems.ECLIPSE_QUARTZ,2,5));
addDrop(ModBlocks.DEEPSLATE_ECLIPSE_ORE,multipleOreDrops(ModBlocks.DEEPSLATE_ECLIPSE_ORE,ModItems.ECLIPSE_QUARTZ,2,5));



addDrop(ModBlocks.SHADOW_LANTERN);
addDrop(ModBlocks.SHADOW_TORCH, ModItems.SHADOW_TORCH);
addDrop(ModBlocks.WALL_SHADOW_TORCH, ModItems.SHADOW_TORCH);
addDrop(ModBlocks.NIGHTBLOOM);
addPottedPlantDrops(ModBlocks.POTTED_NIGHTBLOOM);

        addDrop(ModBlocks.GLOWING_MUSHROOM);
        addPottedPlantDrops(ModBlocks.POTTED_GLOWING_MUSHROOM);


    }
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}

