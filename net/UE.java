/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.JH;

public class UE {
    private static String b;

    static {
        if (UE.b() != null) {
            UE.b("BqKVPc");
        }
    }

    public static void b(JH jH, String string) {
        jH.b(string);
    }

    public static JH a(Exception exception) {
        return JH.a(exception);
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }

    public static void a(JH jH, String string) {
        jH.a(string);
    }
}

