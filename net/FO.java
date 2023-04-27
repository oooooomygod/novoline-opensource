/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import net.skidunion.x_0;

public class FO {
    private static int b;

    public static int c() {
        FO.b();
        return 126;
    }

    public static int b() {
        return b;
    }

    static {
        if (FO.b() == 0) {
            FO.b(26);
        }
    }

    public static List a(x_0 x_02) {
        return x_02.a();
    }

    public static void b(int n) {
        b = n;
    }
}

