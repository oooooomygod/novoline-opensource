/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import deobf.PlayerProfileCache;
import java.util.UUID;

public class aUu {
    public static void a(PlayerProfileCache playerProfileCache, GameProfile gameProfile) {
        playerProfileCache.a(gameProfile);
    }

    public static String[] a(PlayerProfileCache playerProfileCache) {
        return playerProfileCache.b();
    }

    public static GameProfile a(PlayerProfileCache playerProfileCache, UUID uUID) {
        return playerProfileCache.b(uUID);
    }

    public static GameProfile a(PlayerProfileCache playerProfileCache, String string) {
        return playerProfileCache.a(string);
    }
}

