/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ObjectMouseOverInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.util.MovingObjectPosition;

public class oG
extends oa_1 {
    public oG(World world) {
        super(world);
        this.c(0.3125f, 0.3125f);
    }

    @Override
    public boolean N() {
        return false;
    }

    public oG(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        this.c(0.3125f, 0.3125f);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        return false;
    }

    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        if (!this.worldObj.isRemote) {
            if (movingObjectPosition.entityHit != null) {
                movingObjectPosition.entityHit.a(aDJ.a(this, (Entity)this.ak), 5.0f);
                this.a(this.ak, movingObjectPosition.entityHit);
                if (!movingObjectPosition.entityHit.q()) {
                    movingObjectPosition.entityHit.a(5);
                }
            } else {
                BlockPos blockPos;
                if (this.ak != null && this.ak instanceof nl_1) {
                    J9.c(aV8.k(this.worldObj), aCS.a);
                }
                if (aV8.k(this.worldObj, blockPos = amv_2.a(ObjectMouseOverInvoker.getBlockPos(movingObjectPosition), movingObjectPosition.facing))) {
                    aV8.a(this.worldObj, blockPos, abb_1.a(Blocks.c));
                }
            }
            this.E();
        }
    }

    public oG(World world, EntityLivingBase entityLivingBase, double d, double d2, double d3) {
        super(world, entityLivingBase, d, d2, d3);
        this.c(0.3125f, 0.3125f);
    }
}

