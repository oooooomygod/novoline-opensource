/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import net.minecraft.util.DamageSource;
import deobf.Entity;
import deobf.EntityLivingBase;
import net.minecraft.item.ItemStack;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from net.yl
 */
public abstract class yl_2 {
    public int c;
    public static yl_2 C;
    public b_0 g;
    private static Map<ResourceLocation, yl_2> r;
    public static yl_2 E;
    private static yl_2[] u;
    public static yl_2 s;
    public static yl_2 o;
    protected String q;
    public static yl_2 p;
    private int d;
    public static yl_2 a;
    public static yl_2 x;
    public static yl_2 l;
    public static yl_2 A;
    public static yl_2 v;
    public static yl_2 y;
    public static yl_2 e;
    public static yl_2 w;
    public static yl_2[] m;
    public static yl_2 j;
    public static yl_2 h;
    public static yl_2 F;
    public static yl_2 i;
    public static yl_2 z;
    public static yl_2 t;
    public static yl_2 D;
    public static yl_2 B;
    public static yl_2 k;
    public static yl_2 b;
    public static yl_2 f;
    public static yl_2 n;

    public int c() {
        return 1;
    }

    public String c(int n) {
        String string = ahq_0.b(this.d());
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aMT.q), ahq_0.b(aL0.c(aL0.a(new StringBuilder(), aMT.f), n).toString())).toString();
    }

    public int a(int n, DamageSource damageSource) {
        return 0;
    }

    public boolean a(ItemStack itemStack) {
        return ab_0.a(this.g, act_2.k(itemStack));
    }

    public yl_2 a(String string) {
        this.q = string;
        return this;
    }

    public int a() {
        return this.d;
    }

    public String d() {
        return aL0.a(aL0.a(new StringBuilder(), aMT.h), this.q).toString();
    }

    public static Set<ResourceLocation> b() {
        return MapInvoker.c(r);
    }

    protected yl_2(int n, ResourceLocation resourceLocation, int n2, b_0 b_02) {
        this.c = n;
        this.d = n2;
        this.g = b_02;
        if (u[n] != null) {
            throw new IllegalArgumentException(aMT.w);
        }
        yl_2.u[n] = this;
        MapInvoker.c(r, resourceLocation, this);
    }

    public void a(EntityLivingBase entityLivingBase, Entity entity, int n) {
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    public boolean a(yl_2 yl_22) {
        return this != yl_22;
    }

    public static yl_2 b(int n) {
        return n < u.length ? u[n] : null;
    }

    static {
        u = new yl_2[256];
        r = MapsInvoker.a();
        x = new yq_1(0, new ResourceLocation(aMT.a), 10, 0);
        o = new yq_1(1, new ResourceLocation(aMT.m), 5, 1);
        B = new yq_1(2, new ResourceLocation(aMT.B), 5, 2);
        D = new yq_1(3, new ResourceLocation(aMT.y), 2, 3);
        v = new yq_1(4, new ResourceLocation(aMT.l), 5, 4);
        l = new y7_0(5, new ResourceLocation(aMT.p), 2);
        y = new yn_2(6, new ResourceLocation(aMT.z), 2);
        h = new yi_1(7, new ResourceLocation(aMT.v), 1);
        n = new yc_2(8, new ResourceLocation(aMT.b), 2);
        b = new yw_1(16, new ResourceLocation(aMT.t), 10, 0);
        i = new yw_1(17, new ResourceLocation(aMT.j), 5, 1);
        A = new yw_1(18, new ResourceLocation(aMT.c), 5, 2);
        f = new y3_0(19, new ResourceLocation(aMT.C), 5);
        e = new yr_2(20, new ResourceLocation(aMT.A), 2);
        C = new yx_1(21, new ResourceLocation(aMT.s), 2, b_0.WEAPON);
        p = new yv_2(32, new ResourceLocation(aMT.e), 10);
        w = new yg_2(33, new ResourceLocation(aMT.x), 1);
        k = new yv_1(34, new ResourceLocation(aMT.o), 5);
        s = new yx_1(35, new ResourceLocation(aMT.g), 2, b_0.DIGGER);
        j = new yy_0(48, new ResourceLocation(aMT.n), 10);
        E = new yp_1(49, new ResourceLocation(aMT.u), 2);
        a = new y6_0(50, new ResourceLocation(aMT.k), 2);
        t = new yj_2(51, new ResourceLocation(aMT.r), 1);
        F = new yx_1(61, new ResourceLocation(aMT.i), 2, b_0.FISHING_ROD);
        z = new yu_2(62, new ResourceLocation(aMT.d), 2, b_0.FISHING_ROD);
        ArrayList arrayList = my_0.c();
        for (yl_2 yl_22 : u) {
            ListInvoker.add(arrayList, yl_22);
        }
        m = (yl_2[])ListInvoker.toArray(arrayList, new yl_2[ListInvoker.size(arrayList)]);
    }

    public float a(int n, aH2 aH22) {
        return 0.0f;
    }

    public static yl_2 b(String string) {
        return (yl_2)MapInvoker.c(r, new ResourceLocation(string));
    }

    public void b(EntityLivingBase entityLivingBase, Entity entity, int n) {
    }

    public int a(int n) {
        return 1 + n * 10;
    }

    public int d(int n) {
        return this.a(n) + 5;
    }

    public int e() {
        return 1;
    }
}

