/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * Renamed from net.d
 */
public class d_0 {
    public static void b(ReentrantReadWriteLock.ReadLock readLock) {
        readLock.unlock();
    }

    public static void a(ReentrantReadWriteLock.ReadLock readLock) {
        readLock.lock();
    }
}

