package net.lxlennox.terranova.world.biome;

import net.lxlennox.terranova.Terranova;

import net.lxlennox.terranova.world.biome.surface.ModMaterialRules;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;

import terrablender.api.SurfaceRuleManager;
import terrablender.api.TerraBlenderApi;

public class ModTerrablenderAPI implements TerraBlenderApi {
    @Override
    public void onTerraBlenderInitialized(){
        Regions.register(new ModOverworldRegion(Identifier.of(Terranova.MOD_ID,"overworld"),4));

        SurfaceRuleManager.addSurfaceRules(SurfaceRuleManager.RuleCategory.OVERWORLD, Terranova.MOD_ID, ModMaterialRules.overworld());

    }
}
