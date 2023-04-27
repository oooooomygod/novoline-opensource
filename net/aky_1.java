/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Renamed from net.akY
 */
public class aky_1 {
    public static Object h(LinkedList linkedList) {
        return linkedList.getFirst();
    }

    public static void e(LinkedList linkedList) {
        linkedList.clear();
    }

    public static int d(LinkedList linkedList) {
        return linkedList.size();
    }

    public static Object a(LinkedList linkedList, int n) {
        return linkedList.get(n);
    }

    public static Object[] b(LinkedList linkedList) {
        return linkedList.toArray();
    }

    public static Object g(LinkedList linkedList) {
        return linkedList.removeFirst();
    }

    public static Iterator f(LinkedList linkedList) {
        return linkedList.iterator();
    }

    public static boolean a(LinkedList linkedList, Object object) {
        return linkedList.add(object);
    }

    public static ListIterator a(LinkedList linkedList) {
        return linkedList.listIterator();
    }

    public static void b(LinkedList linkedList, Object object) {
        linkedList.addFirst(object);
    }

    public static boolean c(LinkedList linkedList, Object object) {
        return linkedList.remove(object);
    }

    public static void d(LinkedList linkedList, Object object) {
        linkedList.addLast(object);
    }

    public static boolean c(LinkedList linkedList) {
        return linkedList.isEmpty();
    }
}

