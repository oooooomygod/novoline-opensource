/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.Packet;
import deobf.Vec3;

import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.World;
import net.aV8;
import net.ayj_0;

public class C02PacketUseEntity
implements Packet<INetHandlerPlayServer> {
    private int entityId;
    private Vec3 hitVec;
    private C02PacketUseEntity$Action action;

    public C02PacketUseEntity(Entity entity, Vec3 vec3) {
        this(entity, C02PacketUseEntity$Action.INTERACT_AT);
        this.hitVec = vec3;
    }

    public C02PacketUseEntity() {
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.entityId = PacketBufferInvoker.b(packetBuffer);
        this.action = (C02PacketUseEntity$Action)PacketBufferInvoker.a(packetBuffer, C02PacketUseEntity$Action.class);
        if (this.action == C02PacketUseEntity$Action.INTERACT_AT) {
            this.hitVec = new Vec3(PacketBufferInvoker.m(packetBuffer), PacketBufferInvoker.m(packetBuffer), PacketBufferInvoker.m(packetBuffer));
        }
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.entityId);
        PacketBufferInvoker.a(packetBuffer, this.action);
        if (this.action == C02PacketUseEntity$Action.INTERACT_AT) {
            PacketBufferInvoker.writeFloat(packetBuffer, (float)this.hitVec.xCoord);
            PacketBufferInvoker.writeFloat(packetBuffer, (float)this.hitVec.yCoord);
            PacketBufferInvoker.writeFloat(packetBuffer, (float)this.hitVec.zCoord);
        }
    }

    public C02PacketUseEntity$Action a() {
        return this.action;
    }

    public Entity a(World world) {
        return aV8.b(world, this.entityId);
    }

    public int b() {
        return this.entityId;
    }

    public void a(int n) {
        this.entityId = n;
    }

    public Vec3 c() {
        return this.hitVec;
    }

    public C02PacketUseEntity(Entity entity, C02PacketUseEntity$Action c02PacketUseEntity$Action) {
        this.entityId = ayj_0.B(entity);
        this.action = c02PacketUseEntity$Action;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }
}

