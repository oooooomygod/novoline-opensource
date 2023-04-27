/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 */
package net;

import com.google.common.collect.BiMap;

/*
 * Renamed from net.aHi
 */
public class ahi_0 {
    public static int b(BiMap biMap) {
        return biMap.size();
    }

    public static boolean a(BiMap biMap, Object object) {
        return biMap.containsValue(object);
    }

    public static Object a(BiMap biMap, Object object, Object object2) {
        return biMap.put(object, object2);
    }

    public static Object b(BiMap biMap, Object object) {
        return biMap.get(object);
    }

    public static BiMap a(BiMap biMap) {
        return biMap.inverse();
    }
}

