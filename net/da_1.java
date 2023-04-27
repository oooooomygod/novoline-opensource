/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 */
package net;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/*
 * Renamed from net.dA
 */
public class da_1 {
    public static Object b(ImmutableMap immutableMap, Object object) {
        return immutableMap.get(object);
    }

    public static ImmutableSet c(ImmutableMap immutableMap) {
        return immutableMap.keySet();
    }

    public static boolean a(ImmutableMap immutableMap) {
        return immutableMap.isEmpty();
    }

    public static ImmutableMap a() {
        return ImmutableMap.of();
    }

    public static ImmutableSet b(ImmutableMap immutableMap) {
        return immutableMap.entrySet();
    }

    public static boolean a(ImmutableMap immutableMap, Object object) {
        return immutableMap.containsKey(object);
    }

    public static ImmutableMap a(Map map) {
        return ImmutableMap.copyOf((Map)map);
    }
}

