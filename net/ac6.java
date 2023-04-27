/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 *  io.netty.util.concurrent.ScheduledFuture
 */
package net;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.ScheduledFuture;

public class ac6 {
    private static String[] b;

    public static Future a(ScheduledFuture scheduledFuture, GenericFutureListener genericFutureListener) {
        return scheduledFuture.addListener(genericFutureListener);
    }

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (ac6.b() == null) {
            ac6.b(new String[3]);
        }
    }
}

