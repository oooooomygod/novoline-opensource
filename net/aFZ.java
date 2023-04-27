/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import deobf.SkinManager;
import java.util.Map;
import net.ResourceLocation;
import net.azz_2;

public class aFZ {
    public static Map a(SkinManager skinManager, GameProfile gameProfile) {
        return skinManager.a(gameProfile);
    }

    public static void a(SkinManager skinManager, GameProfile gameProfile, azz_2 azz_22, boolean bl) {
        skinManager.a(gameProfile, azz_22, bl);
    }

    public static ResourceLocation a(SkinManager skinManager, MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type) {
        return skinManager.a(minecraftProfileTexture, type);
    }

    public static ResourceLocation a(SkinManager skinManager, MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, azz_2 azz_22) {
        return skinManager.a(minecraftProfileTexture, type, azz_22);
    }
}

