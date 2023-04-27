/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.mM
 */
public class mm_1
extends mi_1 {
    protected mm_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        this.an = 1.0f;
        this.ao = 1.0f;
        this.av = 1.0f;
        this.c(32);
        this.c(0.02f, 0.02f);
        this.au *= a5_0.e(this.Q) * 0.6f + 0.2f;
        this.motionX = d4 * (double)0.2f + (MathInvoker.a() * 2.0 - 1.0) * (double)0.02f;
        this.motionY = d5 * (double)0.2f + (MathInvoker.a() * 2.0 - 1.0) * (double)0.02f;
        this.motionZ = d6 * (double)0.2f + (MathInvoker.a() * 2.0 - 1.0) * (double)0.02f;
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.2));
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY += 0.002;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.85f;
        this.motionY *= (double)0.85f;
        this.motionZ *= (double)0.85f;
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, new BlockPos(this)))) != Material.M) {
            this.E();
        }
        if (this.am-- <= 0) {
            this.E();
        }
    }
}

