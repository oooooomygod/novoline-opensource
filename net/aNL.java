/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 */
package net;

import com.mojang.authlib.GameProfile;
import net.minecraft.world.GameType;
import deobf.IChatComponent;

public class aNL {
    public static void a(NetworkPlayerInfo networkPlayerInfo, int n) {
        networkPlayerInfo.b(n);
    }

    public static a35 h(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.k();
    }

    public static IChatComponent j(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.a();
    }

    public static void a(NetworkPlayerInfo networkPlayerInfo, IChatComponent iChatComponent) {
        networkPlayerInfo.a(iChatComponent);
    }

    public static int b(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.m();
    }

    public static long l(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.e();
    }

    public static int f(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.f();
    }

    public static GameProfile a(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.l();
    }

    public static int g(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.d();
    }

    public static ResourceLocation k(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.b();
    }

    public static void b(NetworkPlayerInfo networkPlayerInfo, int n) {
        networkPlayerInfo.c(n);
    }

    public static void a(NetworkPlayerInfo networkPlayerInfo, long l4) {
        networkPlayerInfo.a(l4);
    }

    public static long d(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.i();
    }

    public static void b(NetworkPlayerInfo networkPlayerInfo, long l4) {
        networkPlayerInfo.b(l4);
    }

    public static GameType c(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.c();
    }

    public static void c(NetworkPlayerInfo networkPlayerInfo, long l4) {
        networkPlayerInfo.c(l4);
    }

    public static boolean i(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.h();
    }

    public static long e(NetworkPlayerInfo networkPlayerInfo) {
        return networkPlayerInfo.n();
    }
}

