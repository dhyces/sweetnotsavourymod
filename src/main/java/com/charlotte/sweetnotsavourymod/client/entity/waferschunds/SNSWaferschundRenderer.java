package com.charlotte.sweetnotsavourymod.client.entity.waferschunds;

import com.charlotte.sweetnotsavourymod.client.entity.model.pugs.SNSPugModel;
import com.charlotte.sweetnotsavourymod.client.entity.model.waferschunds.SNSWaferschundModel;
import com.charlotte.sweetnotsavourymod.common.entity.pugs.SNSPugEntity;
import com.charlotte.sweetnotsavourymod.common.entity.waferschunds.SNSWaferschundEntity;
import com.charlotte.sweetnotsavourymod.core.util.PugFlavourVariant;
import com.charlotte.sweetnotsavourymod.core.util.WaferschundVariant;
import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import java.util.Map;

public class SNSWaferschundRenderer extends GeoEntityRenderer<SNSWaferschundEntity> {
    public static final Map<WaferschundVariant, ResourceLocation> LOCATION_BY_VARIANT =
            Util.make(Maps.newEnumMap(WaferschundVariant.class), (p_114874_) -> {
                p_114874_.put(WaferschundVariant.STRAWBERRY, new ResourceLocation("sweetnotsavourymod:textures/entity/waferschunds/strawberrywaferschund.png"));

            });

    public SNSWaferschundRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SNSWaferschundModel());
        this.shadowRadius = 0.1F;
    }

    @Override
    public ResourceLocation getTextureLocation(SNSWaferschundEntity entity) {
        return LOCATION_BY_VARIANT.get(entity.getVariant());
    }

    @Override
    public void renderEarly(SNSWaferschundEntity animatable, PoseStack stackIn, float ticks, MultiBufferSource renderTypeBuffer,
                            VertexConsumer vertexBuilder, int packedLightIn, int packedOverlayIn, float red, float green, float blue,
                            float partialTicks) {
        super.renderEarly(animatable, stackIn, ticks, renderTypeBuffer, vertexBuilder, packedLightIn, packedOverlayIn,
                red, green, blue, partialTicks);
        stackIn.scale(0.7F, 0.7F, 0.7F);
    }
}