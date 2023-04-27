/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.jvm.functions.Function1
 */
package net;

import kotlin.jvm.functions.Function1;

public class aIA {
    private static boolean b;

    public static Object a(Function1 function1, Object object) {
        return function1.invoke(object);
    }

    public static boolean c() {
        aIA.b();
        return true;
    }

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (aIA.c()) {
            aIA.b(true);
        }
    }
}

