/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.Packet;
import net.minecraft.network.packts.C05PacketPlayerLook;
import net.skidunion.annotations;

/*
 * Renamed from net.Kp
 */
public class kp_0
implements xz_2 {
    private C05PacketPlayerLook a;

    @annotations
    public void setPitch(float f) {
        this.a.setPitch(f);
    }

    public kp_0(C05PacketPlayerLook c05PacketPlayerLook) {
        ant_1.b();
        this.a = c05PacketPlayerLook;
        if (ListInvoker.b() != null) {
            ant_1.b(new ListInvoker[2]);
        }
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public float getPitch() {
        return this.a.getPitch();
    }

    @annotations
    public float getYaw() {
        return this.a.getYaw();
    }

    @annotations
    public void setOnGround(boolean bl) {
        this.a.setOnGround(bl);
    }

    @annotations
    public void setYaw(float f) {
        this.a.b(f);
    }

    @annotations
    public boolean isOnGround() {
        return this.a.isOnGround();
    }

    @Override
    @annotations
    public String getName() {
        return CY.a;
    }
}

