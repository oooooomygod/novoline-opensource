/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.function.Consumer;
import net.skidunion.g_0;
import net.skidunion.j_0;

public class a4Y {
    private static ListInvoker[] b;

    static {
        if (a4Y.b() != null) {
            a4Y.b(new ListInvoker[1]);
        }
    }

    public static void a(g_0 g_02) {
        j_0.a(g_02);
    }

    public static void a(g_0 g_02, Consumer consumer) {
        j_0.a(g_02, consumer);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }
}

