/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.configurations.annotation.Property;

/*
 * Renamed from net.aMt
 */
public class amt_0 {
    private static String[] b;

    static {
        if (amt_0.b() != null) {
            amt_0.b(new String[2]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static String a(Property property) {
        return property.value();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

