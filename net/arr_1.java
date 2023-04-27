/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.configurations.property.Property;

/*
 * Renamed from net.arR
 */
public class arr_1 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    static {
        if (arr_1.b() != null) {
            arr_1.b(new String[5]);
        }
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static Object a(Property property) {
        return property.get();
    }

    public static void a(Property property, Object object) {
        property.a(object);
    }
}

