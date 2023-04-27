/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.EntityLivingBase;
import deobf.EnumDifficulty;
import net.minecraft.util.MovingObjectPosition;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.oE
 */
public class oe_1
extends oa_1 {
    @Override
    protected float a() {
        return this.a() ? 0.73f : super.a();
    }

    public void h(boolean bl) {
        aom_0.b(this.l, 10, axt_2.a((byte)1));
    }

    @Override
    public float a(aw0_0 aw0_02, World world, BlockPos blockPos, IBlockState iBlockState) {
        float f = super.a(aw0_02, world, blockPos, iBlockState);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (this.a() && hd_0.a(block)) {
            f = MathInvoker.a(0.8f, f);
        }
        return f;
    }

    @Override
    public boolean N() {
        return false;
    }

    @Override
    public boolean ag() {
        return false;
    }

    public oe_1(World world, double d, double d2, double d3, double d4, double d5, double d6) {
        super(world, d, d2, d3, d4, d5, d6);
        this.c(0.3125f, 0.3125f);
    }

    @Override
    protected void g() {
        aom_0.a(this.l, 10, axt_2.a((byte)0));
    }

    @Override
    protected void a(MovingObjectPosition movingObjectPosition) {
        if (!this.worldObj.isRemote) {
            if (movingObjectPosition.entityHit != null) {
                if (this.ak != null) {
                    if (movingObjectPosition.entityHit.a(aDJ.a(this.ak), 8.0f)) {
                        if (!movingObjectPosition.entityHit.n()) {
                            atn_0.b(this.ak, 5.0f);
                        } else {
                            this.a(this.ak, movingObjectPosition.entityHit);
                        }
                    }
                } else {
                    movingObjectPosition.entityHit.a(DamageSource.s, 5.0f);
                }
                if (movingObjectPosition.entityHit instanceof EntityLivingBase) {
                    int n = 0;
                    if (aV8.p(this.worldObj) == EnumDifficulty.NORMAL) {
                        n = 10;
                    } else if (aV8.p(this.worldObj) == EnumDifficulty.HARD) {
                        n = 40;
                    }
                    atn_0.a((EntityLivingBase)movingObjectPosition.entityHit, new a2l_0(ari_0.f(Potion.wither), 20 * n, 1));
                }
            }
            aV8.a(this.worldObj, this, this.posX, this.posY, this.posZ, 1.0f, false, J9.c(aV8.k(this.worldObj), aCJ.a));
            this.E();
        }
    }

    public oe_1(World world, EntityLivingBase entityLivingBase, double d, double d2, double d3) {
        super(world, entityLivingBase, d, d2, d3);
        this.c(0.3125f, 0.3125f);
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        return false;
    }

    public oe_1(World world) {
        super(world);
        this.c(0.3125f, 0.3125f);
    }

    public boolean a() {
        return aom_0.g(this.l, 10) == 1;
    }
}

