package net.lxlennox.terranova.item;



import com.terraformersmc.terraform.boat.api.item.TerraformBoatItemHelper;
import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.block.ModBlocks;
import net.lxlennox.terranova.entity.ModBoats;
import net.lxlennox.terranova.entity.ModEntities;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public class ModItems {

    public static final Item REDWOOD_SIGN = registerItem("redwood_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.REDWOOD_SIGN, ModBlocks.REDWOOD_WALL_SIGN));

    public static final Item REDWOOD_HANGING_SIGN = registerItem("redwood_hanging_sign",
            new HangingSignItem(ModBlocks.REDWOOD_HANGING_SIGN, ModBlocks.REDWOOD_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item REDWOOD_BOAT =
            TerraformBoatItemHelper.registerBoatItem(ModBoats.REDWOOD_BOAT_ID,ModBoats.REDWOOD_BOAT_KEY, false);

    public static final Item REDWOOD_CHEST_BOAT =
            TerraformBoatItemHelper.registerBoatItem(ModBoats.REDWOOD_CHEST_BOAT_ID, ModBoats.REDWOOD_BOAT_KEY, true);

public static final Item DEER_SPAWN_EGG=registerItem("deer_spawn_egg",
        new SpawnEggItem(ModEntities.DEER,0x3A291D,0x705840 ,new Item.Settings()));






    public static final Item LAVENDER_SIGN = registerItem("lavender_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.LAVENDER_SIGN, ModBlocks.LAVENDER_WALL_SIGN));

    public static final Item LAVENDER_HANGING_SIGN = registerItem("lavender_hanging_sign",
            new HangingSignItem(ModBlocks.LAVENDER_HANGING_SIGN, ModBlocks.LAVENDER_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));


    public static final Item LAVENDER_BOAT =
            TerraformBoatItemHelper.registerBoatItem(ModBoats.LAVENDER_BOAT_ID,ModBoats.LAVENDER_BOAT_KEY, false);

    public static final Item LAVENDER_CHEST_BOAT =
            TerraformBoatItemHelper.registerBoatItem(ModBoats.LAVENDER_CHEST_BOAT_ID, ModBoats.LAVENDER_BOAT_KEY, true);


    public static final Item SHADOW_SIGN = registerItem("shadow_sign",
            new SignItem(new Item.Settings().maxCount(16), ModBlocks.SHADOW_SIGN, ModBlocks.SHADOW_WALL_SIGN));

    public static final Item SHADOW_HANGING_SIGN = registerItem("shadow_hanging_sign",
            new HangingSignItem(ModBlocks.SHADOW_HANGING_SIGN, ModBlocks.SHADOW_WALL_HANGING_SIGN, new Item.Settings().maxCount(16)));

    public static final Item SHADOW_BOAT =
            TerraformBoatItemHelper.registerBoatItem(ModBoats.SHADOW_BOAT_ID,ModBoats.SHADOW_BOAT_KEY, false);

    public static final Item SHADOW_CHEST_BOAT =
            TerraformBoatItemHelper.registerBoatItem(ModBoats.SHADOW_CHEST_BOAT_ID, ModBoats.SHADOW_BOAT_KEY, true);



    public static final Item SHADOW_TORCH = registerItem("shadow_torch",
           (new VerticallyAttachableBlockItem(ModBlocks.SHADOW_TORCH, ModBlocks.WALL_SHADOW_TORCH, new Item.Settings(), Direction.DOWN)));

public static final Item ECLIPSE_QUARTZ=registerItem("eclipse_quartz",
        new Item(new Item.Settings()));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Terranova.MOD_ID, name), item);
    }

    public static void registerModItems() {
       Terranova.LOGGER.info("Registering Mod Items for " + Terranova.MOD_ID);
    };
    }
