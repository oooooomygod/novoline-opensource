/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Packet;
import net.minecraft.network.packts.C04PacketPlayerPosition;
import net.skidunion.annotations;

/*
 * Renamed from net.Gl
 */
public class gl_0
implements xz_2 {
    private C04PacketPlayerPosition a;

    @annotations
    public double getZ() {
        return this.a.getZ();
    }

    @annotations
    public void setY(double d) {
        this.a.setY(d);
    }

    @annotations
    public boolean isOnGround() {
        return this.a.isOnGround();
    }

    @annotations
    public double getY() {
        return this.a.getY();
    }

    @annotations
    public void setX(double d) {
        this.a.setX(d);
    }

    @Override
    @annotations
    public Packet getPacket() {
        return this.a;
    }

    @annotations
    public double getX() {
        return this.a.getX();
    }

    public gl_0(C04PacketPlayerPosition c04PacketPlayerPosition) {
        this.a = c04PacketPlayerPosition;
    }

    @annotations
    public void setZ(double d) {
        this.a.setZ(d);
    }

    @annotations
    public void setOnGround(boolean bl) {
        this.a.setOnGround(bl);
    }

    @Override
    @annotations
    public String getName() {
        return ayx_1.a;
    }
}

