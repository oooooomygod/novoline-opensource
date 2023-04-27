/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ibm.icu.text.Bidi
 */
package net;

import com.ibm.icu.text.Bidi;

/*
 * Renamed from net.jV
 */
public class jv_1 {
    private static boolean b;

    public static void a(Bidi bidi, int n) {
        bidi.setReorderingMode(n);
    }

    public static boolean b() {
        return b;
    }

    public static String b(Bidi bidi, int n) {
        return bidi.writeReordered(n);
    }

    static {
        if (!jv_1.b()) {
            jv_1.b(true);
        }
    }

    public static boolean c() {
        jv_1.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }
}

