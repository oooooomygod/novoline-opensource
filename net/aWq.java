/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.J_;

public class aWq {
    private static ListInvoker[] b;

    public static J_ a(String string) {
        return J_.a(string);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (aWq.b() != null) {
            aWq.b(new ListInvoker[3]);
        }
    }
}

