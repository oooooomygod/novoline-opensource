/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.Modifier;

public class AJ {
    public static boolean b(int n) {
        return Modifier.isAbstract(n);
    }

    public static String a(int n) {
        return Modifier.toString(n);
    }

    public static boolean d(int n) {
        return Modifier.isFinal(n);
    }

    public static boolean c(int n) {
        return Modifier.isStatic(n);
    }
}

