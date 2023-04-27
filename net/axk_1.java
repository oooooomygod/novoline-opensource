/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFutureTask
 */
package net;

import com.google.common.util.concurrent.ListenableFutureTask;
import java.util.concurrent.Callable;

/*
 * Renamed from net.axK
 */
public class axk_1 {
    public static ListenableFutureTask a(Callable callable) {
        return ListenableFutureTask.create((Callable)callable);
    }

    public static void a(ListenableFutureTask listenableFutureTask) {
        listenableFutureTask.run();
    }

    public static ListenableFutureTask a(Runnable runnable, Object object) {
        return ListenableFutureTask.create((Runnable)runnable, (Object)object);
    }
}

