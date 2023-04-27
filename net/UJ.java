/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.ayb_0;
import net.z_0;

public class UJ {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static z_0 a() {
        return z_0.b();
    }

    public static void a(z_0 z_02, ayb_0 ayb_02) {
        z_02.a(ayb_02);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (UJ.b() == null) {
            UJ.b(new ListInvoker[3]);
        }
    }
}

