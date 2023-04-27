/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.Array;

public class JI {
    public static Object a(Class clazz, int[] nArray) {
        return Array.newInstance(clazz, nArray);
    }

    public static Object a(Class clazz, int n) {
        return Array.newInstance(clazz, n);
    }
}

