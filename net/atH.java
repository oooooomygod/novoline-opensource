/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import net.DoubleProperty;
import net.KillAura;
import net.ListProperty;
import net.StringProperty;

public class atH {
    private static ListInvoker[] b;

    public static float l(KillAura killAura) {
        return killAura.u();
    }

    public static EntityPlayer h(KillAura killAura) {
        return killAura.M();
    }

    public static void n(KillAura killAura) {
        killAura.g();
    }

    public static boolean j(KillAura killAura) {
        return killAura.l();
    }

    public static float c(KillAura killAura) {
        return killAura.Q();
    }

    public static ListProperty f(KillAura killAura) {
        return killAura.K();
    }

    public static boolean k(KillAura killAura) {
        return killAura.x();
    }

    static {
        if (atH.b() != null) {
            atH.b(new ListInvoker[3]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static boolean m(KillAura killAura) {
        return killAura.D();
    }

    public static DoubleProperty d(KillAura killAura) {
        return killAura.p();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static boolean b(KillAura killAura) {
        return killAura.n();
    }

    public static boolean a(KillAura killAura, String string) {
        return killAura.b(string);
    }

    public static boolean a(KillAura killAura, Entity entity) {
        return killAura.c(entity);
    }

    public static Entity a(KillAura killAura) {
        return killAura.C();
    }

    public static float i(KillAura killAura) {
        return killAura.L();
    }

    public static StringProperty e(KillAura killAura) {
        return killAura.j();
    }

    public static float g(KillAura killAura) {
        return killAura.i();
    }
}

