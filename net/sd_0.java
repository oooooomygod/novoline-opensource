/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Deque;

/*
 * Renamed from net.Sd
 */
public class sd_0 {
    public static Object c(Deque deque) {
        return deque.removeLast();
    }

    public static boolean a(Deque deque) {
        return deque.isEmpty();
    }

    public static void a(Deque deque, Object object) {
        deque.push(object);
    }

    public static Object d(Deque deque) {
        return deque.poll();
    }

    public static Object f(Deque deque) {
        return deque.getLast();
    }

    public static boolean b(Deque deque, Object object) {
        return deque.add(object);
    }

    public static void b(Deque deque) {
        deque.clear();
    }

    public static Object e(Deque deque) {
        return deque.pop();
    }

    public static void c(Deque deque, Object object) {
        deque.addLast(object);
    }
}

