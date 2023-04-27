/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.GenericFutureListener
 */
package net;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

/*
 * Renamed from net.ae2
 */
public class ae2_0 {
    public static Throwable b(Future future) {
        return future.cause();
    }

    public static boolean a(Future future) {
        return future.isCancelled();
    }

    public static Future a(Future future, GenericFutureListener genericFutureListener) {
        return future.addListener(genericFutureListener);
    }
}

