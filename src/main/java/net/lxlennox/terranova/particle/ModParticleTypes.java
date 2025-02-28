package net.lxlennox.terranova.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.lxlennox.terranova.Terranova;
import net.minecraft.particle.SimpleParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticleTypes {

public static SimpleParticleType SHADOW_FLAME=registerParticle("shadow_flame",
        FabricParticleTypes.simple());






public static SimpleParticleType registerParticle(String name,SimpleParticleType particleType){
    return Registry.register(Registries.PARTICLE_TYPE, Identifier.of(Terranova.MOD_ID,name),particleType);
}



    public static void registerParticles(){

    }
}
