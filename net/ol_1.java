/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.Container;
import net.minecraft.util.DamageSource;
import deobf.EntityPlayer;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.oL
 */
public class ol_1
extends ok_2
implements amb_0 {
    private boolean ax = true;
    private BlockPos az = BlockPos.m;
    private int ay = -1;

    public ol_1(World world) {
        super(world);
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        this.ay = tn_0.g(nBTTagCompound, th_0.b);
    }

    @Override
    public World b() {
        return this.worldObj;
    }

    public boolean g() {
        return this.ay > 0;
    }

    public boolean h() {
        if (a9i_0.a(this)) {
            return true;
        }
        List list = aV8.a(this.worldObj, og_0.class, h__0.d(this.getEntityBoundingBox(), 0.25, 0.0, 0.25), od_2.b);
        if (!ListInvoker.isEmpty(list)) {
            a9i_0.a(this, (og_0)ListInvoker.get(list, 0));
        }
        return false;
    }

    @Override
    public double c() {
        return this.posX;
    }

    public void j(int n) {
        this.ay = n;
    }

    @Override
    public void onUpdate() {
        super.onUpdate();
        if (!this.worldObj.isRemote && this.n() && this.i()) {
            BlockPos blockPos = new BlockPos(this);
            if (blockPos.equals(this.az)) {
                --this.ay;
            } else {
                this.j(0);
            }
            if (!this.g()) {
                this.j(0);
                if (this.h()) {
                    this.j(4);
                    this.d();
                }
            }
        }
    }

    public boolean i() {
        return this.ax;
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        tn_0.b(nBTTagCompound, th_0.d, this.ay);
    }

    @Override
    public int e() {
        return 5;
    }

    @Override
    public IBlockState k() {
        return aos_0.a(Blocks.t);
    }

    @Override
    public String b() {
        return th_0.a;
    }

    @Override
    public double e() {
        return this.posY + 0.5;
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aai_2(aSK2, this, entityPlayer);
    }

    @Override
    public int i() {
        return 1;
    }

    @Override
    public anf_0 d() {
        return anf_0.HOPPER;
    }

    @Override
    public void a(DamageSource damageSource) {
        super.a(damageSource);
        if (J9.c(aV8.k(this.worldObj), th_0.c)) {
            this.a(px_0.a(Blocks.t), 1, 0.0f);
        }
    }

    @Override
    public double d() {
        return this.posZ;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (!this.worldObj.isRemote) {
            a6w_0.a(entityPlayer, this);
        }
        return true;
    }

    public void i(boolean bl) {
        this.ax = bl;
    }

    public ol_1(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    public void a(int n, int n2, int n3, boolean bl) {
        boolean bl2 = true;
        if (bl2 != this.i()) {
            this.i(bl2);
        }
    }
}

