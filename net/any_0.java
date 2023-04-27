/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.concurrent.atomic.AtomicReference;

/*
 * Renamed from net.aNy
 */
public class any_0 {
    public static void a(AtomicReference atomicReference, Object object) {
        atomicReference.set(object);
    }

    public static Object b(AtomicReference atomicReference, Object object) {
        return atomicReference.getAndSet(object);
    }

    public static Object a(AtomicReference atomicReference) {
        return atomicReference.get();
    }

    public static boolean a(AtomicReference atomicReference, Object object, Object object2) {
        return atomicReference.compareAndSet(object, object2);
    }
}

