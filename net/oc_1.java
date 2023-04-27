/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/*
 * Renamed from net.oC
 */
public class oc_1 {
    private static int[] b;

    public static Optional b(Object object) {
        return Optional.of(object);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (oc_1.b() != null) {
            oc_1.b(new int[3]);
        }
    }

    public static void a(Optional optional, Consumer consumer) {
        optional.ifPresent(consumer);
    }

    public static int[] b() {
        return b;
    }

    public static Optional a(Optional optional, Function function) {
        return optional.map(function);
    }

    public static Optional a(Object object) {
        return Optional.ofNullable(object);
    }

    public static Optional c() {
        return Optional.empty();
    }

    public static Object a(Optional optional, Supplier supplier) {
        return optional.orElseThrow(supplier);
    }

    public static boolean a(Optional optional) {
        return optional.isPresent();
    }

    public static Object a(Optional optional, Object object) {
        return optional.orElse(object);
    }

    public static Object b(Optional optional) {
        return optional.get();
    }
}

