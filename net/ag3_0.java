/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.jc_0;

/*
 * Renamed from net.ag3
 */
public class ag3_0
extends Enum<ag3_0> {
    private static String[] b;
    private static ag3_0[] c;
    public static /* enum */ ag3_0 UPDATE;
    public static /* enum */ ag3_0 TICK;
    public static /* enum */ ag3_0 RENDER;

    public static ag3_0[] values() {
        return (ag3_0[])c.clone();
    }

    public static ag3_0 valueOf(String string) {
        return (ag3_0)jc_0.a(ag3_0.class, string);
    }

    static {
        TICK = new ag3_0();
        ag3_0.b(null);
        RENDER = new ag3_0();
        UPDATE = new ag3_0();
        c = new ag3_0[]{TICK, RENDER, UPDATE};
    }

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

