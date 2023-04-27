/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.Attribute
 */
package net;

import io.netty.util.Attribute;

public class a8E {
    private static int b;

    public static int b() {
        return b;
    }

    public static void a(Attribute attribute, Object object) {
        attribute.set(object);
    }

    public static Object a(Attribute attribute) {
        return attribute.get();
    }

    static {
        if (a8E.b() != 0) {
            a8E.b(68);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static int c() {
        a8E.b();
        return 46;
    }
}

