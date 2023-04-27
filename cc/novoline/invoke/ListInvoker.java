/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ListInvoker {
    private static ListInvoker[] b;

    public static Stream stream(List list) {
        return list.stream();
    }

    public static boolean removeAll(List list, Collection collection) {
        return list.removeAll(collection);
    }

    public static Object[] toArray(List list, Object[] objectArray) {
        return list.toArray(objectArray);
    }

    public static int indexOf(List list, Object object) {
        return list.indexOf(object);
    }

    public static Object get(List list, int n) {
        return list.get(n);
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static int lastIndexOf(List list, Object object) {
        return list.lastIndexOf(object);
    }

    public static Object[] toArray(List list) {
        return list.toArray();
    }

    public static void sort(List list, Comparator comparator) {
        list.sort(comparator);
    }

    public static boolean isEmpty(List list) {
        return list.isEmpty();
    }

    public static boolean addAll(List list, Collection collection) {
        return list.addAll(collection);
    }

    public static boolean remove(List list, Object object) {
        return list.remove(object);
    }

    public static void clear(List list) {
        list.clear();
    }

    public static boolean add(List list, Object object) {
        return list.add(object);
    }

    public static boolean contains(List list, Object object) {
        return list.contains(object);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static Iterator iterator(List list) {
        return list.iterator();
    }

    public static Object remove(List list, int n) {
        return list.remove(n);
    }

    public static Object set(List list, int n, Object object) {
        return list.set(n, object);
    }

    public static int size(List list) {
        return list.size();
    }

    public static boolean removeIf(List list, Predicate predicate) {
        return list.removeIf(predicate);
    }

    public static List subList(List list, int n, int n2) {
        return list.subList(n, n2);
    }

    public static void add(List list, int n, Object object) {
        list.add(n, object);
    }

    public static void forEach(List list, Consumer consumer) {
        list.forEach(consumer);
    }

    static {
        if (ListInvoker.b() != null) {
            ListInvoker.b(new ListInvoker[3]);
        }
    }
}

