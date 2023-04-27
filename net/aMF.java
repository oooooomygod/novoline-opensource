/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Comparator;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class aMF {
    private static int[] b;

    public static Stream b(Stream stream, Predicate predicate) {
        return stream.filter(predicate);
    }

    public static long c(Stream stream) {
        return stream.count();
    }

    static {
        if (aMF.b() != null) {
            aMF.b(new int[5]);
        }
    }

    public static boolean c(Stream stream, Predicate predicate) {
        return stream.anyMatch(predicate);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static Optional b(Stream stream, Comparator comparator) {
        return stream.min(comparator);
    }

    public static void a(Stream stream, Consumer consumer) {
        stream.forEach(consumer);
    }

    public static Object a(Stream stream, Collector collector) {
        return stream.collect(collector);
    }

    public static int[] b() {
        return b;
    }

    public static Stream a(Object[] objectArray) {
        return Stream.of(objectArray);
    }

    public static void a(Stream stream) {
        stream.close();
    }

    public static Stream e(Stream stream) {
        return stream.distinct();
    }

    public static Stream a(Stream stream, Comparator comparator) {
        return stream.sorted(comparator);
    }

    public static Optional b(Stream stream) {
        return stream.findFirst();
    }

    public static Stream a(Stream stream, Function function) {
        return stream.map(function);
    }

    public static Optional d(Stream stream) {
        return stream.findAny();
    }

    public static Optional c(Stream stream, Comparator comparator) {
        return stream.max(comparator);
    }

    public static boolean a(Stream stream, Predicate predicate) {
        return stream.noneMatch(predicate);
    }

    public static IntStream a(Stream stream, ToIntFunction toIntFunction) {
        return stream.mapToInt(toIntFunction);
    }
}

