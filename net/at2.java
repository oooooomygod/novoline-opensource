/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

public class at2 {
    public static void a(MethodHandle methodHandle, Object object) {
        methodHandle.invokeExact(object);
    }

    public static MethodHandle a(MethodHandle methodHandle, MethodType methodType) {
        return methodHandle.asType(methodType);
    }

    public static MethodType a(MethodHandle methodHandle) {
        return methodHandle.type();
    }
}

