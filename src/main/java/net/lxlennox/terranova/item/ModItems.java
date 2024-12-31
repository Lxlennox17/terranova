package net.lxlennox.terranova.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

import net.lxlennox.terranova.Terranova;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item REDWOOD_TOTEM = registerItem("redwood_totem", new Item(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Terranova.MOD_ID, name), item);
    }

    public static void registerModItems() {
       Terranova.LOGGER.info("Registering Mod Items for " + Terranova.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(REDWOOD_TOTEM);

        });
    }
}