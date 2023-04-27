/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;

public class N1 {
    public static MethodHandle a(MethodHandles.Lookup lookup, Field field) {
        return lookup.unreflectSetter(field);
    }
}

