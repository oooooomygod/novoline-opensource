/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Iterator;
import java.util.Random;
import deobf.EnumFacing;

/*
 * Renamed from net.abw
 */
public class abw_2 {
    private static int b;

    public static int b() {
        return b;
    }

    public static EnumFacing a(cs_1 cs_12, Random random) {
        return cs_12.a(random);
    }

    static {
        if (abw_2.b() != 0) {
            abw_2.b(4);
        }
    }

    public static Iterator b(cs_1 cs_12) {
        return cs_12.iterator();
    }

    public static int c() {
        abw_2.b();
        return 61;
    }

    public static EnumFacing[] a(cs_1 cs_12) {
        return cs_12.a();
    }

    public static void b(int n) {
        b = n;
    }
}

