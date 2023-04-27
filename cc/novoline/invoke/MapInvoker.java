/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

public class MapInvoker {
    private static String b = "AkoYKc";

    public static Object a(Map map, Object object, Object object2) {
        return map.getOrDefault(object, object2);
    }

    public static Set b(Map map) {
        return map.entrySet();
    }

    public static void a(Map map, BiFunction biFunction) {
        map.replaceAll(biFunction);
    }

    public static int a(Map map) {
        return map.size();
    }

    static {
        if (MapInvoker.b() == null) {
            MapInvoker.b("AkoYKc");
        }
    }

    public static void d(Map map) {
        map.clear();
    }

    public static String b() {
        return b;
    }

    public static boolean b(Map map, Object object) {
        return map.containsKey(object);
    }

    public static Object c(Map map, Object object, Object object2) {
        return map.put(object, object2);
    }

    public static boolean e(Map map) {
        return map.isEmpty();
    }

    public static void a(Map map, Map map2) {
        map.putAll(map2);
    }

    public static Object a(Map map, Object object) {
        return map.remove(object);
    }

    public static Object a(Map map, Object object, Function function) {
        return map.computeIfAbsent(object, function);
    }

    public static Set c(Map map) {
        return map.keySet();
    }

    public static Object c(Map map, Object object) {
        return map.get(object);
    }

    public static void b(String string) {
        b = string;
    }

    public static Object b(Map map, Object object, Object object2) {
        return map.putIfAbsent(object, object2);
    }
}

