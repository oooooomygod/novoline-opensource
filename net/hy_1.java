/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  paulscode.sound.Source
 */
package net;

import paulscode.sound.Source;

/*
 * Renamed from net.hY
 */
public class hy_1 {
    private static String b = "d6EQYb";

    static {
        if (hy_1.b() == null) {
            hy_1.b("d6EQYb");
        }
    }

    public static String b() {
        return b;
    }

    public static boolean a(Source source) {
        return source.paused();
    }

    public static boolean b(Source source) {
        return source.playing();
    }

    public static void b(String string) {
        b = string;
    }
}

