/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.nV
 */
public class nv_1
extends mi_1 {
    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        this.motionY -= (double)this.ar;
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        this.motionX *= (double)0.98f;
        this.motionY *= (double)0.98f;
        this.motionZ *= (double)0.98f;
        if (this.am-- <= 0) {
            this.E();
        }
        if (this.onGround) {
            if (MathInvoker.a() < 0.5) {
                this.E();
            }
            this.motionX *= (double)0.7f;
            this.motionZ *= (double)0.7f;
        }
        BlockPos blockPos = new BlockPos(this);
        IBlockState iBlockState = aV8.q(this.worldObj, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        BlocksInvoker.a(block, (IBlockAccess)this.worldObj, blockPos);
        Material material = BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState));
        if (akm_1.f(material) || akm_1.i(material)) {
            double d = 0.0;
            d = BlockStateInvoker.getBlock(iBlockState) instanceof BlockLiquid ? (double)(1.0f - mu_1.a(P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)))) : BlocksInvoker.C(block);
            double d2 = (double)MathHelper.floor_double(this.posY) + d;
            if (this.posY < d2) {
                this.E();
            }
        }
    }

    protected nv_1(World world, double d, double d2, double d3) {
        super(world, d, d2, d3, 0.0, 0.0, 0.0);
        this.motionX *= (double)0.3f;
        this.motionY = MathInvoker.a() * (double)0.2f + (double)0.1f;
        this.motionZ *= (double)0.3f;
        this.an = 1.0f;
        this.ao = 1.0f;
        this.av = 1.0f;
        this.c(19 + a5_0.a(this.Q, 4));
        this.c(0.01f, 0.01f);
        this.ar = 0.06f;
        this.am = (int)(8.0 / (MathInvoker.a() * 0.8 + 0.2));
    }
}

