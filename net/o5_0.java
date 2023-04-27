/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityArrow;
import deobf.EntityMinecart;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.o5
 */
public class o5_0
extends EntityMinecart {
    private int av = -1;

    @Override
    public void a(int n, int n2, int n3, boolean bl) {
        if (this.av < 0) {
            this.a();
        }
    }

    @Override
    public anf_0 d() {
        return anf_0.TNT;
    }

    @Override
    public void a(byte by) {
        if (by == 10) {
            this.a();
        } else {
            super.a(by);
        }
    }

    @Override
    public void b(float f, float f2) {
        if (f >= 3.0f) {
            float f3 = f / 10.0f;
            this.a((double)(f3 * f3));
        }
        super.b(f, f2);
    }

    public int c() {
        return this.av;
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        if (tn_0.a(nBTTagCompound, a9I.a, 99)) {
            this.av = tn_0.g(nBTTagCompound, a9I.e);
        }
    }

    @Override
    public void a(DamageSource damageSource) {
        super.a(damageSource);
        double d = this.motionX * this.motionX + this.motionZ * this.motionZ;
        if (!aDJ.h(damageSource) && J9.c(aV8.k(this.worldObj), a9I.d)) {
            this.a(new ItemStack(Blocks.Y, 1), 0.0f);
        }
        if (aDJ.m(damageSource) || aDJ.h(damageSource) || d >= (double)0.01f) {
            this.a(d);
        }
    }

    protected void a(double d) {
        if (!this.worldObj.isRemote) {
            double d2 = MathInvoker.d(d);
            if (d2 > 5.0) {
                d2 = 5.0;
            }
            aV8.a(this.worldObj, this, this.posX, this.posY, this.posZ, (float)(4.0 + a5_0.c(this.Q) * 1.5 * d2), true);
            this.E();
        }
    }

    @Override
    public boolean a(DamageSource damageSource, float f) {
        EntityArrow entityArrow;
        Entity entity = aDJ.l(damageSource);
        if (entity instanceof EntityArrow && (entityArrow = (EntityArrow)entity).ag()) {
            this.a(entityArrow.motionX * entityArrow.motionX + entityArrow.motionY * entityArrow.motionY + entityArrow.motionZ * entityArrow.motionZ);
        }
        return super.a(damageSource, f);
    }

    public o5_0(World world) {
        super(world);
    }

    @Override
    public float a(aw0_0 aw0_02, World world, BlockPos blockPos, IBlockState iBlockState) {
        return !this.b() || !ask_1.a(iBlockState) && !ask_1.a(world, amv_2.e(blockPos)) ? super.a(aw0_02, world, blockPos, iBlockState) : 0.0f;
    }

    @Override
    public boolean a(aw0_0 aw0_02, World world, BlockPos blockPos, IBlockState iBlockState, float f) {
        return (!this.b() || !ask_1.a(iBlockState) && !ask_1.a(world, amv_2.e(blockPos))) && super.a(aw0_02, world, blockPos, iBlockState, f);
    }

    @Override
    public IBlockState k() {
        return BlocksInvoker.t(Blocks.Y);
    }

    public boolean b() {
        return this.av > -1;
    }

    @Override
    public void onUpdate() {
        double d;
        super.onUpdate();
        if (this.av > 0) {
            --this.av;
            aV8.a(this.worldObj, B7.SMOKE_NORMAL, this.posX, this.posY + 0.5, this.posZ, 0.0, 0.0, 0.0, new int[0]);
        } else if (this.av == 0) {
            this.a(this.motionX * this.motionX + this.motionZ * this.motionZ);
        }
        if (this.g && (d = this.motionX * this.motionX + this.motionZ * this.motionZ) >= (double)0.01f) {
            this.a(d);
        }
    }

    public void a() {
        this.av = 80;
        if (!this.worldObj.isRemote) {
            aV8.a(this.worldObj, (Entity)this, (byte)10);
            if (!this.Q()) {
                aV8.a(this.worldObj, this, a9I.c, 1.0f, 1.0f);
            }
        }
    }

    public o5_0(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, a9I.b, this.av);
    }
}

