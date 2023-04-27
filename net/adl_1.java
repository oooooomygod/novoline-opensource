/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C01PacketChatMessage;
import net.skidunion.annotations;

/*
 * Renamed from net.adl
 */
public class adl_1
implements xz_2 {
    private C01PacketChatMessage a;

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public String getMessage() {
        return this.a.a();
    }

    public adl_1(C01PacketChatMessage c01PacketChatMessage) {
        this.a = c01PacketChatMessage;
    }

    @Override
    @annotations
    public String getName() {
        return aa_0.a;
    }
}

