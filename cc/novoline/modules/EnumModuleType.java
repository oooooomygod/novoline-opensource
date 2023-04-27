/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.modules;

import cc.novoline.invoke.ListInvoker;

public enum EnumModuleType {
    COMBAT,
    MOVEMENT,
    PLAYER,
    VISUALS,
    EXPLOITS,
    MISC;

    private static ListInvoker[] b;

    static {
        EnumModuleType.b(null);
    }

    public static void b(ListInvoker[] listInvokerArray) {
        b = listInvokerArray;
    }

    public static ListInvoker[] b() {
        return b;
    }
}

