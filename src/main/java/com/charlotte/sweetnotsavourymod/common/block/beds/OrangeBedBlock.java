package com.charlotte.sweetnotsavourymod.common.block.beds;

import com.charlotte.sweetnotsavourymod.common.blockentities.beds.LemonIceCreamBedBlockEntity;
import com.charlotte.sweetnotsavourymod.common.blockentities.beds.OrangeIceCreamBedBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OrangeBedBlock extends SNSBedBlock {
    public OrangeBedBlock(DyeColor colorIn, Properties properties) {
        super(colorIn, properties);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new OrangeIceCreamBedBlockEntity(pos, state);
    }
}
