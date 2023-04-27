/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;

public class C03PacketPlayer
implements Packet<INetHandlerPlayServer> {
    protected double x;
    protected float yaw;
    protected boolean onGround;
    protected float pitch;
    protected boolean moving;
    protected double z;
    protected double y;
    protected boolean rotating;

    public void setY(double d) {
        this.y = d;
    }

    public double getZ() {
        return this.z;
    }

    public void setOnGround(boolean bl) {
        this.onGround = bl;
    }

    public C03PacketPlayer(boolean bl) {
        this.onGround = bl;
    }

    public void setRotation(float[] fArray) {
        this.yaw = fArray[0];
        this.pitch = fArray[1];
    }

    public void setX(double d) {
        this.x = d;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.onGround = PacketBufferInvoker.n(packetBuffer) != 0;
    }

    public float getPitch() {
        return this.pitch;
    }

    public double getY() {
        return this.y;
    }

    public void a(boolean bl) {
        this.rotating = bl;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setZ(double d) {
        this.z = d;
    }

    public double getX() {
        return this.x;
    }

    public void b(float f) {
        this.yaw = f;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.onGround ? 1 : 0);
    }

    public boolean isMoving() {
        return this.moving;
    }

    public C03PacketPlayer() {
    }

    public void setRotating(boolean bl) {
        this.moving = bl;
    }

    public void setPitch(float f) {
        this.pitch = f;
    }

    public boolean isRotating() {
        return this.rotating;
    }

    public boolean isOnGround() {
        return this.onGround;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public void setRotation(float f, float f2) {
        this.yaw = f;
        this.pitch = f2;
    }
}

