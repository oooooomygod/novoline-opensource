/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 *  com.google.common.collect.Multimap
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.InsecureTextureException
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 */
package net.minecraft.client.resources;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.SessionInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import com.google.common.cache.LoadingCache;
import com.google.common.collect.Multimap;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.InsecureTextureException;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import deobf.MCInvoker;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import net.ResourceLocation;
import net.TextureManager;
import net.a2q;
import net.a4Z;
import net.aL0;
import net.aM4;
import net.aSI;
import net.abj_0;
import net.af0;
import net.aom_1;
import net.asn_1;
import net.ayw_0;
import net.azz_2;
import net.u_0;

public class SkinManager {
    private File e;
    private TextureManager c;
    private LoadingCache<GameProfile, Map<MinecraftProfileTexture.Type, MinecraftProfileTexture>> b;
    private MinecraftSessionService d;
    private static ExecutorService a = new ThreadPoolExecutor(0, 2, 1L, TimeUnit.MINUTES, new LinkedBlockingQueue<Runnable>());

    public ResourceLocation a(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type) {
        return this.a(minecraftProfileTexture, type, null);
    }

    public void a(GameProfile gameProfile, azz_2 azz_22, boolean bl) {
        asn_1.a(a, () -> this.lambda$loadProfileTextures$1(gameProfile, bl, azz_22));
    }

    public Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> a(GameProfile gameProfile) {
        return (Map)abj_0.b(this.b, gameProfile);
    }

    public SkinManager(TextureManager textureManager, File file, MinecraftSessionService minecraftSessionService) {
        this.c = textureManager;
        this.e = file;
        this.d = minecraftSessionService;
        this.b = aM4.a(aM4.a(aM4.c(), 15L, TimeUnit.SECONDS), new a2q(this));
    }

    private void lambda$null$0(Map map, azz_2 azz_22) {
        if (MapInvoker.b(map, MinecraftProfileTexture.Type.SKIN)) {
            this.a((MinecraftProfileTexture)MapInvoker.c(map, MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN, azz_22);
        }
        if (MapInvoker.b(map, MinecraftProfileTexture.Type.CAPE)) {
            this.a((MinecraftProfileTexture)MapInvoker.c(map, MinecraftProfileTexture.Type.CAPE), MinecraftProfileTexture.Type.CAPE, azz_22);
        }
    }

    private static InsecureTextureException a(InsecureTextureException insecureTextureException) {
        return insecureTextureException;
    }

    public ResourceLocation a(MinecraftProfileTexture minecraftProfileTexture, MinecraftProfileTexture.Type type, azz_2 azz_22) {
        ResourceLocation resourceLocation = new ResourceLocation(aL0.a(aL0.a(new StringBuilder(), u_0.b), af0.a(minecraftProfileTexture)).toString());
        TextureManagerInvoker.b(this.c, resourceLocation);
        aom_1.a(azz_22, type, resourceLocation, minecraftProfileTexture);
        return resourceLocation;
    }

    private void lambda$loadProfileTextures$1(GameProfile gameProfile, boolean bl, azz_2 azz_22) {
        HashMap hashMap = MapsInvoker.a();
        try {
            MapInvoker.a((Map)hashMap, aSI.a(this.d, gameProfile, bl));
        }
        catch (InsecureTextureException insecureTextureException) {}
        if (MapInvoker.e(hashMap) && a4Z.a(gameProfile).equals(a4Z.a(SessionInvoker.a(MCInvoker.y(MCInvoker.f()))))) {
            ayw_0.c(a4Z.c(gameProfile));
            ayw_0.a(a4Z.c(gameProfile), (Multimap)MCInvoker.I(MCInvoker.f()));
            MapInvoker.a((Map)hashMap, aSI.a(this.d, gameProfile, false));
        }
        MCInvoker.a(MCInvoker.f(), () -> this.lambda$null$0(hashMap, azz_22));
    }
}

