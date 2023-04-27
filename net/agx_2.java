/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.function.Function;

/*
 * Renamed from net.agx
 */
public class agx_2 {
    public static Object a(Function function, Object object) {
        return function.apply(object);
    }

    public static Function a() {
        return Function.identity();
    }
}

