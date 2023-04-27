/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import net.skidunion.I;
import net.skidunion.aG;
import net.skidunion.aP;
import net.skidunion.aZ;
import net.skidunion.ap_0;
import net.skidunion.n_0;
import net.skidunion.o_0;

/*
 * Renamed from net.yC
 */
public class yc_1 {
    private static boolean b;

    public static void a(aP aP10, n_0 n_02) {
        aP10.a(n_02);
    }

    public static void a(aP aP10, String string) {
        aP10.a(string);
    }

    public static void a(aP aP10, ap_0 ap_02) {
        aP10.a(ap_02);
    }

    public static boolean e(aP aP10) {
        return aP10.connectBlocking();
    }

    public static CountDownLatch g(aP aP10) {
        return aP10.m();
    }

    public static String b(aP aP10) {
        return aP10.j();
    }

    public static CopyOnWriteArrayList f(aP aP10) {
        return aP10.d();
    }

    public static boolean h(aP aP10) {
        return aP10.n();
    }

    public static aZ d(aP aP10) {
        return aP10.a();
    }

    public static void a(aP aP10, I i) {
        aP10.a(i);
    }

    static {
        if (!yc_1.b()) {
            yc_1.b(true);
        }
    }

    public static boolean a() {
        yc_1.b();
        return true;
    }

    public static void a(aP aP10, o_0 o_02) {
        aP10.a(o_02);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static aG a(aP aP10) {
        return aP10.b();
    }

    public static void b(aP aP10, String string) {
        aP10.g(string);
    }

    public static o_0 c(aP aP10) {
        return aP10.k();
    }

    public static boolean b() {
        return b;
    }
}

