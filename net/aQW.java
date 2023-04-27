/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.function.Supplier;

public class aQW {
    public static void a(ThreadLocal threadLocal, Object object) {
        threadLocal.set(object);
    }

    public static Object a(ThreadLocal threadLocal) {
        return threadLocal.get();
    }

    public static ThreadLocal a(Supplier supplier) {
        return ThreadLocal.withInitial(supplier);
    }
}

