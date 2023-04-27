/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.skidunion.y_0;

public class PF {
    private static ListInvoker[] b;

    static {
        if (PF.b() != null) {
            PF.b(new ListInvoker[5]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static int a(y_0 y_02) {
        return y_02.a();
    }
}

