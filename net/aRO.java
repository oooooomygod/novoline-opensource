/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.I;
import net.anf_0;

class aRO {
    static int[] b = new int[anf_0.values().length];
    static int[] a;

    static {
        try {
            aRO.b[anf_0.FURNACE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRO.b[anf_0.CHEST.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRO.b[anf_0.TNT.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRO.b[anf_0.HOPPER.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRO.b[anf_0.COMMAND_BLOCK.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = new int[I.values().length];
        try {
            aRO.a[I.ENTITY.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRO.a[I.BLOCK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aRO.a[I.MISS.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

