/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import java.io.IOException;
import net.PacketBuffer;
import net.VG;

public class S04PacketEntityEquipment
implements Packet<INetHandlerPlayClient> {
    private ItemStack b;
    private int a;
    private int c;

    public S04PacketEntityEquipment(int n, int n2, ItemStack itemStack) {
        this.c = n;
        this.a = n2;
        this.b = null;
    }

    public int a() {
        return this.a;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.c = PacketBufferInvoker.b(packetBuffer);
        this.a = PacketBufferInvoker.k(packetBuffer);
        this.b = PacketBufferInvoker.g(packetBuffer);
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.b(packetBuffer, this.c);
        PacketBufferInvoker.g(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.b);
    }

    public int c() {
        return this.c;
    }

    public S04PacketEntityEquipment() {
    }

    public ItemStack b() {
        return this.b;
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }
}

