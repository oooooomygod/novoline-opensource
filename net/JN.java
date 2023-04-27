/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.skidunion.a2;

public class JN {
    private static String[] b;

    static {
        if (JN.b() != null) {
            JN.b(new String[1]);
        }
    }

    public static Long a(a2 a23) {
        return a23.e();
    }

    public static String[] b() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

