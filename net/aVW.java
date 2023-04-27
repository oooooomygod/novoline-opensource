/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 *  com.google.common.util.concurrent.ListeningExecutorService
 */
package net;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;

public class aVW {
    public static ListenableFuture a(ListeningExecutorService listeningExecutorService, Runnable runnable) {
        return listeningExecutorService.submit(runnable);
    }
}

