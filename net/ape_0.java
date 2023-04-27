/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/*
 * Renamed from net.aPe
 */
public class ape_0 {
    public static Object b(ConcurrentHashMap concurrentHashMap, Object object) {
        return concurrentHashMap.get(object);
    }

    public static Object c(ConcurrentHashMap concurrentHashMap, Object object) {
        return concurrentHashMap.remove(object);
    }

    public static void a(ConcurrentHashMap concurrentHashMap) {
        concurrentHashMap.clear();
    }

    public static boolean a(ConcurrentHashMap concurrentHashMap, Object object) {
        return concurrentHashMap.containsKey(object);
    }

    public static Set b(ConcurrentHashMap concurrentHashMap) {
        return concurrentHashMap.entrySet();
    }
}

