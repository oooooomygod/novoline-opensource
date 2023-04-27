/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.agg_2;
import net.azs_0;

/*
 * Renamed from net.aBy
 */
public class aby_0 {
    public static void a(azs_0 azs_02, double d, double d2, double d3, double d4, double d5, double d6, float f, Runnable runnable, float f2) {
        agg_2.b();
        azs_02.a(d, d2, d3, d4, d5, d6, f, runnable, f2);
        if (ListInvoker.b() != null) {
            agg_2.b("I4vQVb");
        }
    }

    public static azs_0 a() {
        return azs_0.d();
    }

    public static void a(azs_0 azs_02, double d, double d2, double d3, double d4, double d5, double d6, float f, float[] fArray, Runnable runnable) {
        agg_2.b();
        azs_02.a(d, d2, d3, d4, d5, d6, f, fArray, runnable);
        ListInvoker.b(new ListInvoker[4]);
    }
}

