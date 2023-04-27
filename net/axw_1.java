/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;

/*
 * Renamed from net.axW
 */
public class axw_1 {
    private static String[] b;

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    static {
        if (axw_1.b() != null) {
            axw_1.b(new String[1]);
        }
    }

    public static String a(ResourceLocation resourceLocation) {
        return resourceLocation.b();
    }

    public static String b(ResourceLocation resourceLocation) {
        return resourceLocation.a();
    }
}

