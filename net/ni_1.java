/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.nI
 */
public class ni_1
extends mi_1 {
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this)))) != Material.M) {
            this.E();
        }
        if (this.am-- <= 0) {
            this.E();
        }
    }

    protected ni_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2 - 0.125, d3, d4, d5, d6);
        this.an = 0.4f;
        this.ao = 0.4f;
        this.av = 0.7f;
        this.c(0);
        this.c(0.01f, 0.01f);
        this.au *= a5_0.e(this.Q) * 0.6f + 0.2f;
        this.motionX = d4 * 0.0;
        this.motionY = d5 * 0.0;
        this.motionZ = d6 * 0.0;
        this.am = (int)(16.0 / (MathInvoker.a() * 0.8 + 0.2));
    }
}

