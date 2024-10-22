package net.mattias.jurassicfrontier.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.mattias.jurassicfrontier.JurassicFrontier;
import net.mattias.jurassicfrontier.entity.custom.TriceratopsEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class TriceratopsRenderer extends MobRenderer<TriceratopsEntity, TriceratopsModel<TriceratopsEntity>> {


    public TriceratopsRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new TriceratopsModel<>(pContext.bakeLayer(ModModelLayers.TRICERATOPS_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(TriceratopsEntity triceratopsEntity) {
        return new ResourceLocation(JurassicFrontier.MOD_ID, "textures/entity/triceratops.png");
    }

    @Override
    public void render(TriceratopsEntity pEntity, float pEntityYaw, float pPartialTicks, PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {

        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.5f, 0.5f, 0.5f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}