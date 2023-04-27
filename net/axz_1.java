/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.javafx.geom.Vec2d
 */
package net;

import com.sun.javafx.geom.Vec2d;
import net.ahi_1;

/*
 * Renamed from net.axZ
 */
public class axz_1 {
    private static int b;

    static {
        if (axz_1.a() == 0) {
            axz_1.b(9);
        }
    }

    public static String a(ahi_1 ahi_12) {
        return ahi_12.b();
    }

    public static void a(ahi_1 ahi_12, String string) {
        ahi_12.a(string);
    }

    public static void a(ahi_1 ahi_12, Vec2d vec2d) {
        ahi_12.a(vec2d);
    }

    public static void b(int n) {
        b = n;
    }

    public static int a() {
        axz_1.b();
        return 97;
    }

    public static int b() {
        return b;
    }

    public static void b(ahi_1 ahi_12, Vec2d vec2d) {
        ahi_12.b(vec2d);
    }
}

