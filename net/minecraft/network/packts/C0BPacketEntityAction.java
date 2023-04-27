/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.Packet;

import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.ayj_0;

public class C0BPacketEntityAction
implements Packet<INetHandlerPlayServer> {
    private C0BPacketEntityAction$Action action;
    private int auxData;
    private int entityID;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.entityID);
        PacketBufferInvoker.a(packetBuffer, this.action);
        PacketBufferInvoker.b(packetBuffer, this.auxData);
    }

    public C0BPacketEntityAction$Action a() {
        return this.action;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public int b() {
        return this.auxData;
    }

    public C0BPacketEntityAction(Entity entity, C0BPacketEntityAction$Action c0BPacketEntityAction$Action, int n) {
        this.entityID = ayj_0.B(entity);
        this.action = c0BPacketEntityAction$Action;
        this.auxData = n;
    }

    public C0BPacketEntityAction(Entity entity, C0BPacketEntityAction$Action c0BPacketEntityAction$Action) {
        this(entity, c0BPacketEntityAction$Action, 0);
    }

    public C0BPacketEntityAction() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.entityID = PacketBufferInvoker.b(packetBuffer);
        this.action = (C0BPacketEntityAction$Action)PacketBufferInvoker.a(packetBuffer, C0BPacketEntityAction$Action.class);
        this.auxData = PacketBufferInvoker.b(packetBuffer);
    }
}

