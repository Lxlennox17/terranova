package net.lxlennox.terranova;



import com.terraformersmc.terraform.boat.api.client.TerraformBoatClientHelper;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.lxlennox.terranova.block.ModBlocks;
import net.lxlennox.terranova.entity.ModBoats;
import net.lxlennox.terranova.entity.ModEntities;
import net.lxlennox.terranova.entity.client.DeerModel;
import net.lxlennox.terranova.entity.client.DeerRenderer;
import net.lxlennox.terranova.particle.ModParticleTypes;
import net.lxlennox.terranova.particle.ShadowFlame;
import net.minecraft.client.color.block.BlockColorProvider;
import net.minecraft.client.color.block.BlockColors;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.model.EntityModelLayer;


public class TerranovaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {


BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),ModBlocks.REDWOOD_SAPLING,ModBlocks.REDWOOD_LEAVES,ModBlocks.LAVENDER_LEAVES,
        ModBlocks.LAVENDER_SAPLING,ModBlocks.LAVENDER_DOOR,ModBlocks.LAVENDER_TRAPDOOR,ModBlocks.LAVENDER_BUSH,ModBlocks.LAVENDER,ModBlocks.POTTED_LAVENDER,
        ModBlocks.SHADOW_TORCH,ModBlocks.WALL_SHADOW_TORCH,ModBlocks.SHADOW_LANTERN,ModBlocks.POTTED_REDWOOD_SAPLING,ModBlocks.NIGHTBLOOM,
        ModBlocks.POTTED_NIGHTBLOOM,ModBlocks.POTTED_LAVENDER_SAPLING,ModBlocks.SHADOW_SAPLING,ModBlocks.POTTED_SHADOW_SAPLING,
        ModBlocks.SHADOW_DOOR,ModBlocks.SHADOW_TRAPDOOR,ModBlocks.GLOWING_MUSHROOM,ModBlocks.POTTED_GLOWING_MUSHROOM);


        ParticleFactoryRegistry.getInstance().register(ModParticleTypes.SHADOW_FLAME, ShadowFlame.Factory::new);



//Model Layers
        TerraformBoatClientHelper.registerModelLayers(ModBoats.REDWOOD_BOAT_ID,false);
TerraformBoatClientHelper.registerModelLayers(ModBoats.LAVENDER_BOAT_ID,false);
   TerraformBoatClientHelper.registerModelLayers(ModBoats.SHADOW_BOAT_ID,false);

        EntityModelLayerRegistry.registerModelLayer(DeerModel.DEER,DeerModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.DEER, DeerRenderer::new);


    }
}
