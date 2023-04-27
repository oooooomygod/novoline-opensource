/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import deobf.EnumFacing;

/*
 * Renamed from net.ahT
 */
public class aht_1 {
    public static void b(JE jE) {
        aP2.b();
        ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), mh_0.b), jE), mh_0.j), aND.b(jE)), mh_0.g), aND.e(jE)), mh_0.f), aND.c(jE)), mh_0.c), aND.f(jE)).toString());
        EnumFacing[] enumFacingArray = EnumFacing.VALUES;
        int n = 0;
        if (n < enumFacingArray.length) {
            EnumFacing enumFacing = enumFacingArray[n];
            List list = aND.a(jE, enumFacing);
            aht_1.a(SJ.d(enumFacing), list, mh_0.m);
            ++n;
        }
        List list = aND.d(jE);
        aht_1.a(mh_0.r, list, mh_0.u);
    }

    private static void a(String string, List list, String string2) {
        aP2.b();
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            aht_1.a(string, (a9Z)object, string2);
        }
    }

    public static JE a(JE jE) {
        List list = aht_1.a(aND.d(jE));
        aP2.b();
        EnumFacing[] enumFacingArray = EnumFacing.VALUES;
        ArrayList<List<a9Z>> arrayList = new ArrayList<List<a9Z>>();
        int n = 0;
        if (n < enumFacingArray.length) {
            EnumFacing enumFacing = enumFacingArray[n];
            List list2 = aND.a(jE, enumFacing);
            List list3 = aht_1.a(list2);
            ListInvoker.add(arrayList, list3);
            ++n;
        }
        aks_2 aks_22 = new aks_2(list, arrayList, aND.b(jE), aND.e(jE), aND.f(jE), aND.a(jE));
        return aks_22;
    }

    public static void a(String string, a9Z a9Z2, String string2) {
        ys_2.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string2), mh_0.i), ara_2.b(a9Z2.getClass())), mh_0.s), string), mh_0.k), aX3.f(a9Z2)), mh_0.v), aX3.e(a9Z2)), mh_0.q), aX3.a(a9Z2)).toString());
        aht_1.a(aX3.d(a9Z2), aL0.a(aL0.a(new StringBuilder(), mh_0.a), string2).toString());
    }

    public static List a(List list) {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        Iterator iterator = ListInvoker.iterator(list);
        if (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            a9Z a9Z2 = aht_1.a((a9Z)object);
            ListInvoker.add(arrayList, a9Z2);
        }
        return arrayList;
    }

    public static void a(int[] nArray, String string) {
        int n = nArray.length / 4;
        ys_2.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.a(new StringBuilder(), string), mh_0.t), nArray.length), mh_0.o), n).toString());
        aP2.b();
        int n2 = 0;
        int n3 = n2 * n;
        float f = axx_1.a(nArray[n3]);
        float f2 = axx_1.a(nArray[n3 + 1]);
        float f3 = axx_1.a(nArray[n3 + 2]);
        int n4 = nArray[n3 + 3];
        float f4 = axx_1.a(nArray[n3 + 4]);
        float f5 = axx_1.a(nArray[n3 + 5]);
        ys_2.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), string), n2), mh_0.e), f), mh_0.d), f2), mh_0.p), f3), mh_0.l), n4), mh_0.h), f4), mh_0.n), f5).toString());
        ++n2;
    }

    public static a9Z a(a9Z a9Z2) {
        a9Z a9Z3 = new a9Z((int[])aX3.d(a9Z2).clone(), aX3.e(a9Z2), aX3.f(a9Z2), aX3.a(a9Z2));
        return a9Z3;
    }
}

