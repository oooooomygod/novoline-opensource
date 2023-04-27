/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.ArrayDeque;

public class a8O {
    public static boolean f(ArrayDeque arrayDeque) {
        return arrayDeque.isEmpty();
    }

    public static boolean b(ArrayDeque arrayDeque, Object object) {
        return arrayDeque.add(object);
    }

    public static Object e(ArrayDeque arrayDeque) {
        return arrayDeque.poll();
    }

    public static Object c(ArrayDeque arrayDeque) {
        return arrayDeque.getLast();
    }

    public static Object d(ArrayDeque arrayDeque) {
        return arrayDeque.removeLast();
    }

    public static Object b(ArrayDeque arrayDeque) {
        return arrayDeque.pollLast();
    }

    public static int a(ArrayDeque arrayDeque) {
        return arrayDeque.size();
    }

    public static void a(ArrayDeque arrayDeque, Object object) {
        arrayDeque.addLast(object);
    }
}

