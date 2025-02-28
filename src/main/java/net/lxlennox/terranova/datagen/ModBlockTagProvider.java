package net.lxlennox.terranova.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.lxlennox.terranova.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
        .add(ModBlocks.ECLIPSE_ORE)
        .add(ModBlocks.DEEPSLATE_ECLIPSE_ORE)
        .add(ModBlocks.ECLIPSE_QUARTZ_BLOCK)
        .add(ModBlocks.ECLIPSE_QUARTZ_BRICKS);


getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
        .add(ModBlocks.ECLIPSE_ORE)
        .add(ModBlocks.DEEPSLATE_ECLIPSE_ORE)
        .add(ModBlocks.ECLIPSE_QUARTZ_BLOCK)
        .add(ModBlocks.ECLIPSE_QUARTZ_BRICKS);


        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
        .add(ModBlocks.STRIPPED_REDWOOD_LOG)
        .add(ModBlocks.REDWOOD_LOG)
        .add(ModBlocks.REDWOOD_WOOD)
        .add(ModBlocks.STRIPPED_REDWOOD_WOOD)
        .add(ModBlocks.STRIPPED_LAVENDER_LOG)
        .add(ModBlocks.LAVENDER_LOG)
        .add(ModBlocks.LAVENDER_WOOD)
        .add(ModBlocks.STRIPPED_LAVENDER_WOOD)
        .add(ModBlocks.SHADOW_LOG)
        .add(ModBlocks.SHADOW_WOOD)
                .add(ModBlocks.STRIPPED_SHADOW_LOG)
                .add(ModBlocks.STRIPPED_SHADOW_WOOD);



        getOrCreateTagBuilder(BlockTags.WOODEN_FENCES)
        .add(ModBlocks.REDWOOD_FENCE)
                .add(ModBlocks.LAVENDER_FENCE)
                .add(ModBlocks.SHADOW_FENCE);


getOrCreateTagBuilder(BlockTags.FENCE_GATES)
        .add(ModBlocks.REDWOOD_FENCE_GATE)
.add(ModBlocks.LAVENDER_FENCE_GATE)
        .add(ModBlocks.SHADOW_FENCE_GATE);


        getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
                .add(ModBlocks.REDWOOD_SIGN)
                .add(ModBlocks.LAVENDER_SIGN)
                .add(ModBlocks.SHADOW_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
                .add(ModBlocks.REDWOOD_WALL_SIGN)
                        .add(ModBlocks.LAVENDER_WALL_SIGN)
                .add(ModBlocks.SHADOW_WALL_SIGN);

        getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
                .add(ModBlocks.REDWOOD_HANGING_SIGN)
.add(ModBlocks.LAVENDER_HANGING_SIGN)
                .add(ModBlocks.SHADOW_HANGING_SIGN);

        getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
                .add(ModBlocks.REDWOOD_WALL_HANGING_SIGN)
                .add(ModBlocks.LAVENDER_WALL_HANGING_SIGN)
                .add(ModBlocks.SHADOW_WALL_HANGING_SIGN);

getOrCreateTagBuilder(BlockTags.TALL_FLOWERS)
        .add(ModBlocks.LAVENDER_BUSH);





    }
}
