/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C00PacketKeepAlive;
import net.skidunion.annotations;

public class aKW
implements xz_2 {
    private C00PacketKeepAlive a;

    @annotations
    public int getKey() {
        return this.a.a();
    }

    public aKW(C00PacketKeepAlive c00PacketKeepAlive) {
        this.a = c00PacketKeepAlive;
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @Override
    @annotations
    public String getName() {
        return lc_2.a;
    }

    @annotations
    public void setKey(int n) {
        this.a.a(n);
    }
}

