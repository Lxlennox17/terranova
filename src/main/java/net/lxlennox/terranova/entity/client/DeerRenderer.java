package net.lxlennox.terranova.entity.client;

import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.entity.custom.DeerEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class DeerRenderer extends MobEntityRenderer<DeerEntity,DeerModel<DeerEntity>> {
    public DeerRenderer(EntityRendererFactory.Context context) {
        super(context, new DeerModel<>(context.getPart(DeerModel.DEER)), 0.75f);
    }

    @Override
    public Identifier getTexture(DeerEntity entity) {
        return Identifier.of(Terranova.MOD_ID,"textures/entity/deer/deer.png");
    }
    @Override
    public void render(DeerEntity livingEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(livingEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f, 1f, 1f);
        }

        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }



}
