/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.network.packts.S14PacketEntity;

/*
 * Renamed from net.ayc
 */
public class ayc_2 {
    public static boolean b(S14PacketEntity s14PacketEntity) {
        return s14PacketEntity.g();
    }

    public static byte d(S14PacketEntity s14PacketEntity) {
        return s14PacketEntity.c();
    }

    public static byte a(S14PacketEntity s14PacketEntity) {
        return s14PacketEntity.e();
    }

    public static byte c(S14PacketEntity s14PacketEntity) {
        return s14PacketEntity.f();
    }

    public static byte g(S14PacketEntity s14PacketEntity) {
        return s14PacketEntity.b();
    }

    public static byte f(S14PacketEntity s14PacketEntity) {
        return s14PacketEntity.a();
    }

    public static boolean e(S14PacketEntity s14PacketEntity) {
        return s14PacketEntity.d();
    }

    public static Entity a(S14PacketEntity s14PacketEntity, World world) {
        return s14PacketEntity.a(world);
    }
}

