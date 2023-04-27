/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;


public class LA
extends Item {
    private float m;
    private boolean r;
    private int n;
    private int p;
    public int q;
    private int u;
    private int o;
    private boolean s;
    private float t;

    public boolean b() {
        return this.s;
    }

    public int b(ItemStack itemStack) {
        return this.p;
    }

    @Override
    public ItemStack c(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        --itemStack.a;
        K.a(a6w_0.u(entityPlayer), this, itemStack);
        aV8.a(world, (Entity)entityPlayer, py_2.a, 0.5f, a5_0.e(world.o) * 0.1f + 0.9f);
        this.b(itemStack, world, entityPlayer);
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack;
    }

    @Override
    public ti_1 c(ItemStack itemStack) {
        return ti_1.EAT;
    }

    protected void b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote && this.o > 0 && a5_0.e(world.o) < this.t) {
            a6w_0.a(entityPlayer, new a2l_0(this.o, this.u * 20, this.n));
        }
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 32;
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (a6w_0.a(entityPlayer, this.r)) {
            a6w_0.a(entityPlayer, itemStack, this.getMaxItemUseDuration(itemStack));
        }
        return itemStack;
    }

    public LA a() {
        this.r = true;
        return this;
    }

    public LA a(int n, int n2, int n3, float f) {
        this.o = n;
        this.u = n2;
        this.n = n3;
        this.t = f;
        return this;
    }

    public LA(int n, float f, boolean bl) {
        this.q = 32;
        this.p = n;
        this.s = bl;
        this.m = f;
        this.a(CreativeTabs.q);
    }

    public float a(ItemStack itemStack) {
        return this.m;
    }

    public LA(int n, boolean bl) {
        this(n, 0.6f, bl);
    }
}

