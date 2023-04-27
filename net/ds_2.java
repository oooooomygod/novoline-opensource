/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.HashMap;
import java.util.Set;

/*
 * Renamed from net.ds
 */
public class ds_2 {
    public static Object a(HashMap hashMap, Object object, Object object2) {
        return hashMap.put(object, object2);
    }

    public static Set a(HashMap hashMap) {
        return hashMap.entrySet();
    }

    public static boolean b(HashMap hashMap, Object object) {
        return hashMap.containsKey(object);
    }

    public static Object c(HashMap hashMap, Object object) {
        return hashMap.remove(object);
    }

    public static Object a(HashMap hashMap, Object object) {
        return hashMap.get(object);
    }
}

