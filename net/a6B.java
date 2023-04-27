/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.inventory.Container;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.NBTTagList;
import java.util.Random;


public class a6B
extends a6h_0
implements rs_1 {
    private ItemStack[] j = new ItemStack[9];
    protected String k;
    private static Random l = new Random();

    @Override
    public void a() {
        for (int i = 0; i < this.j.length; ++i) {
            this.j[i] = null;
        }
    }

    @Override
    public boolean a(int n, ItemStack itemStack) {
        return true;
    }

    @Override
    public String b() {
        return AZ.d;
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public int c() {
        return 0;
    }

    public void a(String string) {
        this.k = string;
    }

    @Override
    public boolean a(EntityPlayer entityPlayer) {
        return aV8.z(this.e, this.g) == this && entityPlayer.d((double)amv_2.j(this.g) + 0.5, (double)amv_2.h(this.g) + 0.5, (double)amv_2.i(this.g) + 0.5) <= 64.0;
    }

    public int a() {
        int n = -1;
        int n2 = 1;
        for (int i = 0; i < this.j.length; ++i) {
            if (this.j[i] == null || a5_0.a(l, n2++) != 0) continue;
            n = i;
        }
        return n;
    }

    @Override
    public Container a(aSK aSK2, EntityPlayer entityPlayer) {
        return new aat_1(aSK2, this);
    }

    @Override
    public String getName() {
        return this.e() ? this.k : AZ.g;
    }

    @Override
    public void c(EntityPlayer entityPlayer) {
    }

    @Override
    public ItemStack a(int n) {
        return this.j[n];
    }

    @Override
    public int b() {
        return 64;
    }

    @Override
    public int c(int n) {
        return 0;
    }

    @Override
    public ItemStack b(int n) {
        if (this.j[n] != null) {
            ItemStack itemStack = this.j[n];
            this.j[n] = null;
            return itemStack;
        }
        return null;
    }

    @Override
    public void b(EntityPlayer entityPlayer) {
    }

    @Override
    public void c(NBTTagCompound nBTTagCompound) {
        super.c(nBTTagCompound);
        NBTTagList nBTTagList = new NBTTagList();
        for (int i = 0; i < this.j.length; ++i) {
            if (this.j[i] == null) continue;
            NBTTagCompound nBTTagCompound2 = new NBTTagCompound();
            tn_0.a(nBTTagCompound2, AZ.f, (byte)i);
            act_2.a(this.j[i], nBTTagCompound2);
            kv_0.a(nBTTagList, nBTTagCompound2);
        }
        tn_0.a(nBTTagCompound, AZ.c, nBTTagList);
        if (this.e()) {
            tn_0.a(nBTTagCompound, AZ.i, this.k);
        }
    }

    @Override
    public boolean e() {
        return this.k != null;
    }

    @Override
    public ItemStack b(int n, int n2) {
        if (this.j[n] != null) {
            if (this.j[n].a <= n2) {
                ItemStack itemStack = this.j[n];
                this.j[n] = null;
                this.d();
                return itemStack;
            }
            ItemStack itemStack = act_2.b(this.j[n], n2);
            if (this.j[n].a == 0) {
                this.j[n] = null;
            }
            this.d();
            return itemStack;
        }
        return null;
    }

    @Override
    public void a(NBTTagCompound nBTTagCompound) {
        super.a(nBTTagCompound);
        NBTTagList nBTTagList = tn_0.c(nBTTagCompound, AZ.h, 10);
        this.j = new ItemStack[this.e()];
        for (int i = 0; i < kv_0.c(nBTTagList); ++i) {
            NBTTagCompound nBTTagCompound2 = kv_0.g(nBTTagList, i);
            int n = tn_0.e(nBTTagCompound2, AZ.e) & 0xFF;
            if (n >= this.j.length) continue;
            this.j[n] = act_2.a(nBTTagCompound2);
        }
        if (tn_0.a(nBTTagCompound, AZ.b, 8)) {
            this.k = tn_0.m(nBTTagCompound, AZ.a);
        }
    }

    @Override
    public void b(int n, ItemStack itemStack) {
        this.j[n] = itemStack;
        if (itemStack.a > this.b()) {
            itemStack.a = this.b();
        }
        this.d();
    }

    public int a(ItemStack itemStack) {
        for (int i = 0; i < this.j.length; ++i) {
            if (this.j[i] != null && act_2.k(this.j[i]) != null) continue;
            this.b(i, itemStack);
            return i;
        }
        return -1;
    }

    @Override
    public int e() {
        return 9;
    }
}

