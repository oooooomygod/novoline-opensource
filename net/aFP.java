/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.io.BufferedReader;
import net.an_1;
import net.s5_0;

public class aFP {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (!aFP.c()) {
            aFP.b(true);
        }
    }

    public static String a(BufferedReader bufferedReader, s5_0[] s5_0Array) {
        return an_1.a(bufferedReader, s5_0Array);
    }

    public static boolean c() {
        aFP.b();
        return true;
    }
}

