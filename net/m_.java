/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;

public class m_
extends mi_1 {
    private int az;
    private Material aA;

    @Override
    public float b(float f) {
        return this.aA == Material.M ? super.b(f) : 1.0f;
    }

    protected m_(World world, double d, double d2, double d3, Material material) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.motionX = 0.0;
        if (material == Material.M) {
            this.an = 0.0f;
            this.ao = 0.0f;
            this.av = 1.0f;
        } else {
            this.an = 1.0f;
            this.ao = 0.0f;
            this.av = 0.0f;
        }
        this.c(113);
        this.c(0.01f, 0.01f);
        this.ar = 0.06f;
        this.aA = material;
        this.az = 40;
        this.am = (int)(64.0 / (MathInvoker.a() * 0.8 + 0.2));
        this.motionZ = 0.0;
        this.motionY = 0.0;
        this.motionX = 0.0;
    }

    @Override
    public int d(float f) {
        return this.aA == Material.M ? super.d(f) : 257;
    }

    @Override
    public void onUpdate() {
        BlockPos blockPos;
        IBlockState iBlockState;
        Material material;
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.aA == Material.M) {
            this.an = 0.2f;
            this.ao = 0.3f;
            this.av = 1.0f;
        } else {
            this.an = 1.0f;
            this.ao = 16.0f / (float)(40 - this.az + 16);
            this.av = 4.0f / (float)(40 - this.az + 8);
        }
        this.motionY -= (double)this.ar;
        if (this.az-- > 0) {
            this.motionX *= 0.02;
            this.motionY *= 0.02;
            this.motionZ *= 0.02;
            this.c(113);
        } else {
            this.c(112);
        }
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.98f;
        this.motionY *= (double)0.98f;
        this.motionZ *= (double)0.98f;
        if (this.am-- <= 0) {
            this.E();
        }
        if (this.onGround) {
            if (this.aA == Material.M) {
                this.E();
                aV8.a(this.worldObj, B7.WATER_SPLASH, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0, new int[0]);
            } else {
                this.c(114);
            }
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
        if (akm_1.f(material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState = aV8.q(this.worldObj, blockPos = new BlockPos(this))))) || akm_1.i(material)) {
            double d;
            double d2 = 0.0;
            if (BlockStateInvoker.getBlock(iBlockState) instanceof BlockLiquid) {
                d2 = mu_1.a(P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)));
            }
            if (this.posY < (d = (double)(MathHelper.floor_double(this.posY) + 1) - d2)) {
                this.E();
            }
        }
    }
}

