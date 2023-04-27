/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IntProperty;
import net.AbstractNumberProperty;

/*
 * Renamed from net.adt
 */
public class adt_2 {
    private static int[] b;

    public static Number c(IntProperty intProperty) {
        return intProperty.a();
    }

    public static Object a(IntProperty intProperty) {
        return intProperty.get();
    }

    static {
        if (adt_2.b() == null) {
            adt_2.b(new int[5]);
        }
    }

    public static IntProperty a(Integer n) {
        return IntProperty.b(n);
    }

    public static AbstractNumberProperty a(IntProperty intProperty, Number number) {
        return intProperty.h(number);
    }

    public static int[] b() {
        return b;
    }

    public static Number b(IntProperty intProperty) {
        return intProperty.e();
    }

    public static IntProperty a() {
        return IntProperty.a();
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static AbstractNumberProperty c(IntProperty intProperty, Number number) {
        return intProperty.c(number);
    }

    public static void b(IntProperty intProperty, Number number) {
        intProperty.e(number);
    }
}

