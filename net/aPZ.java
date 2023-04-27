/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import deobf.EnumFacing;

public class aPZ {
    private static ag__0[] a = new ag__0[]{new ag__0(zt_0.class, 40, 0), new ag__0(ZP.class, 5, 5), new ag__0(ZO.class, 20, 0), new ag__0(ZB.class, 20, 0), new ag__0(zf_0.class, 10, 6), new ag__0(zz_0.class, 5, 5), new ag__0(zq_0.class, 5, 5), new ag__0(ZE.class, 5, 4), new ag__0(zh_0.class, 5, 4), new agc_1(ZF.class, 10, 2), new agw_2(ZZ.class, 20, 1)};
    private static ta_1 b = new ta_1(null);
    private static List<ag__0> e;
    private static Class<? extends ZA> d;
    static int c;

    static Class a(Class clazz) {
        d = clazz;
        return d;
    }

    private static ZA b(ze_0 ze_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        ag__0 ag__02;
        if (!aPZ.b()) {
            return null;
        }
        if (d != null) {
            ZA zA = aPZ.a(d, list, random, n, n2, n3, enumFacing, n4);
            d = null;
            return zA;
        }
        int n5 = 0;
        while (true) {
            ++n5;
            int n6 = a5_0.a(random, c);
            Iterator iterator = ListInvoker.iterator(e);
            if (!dz_0.c(iterator)) continue;
            ag__02 = (ag__0)dz_0.b(iterator);
            n6 -= ag__02.c;
            if (ag__02.a(n4) && ag__02 != ze_02.g) break;
        }
        ZA zA = aPZ.a(ag__02.d, list, random, n, n2, n3, enumFacing, n4);
        ++ag__02.a;
        ze_02.g = ag__02;
        if (!ag__02.a()) {
            ListInvoker.remove(e, ag__02);
        }
        return zA;
    }

    public static void a() {
        _6.b(zh_0.class, aB3.j);
        _6.b(ZG.class, aB3.c);
        _6.b(ZE.class, aB3.m);
        _6.b(ZO.class, aB3.l);
        _6.b(ZF.class, aB3.k);
        _6.b(ZZ.class, aB3.g);
        _6.b(ZP.class, aB3.d);
        _6.b(ZB.class, aB3.a);
        _6.b(zf_0.class, aB3.b);
        _6.b(zq_0.class, aB3.h);
        _6.b(ze_0.class, aB3.f);
        _6.b(zt_0.class, aB3.e);
        _6.b(zz_0.class, aB3.i);
    }

    public static void d() {
        e = my_0.c();
        for (ag__0 ag__02 : a) {
            ag__02.a = 0;
            ListInvoker.add(e, ag__02);
        }
        d = null;
    }

    private static boolean b() {
        boolean bl = false;
        c = 0;
        Iterator iterator = ListInvoker.iterator(e);
        while (dz_0.c(iterator)) {
            ag__0 ag__02 = (ag__0)dz_0.b(iterator);
            if (ag__02.b > 0 && ag__02.a < ag__02.b) {
                bl = true;
            }
            c += ag__02.c;
        }
        return bl;
    }

    private static Y_ a(ze_0 ze_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        if (n4 > 50) {
            return null;
        }
        if (MathInvoker.a(n - n_0.a((ze_0)ze_02).f) <= 112 && MathInvoker.a(n3 - n_0.a((ze_0)ze_02).b) <= 112) {
            ZA zA = aPZ.b(ze_02, list, random, n, n2, n3, enumFacing, n4 + 1);
            ListInvoker.add(list, zA);
            ListInvoker.add(ze_02.h, zA);
            return zA;
        }
        return null;
    }

    static ta_1 c() {
        return b;
    }

    private static ZA a(Class<? extends ZA> clazz, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        ZA zA = null;
        if (clazz == zt_0.class) {
            zA = XS.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZP.class) {
            zA = dj_2.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZO.class) {
            zA = ays_2.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZB.class) {
            zA = aP5.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zf_0.class) {
            zA = aIV.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zz_0.class) {
            zA = u0_0.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zq_0.class) {
            zA = aA7.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZE.class) {
            zA = akp_1.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zh_0.class) {
            zA = acj_0.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZF.class) {
            zA = aYP.a(list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZZ.class) {
            zA = fx_0.a(list, random, n, n2, n3, enumFacing, n4);
        }
        return zA;
    }

    static Y_ c(ze_0 ze_02, List list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        return aPZ.a(ze_02, (List<Y_>)list, random, n, n2, n3, enumFacing, n4);
    }
}

