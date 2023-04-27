/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.Vec3;
import net.minecraft.network.packts.C02PacketUseEntity;
import net.minecraft.network.packts.C02PacketUseEntity$Action;

public class Hr {
    public static C02PacketUseEntity$Action a(C02PacketUseEntity c02PacketUseEntity) {
        return c02PacketUseEntity.a();
    }

    public static Vec3 b(C02PacketUseEntity c02PacketUseEntity) {
        return c02PacketUseEntity.c();
    }

    public static Entity a(C02PacketUseEntity c02PacketUseEntity, World world) {
        return c02PacketUseEntity.a(world);
    }
}

