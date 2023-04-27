/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fr.litarvan.openauth.microsoft.model.response.MinecraftProfile
 */
package net;

import fr.litarvan.openauth.microsoft.model.response.MinecraftProfile;

/*
 * Renamed from net.aDs
 */
public class ads_0 {
    private static boolean b;

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (!ads_0.b()) {
            ads_0.b(true);
        }
    }

    public static String a(MinecraftProfile minecraftProfile) {
        return minecraftProfile.getName();
    }

    public static boolean a() {
        ads_0.b();
        return true;
    }

    public static String b(MinecraftProfile minecraftProfile) {
        return minecraftProfile.getId();
    }
}

