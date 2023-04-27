/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * Renamed from net.aQk
 */
public class aqk_0 {
    public static void b(ReentrantReadWriteLock.WriteLock writeLock) {
        writeLock.lock();
    }

    public static void a(ReentrantReadWriteLock.WriteLock writeLock) {
        writeLock.unlock();
    }
}

