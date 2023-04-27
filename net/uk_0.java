/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.FontRenderer;
import net.SI;

/*
 * Renamed from net.Uk
 */
public class uk_0 {
    private static ListInvoker[] b;

    public static void a(SI sI) {
        sI.h();
    }

    public static void a(SI sI, FontRenderer fontRenderer, String string, int n, int n2, int n3) {
        sI.b(fontRenderer, string, n, n2, n3);
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (uk_0.b() == null) {
            uk_0.b(new ListInvoker[1]);
        }
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }
}

