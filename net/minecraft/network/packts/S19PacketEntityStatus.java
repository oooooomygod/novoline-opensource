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

public class S19PacketEntityStatus
implements Packet<INetHandlerPlayClient> {
    private int a;
    private byte b;

    public Entity a(World world) {
        return aV8.b(world, this.a);
    }

    public byte a() {
        return this.b;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.p(packetBuffer);
        this.b = PacketBufferInvoker.l(packetBuffer);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S19PacketEntityStatus() {
    }

    public S19PacketEntityStatus(Entity entity, byte by) {
        this.a = ayj_0.B(entity);
        this.b = by;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.e(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.b);
    }
}

