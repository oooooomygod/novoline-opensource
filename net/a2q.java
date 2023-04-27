/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 */
package net;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import deobf.MCInvoker;
import deobf.SkinManager;
import java.util.Map;
import net.aSI;

class a2q
extends CacheLoader<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> {
    SkinManager a;

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile gameProfile) {
        return aSI.a(MCInvoker.T(MCInvoker.f()), gameProfile, false);
    }

    a2q(SkinManager skinManager) {
        this.a = skinManager;
    }
}

