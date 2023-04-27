/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IAttribute;
import java.util.Collection;
import java.util.UUID;
import net.AttributeModifier;
import net.ahw_2;

public class Ma {
    private static boolean b;

    public static Collection a(ahw_2 ahw_22) {
        return ahw_22.b();
    }

    public static void a(ahw_2 ahw_22, double d) {
        ahw_22.a(d);
    }

    public static void a(ahw_2 ahw_22, AttributeModifier attributeModifier) {
        ahw_22.c(attributeModifier);
    }

    public static boolean b() {
        return b;
    }

    public static boolean a() {
        Ma.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static void e(ahw_2 ahw_22) {
        ahw_22.a();
    }

    public static double d(ahw_2 ahw_22) {
        return ahw_22.d();
    }

    public static double b(ahw_2 ahw_22) {
        return ahw_22.c();
    }

    public static void b(ahw_2 ahw_22, AttributeModifier attributeModifier) {
        ahw_22.a(attributeModifier);
    }

    public static boolean c(ahw_2 ahw_22, AttributeModifier attributeModifier) {
        return ahw_22.b(attributeModifier);
    }

    static {
        if (Ma.b()) {
            Ma.b(true);
        }
    }

    public static AttributeModifier a(ahw_2 ahw_22, UUID uUID) {
        return ahw_22.a(uUID);
    }

    public static IAttribute c(ahw_2 ahw_22) {
        return ahw_22.e();
    }
}

