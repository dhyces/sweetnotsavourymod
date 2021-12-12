package com.charlotte.sweetnotsavourymod.client.entity.model.elves;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.client.entity.elves.SNSElfRenderer;
import com.charlotte.sweetnotsavourymod.common.entity.elves.SNSElfEntity;

import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class SNSElfModel extends AnimatedGeoModel<SNSElfEntity> {
	@Override
	public ResourceLocation getModelLocation(SNSElfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "geo/elf.geo.json");
	}
	
	@Override
	public ResourceLocation getTextureLocation(SNSElfEntity entity)	{
		return SNSElfRenderer.LOCATION_BY_VARIANT.get(entity.getVariant());
	}
	
	@Override
	public ResourceLocation getAnimationFileLocation(SNSElfEntity entity) {
		return new ResourceLocation(SweetNotSavouryMod.MOD_ID, "animations/elf.animation.json");
	}
}