/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cc.novoline.auth.minecraft.user.MinecraftUser
 *  cc.novoline.auth.minecraft.user.mcsauth.MinecraftServicesToken
 */
package net;

import cc.novoline.auth.minecraft.user.MinecraftUser;
import cc.novoline.auth.minecraft.user.mcsauth.MinecraftServicesToken;
import java.util.UUID;

/*
 * Renamed from net.a5q
 */
public class a5q_0 {
    private static boolean b;

    public static MinecraftServicesToken c(MinecraftUser minecraftUser) {
        return minecraftUser.getMinecraftToken();
    }

    public static boolean b() {
        return b;
    }

    public static String d(MinecraftUser minecraftUser) {
        return minecraftUser.getType();
    }

    static {
        if (a5q_0.c()) {
            a5q_0.b(true);
        }
    }

    public static String b(MinecraftUser minecraftUser) {
        return minecraftUser.getUsername();
    }

    public static boolean c() {
        a5q_0.b();
        return true;
    }

    public static UUID a(MinecraftUser minecraftUser) {
        return minecraftUser.getUUID();
    }

    public static void b(boolean bl) {
        b = bl;
    }
}

