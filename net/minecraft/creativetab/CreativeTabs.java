/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.creativetab;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.Iterator;
import java.util.List;

public abstract class CreativeTabs {
    public static CreativeTabs o;
    private int d;
    private ItemStack g;
    public static CreativeTabs f;
    public static CreativeTabs b;
    private boolean k = true;
    private b_0[] p;
    public static CreativeTabs j;
    public static CreativeTabs e;
    private boolean s = true;
    public static CreativeTabs h;
    public static CreativeTabs c;
    public static CreativeTabs l;
    public static CreativeTabs[] t;
    public static CreativeTabs a;
    private String n = es_0.m;
    private String r;
    public static CreativeTabs i;
    public static CreativeTabs q;
    public static CreativeTabs m;

    public CreativeTabs(int n, String string) {
        this.d = n;
        this.r = string;
        CreativeTabs.t[n] = this;
    }

    public String g() {
        return this.r;
    }

    public String e() {
        return aL0.a(aL0.a(new StringBuilder(), es_0.g), this.g()).toString();
    }

    public CreativeTabs a() {
        this.k = false;
        return this;
    }

    public int d() {
        return this.d;
    }

    public CreativeTabs a(String string) {
        this.n = string;
        return this;
    }

    public void a(List<ItemStack> list, b_0 ... b_0Array) {
        for (yl_2 yl_22 : yl_2.m) {
            if (yl_22.g == null) continue;
            for (int i = 0; i < b_0Array.length; ++i) {
                if (yl_22.g != b_0Array[i]) continue;
            }
            ListInvoker.add(list, arw_2.a(Items.enchanted_book, new cl_0(yl_22, xr_1.c(yl_22))));
        }
    }

    public int h() {
        return this.d % 6;
    }

    public boolean n() {
        return this.k;
    }

    public CreativeTabs a(b_0 ... b_0Array) {
        this.p = b_0Array;
        return this;
    }

    public b_0[] c() {
        return this.p;
    }

    public boolean k() {
        return this.d < 6;
    }

    public abstract Item m();

    public boolean a(b_0 b_02) {
        if (this.p != null) {
            for (b_0 b_03 : this.p) {
                if (b_03 != b_02) continue;
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return this.s;
    }

    public void a(List<ItemStack> list) {
        Iterator iterator = aLP.a(Item.k);
        while (dz_0.c(iterator)) {
            Item item = (Item)dz_0.b(iterator);
            if (px_0.j(item) != this) continue;
            px_0.a(item, item, this, list);
        }
        if (this.c() != null) {
            this.a(list, this.c());
        }
    }

    public int i() {
        return 0;
    }

    static {
        t = new CreativeTabs[12];
        m = new zm_2(0, es_0.d);
        l = new zw_2(1, es_0.c);
        j = new zs_2(2, es_0.b);
        f = new zy_0(3, es_0.o);
        b = new zk_1(4, es_0.n).a(new b_0[]{b_0.ALL});
        e = new zb_1(5, es_0.e).a(es_0.p);
        q = new z1(6, es_0.k);
        c = new zt_1(7, es_0.a).a(b_0.DIGGER, b_0.FISHING_ROD, b_0.BREAKABLE);
        a = new zj_1(8, es_0.i).a(b_0.ARMOR, b_0.ARMOR_FEET, b_0.ARMOR_HEAD, b_0.ARMOR_LEGS, b_0.ARMOR_TORSO, b_0.BOW, b_0.WEAPON);
        h = new z0_0(9, es_0.h);
        i = new z__0(10, es_0.l);
        o = new zc_1(11, es_0.f).a(es_0.j).b().a();
    }

    public CreativeTabs b() {
        this.s = false;
        return this;
    }

    public ItemStack j() {
        if (this.g == null) {
            this.g = new ItemStack(this.m(), 1, this.i());
        }
        return this.g;
    }

    public String l() {
        return this.n;
    }
}

