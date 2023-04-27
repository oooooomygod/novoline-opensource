/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.modules.AbstractModule;
import deobf.ModuleRegistry;

public class ModuleInvoker {
    private static ListInvoker[] b;

    public static ListInvoker[] b() {
        return b;
    }

    public static AbstractModule isEnable(ModuleRegistry moduleRegistry) {
        return moduleRegistry.a();
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    static {
        if (ModuleInvoker.b() == null) {
            ModuleInvoker.b(new ListInvoker[3]);
        }
    }
}

