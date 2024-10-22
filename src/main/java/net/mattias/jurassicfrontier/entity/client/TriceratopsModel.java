package net.mattias.jurassicfrontier.entity.client;// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.mattias.jurassicfrontier.entity.animations.ModAnimationDefinitions;
import net.mattias.jurassicfrontier.entity.custom.TriceratopsEntity;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class TriceratopsModel<T extends Entity> extends HierarchicalModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor

	private final ModelPart gRotation;
	private final ModelPart gRoot;
	private final ModelPart gTorso;
	private final ModelPart gBacklegs;
	private final ModelPart gLeftbackleg;
	private final ModelPart gRightbackleg;
	private final ModelPart gTail;
	private final ModelPart gTail2;
	private final ModelPart gFrontlegs;
	private final ModelPart gLeftfrontleg;
	private final ModelPart gRightfrontleg;
	private final ModelPart gNeck;
	private final ModelPart gHead;
	private final ModelPart gJaw;
	private final ModelPart gTongue;

	public TriceratopsModel(ModelPart root) {
		this.gRotation = root.getChild("gRotation");
		this.gRoot = this.gRotation.getChild("gRoot");
		this.gTorso = this.gRoot.getChild("gTorso");
		this.gBacklegs = this.gTorso.getChild("gBacklegs");
		this.gLeftbackleg = this.gBacklegs.getChild("gLeftbackleg");
		this.gRightbackleg = this.gBacklegs.getChild("gRightbackleg");
		this.gTail = this.gTorso.getChild("gTail");
		this.gTail2 = this.gTail.getChild("gTail2");
		this.gFrontlegs = this.gTorso.getChild("gFrontlegs");
		this.gLeftfrontleg = this.gFrontlegs.getChild("gLeftfrontleg");
		this.gRightfrontleg = this.gFrontlegs.getChild("gRightfrontleg");
		this.gNeck = this.gTorso.getChild("gNeck");
		this.gHead = this.gNeck.getChild("gHead");
		this.gJaw = this.gHead.getChild("gJaw");
		this.gTongue = this.gJaw.getChild("gTongue");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition gRotation = partdefinition.addOrReplaceChild("gRotation", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition gRoot = gRotation.addOrReplaceChild("gRoot", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition gTorso = gRoot.addOrReplaceChild("gTorso", CubeListBuilder.create().texOffs(0, 0).addBox(-13.0F, -13.0F, -22.0F, 26.0F, 26.0F, 44.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -30.0F, -9.0F));

		PartDefinition gBacklegs = gTorso.addOrReplaceChild("gBacklegs", CubeListBuilder.create(), PartPose.offset(0.0F, -4.0F, 13.0F));

		PartDefinition gLeftbackleg = gBacklegs.addOrReplaceChild("gLeftbackleg", CubeListBuilder.create().texOffs(88, 110).addBox(-6.5F, 0.0F, -7.0F, 13.0F, 34.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, -0.033F, -0.1802F));

		PartDefinition gRightbackleg = gBacklegs.addOrReplaceChild("gRightbackleg", CubeListBuilder.create().texOffs(0, 114).mirror().addBox(-6.5F, 0.0F, -7.0F, 13.0F, 34.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-8.0F, -0.033F, -0.1802F));

		PartDefinition gTail = gTorso.addOrReplaceChild("gTail", CubeListBuilder.create().texOffs(0, 70).addBox(-10.0F, -0.3909F, -0.0714F, 20.0F, 20.0F, 24.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -12.0313F, 21.8476F, -0.4363F, 0.0F, 0.0F));

		PartDefinition gTail2 = gTail.addOrReplaceChild("gTail2", CubeListBuilder.create().texOffs(88, 70).addBox(-7.0F, 0.975F, -0.125F, 14.0F, 11.0F, 29.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0091F, 23.9036F, -0.0436F, 0.0F, 0.0F));

		PartDefinition gFrontlegs = gTorso.addOrReplaceChild("gFrontlegs", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.0F, -15.225F, 0.1309F, 0.0F, 0.0F));

		PartDefinition gLeftfrontleg = gFrontlegs.addOrReplaceChild("gLeftfrontleg", CubeListBuilder.create().texOffs(140, 27).addBox(-4.5F, -0.0535F, -5.6098F, 9.0F, 27.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.0F, -0.0497F, -0.3347F, -0.1309F, 0.0F, 0.0F));

		PartDefinition gRightfrontleg = gFrontlegs.addOrReplaceChild("gRightfrontleg", CubeListBuilder.create().texOffs(140, 27).mirror().addBox(-4.5F, -0.0535F, -5.6098F, 9.0F, 27.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-10.0F, -0.0497F, -0.3347F, -0.1309F, 0.0F, 0.0F));

		PartDefinition gNeck = gTorso.addOrReplaceChild("gNeck", CubeListBuilder.create().texOffs(140, 0).addBox(-10.0F, -8.6488F, -7.9437F, 20.0F, 18.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.2457F, -21.973F, 0.0873F, 0.0F, 0.0F));

		PartDefinition gHead = gNeck.addOrReplaceChild("gHead", CubeListBuilder.create().texOffs(142, 148).addBox(-7.9968F, -7.8805F, -10.9623F, 16.0F, 12.0F, 11.0F, new CubeDeformation(0.0F))
		.texOffs(86, 158).addBox(-4.9968F, -6.8805F, -20.9623F, 10.0F, 11.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(140, 65).addBox(-3.9968F, 4.1195F, -20.9623F, 8.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(174, 79).addBox(-7.4968F, 4.1195F, -2.9623F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(180, 36).mirror().addBox(7.2532F, 3.6195F, -10.9623F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(84, 179).addBox(-4.2468F, 3.6195F, -19.9623F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(180, 27).addBox(-7.2468F, 3.6195F, -10.9623F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(174, 100).mirror().addBox(4.2532F, 3.6195F, -19.9623F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-0.0032F, -0.7434F, -7.8314F));

		PartDefinition cube_r1 = gHead.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(180, 45).addBox(-1.0F, -2.5F, -1.5F, 2.0F, 7.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0032F, -10.0353F, -19.8389F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = gHead.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(180, 55).mirror().addBox(-4.5F, -15.5F, 0.5F, 9.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(46, 174).mirror().addBox(-4.5F, -13.5F, -1.5F, 9.0F, 27.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0348F, -15.8428F, 6.2419F, -0.4795F, 0.0104F, -0.0046F));

		PartDefinition cube_r3 = gHead.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(54, 114).mirror().addBox(-6.5F, -13.5F, -1.5F, 13.0F, 27.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(141, 171).mirror().addBox(-8.5F, -15.5F, 0.0F, 15.0F, 29.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.4968F, -15.0238F, 6.1938F, -0.4787F, -0.0298F, -0.082F));

		PartDefinition cube_r4 = gHead.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(126, 171).addBox(-6.5F, -15.5F, 0.0F, 15.0F, 29.0F, 0.0F, new CubeDeformation(0.0F))
		.texOffs(54, 114).addBox(-6.5F, -13.5F, -1.5F, 13.0F, 27.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.5032F, -15.0238F, 6.1938F, -0.4787F, 0.0298F, 0.082F));

		PartDefinition cube_r5 = gHead.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 176).mirror().addBox(-1.5F, -9.0F, -1.5F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-6.1718F, -10.4305F, -2.4623F, 0.3491F, 0.0F, -0.2618F));

		PartDefinition cube_r6 = gHead.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(72, 174).addBox(-1.5F, -9.0F, -1.5F, 3.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1782F, -10.4305F, -2.4623F, 0.3491F, 0.0F, 0.2618F));

		PartDefinition gJaw = gHead.addOrReplaceChild("gJaw", CubeListBuilder.create().texOffs(0, 162).addBox(-7.5F, 0.0F, -8.0F, 15.0F, 6.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(30, 176).addBox(-7.25F, -0.5F, -8.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F))
		.texOffs(126, 158).mirror().addBox(7.25F, -0.5F, -8.0F, 0.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(174, 65).addBox(-4.5F, 0.0F, -17.0F, 9.0F, 5.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(102, 179).addBox(-4.25F, -0.5F, -17.0F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F))
		.texOffs(12, 176).mirror().addBox(4.25F, -0.5F, -17.0F, 0.0F, 1.0F, 9.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(0.0032F, 4.1195F, -2.9623F));

		PartDefinition gTongue = gJaw.addOrReplaceChild("gTongue", CubeListBuilder.create().texOffs(174, 88).addBox(-2.5F, -0.5F, -11.0F, 5.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.5F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}


	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.TriceratopsWalk, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(((TriceratopsEntity) entity).idleAnimationState, ModAnimationDefinitions.TriceratopsIdle, ageInTicks, 1f);
	}
	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.gHead.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.gHead.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		gRotation.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return gRotation;
	}
}