/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.ThreadFactory;

public class aED {
    public static Thread a(ThreadFactory threadFactory, Runnable runnable) {
        return threadFactory.newThread(runnable);
    }
}

