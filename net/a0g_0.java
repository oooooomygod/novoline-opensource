/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * Renamed from net.a0g
 */
public class a0g_0 {
    public static ReentrantReadWriteLock.ReadLock b(ReentrantReadWriteLock reentrantReadWriteLock) {
        return reentrantReadWriteLock.readLock();
    }

    public static ReentrantReadWriteLock.WriteLock a(ReentrantReadWriteLock reentrantReadWriteLock) {
        return reentrantReadWriteLock.writeLock();
    }
}

