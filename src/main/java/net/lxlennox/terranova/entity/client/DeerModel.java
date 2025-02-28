package net.lxlennox.terranova.entity.client;

import net.lxlennox.terranova.Terranova;
import net.lxlennox.terranova.entity.custom.DeerEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class DeerModel <T extends DeerEntity> extends SinglePartEntityModel<T> {

public static final EntityModelLayer DEER= new EntityModelLayer(Identifier.of(Terranova.MOD_ID,"deer"), "main");

    private final ModelPart root;
    private final ModelPart Body;
    private final ModelPart hirc;
    private final ModelPart first;
    private final ModelPart mainBody;
    private final ModelPart Hips;
    private final ModelPart leftHip;
    private final ModelPart rightHip;
    private final ModelPart upperBody;
    private final ModelPart frontUpperBody;
    private final ModelPart hindUpperBody;
    private final ModelPart tail;
    private final ModelPart second;
    private final ModelPart Legs;
    private final ModelPart leftFrontLeg;
    private final ModelPart kneefl;
    private final ModelPart rightFrontLeg;
    private final ModelPart kneefr;
    private final ModelPart leftHindLeg;
    private final ModelPart kneebl;
    private final ModelPart rightHindLeg;
    private final ModelPart kneebr;
    private final ModelPart Headregion;
    private final ModelPart neck;
    private final ModelPart neck2;
    private final ModelPart head;
    private final ModelPart earleft;
    private final ModelPart earright;
    public  DeerModel(ModelPart root) {
        this.root = root.getChild("root");
        this.Body = this.root.getChild("Body");
        this.hirc = this.Body.getChild("hirc");
        this.first = this.hirc.getChild("first");
        this.mainBody = this.first.getChild("mainBody");
        this.Hips = this.mainBody.getChild("Hips");
        this.leftHip = this.Hips.getChild("leftHip");
        this.rightHip = this.Hips.getChild("rightHip");
        this.upperBody = this.mainBody.getChild("upperBody");
        this.frontUpperBody = this.upperBody.getChild("frontUpperBody");
        this.hindUpperBody = this.upperBody.getChild("hindUpperBody");
        this.tail = this.mainBody.getChild("tail");
        this.second = this.first.getChild("second");
        this.Legs = this.second.getChild("Legs");
        this.leftFrontLeg = this.Legs.getChild("leftFrontLeg");
        this.kneefl = this.leftFrontLeg.getChild("kneefl");
        this.rightFrontLeg = this.Legs.getChild("rightFrontLeg");
        this.kneefr = this.rightFrontLeg.getChild("kneefr");
        this.leftHindLeg = this.Legs.getChild("leftHindLeg");
        this.kneebl = this.leftHindLeg.getChild("kneebl");
        this.rightHindLeg = this.Legs.getChild("rightHindLeg");
        this.kneebr = this.rightHindLeg.getChild("kneebr");
        this.Headregion = this.second.getChild("Headregion");
        this.neck = this.Headregion.getChild("neck");
        this.neck2 = this.neck.getChild("neck2");
        this.head = this.neck2.getChild("head");
        this.earleft = this.head.getChild("earleft");
        this.earright = this.head.getChild("earright");

    }
    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData root = modelPartData.addChild("root", ModelPartBuilder.create(), ModelTransform.of(0.0F, 24.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData Body = root.addChild("Body", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData hirc = Body.addChild("hirc", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData first = hirc.addChild("first", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData mainBody = first.addChild("mainBody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -14.0F, 0.0F));

        ModelPartData Hips = mainBody.addChild("Hips", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData leftHip = Hips.addChild("leftHip", ModelPartBuilder.create().uv(0, 37).cuboid(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.0F, -8.5F, -5.5F));

        ModelPartData rightHip = Hips.addChild("rightHip", ModelPartBuilder.create().uv(17, 44).cuboid(-2.0F, -2.5F, -2.5F, 4.0F, 5.0F, 5.0F, new Dilation(0.0F)), ModelTransform.pivot(3.0F, -8.5F, -5.5F));

        ModelPartData upperBody = mainBody.addChild("upperBody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 12.0F, 0.0F));

        ModelPartData frontUpperBody = upperBody.addChild("frontUpperBody", ModelPartBuilder.create().uv(0, 21).cuboid(-4.4999F, -5.0F, -1.0F, 9.0F, 10.0F, 6.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -12.0F, 3.0F));

        ModelPartData hindUpperBody = upperBody.addChild("hindUpperBody", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -12.0F, 2.8F));

        ModelPartData cube_r1 = hindUpperBody.addChild("cube_r1", ModelPartBuilder.create().uv(0, 0).cuboid(-6.0F, -10.05F, -10.0F, 9.0F, 10.0F, 11.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 5.1F, -0.8F, 0.0873F, 0.0F, 0.0F));

        ModelPartData tail = mainBody.addChild("tail", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -1.9407F, -8.2589F));

        ModelPartData cube_r2 = tail.addChild("cube_r2", ModelPartBuilder.create().uv(18, 37).cuboid(-3.0F, -5.0F, -1.0F, 4.0F, 5.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(1.0F, 3.4407F, -1.5411F, -0.2182F, 0.0F, 0.0F));

        ModelPartData second = first.addChild("second", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Legs = second.addChild("Legs", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData leftFrontLeg = Legs.addChild("leftFrontLeg", ModelPartBuilder.create().uv(48, 45).cuboid(-1.001F, 0.5F, -1.5F, 2.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.5F, -9.5F, 5.5F));

        ModelPartData kneefl = leftFrontLeg.addChild("kneefl", ModelPartBuilder.create().uv(48, 49).cuboid(-1.001F, -1.0F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.5F, -0.5F));

        ModelPartData rightFrontLeg = Legs.addChild("rightFrontLeg", ModelPartBuilder.create().uv(10, 53).cuboid(-0.999F, 0.5F, -1.5F, 2.0F, 4.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(3.5F, -9.5F, 5.5F));

        ModelPartData kneefr = rightFrontLeg.addChild("kneefr", ModelPartBuilder.create().uv(10, 56).cuboid(-0.499F, -0.1004F, -1.5989F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-0.5F, 4.6F, 0.1F));

        ModelPartData leftHindLeg = Legs.addChild("leftHindLeg", ModelPartBuilder.create().uv(0, 47).cuboid(-1.0F, 1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.5F, -9.5F, -5.5F));

        ModelPartData kneebl = leftHindLeg.addChild("kneebl", ModelPartBuilder.create().uv(0, 50).cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 5.5F, -0.5F));

        ModelPartData rightHindLeg = Legs.addChild("rightHindLeg", ModelPartBuilder.create().uv(20, 53).cuboid(-1.0F, 1.5F, -1.5F, 2.0F, 3.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(3.5F, -9.5F, -5.5F));

        ModelPartData kneebr = rightHindLeg.addChild("kneebr", ModelPartBuilder.create().uv(20, 56).cuboid(2.5F, 2.0F, -2.0F, 2.0F, 5.0F, 3.0F, new Dilation(0.0F)), ModelTransform.pivot(-3.5F, 2.5F, 0.5F));

        ModelPartData Headregion = second.addChild("Headregion", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, -22.0F, 0.0F));

        ModelPartData neck = Headregion.addChild("neck", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 5.4F, 6.9F));

        ModelPartData cube_r3 = neck.addChild("cube_r3", ModelPartBuilder.create().uv(30, 34).cuboid(-5.0F, -5.0F, -2.0F, 7.0F, 6.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.5F, 1.6F, 1.1F, 0.6545F, 0.0F, 0.0F));

        ModelPartData neck2 = neck.addChild("neck2", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, -1.8F, 1.9F));

        ModelPartData cube_r4 = neck2.addChild("cube_r4", ModelPartBuilder.create().uv(34, 45).cuboid(-4.0F, -7.0F, -1.0F, 5.0F, 8.0F, 2.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 2.4F, 2.2F, -0.2182F, 0.0F, 0.0F));

        ModelPartData cube_r5 = neck2.addChild("cube_r5", ModelPartBuilder.create().uv(40, 0).cuboid(-3.0F, -8.0F, -1.0F, 4.0F, 8.0F, 4.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 1.4F, -1.8F, -0.48F, 0.0F, 0.0F));

        ModelPartData head = neck2.addChild("head", ModelPartBuilder.create(), ModelTransform.pivot(-1.7F, -4.1F, 2.7F));

        ModelPartData cube_r6 = head.addChild("cube_r6", ModelPartBuilder.create().uv(29, 54).mirrored().cuboid(-1.0F, -9.0F, 1.0F, 5.0F, 9.0F, 0.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.of(1.2F, -3.5F, 0.5F, 0.5672F, 0.4363F, 0.6109F));

        ModelPartData cube_r7 = head.addChild("cube_r7", ModelPartBuilder.create().uv(29, 54).cuboid(-4.0F, -9.0F, 1.0F, 5.0F, 9.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.8F, -3.5F, 0.5F, 0.5672F, -0.4363F, -0.6109F));

        ModelPartData cube_r8 = head.addChild("cube_r8", ModelPartBuilder.create().uv(40, 12).cuboid(-3.0F, -2.0F, -1.0F, 4.0F, 4.0F, 5.0F, new Dilation(0.0F)), ModelTransform.of(1.2F, 0.0F, 6.5F, -0.2618F, 0.0F, 0.0F));

        ModelPartData cube_r9 = head.addChild("cube_r9", ModelPartBuilder.create().uv(30, 21).cuboid(-3.9999F, -5.0F, -3.0F, 5.0F, 5.0F, 8.0F, new Dilation(0.0F)), ModelTransform.of(1.7F, 0.5F, 0.7F, -0.2618F, 0.0F, 0.0F));

        ModelPartData earleft = head.addChild("earleft", ModelPartBuilder.create(), ModelTransform.pivot(-3.3F, -1.5F, 0.5F));

        ModelPartData cube_r10 = earleft.addChild("cube_r10", ModelPartBuilder.create().uv(10, 47).cuboid(-2.8016F, -0.9162F, -0.8189F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.1F, -0.8F, 0.0F, -0.2618F, 0.1309F, 0.3054F));

        ModelPartData earright = head.addChild("earright", ModelPartBuilder.create(), ModelTransform.pivot(2.6F, -2.0F, 0.5F));

        ModelPartData cube_r11 = earright.addChild("cube_r11", ModelPartBuilder.create().uv(10, 50).cuboid(-1.0F, -2.0F, -1.0F, 3.0F, 2.0F, 1.0F, new Dilation(0.0F)), ModelTransform.of(1.1F, 0.5F, 0.0F, -0.2618F, -0.1309F, -0.3054F));
        return TexturedModelData.of(modelData, 64, 64);

    }
    @Override
    public void setAngles(DeerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        this.getPart().traverse().forEach(ModelPart::resetTransform);
        this.setHeadAngles(netHeadYaw, headPitch);

        this.animateMovement(DeerAnimations.ANIM_DEER_WALKING, limbSwing, limbSwingAmount, 2f, 2.5f);
        this.updateAnimation(entity.idleAnimationState, DeerAnimations.ANIM_DEER_IDLE, ageInTicks, 1f);

    }

    private void setHeadAngles(float headYaw, float headPitch) {
        headYaw = MathHelper.clamp(headYaw, -30.0F, 30.0F);
        headPitch = MathHelper.clamp(headPitch, -25.0F, 45.0F);

        this.head.yaw = headYaw * 0.017453292F;
        this.head.pitch = headPitch * 0.017453292F;

    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        root.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return root;
    }

    }

