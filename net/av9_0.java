/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from net.av9
 */
public class av9_0 {
    public static boolean a(CountDownLatch countDownLatch, long l4, TimeUnit timeUnit) {
        return countDownLatch.await(l4, timeUnit);
    }

    public static void a(CountDownLatch countDownLatch) {
        countDownLatch.await();
    }

    public static void b(CountDownLatch countDownLatch) {
        countDownLatch.countDown();
    }
}

