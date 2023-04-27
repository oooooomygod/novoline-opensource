/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import net.minecraft.network.packts.S02PacketLoginSuccess;

public class aUJ {
    private static boolean b;

    public static boolean a() {
        aUJ.b();
        return true;
    }

    public static GameProfile a(S02PacketLoginSuccess s02PacketLoginSuccess) {
        return s02PacketLoginSuccess.a();
    }

    public static boolean b() {
        return b;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    static {
        if (aUJ.a()) {
            aUJ.b(true);
        }
    }
}

