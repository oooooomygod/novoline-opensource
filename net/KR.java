/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap
 */
package net;

import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.util.function.Function;

public class KR {
    public static Object a(Object2ObjectArrayMap object2ObjectArrayMap, Object object, Function function) {
        return object2ObjectArrayMap.computeIfAbsent(object, function);
    }

    public static Object a(Object2ObjectArrayMap object2ObjectArrayMap, Object object, Object object2) {
        return object2ObjectArrayMap.put(object, object2);
    }
}

