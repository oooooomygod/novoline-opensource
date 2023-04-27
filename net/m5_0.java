/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.modules.visual.ClickGui;

/*
 * Renamed from net.m5
 */
public class m5_0 {
    private static String[] b;

    public static void a(JF jF, boolean bl) {
        jF.b(bl);
    }

    public static boolean b(JF jF) {
        return jF.e();
    }

    public static String[] b() {
        return b;
    }

    public static Setting a(JF jF) {
        return jF.b();
    }

    public static boolean d(JF jF) {
        return jF.f();
    }

    public static void b(JF jF, boolean bl) {
        jF.a(bl);
    }

    static {
        if (m5_0.b() != null) {
            m5_0.b(new String[2]);
        }
    }

    public static void a(JF jF, ClickGui clickGui, int n, int n2, float f, int n3) {
        jF.a(clickGui, n, n2, f, n3);
    }

    public static int c(JF jF) {
        return jF.a();
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

