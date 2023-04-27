/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.locks.ReentrantLock;

/*
 * Renamed from net.akg
 */
public class akg_2 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void b(ReentrantLock reentrantLock) {
        reentrantLock.unlock();
    }

    public static String[] b() {
        return b;
    }

    public static void a(ReentrantLock reentrantLock) {
        reentrantLock.lock();
    }

    static {
        if (akg_2.b() == null) {
            akg_2.b(new String[4]);
        }
    }
}

