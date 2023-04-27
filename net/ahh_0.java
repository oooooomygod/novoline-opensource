/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.item.ItemStack;
import deobf.NBTBase;

/*
 * Renamed from net.ahH
 */
public class ahh_0 {
    private ItemStack e;
    private ItemStack d;
    private int c;
    private boolean b;
    private ItemStack a;
    private int f;

    public void c() {
        ++this.f;
    }

    public NBTTagCompound g() {
        NBTTagCompound nBTTagCompound = new NBTTagCompound();
        tn_0.a(nBTTagCompound, ax_1.c, (NBTBase)act_2.a(this.e, new NBTTagCompound()));
        tn_0.a(nBTTagCompound, ax_1.j, (NBTBase)act_2.a(this.a, new NBTTagCompound()));
        if (this.d != null) {
            tn_0.a(nBTTagCompound, ax_1.l, (NBTBase)act_2.a(this.d, new NBTTagCompound()));
        }
        tn_0.b(nBTTagCompound, ax_1.b, this.f);
        tn_0.b(nBTTagCompound, ax_1.g, this.c);
        tn_0.a(nBTTagCompound, ax_1.m, this.b);
        return nBTTagCompound;
    }

    public void a(int n) {
        this.c += n;
    }

    public ahh_0(ItemStack itemStack, ItemStack itemStack2, ItemStack itemStack3) {
        this(itemStack, itemStack2, itemStack3, 0, 7);
    }

    public ItemStack h() {
        return this.d;
    }

    public void a(NBTTagCompound nBTTagCompound) {
        NBTTagCompound nBTTagCompound2 = tn_0.d(nBTTagCompound, ax_1.f);
        this.e = act_2.a(nBTTagCompound2);
        NBTTagCompound nBTTagCompound3 = tn_0.d(nBTTagCompound, ax_1.n);
        this.a = act_2.a(nBTTagCompound3);
        if (tn_0.a(nBTTagCompound, ax_1.h, 10)) {
            this.d = act_2.a(tn_0.d(nBTTagCompound, ax_1.i));
        }
        if (tn_0.a(nBTTagCompound, ax_1.k, 99)) {
            this.f = tn_0.g(nBTTagCompound, ax_1.o);
        }
        this.c = tn_0.a(nBTTagCompound, ax_1.e, 99) ? tn_0.g(nBTTagCompound, ax_1.a) : 7;
        this.b = tn_0.a(nBTTagCompound, ax_1.d, 1) ? tn_0.c(nBTTagCompound, ax_1.p) : true;
    }

    public ItemStack k() {
        return this.e;
    }

    public ahh_0(ItemStack itemStack, Item item) {
        this(itemStack, new ItemStack(item));
    }

    public ItemStack f() {
        return this.a;
    }

    public void i() {
        this.f = this.c;
    }

    public ahh_0(ItemStack itemStack, ItemStack itemStack2) {
        this(itemStack, null, itemStack2);
    }

    public int j() {
        return this.f;
    }

    public boolean a() {
        return this.b;
    }

    public ahh_0(NBTTagCompound nBTTagCompound) {
        this.a(nBTTagCompound);
    }

    public boolean b() {
        return this.f >= this.c;
    }

    public int e() {
        return this.c;
    }

    public ahh_0(ItemStack itemStack, ItemStack itemStack2, ItemStack itemStack3, int n, int n2) {
        this.e = itemStack;
        this.d = itemStack2;
        this.a = itemStack3;
        this.f = n;
        this.c = n2;
        this.b = true;
    }

    public boolean d() {
        return this.d != null;
    }
}

