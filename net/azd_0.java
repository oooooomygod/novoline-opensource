/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SystemInvoker;
import java.util.ArrayList;
import java.util.List;
import deobf.EnumFacing;

/*
 * Renamed from net.aZd
 */
public class azd_0 {
    private static JE d = null;
    private static List f;
    private static JE b;
    private static JE n;
    private static JE m;
    private static List q;
    private static JE a;
    private static List h;
    private static JE g;
    private static List o;
    private static JE k;
    private static List c;
    private static List p;
    private static JE l;
    private static JE r;
    private static JE e;
    private static JE j;
    private static JE i;

    static {
        g = null;
        b = null;
        k = null;
        l = null;
        i = null;
        h = null;
        o = null;
        p = null;
        c = null;
        f = null;
        q = null;
        n = null;
        m = null;
        j = null;
        e = null;
        r = null;
        a = null;
    }

    private static JE a(JE jE) {
        List[] listArray;
        aP2.b();
        if (jE == null) {
            return null;
        }
        if (ListInvoker.size(aND.d(jE)) > 0) {
            ys_2.d(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), im_0.j), ListInvoker.size(aND.d(jE))), im_0.b), jE).toString());
            return jE;
        }
        int n = 0;
        EnumFacing[] enumFacingArray = EnumFacing.VALUES;
        if (n < enumFacingArray.length) {
            listArray = enumFacingArray[n];
            List list = aND.a(jE, (EnumFacing)listArray);
            if (ListInvoker.size(list) != 1) {
                ys_2.d(aL0.a(aL0.a(aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), im_0.q), listArray), im_0.e), ListInvoker.size(list)), im_0.c), jE).toString());
                return jE;
            }
            ++n;
        }
        JE jE2 = azl_0.a(jE);
        listArray = new List[enumFacingArray.length];
        int n2 = 0;
        if (n2 < enumFacingArray.length) {
            EnumFacing enumFacing = enumFacingArray[n2];
            List list = aND.a(jE2, enumFacing);
            a9Z a9Z2 = (a9Z)ListInvoker.get(list, 0);
            a9Z a9Z3 = new a9Z((int[])aX3.d(a9Z2).clone(), aX3.e(a9Z2), aX3.f(a9Z2), aX3.a(a9Z2));
            int[] nArray = aX3.d(a9Z3);
            int[] nArray2 = (int[])nArray.clone();
            int n3 = nArray.length / 4;
            SystemInvoker.a(nArray, 0 * n3, nArray2, 3 * n3, n3);
            SystemInvoker.a(nArray, 1 * n3, nArray2, 2 * n3, n3);
            SystemInvoker.a(nArray, 2 * n3, nArray2, 1 * n3, n3);
            SystemInvoker.a(nArray, 3 * n3, nArray2, 0 * n3, n3);
            SystemInvoker.a(nArray2, 0, nArray, 0, nArray2.length);
            ListInvoker.add(list, a9Z3);
            ++n2;
        }
        return jE2;
    }

    private static List b(JE jE) {
        aP2.b();
        return jE == null ? null : aND.d(jE);
    }

    static JE a(String string, List list) {
        aP2.b();
        ys_2.aJ();
        return null;
    }

    public static void a() {
        aP2.b();
        ArrayList arrayList = new ArrayList();
        d = azd_0.a(im_0.n, arrayList);
        g = azd_0.a(im_0.h, arrayList);
        b = azd_0.a(im_0.l, arrayList);
        k = azd_0.a(im_0.k, arrayList);
        l = azd_0.a(im_0.a, arrayList);
        i = azd_0.a(im_0.f, arrayList);
        h = azd_0.b(d);
        o = azd_0.b(g);
        p = azd_0.b(b);
        c = azd_0.b(k);
        f = azd_0.b(l);
        q = azd_0.b(i);
        n = azd_0.a(d);
        m = azd_0.a(g);
        j = azd_0.a(b);
        e = azd_0.a(k);
        r = azd_0.a(l);
        a = azd_0.a(i);
        if (ListInvoker.size(arrayList) > 0) {
            ys_2.a(aL0.a(aL0.a(new StringBuilder(), im_0.i), ys_2.a(ListInvoker.toArray(arrayList))).toString());
        }
    }

    public static JE c(JE jE) {
        aP2.b();
        if (!ys_2.U()) {
            return jE;
        }
        List list = aND.d(jE);
        return list == h ? n : (list == o ? m : (list == p ? j : (list == c ? e : (list == f ? r : (list == q ? a : jE)))));
    }
}

