/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.Entity;
import deobf.INetHandlerPlayClient;
import deobf.Packet;
import java.io.IOException;
import net.NBTTagCompound;
import net.PacketBuffer;
import net.VG;
import net.World;
import net.aV8;

public class S49PacketUpdateEntityNBT
implements Packet<INetHandlerPlayClient> {
    private NBTTagCompound a;
    private int b;

    public NBTTagCompound a() {
        return this.a;
    }

    public S49PacketUpdateEntityNBT(int n, NBTTagCompound nBTTagCompound) {
        this.b = n;
        this.a = nBTTagCompound;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.b);
        PacketBufferInvoker.a(packetBuffer, this.a);
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S49PacketUpdateEntityNBT() {
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.b(packetBuffer);
        this.a = PacketBufferInvoker.a(packetBuffer);
    }

    public Entity a(World world) {
        return aV8.b(world, this.b);
    }
}

