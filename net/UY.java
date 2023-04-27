/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Objects;

public class UY {
    private static ListInvoker[] b;

    public static Object b(Object object) {
        return Objects.requireNonNull(object);
    }

    public static ListInvoker[] b() {
        return b;
    }

    static {
        if (UY.b() != null) {
            UY.b(new ListInvoker[1]);
        }
    }

    public static int a(Object object) {
        return Objects.hashCode(object);
    }

    public static Object a(Object object, String string) {
        return Objects.requireNonNull(object, string);
    }

    public static int a(Object[] objectArray) {
        return Objects.hash(objectArray);
    }

    public static boolean c(Object object) {
        return Objects.isNull(object);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static boolean a(Object object, Object object2) {
        return Objects.equals(object, object2);
    }
}

