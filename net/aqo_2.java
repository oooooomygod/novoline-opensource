/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.CheckedFuture
 *  com.google.common.util.concurrent.FutureCallback
 *  com.google.common.util.concurrent.Futures
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net;

import com.google.common.util.concurrent.CheckedFuture;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/*
 * Renamed from net.aqo
 */
public class aqo_2 {
    public static ListenableFuture a(Iterable iterable) {
        return Futures.allAsList((Iterable)iterable);
    }

    public static ListenableFuture a(Object object) {
        return Futures.immediateFuture((Object)object);
    }

    public static CheckedFuture a(Exception exception) {
        return Futures.immediateFailedCheckedFuture((Exception)exception);
    }

    public static Object a(Future future) {
        return Futures.getUnchecked((Future)future);
    }

    public static void a(ListenableFuture listenableFuture, FutureCallback futureCallback) {
        Futures.addCallback((ListenableFuture)listenableFuture, (FutureCallback)futureCallback);
    }
}

