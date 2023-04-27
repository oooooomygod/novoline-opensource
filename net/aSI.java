/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 */
package net;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.util.Map;

public class aSI {
    private static int b;

    public static int b() {
        return b;
    }

    public static Map a(MinecraftSessionService minecraftSessionService, GameProfile gameProfile, boolean bl) {
        return minecraftSessionService.getTextures(gameProfile, bl);
    }

    public static void a(MinecraftSessionService minecraftSessionService, GameProfile gameProfile, String string, String string2) {
        minecraftSessionService.joinServer(gameProfile, string, string2);
    }

    public static int a() {
        aSI.b();
        return 37;
    }

    static {
        if (aSI.a() == 0) {
            aSI.b(76);
        }
    }

    public static GameProfile a(MinecraftSessionService minecraftSessionService, GameProfile gameProfile, String string) {
        return minecraftSessionService.hasJoinedServer(gameProfile, string);
    }

    public static void b(int n) {
        b = n;
    }

    public static GameProfile b(MinecraftSessionService minecraftSessionService, GameProfile gameProfile, boolean bl) {
        return minecraftSessionService.fillProfileProperties(gameProfile, bl);
    }
}

