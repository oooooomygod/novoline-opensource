/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import deobf.INetHandlerPlayClient;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import java.io.IOException;
import java.util.List;
import net.PacketBuffer;
import net.VG;

public class S30PacketWindowItems
implements Packet<INetHandlerPlayClient> {
    private int b;
    private ItemStack[] a;

    public void a(int n) {
        this.b = n;
    }

    public ItemStack[] b() {
        return this.a;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public S30PacketWindowItems() {
    }

    public void a(INetHandlerPlayClient iNetHandlerPlayClient) {
        VG.a(iNetHandlerPlayClient, this);
    }

    public S30PacketWindowItems(int n, List<ItemStack> list) {
        this.b = n;
        this.a = new ItemStack[ListInvoker.size(list)];
        for (int i = 0; i < this.a.length; ++i) {
            ItemStack cfr_ignored_0 = (ItemStack)ListInvoker.get(list, i);
            this.a[i] = null;
        }
    }

    public int a() {
        return this.b;
    }

    public void a(ItemStack[] itemStackArray) {
        this.a = itemStackArray;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.b = PacketBufferInvoker.n(packetBuffer);
        int n = PacketBufferInvoker.k(packetBuffer);
        this.a = new ItemStack[n];
        for (int i = 0; i < n; ++i) {
            this.a[i] = PacketBufferInvoker.g(packetBuffer);
        }
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.b);
        PacketBufferInvoker.g(packetBuffer, this.a.length);
        for (ItemStack itemStack : this.a) {
            PacketBufferInvoker.a(packetBuffer, itemStack);
        }
    }
}

