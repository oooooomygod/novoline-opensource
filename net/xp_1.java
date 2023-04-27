/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  cc.novoline.auth.minecraft.user.mcsauth.MinecraftServicesToken
 */
package net;

import cc.novoline.auth.minecraft.user.mcsauth.MinecraftServicesToken;

/*
 * Renamed from net.xp
 */
public class xp_1 {
    private static int b;

    public static String a(MinecraftServicesToken minecraftServicesToken) {
        return minecraftServicesToken.getAccessToken();
    }

    public static void b(int n) {
        b = n;
    }

    static {
        if (xp_1.b() == 0) {
            xp_1.b(105);
        }
    }

    public static int a() {
        xp_1.b();
        return 7;
    }

    public static int b() {
        return b;
    }
}

