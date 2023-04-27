/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.random.Random$Default
 */
package net;

import kotlin.random.Random;

/*
 * Renamed from net.abK
 */
public class abk_1 {
    private static String b = "D8BAq";

    static {
        if (abk_1.b() == null) {
            abk_1.b("D8BAq");
        }
    }

    public static int a(Random.Default default_, int n, int n2) {
        return default_.nextInt(n, n2);
    }

    public static String b() {
        return b;
    }

    public static void b(String string) {
        b = string;
    }
}

