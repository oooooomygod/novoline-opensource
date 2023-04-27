/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/*
 * Renamed from net.asN
 */
public class asn_1 {
    public static Future a(ExecutorService executorService, Runnable runnable) {
        return executorService.submit(runnable);
    }
}

