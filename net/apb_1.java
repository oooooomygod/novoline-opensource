/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.invoke.MethodType;

/*
 * Renamed from net.apB
 */
public class apb_1 {
    private static int b;

    public static int a() {
        apb_1.b();
        return 91;
    }

    public static void b(int n) {
        b = n;
    }

    public static MethodType a(MethodType methodType, Class clazz) {
        return methodType.changeReturnType(clazz);
    }

    public static MethodType a(MethodType methodType) {
        return methodType.generic();
    }

    public static int b() {
        return b;
    }

    static {
        if (apb_1.a() == 0) {
            apb_1.b(76);
        }
    }
}

