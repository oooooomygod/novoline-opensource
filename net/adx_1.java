/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.network.packts.C01PacketPing;

/*
 * Renamed from net.adX
 */
public class adx_1 {
    private static int[] b;

    public static void b(int[] nArray) {
        b = nArray;
    }

    public static long a(C01PacketPing c01PacketPing) {
        return c01PacketPing.a();
    }

    static {
        if (adx_1.b() == null) {
            adx_1.b(new int[2]);
        }
    }

    public static int[] b() {
        return b;
    }
}

