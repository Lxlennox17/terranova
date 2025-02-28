package net.lxlennox.terranova.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.lxlennox.terranova.block.ModBlocks;
import net.lxlennox.terranova.item.ModItems;
import net.minecraft.data.client.*;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.util.Identifier;

import java.util.Optional;


public class ModModelProvider extends FabricModelProvider {


    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerLog(ModBlocks.REDWOOD_LOG).log(ModBlocks.REDWOOD_LOG).wood(ModBlocks.REDWOOD_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_REDWOOD_LOG).log(ModBlocks.STRIPPED_REDWOOD_LOG).wood(ModBlocks.STRIPPED_REDWOOD_WOOD);

        blockStateModelGenerator.registerSingleton(ModBlocks.REDWOOD_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.REDWOOD_SAPLING,ModBlocks.POTTED_REDWOOD_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);



        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_REDWOOD_LOG, ModBlocks.REDWOOD_HANGING_SIGN, ModBlocks.REDWOOD_WALL_HANGING_SIGN);

       var redwoodFamily = new BlockFamily.Builder(ModBlocks.REDWOOD_PLANKS)

               .button(ModBlocks.REDWOOD_BUTTON)
               .fence(ModBlocks.REDWOOD_FENCE)
               .fenceGate(ModBlocks.REDWOOD_FENCE_GATE)
               .pressurePlate(ModBlocks.REDWOOD_PRESSURE_PLATE)
               .sign(ModBlocks.REDWOOD_SIGN,ModBlocks.REDWOOD_WALL_SIGN)
               .slab(ModBlocks.REDWOOD_SLAB)
               .stairs(ModBlocks.REDWOOD_STAIRS)
              .door(ModBlocks.REDWOOD_DOOR)
              .trapdoor(ModBlocks.REDWOOD_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(redwoodFamily.getBaseBlock())
                .family(redwoodFamily);




        blockStateModelGenerator.registerLog(ModBlocks.LAVENDER_LOG).log(ModBlocks.LAVENDER_LOG).wood(ModBlocks.LAVENDER_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_LAVENDER_LOG).log(ModBlocks.STRIPPED_LAVENDER_LOG).wood(ModBlocks.STRIPPED_LAVENDER_WOOD);

        blockStateModelGenerator.registerSingleton(ModBlocks.LAVENDER_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LAVENDER_SAPLING,ModBlocks.POTTED_LAVENDER_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerDoubleBlock(ModBlocks.LAVENDER_BUSH, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.LAVENDER,ModBlocks.POTTED_LAVENDER, BlockStateModelGenerator.TintType.NOT_TINTED);




        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_LAVENDER_LOG, ModBlocks.LAVENDER_HANGING_SIGN, ModBlocks.LAVENDER_WALL_HANGING_SIGN);

        var lavenderFamily = new BlockFamily.Builder(ModBlocks.LAVENDER_PLANKS)

                .button(ModBlocks.LAVENDER_BUTTON)
                .fence(ModBlocks.LAVENDER_FENCE)
                .fenceGate(ModBlocks.LAVENDER_FENCE_GATE)
                .pressurePlate(ModBlocks.LAVENDER_PRESSURE_PLATE)
                .sign(ModBlocks.LAVENDER_SIGN,ModBlocks.LAVENDER_WALL_SIGN)
                .slab(ModBlocks.LAVENDER_SLAB)
                .stairs(ModBlocks.LAVENDER_STAIRS)
                .door(ModBlocks.LAVENDER_DOOR)
                .trapdoor(ModBlocks.LAVENDER_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(lavenderFamily.getBaseBlock())
                .family(lavenderFamily);

//Shadow Forest




        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECLIPSE_ORE);
       blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_ECLIPSE_ORE);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECLIPSE_QUARTZ_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ECLIPSE_QUARTZ_BRICKS);

        blockStateModelGenerator.registerLantern(ModBlocks.SHADOW_LANTERN);
        blockStateModelGenerator.registerTorch(ModBlocks.SHADOW_TORCH,ModBlocks.WALL_SHADOW_TORCH);
 blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.NIGHTBLOOM,ModBlocks.POTTED_NIGHTBLOOM, BlockStateModelGenerator.TintType.NOT_TINTED);

 blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.GLOWING_MUSHROOM,ModBlocks.POTTED_GLOWING_MUSHROOM, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.GLOWING_MUSHROOM_BLOCK);


        blockStateModelGenerator.registerLog(ModBlocks.SHADOW_LOG).log(ModBlocks.SHADOW_LOG).wood(ModBlocks.SHADOW_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_SHADOW_LOG).log(ModBlocks.STRIPPED_SHADOW_LOG).wood(ModBlocks.STRIPPED_SHADOW_WOOD);

        blockStateModelGenerator.registerSingleton(ModBlocks.SHADOW_LEAVES, TexturedModel.LEAVES);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.SHADOW_SAPLING,ModBlocks.POTTED_SHADOW_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);


        blockStateModelGenerator.registerHangingSign(ModBlocks.STRIPPED_SHADOW_LOG, ModBlocks.SHADOW_HANGING_SIGN, ModBlocks.SHADOW_WALL_HANGING_SIGN);

        var shadowFamily = new BlockFamily.Builder(ModBlocks.SHADOW_PLANKS)

                .button(ModBlocks.SHADOW_BUTTON)
                .fence(ModBlocks.SHADOW_FENCE)
                .fenceGate(ModBlocks.SHADOW_FENCE_GATE)
                .pressurePlate(ModBlocks.SHADOW_PRESSURE_PLATE)
                .sign(ModBlocks.SHADOW_SIGN,ModBlocks.SHADOW_WALL_SIGN)
                .slab(ModBlocks.SHADOW_SLAB)
                .stairs(ModBlocks.SHADOW_STAIRS)
                .door(ModBlocks.SHADOW_DOOR)
                .trapdoor(ModBlocks.SHADOW_TRAPDOOR)
                .group("wooden")
                .unlockCriterionName("has_planks")
                .build();
        blockStateModelGenerator.registerCubeAllModelTexturePool(shadowFamily.getBaseBlock())
                .family(shadowFamily);



    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {


        itemModelGenerator.register(ModItems.REDWOOD_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REDWOOD_CHEST_BOAT, Models.GENERATED);


        itemModelGenerator.register(ModItems.LAVENDER_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.LAVENDER_CHEST_BOAT, Models.GENERATED);

        itemModelGenerator.register(ModItems.SHADOW_BOAT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHADOW_CHEST_BOAT, Models.GENERATED);


        itemModelGenerator.register(ModItems.ECLIPSE_QUARTZ,Models.GENERATED);

        itemModelGenerator.register(ModItems.DEER_SPAWN_EGG,
                new Model(Optional.of(Identifier.of("item/template_spawn_egg")),Optional.empty()));

    }
}
