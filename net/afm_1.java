/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.amr_0;
import net.t8_0;

/*
 * Renamed from net.afM
 */
public class afm_1 {
    public static double[] a(amr_0 amr_02, double[] dArray, int n, int n2, int n3, int n4, int n5, int n6, double d, double d2, double d3) {
        int n7 = t8_0.c();
        double[] dArray2 = amr_02.a(dArray, n, n2, n3, n4, n5, n6, d, d2, d3);
        if (ListInvoker.b() != null) {
            t8_0.b(++n7);
        }
        return dArray2;
    }

    public static double[] a(amr_0 amr_02, double[] dArray, int n, int n2, int n3, int n4, double d, double d2, double d3) {
        return amr_02.a(dArray, n, n2, n3, n4, d, d2, d3);
    }
}

