/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/*
 * Renamed from net.vd
 */
public class vd_2 {
    public static ScheduledFuture a(ScheduledExecutorService scheduledExecutorService, Runnable runnable, long l4, TimeUnit timeUnit) {
        return scheduledExecutorService.schedule(runnable, l4, timeUnit);
    }
}

