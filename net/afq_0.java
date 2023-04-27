/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.UUID;
import net.ResourceLocation;
import net.anv_1;

/*
 * Renamed from net.aFq
 */
public class afq_0 {
    public static ResourceLocation a = new ResourceLocation(anv_1.b);
    public static ResourceLocation b = new ResourceLocation(anv_1.d);

    public static ResourceLocation a() {
        return a;
    }

    public static String b(UUID uUID) {
        return afq_0.c(uUID) ? anv_1.a : anv_1.c;
    }

    private static boolean c(UUID uUID) {
        return (uUID.hashCode() & 1) == 1;
    }

    public static ResourceLocation a(UUID uUID) {
        return afq_0.c(uUID) ? b : a;
    }
}

