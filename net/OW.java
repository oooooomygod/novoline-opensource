/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class OW {
    public static Lock b(ReadWriteLock readWriteLock) {
        return readWriteLock.readLock();
    }

    public static Lock a(ReadWriteLock readWriteLock) {
        return readWriteLock.writeLock();
    }
}

