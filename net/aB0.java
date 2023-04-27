/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class aB0 {
    private static String[] b;

    public static Collector d() {
        return Collectors.counting();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static Collector a() {
        return Collectors.toList();
    }

    public static Collector c() {
        return Collectors.joining();
    }

    public static Collector a(Supplier supplier) {
        return Collectors.toCollection(supplier);
    }

    public static Collector a(Function function, Collector collector) {
        return Collectors.groupingBy(function, collector);
    }

    static {
        if (aB0.b() != null) {
            aB0.b(new String[3]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static Collector a(Function function, Function function2) {
        return Collectors.toMap(function, function2);
    }
}

