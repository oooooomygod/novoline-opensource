/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.nC
 */
public abstract class nc_1
extends nl_1 {
    @Override
    public void b(float f, float f2) {
    }

    @Override
    public void f(float f, float f2) {
        if (this.isInWater()) {
            this.a(f, f2, 0.02f);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double)0.8f;
            this.motionY *= (double)0.8f;
            this.motionZ *= (double)0.8f;
        } else if (this.o()) {
            this.a(f, f2, 0.02f);
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= 0.5;
            this.motionY *= 0.5;
            this.motionZ *= 0.5;
        } else {
            float f3 = 0.91f;
            if (this.onGround) {
                f3 = BlockStateInvoker.getBlock((IBlockState)aV8.q((World)this.worldObj, (BlockPos)new BlockPos((int)MathHelper.floor_double((double)this.posX), (int)(MathHelper.floor_double((double)this.getEntityBoundingBox().a) - 1), (int)MathHelper.floor_double((double)this.posZ)))).z * 0.91f;
            }
            float f4 = 0.16277136f / (f3 * f3 * f3);
            this.a(f, f2, this.onGround ? 0.1f * f4 : 0.02f);
            f3 = 0.91f;
            if (this.onGround) {
                f3 = BlockStateInvoker.getBlock((IBlockState)aV8.q((World)this.worldObj, (BlockPos)new BlockPos((int)MathHelper.floor_double((double)this.posX), (int)(MathHelper.floor_double((double)this.getEntityBoundingBox().a) - 1), (int)MathHelper.floor_double((double)this.posZ)))).z * 0.91f;
            }
            this.moveEntity(this.motionX, this.motionY, this.motionZ);
            this.motionX *= (double)f3;
            this.motionY *= (double)f3;
            this.motionZ *= (double)f3;
        }
        this.aM = this.aq;
        double d = this.posX - this.prevPosX;
        double d2 = this.posZ - this.prevPosZ;
        float f5 = MathHelper.e(d * d + d2 * d2) * 4.0f;
        if (f5 > 1.0f) {
            f5 = 1.0f;
        }
        this.aq += (f5 - this.aq) * 0.4f;
        this.aU += this.aq;
    }

    @Override
    public boolean r() {
        return false;
    }

    public nc_1(World world) {
        super(world);
    }

    @Override
    protected void a(double d, boolean bl, Block block, BlockPos blockPos) {
    }
}

