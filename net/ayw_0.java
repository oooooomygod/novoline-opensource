/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.properties.PropertyMap
 */
package net;

import com.google.common.collect.Multimap;
import com.mojang.authlib.properties.PropertyMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/*
 * Renamed from net.aYw
 */
public class ayw_0 {
    private static boolean b;

    public static boolean a(PropertyMap propertyMap, Multimap multimap) {
        return propertyMap.putAll(multimap);
    }

    public static Set a(PropertyMap propertyMap) {
        return propertyMap.keySet();
    }

    public static Map d(PropertyMap propertyMap) {
        return propertyMap.asMap();
    }

    public static Collection b(PropertyMap propertyMap, Object object) {
        return propertyMap.get(object);
    }

    public static void c(PropertyMap propertyMap) {
        propertyMap.clear();
    }

    public static int e(PropertyMap propertyMap) {
        return propertyMap.size();
    }

    static {
        if (!ayw_0.a()) {
            ayw_0.b(true);
        }
    }

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean a(PropertyMap propertyMap, Object object) {
        return propertyMap.containsKey(object);
    }

    public static boolean a() {
        ayw_0.b();
        return true;
    }

    public static boolean b(PropertyMap propertyMap) {
        return propertyMap.isEmpty();
    }

    public static boolean a(PropertyMap propertyMap, Object object, Object object2) {
        return propertyMap.put(object, object2);
    }
}

