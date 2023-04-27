/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityMinecart;
import net.minecraft.util.DamageSource;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ok
 */
public abstract class ok_2
extends EntityMinecart
implements aHP {
    private ItemStack[] aw = new ItemStack[36];
    private boolean av = true;

    @Override
    public void a(DD dD) {
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return !this.isDead && entityPlayer.g(this) <= 64.0;
    }

    @Override
    public DD e() {
        return DD.a;
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public String getName() {
        return this.e() ? this.y() : U0.d;
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public void E() {
        if (this.av) {
            iz_0.a(this.worldObj, this, (rs_1)this);
        }
        super.E();
    }

    @Override
    public ItemStack b(int n) {
        if (this.aw[n] != null) {
            ItemStack itemStack = this.aw[n];
            this.aw[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public boolean b(EntityPlayer entityPlayer) {
        if (!this.worldObj.isRemote) {
            a6w_0.a(entityPlayer, this);
        }
        return true;
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        super.b(nBTTagCompound);
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < this.aw.length; ++i) {
            if (this.aw[i] == null) continue;
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, U0.f, (byte)i);
            act_2.a(this.aw[i], nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, U0.b, nBTTagList);
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public void a(DamageSource damageSource) {
        super.a(damageSource);
        if (J9.c(aV8.k(this.worldObj), U0.a)) {
            iz_0.a(this.worldObj, this, (rs_1)this);
        }
    }

    public ok_2(World world) {
        super(world);
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    protected void g(NBTTagCompound nBTTagCompound) {
        super.g(nBTTagCompound);
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, U0.c, 10);
        this.aw = new ItemStack[ap9_0.a(this)];
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            int n = tn_0.e(nBTTagCompound2, U0.e) & 0xFF;
            if (n >= this.aw.length) continue;
            this.aw[n] = act_2.a(nBTTagCompound2);
        }
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.aw[n] != null) {
            if (this.aw[n].a <= n2) {
                ItemStack itemStack = this.aw[n];
                this.aw[n] = null;
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.aw[n], n2);
            if (this.aw[n].a == 0) {
                this.aw[n] = null;
            }
            return itemStack;
        }
        return null;
    }

    @Override
    public ItemStack a(int n) {
        return this.aw[n];
    }

    @Override
    public void f(int n) {
        this.av = false;
        super.f(n);
    }

    @Override
    public void a() {
        for (int i = 0; i < this.aw.length; ++i) {
            this.aw[i] = null;
        }
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.aw[n] = itemStack;
        if (itemStack.a > this.b()) {
            itemStack.a = this.b();
        }
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    protected void e() {
        int n = 15 - afy_2.a(this);
        float f = 0.98f + (float)n * 0.001f;
        this.motionX *= (double)f;
        this.motionY *= 0.0;
        this.motionZ *= (double)f;
    }

    public ok_2(World world, double d, double d2, double d3) {
        super(world, d, d2, d3);
    }

    @Override
    public void d() {
    }
}

