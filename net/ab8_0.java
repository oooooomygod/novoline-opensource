/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.W2;
import net.a0D;
import net.aL0;
import net.aob_2;
import net.ce_2;
import net.dk_0;
import net.lb_1;
import net.ys_2;

/*
 * Renamed from net.ab8
 */
public class ab8_0 {
    private static lb_1[][] a = null;

    public static void a() {
        a = null;
    }

    public static int a(int n, int n2) {
        a0D.k();
        if (a == null) {
            return n;
        }
        if (n >= 0 && n < a.length) {
            lb_1[] lb_1Array;
            int n3;
            int n4;
            lb_1[] lb_1Array2 = a[n];
            if (lb_1Array2 != null && (n4 = 0) < (n3 = (lb_1Array = lb_1Array2).length)) {
                lb_1 lb_12 = lb_1Array[n4];
                if (aob_2.a(lb_12, n, n2)) {
                    return aob_2.b(lb_12);
                }
                ++n4;
            }
            return n;
        }
        return n;
    }

    private static lb_1[][] a(List<List<lb_1>> list) {
        a0D.k();
        lb_1[][] lb_1Array = new lb_1[ListInvoker.size(list)][];
        int n = 0;
        if (n < lb_1Array.length) {
            List list2 = (List)ListInvoker.get(list, n);
            lb_1Array[n] = (lb_1[])ListInvoker.toArray(list2, new lb_1[0]);
            ++n;
        }
        return lb_1Array;
    }

    public static void a(W2 w2) {
        a0D.r();
        ab8_0.a();
        String string = ce_2.h;
        try {
            dk_0.b(w2, string);
            return;
        }
        catch (IOException iOException) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), ce_2.b), string).toString());
            return;
        }
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    private static void a(List<List<lb_1>> list, lb_1 lb_12) {
        int[] nArray;
        int[] nArray2 = nArray = aob_2.a(lb_12);
        a0D.k();
        int n = nArray2.length;
        int n2 = 0;
        if (n2 < n) {
            ArrayList arrayList;
            int n3 = nArray2[n2];
            if (n3 >= ListInvoker.size(list)) {
                ListInvoker.add(list, null);
            }
            if ((arrayList = (ArrayList)ListInvoker.get(list, n3)) == null) {
                arrayList = new ArrayList();
                ListInvoker.set(list, n3, arrayList);
            }
            ListInvoker.add(arrayList, lb_12);
            ++n2;
        }
    }
}

