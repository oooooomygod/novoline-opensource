/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.AbstractModule;
import cc.novoline.script.Script;

/*
 * Renamed from net.asU
 */
public class asu_1 {
    private static int b;

    public static void a(Script script, String string) {
        script.a(string);
    }

    public static int b() {
        return b;
    }

    public static void c(Script script) {
        script.f();
    }

    public static boolean b(Script script) {
        return script.b();
    }

    static {
        if (asu_1.b() != 0) {
            asu_1.b(64);
        }
    }

    public static int a() {
        asu_1.b();
        return 26;
    }

    public static void b(int n) {
        b = n;
    }

    public static String a(Script script) {
        return script.e();
    }

    public static void a(Script script, boolean bl) {
        script.a(bl);
    }

    public static AbstractModule d(Script script) {
        return script.getModule();
    }
}

