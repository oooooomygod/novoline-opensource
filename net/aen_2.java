/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.Novoline;
import cc.novoline.modules.AbstractModule;
import cc.novoline.modules.configurations.ConfigManager;
import cc.novoline.modules.EnumModuleType;
import java.util.List;

/*
 * Renamed from net.aen
 */
public class aen_2 {
    private static String[] b;

    public static BindManager a(ModuleManager moduleManager) {
        return moduleManager.b();
    }

    public static ConfigManager b(ModuleManager moduleManager) {
        return moduleManager.c();
    }

    static {
        if (aen_2.b() == null) {
            aen_2.b(new String[1]);
        }
    }

    public static String[] b() {
        return b;
    }

    public static AbstractModule a(ModuleManager moduleManager, String string) {
        return moduleManager.a(string);
    }

    public static List a(ModuleManager moduleManager, EnumModuleType enumModuleType) {
        return moduleManager.a(enumModuleType);
    }

    public static void a(ModuleManager moduleManager, String string, atu atu2, boolean bl) {
        moduleManager.a(string, atu2, bl);
    }

    public static AbstractModule a(ModuleManager moduleManager, Class clazz) {
        return moduleManager.a(clazz);
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }

    public static Novoline d(ModuleManager moduleManager) {
        return moduleManager.getNovoline();
    }

    public static ModuleArrayMap c(ModuleManager moduleManager) {
        return moduleManager.d();
    }
}

