/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityPlayer;
import java.util.Iterator;

/*
 * Renamed from net.nc
 */
public abstract class nc_2
extends Entity {
    private int al;
    protected BlockPos ak;
    public EnumFacing aj;

    private void e() {
        if (this.aj != null) {
            double d = (double)amv_2.j(this.ak) + 0.5;
            double d2 = (double)amv_2.h(this.ak) + 0.5;
            double d3 = (double)amv_2.i(this.ak) + 0.5;
            double d4 = this.a(this.c());
            double d5 = this.a(this.a());
            d -= (double)SJ.k(this.aj) * 0.46875;
            d3 -= (double)SJ.a(this.aj) * 0.46875;
            EnumFacing enumFacing = SJ.c(this.aj);
            this.posX = d += d4 * (double)SJ.k(enumFacing);
            this.posY = d2 += d5;
            this.posZ = d3 += d4 * (double)SJ.a(enumFacing);
            double d6 = this.c();
            double d7 = this.a();
            double d8 = this.c();
            if (SJ.h(this.aj) == kl_1.Z) {
                d8 = 1.0;
            } else {
                d6 = 1.0;
            }
            this.a(new rm_2(d - (d6 /= 32.0), d2 - (d7 /= 32.0), d3 - (d8 /= 32.0), d + d6, d2 + d7, d3 + d8));
        }
    }

    @Override
    public void b(NBTTagCompound nBTTagCompound) {
        tn_0.a(nBTTagCompound, kr_2.b, (byte)SJ.j(this.aj));
        tn_0.b(nBTTagCompound, kr_2.l, amv_2.j(this.d()));
        tn_0.b(nBTTagCompound, kr_2.e, amv_2.h(this.d()));
        tn_0.b(nBTTagCompound, kr_2.k, amv_2.i(this.d()));
    }

    private double a(int n) {
        return n % 32 == 0 ? 0.5 : 0.0;
    }

    public abstract void a(Entity var1);

    @Override
    public void j(double d, double d2, double d3) {
        this.posX = d;
        this.posY = d2;
        this.posZ = d3;
        BlockPos blockPos = this.ak;
        this.ak = new BlockPos(d, d2, d3);
        if (!this.ak.equals(blockPos)) {
            this.e();
            this.p = true;
        }
    }

    @Override
    public void moveEntity(double d, double d2, double d3) {
        if (!this.worldObj.isRemote && !this.isDead && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.E();
            this.a((Entity)null);
        }
    }

    @Override
    public boolean b(Entity entity) {
        return entity instanceof EntityPlayer && this.a(aDJ.a((EntityPlayer)entity), 0.0f);
    }

    public boolean b() {
        if (!ListInvoker.isEmpty(aV8.b(this.worldObj, this, this.getEntityBoundingBox()))) {
            return false;
        }
        int n = MathInvoker.max(1, this.c() / 16);
        int n2 = MathInvoker.max(1, this.a() / 16);
        BlockPos blockPos = amv_2.a(this.ak, SJ.b(this.aj));
        EnumFacing enumFacing = SJ.c(this.aj);
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n2; ++j) {
                BlockPos blockPos2 = amv_2.c(amv_2.a(blockPos, enumFacing, i), j);
                Block block = BlockStateInvoker.getBlock(aV8.q(this.worldObj, blockPos2));
                if (akm_1.i(BlocksInvoker.getBlockState(block)) || mu_0.a(block)) continue;
                return false;
            }
        }
        Iterator iterator = ListInvoker.iterator(aV8.a(this.worldObj, (Entity)this, this.getEntityBoundingBox()));
        while (dz_0.c(iterator)) {
            Entity entity = (Entity)dz_0.b(iterator);
            if (!(entity instanceof nc_2)) continue;
            return false;
        }
        return true;
    }

    protected void a(EnumFacing enumFacing) {
        ag4_0.a(enumFacing);
        ag4_0.a(eh_0.b(SJ.h(enumFacing)));
        this.aj = enumFacing;
        this.prevRotationYaw = this.rotationYaw = (float)(SJ.j(this.aj) * 90);
        this.e();
    }

    public nc_2(World world) {
        super(world);
        this.c(0.5f, 0.5f);
    }

    @Override
    public void b(double d, double d2, double d3) {
        if (!this.worldObj.isRemote && !this.isDead && d * d + d2 * d2 + d3 * d3 > 0.0) {
            this.E();
            this.a((Entity)null);
        }
    }

    public nc_2(World world, BlockPos blockPos) {
        this(world);
        this.ak = blockPos;
    }

    @Override
    protected boolean X() {
        return false;
    }

    @Override
    public boolean N() {
        return true;
    }

    @Override
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.al++ == 100 && !this.worldObj.isRemote) {
            this.al = 0;
            if (!this.isDead && !this.b()) {
                this.E();
                this.a((Entity)null);
            }
        }
    }

    public abstract int a();

    @Override
    protected void g() {
    }

    @Override
    public EnumFacing al() {
        return this.aj;
    }

    public BlockPos d() {
        return this.ak;
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        if (this.a(damageSource)) {
            return false;
        }
        if (!this.isDead && !this.worldObj.isRemote) {
            this.E();
            this.k();
            this.a(aDJ.d(damageSource));
        }
        return true;
    }

    @Override
    public void g(NBTTagCompound nBTTagCompound) {
        EnumFacing enumFacing;
        this.ak = new BlockPos(tn_0.g(nBTTagCompound, kr_2.f), tn_0.g(nBTTagCompound, kr_2.j), tn_0.g(nBTTagCompound, kr_2.h));
        if (tn_0.a(nBTTagCompound, kr_2.i, 99)) {
            enumFacing = SJ.b(tn_0.e(nBTTagCompound, kr_2.d));
            this.ak = amv_2.a(this.ak, enumFacing);
        } else {
            enumFacing = tn_0.a(nBTTagCompound, kr_2.a, 99) ? SJ.b(tn_0.e(nBTTagCompound, kr_2.g)) : SJ.b(tn_0.e(nBTTagCompound, kr_2.c));
        }
        this.a(enumFacing);
    }

    public abstract int c();
}

