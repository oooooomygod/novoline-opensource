/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.nio.file.Path;
import net.GuiConfig;

/*
 * Renamed from net.to
 */
public class to_2 {
    private static String[] b;

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static void b(GuiConfig guiConfig) {
        guiConfig.a();
    }

    public static String[] b() {
        return b;
    }

    public static String c(GuiConfig guiConfig) {
        return guiConfig.f();
    }

    public static int e(GuiConfig guiConfig) {
        return guiConfig.b();
    }

    public static void a(GuiConfig guiConfig, boolean bl) {
        guiConfig.a(bl);
    }

    public static boolean f(GuiConfig guiConfig) {
        return guiConfig.d();
    }

    public static GuiConfig a(Path path) {
        return GuiConfig.a(path);
    }

    static {
        if (to_2.b() == null) {
            to_2.b(new String[3]);
        }
    }

    public static boolean d(GuiConfig guiConfig) {
        return guiConfig.c();
    }

    public static void a(GuiConfig guiConfig, int n) {
        guiConfig.a(n);
    }

    public static int a(GuiConfig guiConfig) {
        return guiConfig.e();
    }
}

