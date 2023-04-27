/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Set;
import java.util.concurrent.ConcurrentMap;

/*
 * Renamed from net.a7d
 */
public class a7d_0 {
    public static Set a(ConcurrentMap concurrentMap) {
        return concurrentMap.entrySet();
    }

    public static Object b(ConcurrentMap concurrentMap, Object object, Object object2) {
        return concurrentMap.put(object, object2);
    }

    public static Object b(ConcurrentMap concurrentMap, Object object) {
        return concurrentMap.remove(object);
    }

    public static Object a(ConcurrentMap concurrentMap, Object object, Object object2) {
        return concurrentMap.putIfAbsent(object, object2);
    }

    public static Object a(ConcurrentMap concurrentMap, Object object) {
        return concurrentMap.get(object);
    }
}

