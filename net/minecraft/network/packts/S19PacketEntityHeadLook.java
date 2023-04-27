/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;
import net.World;
import net.aV8;
import net.ayj_0;

public class S19PacketEntityHeadLook
implements Packet<INetHandlerPlayClient> {
    private int b;
    private byte a;

    public S19PacketEntityHeadLook() {
    }

    public Entity a(World world) {
        return aV8.b(world, this.b);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.b(packetBuffer);
        this.a = PacketBufferInvoker.l(packetBuffer);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, this.a);
    }

    public S19PacketEntityHeadLook(Entity entity, byte by) {
        this.b = ayj_0.B(entity);
        this.a = by;
    }

    public byte a() {
        return this.a;
    }
}

