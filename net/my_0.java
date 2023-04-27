/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package net;

import cc.novoline.invoke.ListInvoker;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Renamed from net.My
 */
public class my_0 {
    private static ListInvoker[] b;

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static CopyOnWriteArrayList a() {
        return Lists.newCopyOnWriteArrayList();
    }

    public static ArrayList a(Iterator iterator) {
        return Lists.newArrayList((Iterator)iterator);
    }

    public static ListInvoker[] d() {
        return b;
    }

    public static ArrayList a(int n) {
        return Lists.newArrayListWithExpectedSize((int)n);
    }

    public static LinkedList b() {
        return Lists.newLinkedList();
    }

    public static List a(List list) {
        return Lists.reverse((List)list);
    }

    public static ArrayList c() {
        return Lists.newArrayList();
    }

    public static ArrayList a(Iterable iterable) {
        return Lists.newArrayList((Iterable)iterable);
    }

    public static ArrayList b(int n) {
        return Lists.newArrayListWithCapacity((int)n);
    }

    public static ArrayList a(Object[] objectArray) {
        return Lists.newArrayList((Object[])objectArray);
    }

    static {
        if (my_0.d() != null) {
            my_0.b(new ListInvoker[1]);
        }
    }
}

