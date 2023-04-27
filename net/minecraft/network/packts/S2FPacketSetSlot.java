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

public class S2FPacketSetSlot
implements Packet<INetHandlerPlayClient> {
    private int a;
    private int b;
    private ItemStack c;

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S2FPacketSetSlot(int n, int n2, ItemStack itemStack) {
        this.a = n;
        this.b = n2;
        this.c = null;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.k(packetBuffer);
        this.c = PacketBufferInvoker.g(packetBuffer);
    }

    public int a() {
        return this.a;
    }

    public ItemStack c() {
        return this.c;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.g(packetBuffer, this.b);
        PacketBufferInvoker.a(packetBuffer, this.c);
    }

    public void a(int n) {
        this.b = n;
    }

    public int b() {
        return this.b;
    }

    public S2FPacketSetSlot() {
    }
}

