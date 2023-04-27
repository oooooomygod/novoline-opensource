/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.jc_0;

public class aS1
extends Enum<aS1> {
    public static /* enum */ aS1 LIST;
    public static /* enum */ aS1 MAP;
    private static /* synthetic */ aS1[] c;
    private static int[] b;
    public static /* enum */ aS1 NULL;
    public static /* enum */ aS1 SCALAR;

    public static int[] b() {
        return b;
    }

    public static aS1 valueOf(String string) {
        return (aS1)jc_0.a(aS1.class, string);
    }

    public boolean a() {
        aS1.b();
        return this == MAP || this == LIST;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        SCALAR = new aS1();
        MAP = new aS1();
        aS1.b(null);
        LIST = new aS1();
        NULL = new aS1();
        c = new aS1[]{SCALAR, MAP, LIST, NULL};
    }

    public static aS1[] values() {
        return (aS1[])c.clone();
    }
}

