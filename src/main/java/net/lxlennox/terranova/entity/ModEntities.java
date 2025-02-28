package net.lxlennox.terranova.entity;

import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.entity.custom.DeerEntity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ModEntities {

public static final EntityType<DeerEntity> DEER= Registry.register(Registries.ENTITY_TYPE, Identifier.of(Terranova.MOD_ID,"deer"),
        EntityType.Builder.create(DeerEntity::new, SpawnGroup.CREATURE)
                .dimensions(1.5f,1.5f).build());





    public static void registerModEntities(){
        Terranova.LOGGER.info("Registering Mod Entities for"+Terranova.MOD_ID);
    }


}
