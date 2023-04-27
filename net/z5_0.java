/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.logging.Logger;

/*
 * Renamed from net.z5
 */
public class z5_0 {
    private static int[] b;

    public static void a(Logger logger, String string) {
        logger.info(string);
    }

    public static void b(int[] nArray) {
        b = nArray;
    }

    static {
        if (z5_0.b() != null) {
            z5_0.b(new int[1]);
        }
    }

    public static int[] b() {
        return b;
    }
}

