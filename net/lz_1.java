/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EnumDifficulty;
import net.minecraft.world.GameType;
import net.minecraft.network.packts.S07PacketRespawn;

/*
 * Renamed from net.lZ
 */
public class lz_1 {
    public static GameType d(S07PacketRespawn s07PacketRespawn) {
        return s07PacketRespawn.a();
    }

    public static WorldType b(S07PacketRespawn s07PacketRespawn) {
        return s07PacketRespawn.c();
    }

    public static EnumDifficulty c(S07PacketRespawn s07PacketRespawn) {
        return s07PacketRespawn.d();
    }

    public static int a(S07PacketRespawn s07PacketRespawn) {
        return s07PacketRespawn.b();
    }
}

