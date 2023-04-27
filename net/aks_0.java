/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Vec3;
import net.aMK;

/*
 * Renamed from net.aKs
 */
public class aks_0 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (aks_0.b() != null) {
            aks_0.b(new ListInvoker[2]);
        }
    }

    public static double d(aMK aMK2) {
        return aMK2.b();
    }

    public static aMK c(aMK aMK2) {
        return aMK2.c();
    }

    public static aMK b(aMK aMK2, aMK aMK3) {
        return aMK2.a(aMK3);
    }

    public static double b(aMK aMK2) {
        return aMK2.a();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static Vec3 a(aMK aMK2) {
        return aMK2.d();
    }

    public static double a(aMK aMK2, aMK aMK3) {
        return aMK2.b(aMK3);
    }

    public static aMK a(aMK aMK2, double d, double d2, double d3) {
        return aMK2.a(d, d2, d3);
    }

    public static double e(aMK aMK2) {
        return aMK2.e();
    }
}

