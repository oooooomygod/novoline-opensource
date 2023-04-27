/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.OptionalInt;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class aj_ {
    public static IntStream a(IntStream intStream, IntPredicate intPredicate) {
        return intStream.filter(intPredicate);
    }

    public static OptionalInt b(IntStream intStream) {
        return intStream.max();
    }

    public static long a(IntStream intStream) {
        return intStream.count();
    }

    public static Stream a(IntStream intStream, IntFunction intFunction) {
        return intStream.mapToObj(intFunction);
    }
}

