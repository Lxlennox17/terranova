package net.lxlennox.terranova;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.lxlennox.terranova.block.ModBlocks;
import net.lxlennox.terranova.block.ModFuelRegistry;
import net.lxlennox.terranova.entity.ModBoats;
import net.lxlennox.terranova.entity.ModEntities;
import net.lxlennox.terranova.entity.custom.DeerEntity;
import net.lxlennox.terranova.item.ModItemGroups;
import net.lxlennox.terranova.item.ModItems;

import net.lxlennox.terranova.particle.ModParticleTypes;
import net.lxlennox.terranova.world.gen.ModWorldGeneration;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Terranova implements ModInitializer {
	public static final String MOD_ID = "terranova";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModFuelRegistry.registerFuels();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
		ModBoats.load();

		ModParticleTypes.registerParticles();

		ModEntities.registerModEntities();











		StrippableBlockRegistry.register(ModBlocks.REDWOOD_LOG,ModBlocks.STRIPPED_REDWOOD_LOG);
StrippableBlockRegistry.register(ModBlocks.REDWOOD_WOOD,ModBlocks.STRIPPED_REDWOOD_WOOD);



		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_REDWOOD_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_REDWOOD_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.REDWOOD_LEAVES, 30, 60);



		StrippableBlockRegistry.register(ModBlocks.LAVENDER_LOG,ModBlocks.STRIPPED_LAVENDER_LOG);
		StrippableBlockRegistry.register(ModBlocks.LAVENDER_WOOD,ModBlocks.STRIPPED_LAVENDER_WOOD);



		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LAVENDER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LAVENDER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LAVENDER_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_LAVENDER_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LAVENDER_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LAVENDER_LEAVES, 30, 60);


		StrippableBlockRegistry.register(ModBlocks.SHADOW_LOG,ModBlocks.STRIPPED_SHADOW_LOG);
		StrippableBlockRegistry.register(ModBlocks.SHADOW_WOOD,ModBlocks.STRIPPED_SHADOW_WOOD);



		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SHADOW_LOG, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_SHADOW_WOOD, 5, 5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_PLANKS, 5, 20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.SHADOW_LEAVES, 30, 60);


		FabricDefaultAttributeRegistry.register(ModEntities.DEER, DeerEntity.createAttributes());

	}
}