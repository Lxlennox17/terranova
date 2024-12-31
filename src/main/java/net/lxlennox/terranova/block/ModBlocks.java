package net.lxlennox.terranova.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.lxlennox.terranova.Terranova;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import static net.minecraft.block.Blocks.createLogBlock;

public class ModBlocks {

    public static final Block REDWOOD_WOOD = registerBlock("redwood_wood",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));

    public static final Block REDWOOD_LOG = registerBlock("redwood_log",
            new Block(AbstractBlock.Settings.create().strength(2f)
                    .requiresTool().sounds(BlockSoundGroup.WOOD)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Terranova.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Terranova.MOD_ID, name),
      new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        Terranova.LOGGER.info("Registering Mod Blocks for"+Terranova.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(entries -> {
            entries.add(ModBlocks.REDWOOD_WOOD);
      entries.add(ModBlocks.REDWOOD_LOG);
        } );




    }
}
