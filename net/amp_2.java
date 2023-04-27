/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C0CPacketInput;
import net.skidunion.annotations;

/*
 * Renamed from net.amp
 */
public class amp_2
implements xz_2 {
    private C0CPacketInput a;

    public amp_2(C0CPacketInput c0CPacketInput) {
        this.a = c0CPacketInput;
    }

    @annotations
    public void setStrafeSpeed(float f) {
        this.a.b(f);
    }

    @Override
    @annotations
    public String getName() {
        return as8_0.a;
    }

    @annotations
    public float getForwardSpeed() {
        return this.a.d();
    }

    @annotations
    public void setJumping(boolean bl) {
        this.a.b(bl);
    }

    @annotations
    public float getStrafeSpeed() {
        return this.a.c();
    }

    @annotations
    public void setForwardSpeed(float f) {
        this.a.a(f);
    }

    @annotations
    public boolean isJumping() {
        return this.a.b();
    }

    @annotations
    public void setSneaking(boolean bl) {
        this.a.a(bl);
    }

    @annotations
    public boolean isSneaking() {
        return this.a.a();
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }
}

