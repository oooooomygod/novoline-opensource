/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import deobf.EnumFacing;

public class aAU {
    public static List<aDW> a(Random random, int n) {
        ArrayList arrayList = my_0.c();
        ListInvoker.add(arrayList, new aDW(ZH.class, 4, MathHelper.a(random, 2 + n, 4 + n * 2)));
        ListInvoker.add(arrayList, new aDW(ZN.class, 20, MathHelper.a(random, 0 + n, 1 + n)));
        ListInvoker.add(arrayList, new aDW(ZS.class, 20, MathHelper.a(random, 0 + n, 2 + n)));
        ListInvoker.add(arrayList, new aDW(zs_0.class, 3, MathHelper.a(random, 2 + n, 5 + n * 3)));
        ListInvoker.add(arrayList, new aDW(ZX.class, 15, MathHelper.a(random, 0 + n, 2 + n)));
        ListInvoker.add(arrayList, new aDW(zi_0.class, 3, MathHelper.a(random, 1 + n, 4 + n)));
        ListInvoker.add(arrayList, new aDW(Z8.class, 3, MathHelper.a(random, 2 + n, 4 + n * 2)));
        ListInvoker.add(arrayList, new aDW(ZM.class, 15, MathHelper.a(random, 0, 1 + n)));
        ListInvoker.add(arrayList, new aDW(Z9.class, 8, MathHelper.a(random, 0 + n, 3 + n * 2)));
        Iterator iterator = ListInvoker.iterator(arrayList);
        while (dz_0.c(iterator)) {
            if (((aDW)dz_0.b((Iterator)iterator)).d != 0) continue;
            dz_0.a(iterator);
        }
        return arrayList;
    }

    private static int a(List<aDW> list) {
        int n = 0;
        Iterator iterator = ListInvoker.iterator(list);
        while (dz_0.c(iterator)) {
            aDW aDW2 = (aDW)dz_0.b(iterator);
            if (aDW2.d <= 0 || aDW2.a < aDW2.d) {
                // empty if block
            }
            n += aDW2.c;
        }
        return n;
    }

    public static void a() {
        _6.b(ZS.class, au1_0.k);
        _6.b(zi_0.class, au1_0.f);
        _6.b(Z8.class, au1_0.e);
        _6.b(Z_.class, au1_0.m);
        _6.b(ZX.class, au1_0.h);
        _6.b(ZH.class, au1_0.d);
        _6.b(zs_0.class, au1_0.j);
        _6.b(ZN.class, au1_0.l);
        _6.b(ZM.class, au1_0.c);
        _6.b(zw_0.class, au1_0.b);
        _6.b(Z0.class, au1_0.g);
        _6.b(Z9.class, au1_0.i);
        _6.b(ZC.class, au1_0.a);
    }

    private static zd_0 a(zw_0 zw_02, aDW aDW2, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        Class<? extends zd_0> clazz = aDW2.b;
        zd_0 zd_02 = null;
        if (clazz == ZH.class) {
            zd_02 = fm_0.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZN.class) {
            zd_02 = a7w_0.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZS.class) {
            zd_02 = afz_1.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zs_0.class) {
            zd_02 = ax9_0.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZX.class) {
            zd_02 = aXP.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == zi_0.class) {
            zd_02 = anj_0.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == Z8.class) {
            zd_02 = azy_1.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == ZM.class) {
            zd_02 = at5.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        } else if (clazz == Z9.class) {
            zd_02 = aed_2.a(zw_02, list, random, n, n2, n3, enumFacing, n4);
        }
        return zd_02;
    }

    static Y_ e(zw_0 zw_02, List list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        return aAU.d(zw_02, list, random, n, n2, n3, enumFacing, n4);
    }

    static Y_ a(zw_0 zw_02, List list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        return aAU.c(zw_02, list, random, n, n2, n3, enumFacing, n4);
    }

    private static Y_ c(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        if (n4 > 50) {
            return null;
        }
        if (MathInvoker.a(n - aPJ.b((zw_0)zw_02).f) <= 112 && MathInvoker.a(n3 - aPJ.b((zw_0)zw_02).b) <= 112) {
            int n5;
            zd_0 zd_02 = aAU.b(zw_02, list, random, n, n2, n3, enumFacing, n4 + 1);
            int n6 = (zd_02.b.f + zd_02.b.d) / 2;
            int n7 = (zd_02.b.b + zd_02.b.e) / 2;
            int n8 = zd_02.b.d - zd_02.b.f;
            int n9 = zd_02.b.e - zd_02.b.b;
            int n10 = n5 = n8 > n9 ? n8 : n9;
            if (aqo_0.a(aPJ.a(zw_02), n6, n7, n5 / 2 + 4, ajX.i)) {
                ListInvoker.add(list, zd_02);
                ListInvoker.add(zw_02.i, zd_02);
                return zd_02;
            }
            return null;
        }
        return null;
    }

    private static Y_ d(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        if (n4 > 3 + zw_02.k) {
            return null;
        }
        if (MathInvoker.a(n - aPJ.b((zw_0)zw_02).f) <= 112 && MathInvoker.a(n3 - aPJ.b((zw_0)zw_02).b) <= 112) {
            HF hF = w6_0.a(zw_02, list, random, n, n2, n3, enumFacing);
            if (hF.c > 10) {
                int n5;
                Z0 z0 = new Z0(zw_02, n4, random, hF, enumFacing);
                int n6 = (z0.b.f + z0.b.d) / 2;
                int n7 = (z0.b.b + z0.b.e) / 2;
                int n8 = z0.b.d - z0.b.f;
                int n9 = z0.b.e - z0.b.b;
                int n10 = n5 = n8 > n9 ? n8 : n9;
                if (aqo_0.a(aPJ.a(zw_02), n6, n7, n5 / 2 + 4, ajX.i)) {
                    ListInvoker.add(list, z0);
                    ListInvoker.add(zw_02.l, z0);
                    return z0;
                }
            }
            return null;
        }
        return null;
    }

    private static zd_0 b(zw_0 zw_02, List<Y_> list, Random random, int n, int n2, int n3, EnumFacing enumFacing, int n4) {
        aAU.a(zw_02.g);
        return null;
    }
}

