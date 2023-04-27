/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.configurations.ConfigManager;
import cc.novoline.modules.EnumModuleType;

public class a4_ {
    private static ListInvoker[] b;

    public static void b(ConfigManager configManager, String string) {
        ay_1.a(configManager, string);
    }

    static {
        if (a4_.b() != null) {
            a4_.b(new ListInvoker[5]);
        }
    }

    public static ListInvoker[] b() {
        return b;
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static void a(ConfigManager configManager, String string, EnumModuleType[] enumModuleTypeArray) {
        ay_1.a(configManager, string, enumModuleTypeArray);
    }

    public static void a(ConfigManager configManager, String string) {
        ay_1.c(configManager, string);
    }

    public static void c(ConfigManager configManager, String string) {
        ay_1.b(configManager, string);
    }
}

