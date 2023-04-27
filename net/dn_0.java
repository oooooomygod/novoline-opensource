/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.util.concurrent.ListenableFuture
 */
package net;

import com.google.common.util.concurrent.ListenableFuture;

/*
 * Renamed from net.Dn
 */
public class dn_0 {
    public static boolean a(ListenableFuture listenableFuture, boolean bl) {
        return listenableFuture.cancel(bl);
    }
}

