/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C18PacketSpectate;
import java.util.UUID;

import net.skidunion.annotations;

public class a4F
implements xz_2 {
    private C18PacketSpectate a;

    @Override
    @annotations
    public String getName() {
        return aap_2.a;
    }

    @annotations
    public void setID(UUID uUID) {
        ayd_0.a(this.a, uUID);
    }

    public a4F(C18PacketSpectate c18PacketSpectate) {
        this.a = c18PacketSpectate;
    }

    @annotations
    public UUID getID() {
        return ayd_0.a(this.a);
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }
}

