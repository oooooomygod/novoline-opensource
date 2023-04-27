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
    private int g;
    private int e;
    private int a;
    private short b;
    private int d;
    private boolean f;
    private ItemStack c;

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.c(packetBuffer, this.a);
        PacketBufferInvoker.g(packetBuffer, this.d);
        PacketBufferInvoker.c(packetBuffer, this.e);
        PacketBufferInvoker.g(packetBuffer, this.b);
        PacketBufferInvoker.c(packetBuffer, this.g);
        PacketBufferInvoker.a(packetBuffer, this.c);
    }

    public boolean c() {
        return this.f;
    }

    public boolean d() {
        return this.g == 2;
    }

    public void a(ItemStack itemStack) {
        this.c = itemStack;
    }

    public void c(int n) {
        this.e = n;
    }

    public void d(int n) {
        this.g = n;
    }

    public void a(short s) {
        this.b = s;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public C0EPacketClickWindow() {
    }

    public int k() {
        return this.e;
    }

    public void b(int n) {
        this.d = n;
    }

    public int a() {
        return this.g;
    }

    public ItemStack h() {
        return this.c;
    }

    public boolean f() {
        return this.a == 0 && (this.g() || this.e() || this.d() || this.b());
    }

    public boolean b() {
        return this.e == 0 && this.g == 1;
    }

    public boolean e() {
        return this.e == 2 && this.g == 3;
    }

    public C0EPacketClickWindow(int n, int n2, int n3, int n4, ItemStack itemStack, short s) {
        this.a = n;
        this.d = n2;
        this.e = n3;
        this.c = act_2.C(itemStack);
        this.b = s;
        this.g = n4;
        this.f = false;
    }

    public short i() {
        return this.b;
    }

    public void a(int n) {
        this.a = n;
    }

    public int l() {
        return this.d;
    }

    public boolean g() {
        return (this.e == 1 || this.e == 0) && this.g == 4;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.l(packetBuffer);
        this.d = PacketBufferInvoker.k(packetBuffer);
        this.e = PacketBufferInvoker.l(packetBuffer);
        this.b = PacketBufferInvoker.k(packetBuffer);
        this.g = PacketBufferInvoker.l(packetBuffer);
        this.c = PacketBufferInvoker.g(packetBuffer);
    }

    public int j() {
        return this.a;
    }
}

