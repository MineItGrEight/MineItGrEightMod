package eu.aldin.mirge.mirgem.entity.renderer;

import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.MobRenderer;

import eu.aldin.mirge.mirgem.entity.ChestEntityEntity;

import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class ChestEntityRenderer {
	public static class ModelRegisterHandler {
		@SubscribeEvent
		@OnlyIn(Dist.CLIENT)
		public void registerModels(ModelRegistryEvent event) {
			RenderingRegistry.registerEntityRenderingHandler(ChestEntityEntity.entity, renderManager -> {
				return new MobRenderer(renderManager, new ModelChest_Entity(), 0.5f) {
					@Override
					public ResourceLocation getEntityTexture(Entity entity) {
						return new ResourceLocation("mirgem:textures/chest_entity.png");
					}
				};
			});
		}
	}

	// Made with Blockbench 3.6.3
	// Exported for Minecraft version 1.15
	// Paste this class into your mod and generate all required imports
	public static class ModelChest_Entity extends EntityModel<Entity> {
		private final ModelRenderer middle;
		private final ModelRenderer front;
		public ModelChest_Entity() {
			textureWidth = 64;
			textureHeight = 64;
			middle = new ModelRenderer(this);
			middle.setRotationPoint(0.0F, 24.0F, 0.0F);
			middle.setTextureOffset(0, 0).addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F, 0.0F, false);
			front = new ModelRenderer(this);
			front.setRotationPoint(0.0F, 24.0F, 0.0F);
			front.setTextureOffset(0, 0).addBox(-9.0F, -11.0F, -1.0F, 1.0F, 4.0F, 2.0F, 0.0F, false);
		}

		@Override
		public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue,
				float alpha) {
			middle.render(matrixStack, buffer, packedLight, packedOverlay);
			front.render(matrixStack, buffer, packedLight, packedOverlay);
		}

		public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
			modelRenderer.rotateAngleX = x;
			modelRenderer.rotateAngleY = y;
			modelRenderer.rotateAngleZ = z;
		}

		public void setRotationAngles(Entity e, float f, float f1, float f2, float f3, float f4) {
		}
	}
}
