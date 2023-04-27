/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/*
 * Renamed from net.aSg
 */
public class asg_0 {
    private static String b;

    public static void a(List list, Comparator comparator) {
        Collections.sort(list, comparator);
    }

    public static void d(List list) {
        Collections.sort(list);
    }

    public static Map c() {
        return Collections.emptyMap();
    }

    public static List b(Object object) {
        return Collections.singletonList(object);
    }

    public static void a(List list) {
        Collections.shuffle(list);
    }

    public static boolean a(Collection collection, Object[] objectArray) {
        return Collections.addAll(collection, objectArray);
    }

    public static void b(String string) {
        b = string;
    }

    public static Enumeration b(Collection collection) {
        return Collections.enumeration(collection);
    }

    public static Map a(Map map) {
        return Collections.unmodifiableMap(map);
    }

    public static Iterator a() {
        return Collections.emptyIterator();
    }

    public static List b(List list) {
        return Collections.unmodifiableList(list);
    }

    public static Set b(Map map) {
        return Collections.newSetFromMap(map);
    }

    public static void e(List list) {
        Collections.reverse(list);
    }

    public static String b() {
        return b;
    }

    public static Set a(Set set) {
        return Collections.unmodifiableSet(set);
    }

    public static List c(List list) {
        return Collections.synchronizedList(list);
    }

    public static Set a(Object object) {
        return Collections.singleton(object);
    }

    public static Set d() {
        return Collections.emptySet();
    }

    public static void a(List list, Random random) {
        Collections.shuffle(list, random);
    }

    static {
        if (asg_0.b() != null) {
            asg_0.b("spThD");
        }
    }

    public static Collection a(Collection collection) {
        return Collections.unmodifiableCollection(collection);
    }

    public static List e() {
        return Collections.emptyList();
    }
}

