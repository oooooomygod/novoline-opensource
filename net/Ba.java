/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.BooleanProperty;

public class Ba {
    private static String b;

    public static void a(BooleanProperty booleanProperty, Object object) {
        booleanProperty.a(object);
    }

    public static BooleanProperty a(Boolean bl) {
        return BooleanProperty.a(bl);
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static Object b(BooleanProperty booleanProperty) {
        return booleanProperty.get();
    }

    public static BooleanProperty d() {
        return BooleanProperty.b();
    }

    public static void a(BooleanProperty booleanProperty) {
        booleanProperty.f();
    }

    public static BooleanProperty c() {
        return BooleanProperty.a();
    }

    static {
        if (Ba.b() != null) {
            Ba.b("Ok8bp");
        }
    }
}

