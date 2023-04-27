/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.ForkJoinPool;

public class aFW {
    public static ForkJoinPool a() {
        return ForkJoinPool.commonPool();
    }

    public static void a(ForkJoinPool forkJoinPool, Runnable runnable) {
        forkJoinPool.execute(runnable);
    }
}

