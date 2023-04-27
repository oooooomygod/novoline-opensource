/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/*
 * Renamed from net.p8
 */
public class p8_0 {
    public static Future a(ThreadPoolExecutor threadPoolExecutor, Runnable runnable) {
        return threadPoolExecutor.submit(runnable);
    }
}

