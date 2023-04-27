/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.F4;

public class aGD {
    private static int b;

    public static void b(int n) {
        b = n;
    }

    public static int a() {
        aGD.b();
        return 31;
    }

    static {
        if (aGD.a() == 0) {
            aGD.b(26);
        }
    }

    public static F4 a(String string) {
        return F4.a(string);
    }

    public static int b() {
        return b;
    }
}

