/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.ws_1;

/*
 * Renamed from net.ayE
 */
public class aye_1 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static ws_1 a(ws_1 ws_12) {
        return ws_12.a();
    }

    static {
        if (aye_1.b() != null) {
            aye_1.b(new ListInvoker[4]);
        }
    }
}

