/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/*
 * Renamed from net.aWd
 */
public class awd_0 {
    public static ScheduledExecutorService a() {
        return Executors.newSingleThreadScheduledExecutor();
    }

    public static Callable a(Runnable runnable) {
        return Executors.callable(runnable);
    }

    public static ExecutorService a(int n, ThreadFactory threadFactory) {
        return Executors.newFixedThreadPool(n, threadFactory);
    }

    public static ExecutorService a(ThreadFactory threadFactory) {
        return Executors.newCachedThreadPool(threadFactory);
    }
}

