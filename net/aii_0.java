/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.aPP;
import net.rr_1;

/*
 * Renamed from net.aIi
 */
public class aii_0 {
    private static ListInvoker[] b;

    static {
        if (aii_0.b() != null) {
            aii_0.b(new ListInvoker[4]);
        }
    }

    public static void a(rr_1 rr_12, String string, String string2) {
        aPP.a(rr_12, string, string2);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void c() {
        aPP.e();
    }
}

