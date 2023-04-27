/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import net.aL0;
import net.ast_2;
import net.my_0;

/*
 * Renamed from net.aMa
 */
public class ama_0 {
    private static List<int[]> c;
    private static int b;
    private static List<int[]> a;
    private static List<int[]> e;
    private static List<int[]> d;

    public static synchronized void a() {
        if (!ListInvoker.isEmpty(d)) {
            ListInvoker.remove(d, ListInvoker.size(d) - 1);
        }
        if (!ListInvoker.isEmpty(e)) {
            ListInvoker.remove(e, ListInvoker.size(e) - 1);
        }
        ListInvoker.addAll(d, c);
        ListInvoker.addAll(e, a);
        ListInvoker.clear(c);
        ListInvoker.clear(a);
    }

    public static synchronized String b() {
        return aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), ast_2.d), ListInvoker.size(d)), ast_2.c), ListInvoker.size(e)), ast_2.a), ListInvoker.size(c)), ast_2.b), ListInvoker.size(a)).toString();
    }

    public static synchronized int[] a(int n) {
        if (n <= 256) {
            if (ListInvoker.isEmpty(e)) {
                int[] nArray = new int[256];
                ListInvoker.add(a, nArray);
                return nArray;
            }
            int[] nArray = (int[])ListInvoker.remove(e, ListInvoker.size(e) - 1);
            ListInvoker.add(a, nArray);
            return nArray;
        }
        if (n > b) {
            b = n;
            ListInvoker.clear(d);
            ListInvoker.clear(c);
            int[] nArray = new int[b];
            ListInvoker.add(c, nArray);
            return nArray;
        }
        if (ListInvoker.isEmpty(d)) {
            int[] nArray = new int[b];
            ListInvoker.add(c, nArray);
            return nArray;
        }
        int[] nArray = (int[])ListInvoker.remove(d, ListInvoker.size(d) - 1);
        ListInvoker.add(c, nArray);
        return nArray;
    }

    static {
        b = 256;
        e = my_0.c();
        a = my_0.c();
        d = my_0.c();
        c = my_0.c();
    }
}

