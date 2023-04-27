/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.List;
import net.SR;

/*
 * Renamed from net.aod
 */
public class aod_2 {
    private static boolean b;

    public static String b(int n) {
        return SR.a(n);
    }

    public static List a(String string, int n, int n2) {
        return SR.a(string, n, n2);
    }

    public static String b(String string) {
        return SR.e(string);
    }

    public static String c(String string) {
        return SR.b(string);
    }

    public static String d(String string) {
        return SR.c(string);
    }

    public static boolean a(String string) {
        return SR.a(string);
    }

    public static boolean c() {
        aod_2.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean b() {
        return b;
    }

    static {
        if (aod_2.c()) {
            aod_2.b(true);
        }
    }

    public static String a(int n) {
        return SR.b(n);
    }
}

