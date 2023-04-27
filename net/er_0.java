/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.EventLoop
 *  io.netty.util.concurrent.Future
 *  io.netty.util.concurrent.ScheduledFuture
 */
package net;

import io.netty.channel.EventLoop;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.ScheduledFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from net.eR
 */
public class er_0 {
    public static boolean a(EventLoop eventLoop) {
        return eventLoop.inEventLoop();
    }

    public static ScheduledFuture a(EventLoop eventLoop, Runnable runnable, long l4, long l5, TimeUnit timeUnit) {
        return eventLoop.scheduleAtFixedRate(runnable, l4, l5, timeUnit);
    }

    public static ScheduledFuture a(EventLoop eventLoop, Callable callable, long l4, TimeUnit timeUnit) {
        return eventLoop.schedule(callable, l4, timeUnit);
    }

    public static Future a(EventLoop eventLoop, Runnable runnable) {
        return eventLoop.submit(runnable);
    }

    public static Future a(EventLoop eventLoop, Callable callable) {
        return eventLoop.submit(callable);
    }

    public static void b(EventLoop eventLoop, Runnable runnable) {
        eventLoop.execute(runnable);
    }
}

