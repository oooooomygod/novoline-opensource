/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.epoll.Epoll
 */
package net;

import cc.novoline.invoke.ListInvoker;
import io.netty.channel.epoll.Epoll;

public class X0 {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static boolean c() {
        return Epoll.isAvailable();
    }

    static {
        if (X0.b() != null) {
            X0.b(new ListInvoker[2]);
        }
    }
}

