/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.events.State;
import net.bd_0;
import net.xz_2;

/*
 * Renamed from net.aoi
 */
public class aoi_1 {
    private static int[] b;

    public static State b(bd_0 bd_02) {
        return bd_02.b();
    }

    static {
        if (aoi_1.b() == null) {
            aoi_1.b(new int[4]);
        }
    }

    public static xz_2 a(bd_0 bd_02) {
        return bd_02.getPacket();
    }

    public static int[] b() {
        return b;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

