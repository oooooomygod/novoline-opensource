/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class aN_ {
    public static Comparator a(ToIntFunction toIntFunction) {
        return Comparator.comparingInt(toIntFunction);
    }

    public static Comparator a(Comparator comparator) {
        return comparator.reversed();
    }

    public static Comparator a(ToLongFunction toLongFunction) {
        return Comparator.comparingLong(toLongFunction);
    }

    public static Comparator a(Function function) {
        return Comparator.comparing(function);
    }

    public static Comparator a(ToDoubleFunction toDoubleFunction) {
        return Comparator.comparingDouble(toDoubleFunction);
    }
}

