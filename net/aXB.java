/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C13PacketPlayerAbilities;
import net.skidunion.annotations;

public class aXB
implements xz_2 {
    private C13PacketPlayerAbilities a;

    @annotations
    public void setAllowFlying(boolean bl) {
        this.a.c(bl);
    }

    @annotations
    public void setCreativeMode(boolean bl) {
        this.a.b(bl);
    }

    @annotations
    public void setInvurnerable(boolean bl) {
        tn_2.a(this.a, bl);
    }

    public aXB(C13PacketPlayerAbilities c13PacketPlayerAbilities) {
        this.a = c13PacketPlayerAbilities;
    }

    @annotations
    public void setFlying(boolean bl) {
        this.a.d(bl);
    }

    @Override
    @annotations
    public String getName() {
        return amg_0.a;
    }

    @annotations
    public void setFlySpeed(float f) {
        this.a.a(f);
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public void setWalkSpeed(float f) {
        this.a.b(f);
    }
}

