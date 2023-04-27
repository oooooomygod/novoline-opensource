/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.lang.reflect.Constructor;

/*
 * Renamed from net.ap6
 */
public class ap6_0 {
    public static Class[] a(Constructor constructor) {
        return constructor.getParameterTypes();
    }

    public static void a(Constructor constructor, boolean bl) {
        constructor.setAccessible(bl);
    }

    public static Object a(Constructor constructor, Object[] objectArray) {
        return constructor.newInstance(objectArray);
    }
}

