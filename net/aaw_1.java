/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.SettableFuture
 */
package net;

import com.google.common.util.concurrent.SettableFuture;

/*
 * Renamed from net.aaW
 */
public class aaw_1 {
    public static SettableFuture a() {
        return SettableFuture.create();
    }

    public static boolean a(SettableFuture settableFuture, Object object) {
        return settableFuture.set(object);
    }

    public static boolean a(SettableFuture settableFuture, Throwable throwable) {
        return settableFuture.setException(throwable);
    }
}

