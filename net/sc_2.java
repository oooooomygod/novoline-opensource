/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.a6W;

/*
 * Renamed from net.sc
 */
public class sc_2 {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static String a(int n) {
        return a6W.a(n);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (sc_2.b() != null) {
            sc_2.b(new ListInvoker[1]);
        }
    }
}

