/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.EnumModuleType;

/*
 * Renamed from net.aRf
 */
class arf_0 {
    static int[] a = new int[EnumModuleType.values().length];

    static {
        try {
            arf_0.a[EnumModuleType.COMBAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arf_0.a[EnumModuleType.MOVEMENT.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arf_0.a[EnumModuleType.VISUALS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arf_0.a[EnumModuleType.PLAYER.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

