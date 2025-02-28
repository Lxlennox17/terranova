package net.lxlennox.terranova.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lxlennox.terranova.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {






        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
        .add(ModBlocks.REDWOOD_LOG.asItem())
        .add(ModBlocks.REDWOOD_WOOD.asItem())
   .add(ModBlocks.STRIPPED_REDWOOD_WOOD.asItem())
   .add(ModBlocks.STRIPPED_REDWOOD_LOG.asItem())
       .add(ModBlocks.LAVENDER_LOG.asItem())
        .add(ModBlocks.LAVENDER_WOOD.asItem())
   .add(ModBlocks.STRIPPED_LAVENDER_WOOD.asItem())
   .add(ModBlocks.STRIPPED_LAVENDER_LOG.asItem())
           .add(ModBlocks.SHADOW_LOG.asItem())
        .add(ModBlocks.SHADOW_WOOD.asItem())
                .add(ModBlocks.STRIPPED_SHADOW_LOG.asItem())
                .add(ModBlocks.STRIPPED_SHADOW_WOOD.asItem());


getOrCreateTagBuilder(ItemTags.PLANKS)
        .add(ModBlocks.REDWOOD_PLANKS.asItem())
        .add(ModBlocks.LAVENDER_PLANKS.asItem())
        .add(ModBlocks.SHADOW_PLANKS.asItem());






    }
}

