/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net;

import com.google.common.util.concurrent.ListenableFuture;
import net.IThreadListener;

public class X7 {
    public static ListenableFuture a(IThreadListener iThreadListener, Runnable runnable) {
        return iThreadListener.addScheduledTask(runnable);
    }

    public static boolean a(IThreadListener iThreadListener) {
        return iThreadListener.b();
    }
}

