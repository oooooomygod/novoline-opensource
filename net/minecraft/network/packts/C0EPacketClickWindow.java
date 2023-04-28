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

public class C0EPacketClickWindow
implements Packet<INetHandlerPlayServer> {
    private int mode;
    private int usedButton;
    private int windowId;
    private short actionNumber;
    private int slotId;
    private boolean f;
    private ItemStack clickedItem;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.windowId);
        PacketBufferInvoker.g(packetBuffer, this.slotId);
        PacketBufferInvoker.c(packetBuffer, this.usedButton);
        PacketBufferInvoker.g(packetBuffer, this.actionNumber);
        PacketBufferInvoker.c(packetBuffer, this.mode);
        PacketBufferInvoker.a(packetBuffer, this.clickedItem);
    }

    public boolean c() {
        return this.f;
    }

    public boolean d() {
        return this.mode == 2;
    }

    public void a(ItemStack itemStack) {
        this.clickedItem = itemStack;
    }

    public void c(int n) {
        this.usedButton = n;
    }

    public void d(int n) {
        this.mode = n;
    }

    public void a(short s) {
        this.actionNumber = s;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public C0EPacketClickWindow() {
    }

    public int k() {
        return this.usedButton;
    }

    public void b(int n) {
        this.slotId = n;
    }

    public int a() {
        return this.mode;
    }

    public ItemStack h() {
        return this.clickedItem;
    }

    public boolean f() {
        return this.windowId == 0 && (this.g() || this.e() || this.d() || this.b());
    }

    public boolean b() {
        return this.usedButton == 0 && this.mode == 1;
    }

    public boolean e() {
        return this.usedButton == 2 && this.mode == 3;
    }

    public C0EPacketClickWindow(int n, int n2, int n3, int n4, ItemStack itemStack, short s) {
        this.windowId = n;
        this.slotId = n2;
        this.usedButton = n3;
        this.clickedItem = act_2.C(itemStack);
        this.actionNumber = s;
        this.mode = n4;
        this.f = false;
    }

    public short i() {
        return this.actionNumber;
    }

    public void a(int n) {
        this.windowId = n;
    }

    public int l() {
        return this.slotId;
    }

    public boolean g() {
        return (this.usedButton == 1 || this.usedButton == 0) && this.mode == 4;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.windowId = PacketBufferInvoker.l(packetBuffer);
        this.slotId = PacketBufferInvoker.k(packetBuffer);
        this.usedButton = PacketBufferInvoker.l(packetBuffer);
        this.actionNumber = PacketBufferInvoker.k(packetBuffer);
        this.mode = PacketBufferInvoker.l(packetBuffer);
        this.clickedItem = PacketBufferInvoker.g(packetBuffer);
    }

    public int j() {
        return this.windowId;
    }
}

