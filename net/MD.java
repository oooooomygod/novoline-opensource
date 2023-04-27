/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.AbstractNumberProperty;
import net.DoubleProperty;

public class MD {
    private static int[] b;

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static Number c(DoubleProperty doubleProperty) {
        return doubleProperty.a();
    }

    public static Object b(DoubleProperty doubleProperty) {
        return doubleProperty.get();
    }

    public static int[] b() {
        return b;
    }

    public static void b(DoubleProperty doubleProperty, Number number) {
        doubleProperty.e(number);
    }

    public static AbstractNumberProperty c(DoubleProperty doubleProperty, Number number) {
        return doubleProperty.h(number);
    }

    public static Number a(DoubleProperty doubleProperty) {
        return doubleProperty.e();
    }

    public static DoubleProperty a() {
        return DoubleProperty.b();
    }

    public static DoubleProperty a(Double d) {
        return DoubleProperty.d(d);
    }

    static {
        if (MD.b() != null) {
            MD.b(new int[1]);
        }
    }

    public static AbstractNumberProperty a(DoubleProperty doubleProperty, Number number) {
        return doubleProperty.c(number);
    }
}

