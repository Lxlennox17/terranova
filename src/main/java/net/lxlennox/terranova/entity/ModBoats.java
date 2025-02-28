package net.lxlennox.terranova.entity;

import com.terraformersmc.terraform.boat.api.TerraformBoatType;
import com.terraformersmc.terraform.boat.api.TerraformBoatTypeRegistry;
import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.block.ModBlocks;
import net.lxlennox.terranova.item.ModItems;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModBoats {
    public static final Identifier REDWOOD_BOAT_ID = Identifier.of(Terranova.MOD_ID,"redwood_boat");
    public static final Identifier REDWOOD_CHEST_BOAT_ID = Identifier.of(Terranova.MOD_ID,"redwood_chest_boat");
    public static final RegistryKey<TerraformBoatType> REDWOOD_BOAT_KEY = TerraformBoatTypeRegistry.createKey(REDWOOD_BOAT_ID);

    public static TerraformBoatType REDWOOD_TYPE;

    public static final Identifier LAVENDER_BOAT_ID = Identifier.of(Terranova.MOD_ID,"lavender_boat");
    public static final Identifier LAVENDER_CHEST_BOAT_ID = Identifier.of(Terranova.MOD_ID,"lavender_chest_boat");
    public static final RegistryKey<TerraformBoatType> LAVENDER_BOAT_KEY = TerraformBoatTypeRegistry.createKey(LAVENDER_BOAT_ID);

    public static TerraformBoatType LAVENDER_TYPE;

    public static final Identifier SHADOW_BOAT_ID = Identifier.of(Terranova.MOD_ID,"shadow_boat");
    public static final Identifier SHADOW_CHEST_BOAT_ID = Identifier.of(Terranova.MOD_ID,"shadow_chest_boat");
    public static final RegistryKey<TerraformBoatType> SHADOW_BOAT_KEY = TerraformBoatTypeRegistry.createKey(SHADOW_BOAT_ID);

    public static TerraformBoatType SHADOW_TYPE;


    public static TerraformBoatType register(RegistryKey<TerraformBoatType> key, TerraformBoatType type) {
        return Registry.register(TerraformBoatTypeRegistry.INSTANCE, key, type);
    }

    public static void load() {
        REDWOOD_TYPE = register(REDWOOD_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.REDWOOD_BOAT)
                .chestItem(ModItems.REDWOOD_CHEST_BOAT)
                .planks(ModBlocks.REDWOOD_PLANKS.asItem())
                .build());

        LAVENDER_TYPE = register(LAVENDER_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.LAVENDER_BOAT)
                .chestItem(ModItems.LAVENDER_CHEST_BOAT)
                .planks(ModBlocks.LAVENDER_PLANKS.asItem())
                .build());

        SHADOW_TYPE = register(SHADOW_BOAT_KEY, new TerraformBoatType.Builder()
                .item(ModItems.SHADOW_BOAT)
                .chestItem(ModItems.SHADOW_CHEST_BOAT)
                .planks(ModBlocks.SHADOW_PLANKS.asItem())
                .build());


    }
}
