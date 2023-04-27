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

public class S43PacketCamera
implements Packet<INetHandlerPlayClient> {
    public int a;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public Entity a(World world) {
        return aV8.b(world, this.a);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.a);
    }

    public S43PacketCamera() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.b(packetBuffer);
    }

    public S43PacketCamera(Entity entity) {
        this.a = ayj_0.B(entity);
    }
}

