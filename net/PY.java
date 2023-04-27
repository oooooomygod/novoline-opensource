/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.aeg_0;
import net.akq_1;
import net.ayr_1;

public class PY {
    public static boolean a(ayr_1 ayr_12, int n, int n2) {
        return ayr_12.a(n, n2);
    }

    public static void a(ayr_1 ayr_12, int n, int n2, int n3) {
        ayr_12.a(n, n2, n3);
    }

    public static void a(ayr_1 ayr_12, double d, double d2, double d3, double d4, int n, int n2, int n3, int n4) {
        akq_1.b();
        ayr_12.a(d, d2, d3, d4, n, n2, n3, n4);
        if (ListInvoker.b() != null) {
            akq_1.b(new ListInvoker[3]);
        }
    }

    public static aeg_0 a(ayr_1 ayr_12) {
        return ayr_12.b();
    }
}

