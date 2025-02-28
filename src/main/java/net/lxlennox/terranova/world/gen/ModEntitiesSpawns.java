package net.lxlennox.terranova.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.lxlennox.terranova.entity.ModEntities;
import net.lxlennox.terranova.world.biome.ModBiomes;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.SpawnLocationTypes;
import net.minecraft.entity.SpawnRestriction;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.world.Heightmap;
import net.minecraft.world.biome.BiomeKeys;

public class ModEntitiesSpawns {
    public static void addSpawns(){
        BiomeModifications.addSpawn(BiomeSelectors.includeByKey(BiomeKeys.TAIGA,BiomeKeys.SNOWY_TAIGA,BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA,ModBiomes.REDWOOD_FOREST),
                SpawnGroup.CREATURE, ModEntities.DEER,60,1,3);

        SpawnRestriction.register(ModEntities.DEER, SpawnLocationTypes.ON_GROUND,
                Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, AnimalEntity::isValidNaturalSpawn);



    }


}
