/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;

class aUD {
    static int[] a = new int[MinecraftProfileTexture.Type.values().length];

    static {
        try {
            aUD.a[MinecraftProfileTexture.Type.SKIN.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            aUD.a[MinecraftProfileTexture.Type.CAPE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
    }
}

