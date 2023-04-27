/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.GameSettings;
import java.util.Set;
import net.N6;
import net.aII;
import net.aea_1;
import net.aj2;

/*
 * Renamed from net.awu
 */
public class awu_1 {
    private static String[] b;

    public static void b(GameSettings gameSettings) {
        gameSettings.l();
    }

    static {
        if (awu_1.b() != null) {
            awu_1.b(new String[2]);
        }
    }

    public static void g(GameSettings gameSettings) {
        gameSettings.d();
    }

    public static void a(GameSettings gameSettings, aj2 aj22, int n) {
        gameSettings.a(aj22, n);
    }

    public static void c(GameSettings gameSettings) {
        gameSettings.f();
    }

    public static int f(GameSettings gameSettings) {
        return gameSettings.e();
    }

    public static void a(GameSettings gameSettings, aII aII2, int n) {
        gameSettings.a(aII2, n);
    }

    public static void a(GameSettings gameSettings, aea_1 aea_12) {
        gameSettings.a(aea_12);
    }

    public static float b(GameSettings gameSettings, aj2 aj22) {
        return gameSettings.a(aj22);
    }

    public static String a(int n) {
        return GameSettings.b(n);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static String a(GameSettings gameSettings, aj2 aj22) {
        return gameSettings.d(aj22);
    }

    public static void a(GameSettings gameSettings, boolean bl) {
        gameSettings.a(bl);
    }

    public static void a(GameSettings gameSettings, aj2 aj22, float f) {
        gameSettings.b(aj22, f);
    }

    public static void a(GameSettings gameSettings, int n) {
        gameSettings.a(n);
    }

    public static String[] b() {
        return b;
    }

    public static void a(GameSettings gameSettings) {
        gameSettings.k();
    }

    public static void d(GameSettings gameSettings) {
        gameSettings.a();
    }

    public static boolean e(GameSettings gameSettings) {
        return gameSettings.i();
    }

    public static float a(GameSettings gameSettings, N6 n6) {
        return gameSettings.a(n6);
    }

    public static void a(GameSettings gameSettings, N6 n6, float f) {
        gameSettings.a(n6, f);
    }

    public static boolean a(aII aII2) {
        return GameSettings.a(aII2);
    }

    public static Set h(GameSettings gameSettings) {
        return gameSettings.m();
    }
}

