/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.UX;

/*
 * Renamed from net.aqP
 */
public class aqp_1 {
    private static String[] b;

    static {
        if (aqp_1.b() != null) {
            aqp_1.b(new String[5]);
        }
    }

    public static UX a(UX uX, String string) {
        return uX.a(string);
    }

    public static UX a(UX uX, int n) {
        return uX.a(n);
    }

    public static UX b(UX uX, String string) {
        return uX.b(string);
    }

    public static UX a() {
        return UX.f();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String[] b() {
        return b;
    }

    public static int a(UX uX) {
        return uX.e();
    }

    public static String b(UX uX) {
        return uX.a();
    }
}

