/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Set;
import java.util.TreeMap;

/*
 * Renamed from net.atj
 */
public class atj_0 {
    public static Set a(TreeMap treeMap) {
        return treeMap.keySet();
    }

    public static Object a(TreeMap treeMap, Object object, Object object2) {
        return treeMap.put(object, object2);
    }

    public static boolean c(TreeMap treeMap, Object object) {
        return treeMap.containsKey(object);
    }

    public static void b(TreeMap treeMap) {
        treeMap.clear();
    }

    public static Object b(TreeMap treeMap, Object object) {
        return treeMap.get(object);
    }

    public static Set c(TreeMap treeMap) {
        return treeMap.entrySet();
    }

    public static Object a(TreeMap treeMap, Object object) {
        return treeMap.floorKey(object);
    }
}

