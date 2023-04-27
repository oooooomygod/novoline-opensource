/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.player.Scaffold;
import deobf.IntProperty;
import java.util.List;

/*
 * Renamed from net.ma
 */
public class ma_1 {
    private static ListInvoker[] b;

    public static IntProperty e(Scaffold scaffold) {
        return scaffold.b();
    }

    public static float f(Scaffold scaffold) {
        return scaffold.d();
    }

    public static float g(Scaffold scaffold) {
        return scaffold.t();
    }

    public static float d(Scaffold scaffold) {
        return scaffold.g();
    }

    public static boolean c(Scaffold scaffold) {
        return scaffold.x();
    }

    public static int b(Scaffold scaffold) {
        return scaffold.getBlockCount();
    }

    public static List a(Scaffold scaffold) {
        return scaffold.k();
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (ma_1.b() != null) {
            ma_1.b(new ListInvoker[1]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static float h(Scaffold scaffold) {
        return scaffold.x();
    }
}

