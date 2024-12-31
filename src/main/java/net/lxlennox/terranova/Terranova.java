package net.lxlennox.terranova;

import net.fabricmc.api.ModInitializer;

import net.lxlennox.terranova.block.ModBlocks;
import net.lxlennox.terranova.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Terranova implements ModInitializer {
	public static final String MOD_ID = "terranova";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}