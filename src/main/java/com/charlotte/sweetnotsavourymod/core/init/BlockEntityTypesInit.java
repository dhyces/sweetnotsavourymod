package com.charlotte.sweetnotsavourymod.core.init;

import com.charlotte.sweetnotsavourymod.SweetNotSavouryMod;
import com.charlotte.sweetnotsavourymod.common.tileentities.beds.BlackberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.beds.BlueberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.beds.LemonIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.beds.RaspberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.beds.StrawberryIceCreamBedTe;
import com.charlotte.sweetnotsavourymod.common.tileentities.chests.StrawberryChestTe;


import net.minecraft.world.level.block.entity.BlockEntityType;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockEntityTypesInit{
    public static final DeferredRegister <BlockEntityType < ? >> BLOCK_ENTITY_TYPE = DeferredRegister
            .create ( ForgeRegistries.BLOCK_ENTITIES , SweetNotSavouryMod.MOD_ID );

    public static final RegistryObject <BlockEntityType< StrawberryIceCreamBedTe >> SNS_BLOCK_ENTITY_TYPE = BLOCK_ENTITY_TYPE
            .register("strawberryicecreambed", () -> BlockEntityType.Builder.create( StrawberryIceCreamBedTe::new,
                    BlockInit.STRAWBERRYICECREAMBED.get ()).build(null));

}
