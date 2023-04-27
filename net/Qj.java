/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.IRCThread;

public class Qj {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static long a(IRCThread iRCThread) {
        return iRCThread.c();
    }

    static {
        if (Qj.b() == null) {
            Qj.b(new ListInvoker[5]);
        }
    }
}

