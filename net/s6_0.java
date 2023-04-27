/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.atJ;
import net.rr_1;

/*
 * Renamed from net.s6
 */
public class s6_0 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void c(atJ atJ2) {
        atJ.a(atJ2);
    }

    static {
        if (s6_0.b() != null) {
            s6_0.b(new String[5]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static boolean a(atJ atJ2) {
        return atJ2.c();
    }

    public static void a(atJ atJ2, float f) {
        atJ2.a(f);
    }

    public static void a(atJ atJ2, rr_1 rr_12) {
        atJ2.a(rr_12);
    }

    public static atJ a(int n) {
        return atJ.a(n);
    }

    public static boolean b(atJ atJ2) {
        return atJ2.b();
    }
}

