/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package cc.novoline.invoke;

import cc.novoline.invoke.ListInvoker;
import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

public class MapsInvoker {
    private static ListInvoker[] b;

    public static HashMap a() {
        return Maps.newHashMap();
    }

    public static LinkedHashMap c() {
        return Maps.newLinkedHashMap();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static HashMap a(Map map) {
        return Maps.newHashMap((Map)map);
    }

    public static ConcurrentMap e() {
        return Maps.newConcurrentMap();
    }

    public static EnumMap a(Class clazz) {
        return Maps.newEnumMap((Class)clazz);
    }

    public static IdentityHashMap b() {
        return Maps.newIdentityHashMap();
    }

    static {
        if (MapsInvoker.d() != null) {
            MapsInvoker.b(new ListInvoker[2]);
        }
    }

    public static ListInvoker[] d() {
        return b;
    }

    public static LinkedHashMap b(Map map) {
        return Maps.newLinkedHashMap((Map)map);
    }
}

