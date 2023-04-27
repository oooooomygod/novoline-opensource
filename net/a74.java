/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

class a74
extends Slot {
    rb_0 f;
    private Slot g;

    @Override
    public String b() {
        return this.g.b();
    }

    @Override
    public ItemStack f() {
        return this.g.f();
    }

    @Override
    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        this.g.a(entityPlayer, itemStack);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return this.g.a(itemStack);
    }

    @Override
    public boolean d() {
        return this.g.d();
    }

    @Override
    public void e() {
        this.g.e();
    }

    public a74(rb_0 rb_02, Slot slot, int n) {
        this.f = rb_02;
        super(slot.e, n, 0, 0);
        this.g = slot;
    }

    @Override
    public boolean a(rs_1 rs_12, int n) {
        return this.g.a(rs_12, n);
    }

    @Override
    public void d(ItemStack itemStack) {
        this.g.d(itemStack);
    }

    @Override
    public ItemStack a(int n) {
        return this.g.a(n);
    }

    @Override
    public int c(ItemStack itemStack) {
        return this.g.c(itemStack);
    }

    @Override
    public int a() {
        return this.g.a();
    }

    static Slot a(a74 a742) {
        return a742.g;
    }
}

