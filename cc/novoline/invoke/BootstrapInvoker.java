/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import net.minecraft.init.Bootstrap;

public class BootstrapInvoker {
    private static String[] b;

    public static boolean b() {
        return Bootstrap.isRegistered();
    }

    static {
        if (BootstrapInvoker.c() == null) {
            BootstrapInvoker.b(new String[4]);
        }
    }

    public static void a(String string) {
        Bootstrap.a(string);
    }

    public static void register() {
        Bootstrap.register();
    }

    public static String[] c() {
        return b;
    }

    public static void b(String[] stringArray) {
        b = stringArray;
    }
}

