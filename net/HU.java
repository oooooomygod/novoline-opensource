/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class HU {
    public static boolean b(CopyOnWriteArrayList copyOnWriteArrayList, Object object) {
        return copyOnWriteArrayList.remove(object);
    }

    public static Object a(CopyOnWriteArrayList copyOnWriteArrayList, int n) {
        return copyOnWriteArrayList.get(n);
    }

    public static boolean a(CopyOnWriteArrayList copyOnWriteArrayList, Object object) {
        return copyOnWriteArrayList.add(object);
    }

    public static Iterator a(CopyOnWriteArrayList copyOnWriteArrayList) {
        return copyOnWriteArrayList.iterator();
    }
}

