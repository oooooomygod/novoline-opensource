/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.configurations.annotation.Property;
import java.lang.reflect.Field;

/*
 * Renamed from net.Eq
 */
public class eq_0 {
    private static boolean b;

    static {
        if (eq_0.c()) {
            eq_0.b(true);
        }
    }

    public static boolean c() {
        eq_0.b();
        return true;
    }

    public static vu_1 a(a9p_0 a9p_02, Object object) {
        return a9p_02.b(object);
    }

    public static vu_1 b(a9p_0 a9p_02) {
        return a9p_02.e();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static String a(Field field, Property property) {
        return a9p_0.a(field, property);
    }

    public static boolean b() {
        return b;
    }

    public static Class a(a9p_0 a9p_02) {
        return a9p_02.d();
    }
}

