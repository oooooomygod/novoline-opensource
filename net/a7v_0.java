/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import java.util.Random;

import deobf.EnumFacing;

/*
 * Renamed from net.a7v
 */
public class a7v_0 {
    private static aga_0[] b = new aga_0[]{new aga_0(ZQ.class, 30, 0, true), new aga_0(ZV.class, 10, 4), new aga_0(ZW.class, 10, 4), new aga_0(Z7.class, 10, 3), new aga_0(ZI.class, 5, 2), new aga_0(Z3.class, 5, 1)};
    private static aga_0[] a = new aga_0[]{new aga_0(zp_0.class, 25, 0, true), new aga_0(zv_0.class, 15, 5), new aga_0(Zy.class, 5, 10), new aga_0(zl_0.class, 5, 10), new aga_0(Z6.class, 10, 3, true), new aga_0(zj_0.class, 7, 2), new aga_0(zx_0.class, 5, 2)};

    static aga_0[] a() {
        return a;
    }

    static YJ b(aga_0 aga_02, List list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        return a7v_0.a(aga_02, list, random, n, n2, n3, enumFacing, n4);
    }

    private static YJ a(aga_0 aga_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        Class<? extends YJ> clazz = aga_02.c;
        YJ yJ = null;
        if (clazz == ZQ.class) {
            yJ = d9_0.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZV.class) {
            yJ = avt_0.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZW.class) {
            yJ = axz_0.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == Z7.class) {
            yJ = arh_0.a(list, random, n, n2, n3, n4, enumFacing);
        } else if (clazz == ZI.class) {
            yJ = TQ.a(list, random, n, n2, n3, n4, enumFacing);
        } else if (clazz == Z3.class) {
            yJ = hg_0.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zp_0.class) {
            yJ = apj_2.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == Zy.class) {
            yJ = T5.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zl_0.class) {
            yJ = dg_2.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == Z6.class) {
            yJ = BC.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zj_0.class) {
            yJ = IU.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zv_0.class) {
            yJ = EG.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zx_0.class) {
            yJ = aLN.a(list, random, n, n2, n3, enumFacing, n4);
        }
        return yJ;
    }

    public static void b() {
        _6.b(ZV.class, ac9_0.j);
        _6.b(zu_0.class, ac9_0.k);
        _6.b(ZQ.class, ac9_0.n);
        _6.b(Z6.class, ac9_0.h);
        _6.b(zj_0.class, ac9_0.d);
        _6.b(Z3.class, ac9_0.b);
        _6.b(zv_0.class, ac9_0.o);
        _6.b(zl_0.class, ac9_0.a);
        _6.b(zp_0.class, ac9_0.m);
        _6.b(Zy.class, ac9_0.l);
        _6.b(zx_0.class, ac9_0.c);
        _6.b(ZI.class, ac9_0.f);
        _6.b(ZW.class, ac9_0.i);
        _6.b(Z7.class, ac9_0.g);
        _6.b(zr_0.class, ac9_0.e);
    }

    static aga_0[] c() {
        return b;
    }
}

