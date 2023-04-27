/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.Session;
import net.aqx_1;

/*
 * Renamed from net.aiB
 */
public class aib_1 {
    private static int[] b;

    static {
        if (aib_1.b() != null) {
            aib_1.b(new int[3]);
        }
    }

    public static Session a(aqx_1 aqx_12) {
        return aqx_12.a();
    }

    public static int[] b() {
        return b;
    }

    public static void b(int[] nArray) {
        b = nArray;
    }
}

