/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.EventLoop
 *  io.netty.channel.local.LocalEventLoopGroup
 */
package net;

import io.netty.channel.EventLoop;
import io.netty.channel.local.LocalEventLoopGroup;

public class aKL {
    private static int[] b;

    public static int[] b() {
        return b;
    }

    static {
        if (aKL.b() != null) {
            aKL.b(new int[5]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static EventLoop a(LocalEventLoopGroup localEventLoopGroup) {
        return localEventLoopGroup.next();
    }
}

