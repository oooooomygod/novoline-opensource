/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import net.minecraft.client.entity.AbstractClientPlayer;

public class OY {
    private static int[] b;

    public static int[] b() {
        return b;
    }

    public static void a(kp_2 kp_22, AbstractClientPlayer abstractClientPlayer, double d, double d2, double d3, float f, float f2) {
        OY.b();
        kp_22.a(abstractClientPlayer, d, d2, d3, f, f2);
        ListInvoker.b(new ListInvoker[4]);
    }

    static {
        if (OY.b() != null) {
            OY.b(new int[5]);
        }
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static void a(kp_2 kp_22, ResourceLocation resourceLocation) {
        kp_22.a(resourceLocation);
    }

    public static rv_0 a(kp_2 kp_22) {
        return kp_22.a();
    }
}

