/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.EnumModuleType;

class a1u {
    static int[] a = new int[EnumModuleType.values().length];

    static {
        try {
            a1u.a[EnumModuleType.COMBAT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a1u.a[EnumModuleType.MISC.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a1u.a[EnumModuleType.PLAYER.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a1u.a[EnumModuleType.VISUALS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a1u.a[EnumModuleType.EXPLOITS.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            a1u.a[EnumModuleType.MOVEMENT.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

