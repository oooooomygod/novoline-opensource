/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Packet;
import net.minecraft.network.packts.C03PacketPlayer;
import net.skidunion.annotations;

/*
 * Renamed from net.arh
 */
public class arh_2
implements xz_2 {
    C03PacketPlayer a;

    public arh_2(C03PacketPlayer c03PacketPlayer) {
        ant_1.b();
        this.a = c03PacketPlayer;
        ListInvoker.b(new ListInvoker[4]);
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public boolean isOnGround() {
        return this.a.isOnGround();
    }

    @Override
    @annotations
    public String getName() {
        return FS.a;
    }

    @annotations
    public void setOnGround(boolean bl) {
        this.a.setOnGround(bl);
    }
}

