/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.network.packts.S19PacketEntityStatus;

/*
 * Renamed from net.iV
 */
public class iv_1 {
    public static Entity a(S19PacketEntityStatus s19PacketEntityStatus, World world) {
        return s19PacketEntityStatus.a(world);
    }

    public static byte a(S19PacketEntityStatus s19PacketEntityStatus) {
        return s19PacketEntityStatus.a();
    }
}

