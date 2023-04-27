/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.network.packts.S01PacketJoinGame;

/*
 * Renamed from net.awd
 */
public class awd_2 {
    public static int h(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.e();
    }

    public static boolean a(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.f();
    }

    public static boolean b(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.h();
    }

    public static WorldType g(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.b();
    }

    public static int c(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.g();
    }

    public static EnumDifficulty d(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.d();
    }

    public static GameType e(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.c();
    }

    public static int f(S01PacketJoinGame s01PacketJoinGame) {
        return s01PacketJoinGame.a();
    }
}

