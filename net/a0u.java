/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.FontFamily;
import net.aRD;
import net.avp_2;

public class a0u {
    public static void a(avp_2 avp_22, FontFamily fontFamily, int n, int n2, double d, double d2) {
        avp_22.a(fontFamily, n, n2, d, d2);
    }

    public static double b(avp_2 avp_22) {
        return avp_22.a();
    }

    public static boolean a(avp_2 avp_22) {
        return avp_22.b();
    }

    public static void a(avp_2 avp_22, FontFamily fontFamily, int n, int n2, double d, double d2, int n3, int n4) {
        aRD.b();
        avp_22.a(fontFamily, n, n2, d, d2, n3, n4);
        if (ListInvoker.b() != null) {
            aRD.b(false);
        }
    }
}

