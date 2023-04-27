/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;

/*
 * Renamed from net.nq
 */
public class nq_2
extends np_1
implements a1l {
    @Override
    protected Item j() {
        return Items.snowball;
    }

    @Override
    protected void b(boolean bl, int n) {
        int n2 = a5_0.a(this.Q, 16);
        for (int i = 0; i < n2; ++i) {
            this.a(Items.snowball, 1);
        }
    }

    @Override
    public float w() {
        return 1.7f;
    }

    public nq_2(World world) {
        super(world);
        this.c(0.7f, 1.9f);
        afv_0.b((F_)this.Z(), true);
        aMS.a(this.bx, 1, new _V(this, 1.25, 20, 10.0f));
        aMS.a(this.bx, 2, new _J(this, 1.0));
        aMS.a(this.bx, 3, new aly_2(this, EntityPlayer.class, 6.0f));
        aMS.a(this.bx, 4, new _A(this));
        aMS.a(this.bv, 1, new _m_0<Entity>(this, nl_1.class, 10, true, false, ar0_0.b));
    }

    @Override
    public void onLivingUpdate() {
        super.onLivingUpdate();
        if (!this.worldObj.isRemote) {
            int n = MathHelper.floor_double(this.posX);
            int n2 = MathHelper.floor_double(this.posY);
            int n3 = MathHelper.floor_double(this.posZ);
            if (this.am()) {
                this.a(DamageSource.f, 1.0f);
            }
            BlockPos blockPos = new BlockPos(n, 0, n3);
            BlockPos blockPos2 = new BlockPos(n, n2, n3);
            if (hw_0.c(aV8.o(this.worldObj, blockPos), blockPos2) > 1.0f) {
                this.a(DamageSource.d, 1.0f);
            }
            int n4 = 0;
            while (true) {
                BlockPos blockPos3;
                if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos3 = new BlockPos(n = MathHelper.floor_double(this.posX + (double)((float)(n4 % 2 * 2 - 1) * 0.25f)), n2 = MathHelper.floor_double(this.posY), n3 = MathHelper.floor_double(this.posZ + (double)((float)(n4 / 2 % 2 * 2 - 1) * 0.25f)))))) == Material.air) {
                    BlockPos blockPos4 = new BlockPos(n, 0, n3);
                    if (hw_0.c(aV8.o(this.worldObj, blockPos4), blockPos3) < 0.8f && BlocksInvoker.g(Blocks.cm, this.worldObj, blockPos3)) {
                        aV8.a(this.worldObj, blockPos3, BlocksInvoker.t(Blocks.cm));
                    }
                }
                ++n4;
            }
        }
    }

    @Override
    public void a(EntityLivingBase entityLivingBase, float f) {
        oq_2 oq_22 = new oq_2(this.worldObj, this);
        double d = entityLivingBase.posY + (double)entityLivingBase.w() - (double)1.1f;
        double d2 = entityLivingBase.posX - this.posX;
        double d3 = d - oq_22.posY;
        double d4 = entityLivingBase.posZ - this.posZ;
        float f2 = MathHelper.e(d2 * d2 + d4 * d4) * 0.2f;
        aZA.a(oq_22, d2, d3 + (double)f2, d4, 1.6f, 12.0f);
        this.a(aIX.a, 1.0f, 1.0f / (a5_0.e(this.E()) * 0.4f + 0.8f));
        aV8.b(this.worldObj, oq_22);
    }

    @Override
    protected void H() {
        super.H();
        Ma.a(this.a(abb_0.b), 4.0);
        Ma.a(this.a(abb_0.e), 0.2f);
    }
}

