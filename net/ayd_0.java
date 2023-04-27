/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.network.packts.C18PacketSpectate;
import java.util.UUID;

/*
 * Renamed from net.aYd
 */
public class ayd_0 {
    public static UUID a(C18PacketSpectate c18PacketSpectate) {
        return c18PacketSpectate.a();
    }

    public static Entity a(C18PacketSpectate c18PacketSpectate, WorldServer worldServer) {
        return c18PacketSpectate.a(worldServer);
    }

    public static void a(C18PacketSpectate c18PacketSpectate, UUID uUID) {
        c18PacketSpectate.a(uUID);
    }
}

