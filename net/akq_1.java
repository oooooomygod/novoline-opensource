/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.on_0;

/*
 * Renamed from net.akQ
 */
public class akq_1 {
    private static ListInvoker[] b;

    public static String a(on_0 on_02) {
        return on_02.a();
    }

    public static void a(on_0 on_02, double d, double d2, double d3, double d4, int n, int n2, int n3, int n4) {
        akq_1.b();
        on_02.a(d, d2, d3, d4, n, n2, n3, n4);
        ListInvoker.b(new ListInvoker[2]);
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (akq_1.b() == null) {
            akq_1.b(new ListInvoker[5]);
        }
    }

    public static boolean a(on_0 on_02, int n, int n2) {
        return on_02.b(n, n2);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void a(on_0 on_02, char c, int n) {
        on_02.a(c, n);
    }

    public static void a(on_0 on_02, double d, double d2, double d3, double d4, int n, int n2) {
        on_02.a(d, d2, d3, d4, n, n2);
    }

    public static void a(on_0 on_02, int n, int n2, int n3) {
        on_02.a(n, n2, n3);
    }
}

