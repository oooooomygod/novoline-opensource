/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.Agent
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.UserAuthentication
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 */
package net;

import com.mojang.authlib.Agent;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.UserAuthentication;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;

/*
 * Renamed from net.aKh
 */
public class akh_0 {
    private static boolean b;

    public static UserAuthentication a(YggdrasilAuthenticationService yggdrasilAuthenticationService, Agent agent) {
        return yggdrasilAuthenticationService.createUserAuthentication(agent);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static GameProfileRepository b(YggdrasilAuthenticationService yggdrasilAuthenticationService) {
        return yggdrasilAuthenticationService.createProfileRepository();
    }

    static {
        if (!akh_0.b()) {
            akh_0.b(true);
        }
    }

    public static MinecraftSessionService a(YggdrasilAuthenticationService yggdrasilAuthenticationService) {
        return yggdrasilAuthenticationService.createMinecraftSessionService();
    }

    public static boolean a() {
        akh_0.b();
        return true;
    }

    public static boolean b() {
        return b;
    }
}

