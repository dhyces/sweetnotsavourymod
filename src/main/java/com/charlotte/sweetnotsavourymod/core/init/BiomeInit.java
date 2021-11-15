package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.google.common.base.Supplier;

import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeMaker;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BiomeInit {
	
	public static final DeferredRegister<Biome> BIOMES = DeferredRegister.create(ForgeRegistries.BIOMES, SweetNotSavouryMod.MOD_ID);
	
	static {
		createBiome("icecreamforestbiome", BiomeMaker::makeVoidBiome);

	}
	
	public static RegistryKey<Biome> ICECREAMFORESTBIOME = registerBiome("icecreamforestbiome");


	public static RegistryKey<Biome> registerBiome(String biomeName) {
		return RegistryKey.getOrCreateKey(Registry.BIOME_KEY, new ResourceLocation(SweetNotSavouryMod.MOD_ID, biomeName));
	}
	
	public static RegistryObject<Biome> createBiome(String biomeName, Supplier<Biome> biome) {
		return BIOMES.register(biomeName, biome);
	}
	
	public static void registerBiomes() {
		BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(ICECREAMFORESTBIOME, 10));

	}
	
}
