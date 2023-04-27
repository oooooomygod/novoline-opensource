/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 */
package net;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;

public class af0 {
    public static String a(MinecraftProfileTexture minecraftProfileTexture, String string) {
        return minecraftProfileTexture.getMetadata(string);
    }

    public static String a(MinecraftProfileTexture minecraftProfileTexture) {
        return minecraftProfileTexture.getHash();
    }

    public static String b(MinecraftProfileTexture minecraftProfileTexture) {
        return minecraftProfileTexture.getUrl();
    }
}

