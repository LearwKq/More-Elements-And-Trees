// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class mini_uranium_golem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "mini_uranium_golem"), "main");
	private final ModelPart rightfoot;
	private final ModelPart leftfoot;
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart body;
	private final ModelPart head;

	public mini_uranium_golem(ModelPart root) {
		this.rightfoot = root.getChild("rightfoot");
		this.leftfoot = root.getChild("leftfoot");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.body = root.getChild("body");
		this.head = root.getChild("head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(20, 20).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(30, 12).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-3.0F, 21.0F, 0.0F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(0, 24).addBox(-2.0F, 0.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 21.0F, 0.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(24, 27).addBox(-1.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 8.0F, 0.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(16, 27).addBox(11.0F, 4.0F, -1.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-6.0F, 8.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(26, 0).addBox(-6.0F, -6.0F, -2.0F, 4.0F, 4.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(-9.0F, -8.0F, -1.0F, 10.0F, 8.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(18, 14).addBox(-6.0F, -9.0F, 0.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 20.0F, -2.0F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 14).addBox(-4.0F, -2.0F, 0.0F, 6.0F, 4.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 2).addBox(-3.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 0).addBox(0.0F, -1.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 9.0F, -3.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}