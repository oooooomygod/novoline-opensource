/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import java.util.Set;
import net.aII;

public class GameSettingsInvoker {
    private static boolean b;

    public static int a(aII aII2) {
        return aII2.i();
    }

    public static String f(aII aII2) {
        return aII2.j();
    }

    public static int getKeyCode(aII aII2) {
        return aII2.e();
    }

    public static void b() {
        aII.d();
    }

    public static boolean d() {
        return b;
    }

    public static void a(aII aII2, boolean bl) {
        aII2.b(bl);
    }

    public static void a(int n) {
        aII.b(n);
    }

    public static boolean e(aII aII2) {
        return aII2.h();
    }

    public static void a() {
        aII.g();
    }

    public static boolean c() {
        GameSettingsInvoker.d();
        return true;
    }

    public static boolean d(aII aII2) {
        return aII2.b();
    }

    public static void a(aII aII2, int n) {
        aII2.c(n);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static String c(aII aII2) {
        return aII2.k();
    }

    public static void a(int n, boolean bl) {
        aII.a(n, bl);
    }

    static {
        if (!GameSettingsInvoker.d()) {
            GameSettingsInvoker.b(true);
        }
    }

    public static Set e() {
        return aII.a();
    }
}

