/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.dp_1;
import net.sr_1;

/*
 * Renamed from net.aiF
 */
public class aif_1 {
    private static int b;

    public static dp_1 a(sr_1 sr_12, int n) {
        return sr_12.a(n);
    }

    public static int a(sr_1 sr_12) {
        return sr_12.a();
    }

    static {
        if (aif_1.c() == 0) {
            aif_1.b(106);
        }
    }

    public static void b(int n) {
        b = n;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        aif_1.b();
        return 65;
    }
}

