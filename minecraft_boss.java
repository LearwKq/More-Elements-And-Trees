// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


public class minecraft_boss<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("modid", "minecraft_boss"), "main");
	private final ModelPart rightfoot;
	private final ModelPart leftfoot;
	private final ModelPart haed;
	private final ModelPart body;
	private final ModelPart rightarm;
	private final ModelPart leftarm;

	public minecraft_boss(ModelPart root) {
		this.rightfoot = root.getChild("rightfoot");
		this.leftfoot = root.getChild("leftfoot");
		this.haed = root.getChild("haed");
		this.body = root.getChild("body");
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightfoot = partdefinition.addOrReplaceChild("rightfoot", CubeListBuilder.create().texOffs(0, 22).addBox(-3.0F, -8.0F, -1.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 16.0F, -1.0F));

		PartDefinition leftfoot = partdefinition.addOrReplaceChild("leftfoot", CubeListBuilder.create().texOffs(20, 18).addBox(1.0F, -8.0F, -1.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.0F, 16.0F, -1.0F));

		PartDefinition haed = partdefinition.addOrReplaceChild("haed", CubeListBuilder.create().texOffs(20, 0).addBox(-3.0F, 0.0F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(36, 22).addBox(-5.0F, -6.0F, -1.0F, 6.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -11.0F, -1.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 0).addBox(-7.0F, -18.0F, -1.0F, 8.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 8.0F, -1.0F));

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create().texOffs(32, 34).addBox(-1.0F, -18.0F, -1.0F, 2.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 8.0F, -1.0F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create().texOffs(32, 0).addBox(9.0F, -18.0F, -1.0F, 2.0F, 18.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, 8.0F, -1.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		rightfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftfoot.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		haed.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}