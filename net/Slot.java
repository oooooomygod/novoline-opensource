/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class Slot {
    public int a;
    public int d;
    public rs_1 e;
    public int b;
    private int c;

    public void a(ItemStack itemStack, ItemStack itemStack2) {
        if (act_2.k(itemStack) == act_2.k(itemStack2)) {
            int n = itemStack2.a - itemStack.a;
            this.a(itemStack, n);
        }
    }

    public ItemStack f() {
        return apw_0.b(this.e, this.c);
    }

    public boolean a(EntityPlayer entityPlayer) {
        return true;
    }

    public void e() {
        apw_0.f(this.e);
    }

    protected void a(ItemStack itemStack, int n) {
    }

    public String b() {
        return null;
    }

    public boolean a(ItemStack itemStack) {
        return true;
    }

    public Slot(rs_1 rs_12, int n, int n2, int n3) {
        this.e = rs_12;
        this.c = n;
        this.a = n2;
        this.d = n3;
    }

    public ItemStack a(int n) {
        return apw_0.b(this.e, this.c, n);
    }

    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        this.e();
    }

    public boolean a(rs_1 rs_12, int n) {
        return rs_12 == this.e && n == this.c;
    }

    public boolean a(Item item) {
        return act_2.k(this.f()) != null && act_2.k(this.f()) == item;
    }

    public boolean c() {
        return true;
    }

    public int a() {
        return apw_0.b(this.e);
    }

    protected void b(ItemStack itemStack) {
    }

    public int c(ItemStack itemStack) {
        return this.a();
    }

    public void d(ItemStack itemStack) {
        apw_0.a(this.e, this.c, itemStack);
        this.e();
    }

    public boolean d() {
        return this.f() != null;
    }
}

