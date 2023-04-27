/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.client.entity.AbstractClientPlayer;

public class aC9 {
    private static int[] b;

    public static void a(rr_1 rr_12, float f) {
        rr_12.d(f);
    }

    public static int[] b() {
        return b;
    }

    public static void b(rr_1 rr_12, float f) {
        rr_12.f(f);
    }

    public static void a(rr_1 rr_12, boolean bl) {
        rr_12.a(bl);
    }

    public static void a(rr_1 rr_12, AbstractClientPlayer abstractClientPlayer) {
        rr_12.a(abstractClientPlayer);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (aC9.b() != null) {
            aC9.b(new int[1]);
        }
    }
}

