package com.charlotte.sweetnotsavourymod.common.entity.ai;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.monster.Monster;

public class RSWMummyAttackGoal extends MeleeAttackGoal {
    private int random;

    public RSWMummyAttackGoal(Monster creature, double speedIn , boolean useLongMemory ){
        super( creature , speedIn , useLongMemory );

        this.random = 0;
    }

    @Override
    protected double getAttackReachSqr(LivingEntity attackTarget ){
        return 8.0F + attackTarget.getBbWidth();
    }

    @Override
    protected void checkAndPerformAttack( LivingEntity enemy , double distToEnemySqr ){
        this.random = getRandomNumber( 0 , 40 );
        double d0 = this.getAttackReachSqr( enemy );
        super.checkAndPerformAttack( enemy , distToEnemySqr );
    }

    private int getRandomNumber( int min , int max ){
        return (int) ((Math.random() * (max - min)) + min);
    }

}
