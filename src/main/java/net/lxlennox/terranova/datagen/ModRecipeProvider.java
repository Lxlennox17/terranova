package net.lxlennox.terranova.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.block.ModBlocks;

import net.lxlennox.terranova.item.ModItems;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // Redwood Plank Recipes
        List<ItemConvertible> REDWOOD_PLANKS = List.of(
                ModBlocks.REDWOOD_LOG,
                ModBlocks.REDWOOD_WOOD,
                ModBlocks.STRIPPED_REDWOOD_LOG,
                ModBlocks.STRIPPED_REDWOOD_WOOD);

        for (ItemConvertible inputRedwood : REDWOOD_PLANKS) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REDWOOD_PLANKS, 4)
                    .input(inputRedwood)
                    .criterion("has_" + inputRedwood.asItem().getTranslationKey(),
                            InventoryChangedCriterion.Conditions.items(inputRedwood.asItem()))
                    .offerTo(exporter, Identifier.of(Terranova.MOD_ID, inputRedwood.asItem().getTranslationKey() + "_to_redwood_planks"));
        }

        // Lavender Plank Recipes
        List<ItemConvertible> LAVENDER_PLANKS = List.of(
                ModBlocks.LAVENDER_LOG,
                ModBlocks.LAVENDER_WOOD,
                ModBlocks.STRIPPED_LAVENDER_LOG,
                ModBlocks.STRIPPED_LAVENDER_WOOD);

        for (ItemConvertible inputLavender : LAVENDER_PLANKS) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LAVENDER_PLANKS, 4)
                    .input(inputLavender)
                    .criterion("has_" + inputLavender.asItem().getTranslationKey(),
                            InventoryChangedCriterion.Conditions.items(inputLavender.asItem()))
                    .offerTo(exporter, Identifier.of(Terranova.MOD_ID, inputLavender.asItem().getTranslationKey() + "_to_lavender_planks"));
        }

        // Magenta Dye Recipes
        List<ItemConvertible> MAGENTA_DYE = List.of(
                ModBlocks.LAVENDER,
                ModBlocks.LAVENDER_BUSH);

        for (ItemConvertible inputMagenta : MAGENTA_DYE) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, Items.MAGENTA_DYE, 2)
                    .input(inputMagenta)
                    .criterion("has_" + inputMagenta.asItem().getTranslationKey(),
                            InventoryChangedCriterion.Conditions.items(inputMagenta.asItem()))
                    .offerTo(exporter, Identifier.of(Terranova.MOD_ID, inputMagenta.asItem().getTranslationKey() + "_to_magenta_dye"));
        }
        // SHADOW Plank Recipes
        List<ItemConvertible> SHADOW_PLANKS = List.of(
                ModBlocks.SHADOW_LOG,
                ModBlocks.SHADOW_WOOD);

        for (ItemConvertible inputShadow : SHADOW_PLANKS) {
            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SHADOW_PLANKS, 4)
                    .input(inputShadow)
                    .criterion("has_" + inputShadow.asItem().getTranslationKey(),
                            InventoryChangedCriterion.Conditions.items(inputShadow.asItem()))
                    .offerTo(exporter, Identifier.of(Terranova.MOD_ID, inputShadow.asItem().getTranslationKey() + "_to_shadow_planks"));
        }







//Redwood

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REDWOOD_WOOD)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.REDWOOD_LOG)
                .criterion(hasItem(ModBlocks.REDWOOD_LOG), conditionsFromItem(ModBlocks.REDWOOD_WOOD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STRIPPED_REDWOOD_WOOD)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.STRIPPED_REDWOOD_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_REDWOOD_LOG), conditionsFromItem(ModBlocks.STRIPPED_REDWOOD_WOOD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.STICK)
                .pattern("R")
                .pattern("R")
                .input('R', ModBlocks.REDWOOD_PLANKS)
                .criterion(hasItem(ModBlocks.REDWOOD_PLANKS), conditionsFromItem(Items.STICK))
                .offerTo(exporter);



        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.REDWOOD_SLAB, ModBlocks.REDWOOD_PLANKS);

        createStairsRecipe(ModBlocks.REDWOOD_STAIRS, Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS))
                .criterion(hasItem(ModBlocks.REDWOOD_PLANKS), conditionsFromItem(ModBlocks.REDWOOD_STAIRS)).offerTo(exporter,
                        Identifier.of("redwood_stairs"));


createFenceRecipe(ModBlocks.REDWOOD_FENCE,Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS))
        .criterion(hasItem(ModBlocks.REDWOOD_PLANKS),conditionsFromItem(ModBlocks.REDWOOD_FENCE)).offerTo(exporter,Identifier.of("redwood_fence"));
createFenceGateRecipe(ModBlocks.REDWOOD_FENCE_GATE,Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS))
        .criterion(hasItem(ModBlocks.REDWOOD_PLANKS),conditionsFromItem(ModBlocks.REDWOOD_FENCE_GATE)).offerTo(exporter,Identifier.of("redwood_fence_gate"));

offerPressurePlateRecipe(exporter,ModBlocks.REDWOOD_PRESSURE_PLATE,ModBlocks.REDWOOD_PLANKS);

ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.REDWOOD_BUTTON)
        .input(ModBlocks.REDWOOD_PLANKS)
        .criterion(hasItem(ModBlocks.REDWOOD_PLANKS), conditionsFromItem(ModBlocks.REDWOOD_BUTTON))
        .offerTo(exporter);

offerHangingSignRecipe(exporter,ModBlocks.REDWOOD_HANGING_SIGN,ModBlocks.STRIPPED_REDWOOD_LOG);

createSignRecipe(ModBlocks.REDWOOD_SIGN,Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS))
        .criterion(hasItem(ModBlocks.REDWOOD_PLANKS),conditionsFromItem(ModBlocks.REDWOOD_SIGN))
        .offerTo(exporter,Identifier.of("redwood_sign"));

createDoorRecipe(ModBlocks.REDWOOD_DOOR,Ingredient.ofItems(ModBlocks.REDWOOD_PLANKS))
        .criterion(hasItem(ModBlocks.REDWOOD_PLANKS),conditionsFromItem(ModBlocks.REDWOOD_DOOR)).offerTo(exporter,Identifier.of("redwood_door"));





           //Lavender



            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.LAVENDER_WOOD)
                    .pattern("RR")
                    .pattern("RR")
                    .input('R', ModBlocks.LAVENDER_LOG)
                    .criterion(hasItem(ModBlocks.LAVENDER_LOG), conditionsFromItem(ModBlocks.LAVENDER_WOOD))
                    .offerTo(exporter);

            ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STRIPPED_LAVENDER_WOOD)
                    .pattern("RR")
                    .pattern("RR")
                    .input('R', ModBlocks.STRIPPED_LAVENDER_LOG)
                    .criterion(hasItem(ModBlocks.STRIPPED_LAVENDER_LOG), conditionsFromItem(ModBlocks.STRIPPED_LAVENDER_WOOD))
                    .offerTo(exporter);




            offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.LAVENDER_SLAB, ModBlocks.LAVENDER_PLANKS);

            createStairsRecipe(ModBlocks.LAVENDER_STAIRS, Ingredient.ofItems(ModBlocks.LAVENDER_PLANKS))
                    .criterion(hasItem(ModBlocks.LAVENDER_PLANKS), conditionsFromItem(ModBlocks.LAVENDER_STAIRS)).offerTo(exporter,
                            Identifier.of("lavender_stairs"));


            createFenceRecipe(ModBlocks.LAVENDER_FENCE,Ingredient.ofItems(ModBlocks.LAVENDER_PLANKS))
                    .criterion(hasItem(ModBlocks.LAVENDER_PLANKS),conditionsFromItem(ModBlocks.LAVENDER_FENCE)).offerTo(exporter,Identifier.of("lavender_fence"));
            createFenceGateRecipe(ModBlocks.LAVENDER_FENCE_GATE,Ingredient.ofItems(ModBlocks.LAVENDER_PLANKS))
                    .criterion(hasItem(ModBlocks.LAVENDER_PLANKS),conditionsFromItem(ModBlocks.LAVENDER_FENCE_GATE)).offerTo(exporter,Identifier.of("lavender_fence_gate"));

            offerPressurePlateRecipe(exporter,ModBlocks.LAVENDER_PRESSURE_PLATE,ModBlocks.LAVENDER_PLANKS);

            ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.LAVENDER_BUTTON)
                    .input(ModBlocks.LAVENDER_PLANKS)
                    .criterion(hasItem(ModBlocks.LAVENDER_PLANKS), conditionsFromItem(ModBlocks.LAVENDER_BUTTON))
                    .offerTo(exporter);

            offerHangingSignRecipe(exporter,ModBlocks.LAVENDER_HANGING_SIGN,ModBlocks.STRIPPED_LAVENDER_LOG);

            createSignRecipe(ModBlocks.LAVENDER_SIGN,Ingredient.ofItems(ModBlocks.LAVENDER_PLANKS))
                    .criterion(hasItem(ModBlocks.LAVENDER_PLANKS),conditionsFromItem(ModBlocks.LAVENDER_SIGN))
                    .offerTo(exporter,Identifier.of("lavender_sign"));

            createDoorRecipe(ModBlocks.LAVENDER_DOOR,Ingredient.ofItems(ModBlocks.LAVENDER_PLANKS))
                    .criterion(hasItem(ModBlocks.LAVENDER_PLANKS),conditionsFromItem(ModBlocks.LAVENDER_DOOR)).offerTo(exporter,Identifier.of("lavender_door"));





        //Shadow

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.SHADOW_WOOD)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.SHADOW_LOG)
                .criterion(hasItem(ModBlocks.SHADOW_LOG), conditionsFromItem(ModBlocks.SHADOW_WOOD))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.STRIPPED_SHADOW_WOOD)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.STRIPPED_SHADOW_LOG)
                .criterion(hasItem(ModBlocks.STRIPPED_SHADOW_LOG), conditionsFromItem(ModBlocks.STRIPPED_SHADOW_WOOD))
                .offerTo(exporter);




        offerSlabRecipe(exporter, RecipeCategory.MISC, ModBlocks.SHADOW_SLAB, ModBlocks.SHADOW_PLANKS);

        createStairsRecipe(ModBlocks.SHADOW_STAIRS, Ingredient.ofItems(ModBlocks.SHADOW_PLANKS))
                .criterion(hasItem(ModBlocks.SHADOW_PLANKS), conditionsFromItem(ModBlocks.SHADOW_STAIRS)).offerTo(exporter,
                        Identifier.of("shadow_stairs"));


        createFenceRecipe(ModBlocks.SHADOW_FENCE,Ingredient.ofItems(ModBlocks.SHADOW_PLANKS))
                .criterion(hasItem(ModBlocks.SHADOW_PLANKS),conditionsFromItem(ModBlocks.SHADOW_FENCE)).offerTo(exporter,Identifier.of("shadow_fence"));
        createFenceGateRecipe(ModBlocks.SHADOW_FENCE_GATE,Ingredient.ofItems(ModBlocks.SHADOW_PLANKS))
                .criterion(hasItem(ModBlocks.SHADOW_PLANKS),conditionsFromItem(ModBlocks.SHADOW_FENCE_GATE)).offerTo(exporter,Identifier.of("shadow_fence_gate"));

        offerPressurePlateRecipe(exporter,ModBlocks.SHADOW_PRESSURE_PLATE,ModBlocks.SHADOW_PLANKS);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.SHADOW_BUTTON)
                .input(ModBlocks.SHADOW_PLANKS)
                .criterion(hasItem(ModBlocks.SHADOW_PLANKS), conditionsFromItem(ModBlocks.SHADOW_BUTTON))
                .offerTo(exporter);

        offerHangingSignRecipe(exporter,ModBlocks.SHADOW_HANGING_SIGN,ModBlocks.STRIPPED_SHADOW_LOG);

        createSignRecipe(ModBlocks.SHADOW_SIGN,Ingredient.ofItems(ModBlocks.SHADOW_PLANKS))
                .criterion(hasItem(ModBlocks.SHADOW_PLANKS),conditionsFromItem(ModBlocks.SHADOW_SIGN))
                .offerTo(exporter,Identifier.of("shadow_sign"));

        createDoorRecipe(ModBlocks.SHADOW_DOOR,Ingredient.ofItems(ModBlocks.SHADOW_PLANKS))
                .criterion(hasItem(ModBlocks.SHADOW_PLANKS),conditionsFromItem(ModBlocks.SHADOW_DOOR)).offerTo(exporter,Identifier.of("shadow_door"));





        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ECLIPSE_QUARTZ_BLOCK)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModItems.ECLIPSE_QUARTZ)
                .criterion(hasItem(ModItems.ECLIPSE_QUARTZ), conditionsFromItem(ModBlocks.ECLIPSE_QUARTZ_BLOCK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.ECLIPSE_QUARTZ_BRICKS)
                .pattern("RR")
                .pattern("RR")
                .input('R', ModBlocks.ECLIPSE_QUARTZ_BLOCK)
                .criterion(hasItem(ModBlocks.ECLIPSE_QUARTZ_BLOCK), conditionsFromItem(ModBlocks.ECLIPSE_QUARTZ_BRICKS))
                .offerTo(exporter);











    }




}

