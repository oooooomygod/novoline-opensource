/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.configurations.ConfigManager;
import cc.novoline.modules.EnumModuleType;
import java.nio.file.Path;
import java.util.List;

public class aHE {
    private static ListInvoker[] b;

    public static void a(ConfigManager configManager, String string, boolean bl, EnumModuleType[] enumModuleTypeArray) {
        configManager.a(string, bl, enumModuleTypeArray);
    }

    public static void a(ConfigManager configManager, String string, boolean bl) {
        configManager.a(string, bl);
    }

    public static String c() {
        return ConfigManager.f();
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static Path c(ConfigManager configManager, String string) {
        return configManager.b(string);
    }

    public static String a(ConfigManager configManager, String string) {
        return configManager.d(string);
    }

    public static void a(ConfigManager configManager, Path path, boolean bl) {
        configManager.a(path, bl);
    }

    public static ModuleManager a(ConfigManager configManager) {
        return configManager.h();
    }

    public static boolean b(ConfigManager configManager, String string) {
        return configManager.c(string);
    }

    static {
        if (aHE.b() != null) {
            aHE.b(new ListInvoker[4]);
        }
    }

    public static List c(ConfigManager configManager) {
        return configManager.b();
    }

    public static Path b(ConfigManager configManager) {
        return configManager.e();
    }

    public static boolean d(ConfigManager configManager, String string) {
        return configManager.a(string);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }
}

