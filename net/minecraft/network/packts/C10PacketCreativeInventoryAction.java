/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.PacketBufferInvoker;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import java.io.IOException;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SZ;
import net.act_2;

public class C10PacketCreativeInventoryAction
implements Packet<INetHandlerPlayServer> {
    private int a;
    private ItemStack item;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.g(packetBuffer, this.a);
        PacketBufferInvoker.a(packetBuffer, this.item);
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.k(packetBuffer);
        this.item = PacketBufferInvoker.g(packetBuffer);
    }

    public C10PacketCreativeInventoryAction() {
    }

    public ItemStack b() {
        return this.item;
    }

    public C10PacketCreativeInventoryAction(int n, ItemStack itemStack) {
        this.a = n;
        this.item = act_2.C(itemStack);
    }

    public int a() {
        return this.a;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }
}

