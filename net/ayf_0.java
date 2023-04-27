/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C06PacketPlayerPosLook;
import net.skidunion.annotations;

/*
 * Renamed from net.aYf
 */
public class ayf_0
implements xz_2 {
    private C06PacketPlayerPosLook a;

    @Override
    @annotations
    public String getName() {
        return cm_1.a;
    }

    @annotations
    public void setYaw(float f) {
        this.a.b(f);
    }

    @annotations
    public double getY() {
        return this.a.getY();
    }

    @annotations
    public boolean isOnGround() {
        return this.a.isOnGround();
    }

    @annotations
    public void setX(double d) {
        this.a.setX(d);
    }

    @annotations
    public float getPitch() {
        return this.a.getPitch();
    }

    @annotations
    public double getZ() {
        return this.a.getZ();
    }

    @annotations
    public void setZ(double d) {
        this.a.setZ(d);
    }

    public ayf_0(C06PacketPlayerPosLook c06PacketPlayerPosLook) {
        this.a = c06PacketPlayerPosLook;
    }

    @annotations
    public double getX() {
        return this.a.getX();
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public float getYaw() {
        return this.a.getYaw();
    }

    @annotations
    public void setPitch(float f) {
        this.a.setPitch(f);
    }

    @annotations
    public void setOnGround(boolean bl) {
        this.a.setOnGround(bl);
    }

    @annotations
    public void setY(double d) {
        this.a.setY(d);
    }
}

