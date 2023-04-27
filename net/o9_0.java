/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.atomic.AtomicBoolean;

/*
 * Renamed from net.o9
 */
public class o9_0 {
    public static void a(AtomicBoolean atomicBoolean, boolean bl) {
        atomicBoolean.set(bl);
    }

    public static boolean a(AtomicBoolean atomicBoolean) {
        return atomicBoolean.get();
    }
}

