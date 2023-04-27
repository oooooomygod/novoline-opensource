/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.network.packts;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.PacketBufferInvoker;
import net.minecraft.item.ItemStack;
import deobf.Packet;
import java.io.IOException;
import net.minecraft.block.BlockPos;
import net.INetHandlerPlayServer;
import net.PacketBuffer;
import net.SJ;
import net.SZ;
import net.act_2;

public class C08PacketPlayerBlockPlacement
implements Packet<INetHandlerPlayServer> {
    private static BlockPos d = new BlockPos(-1, -1, -1);
    private float b;
    private BlockPos a;
    private int g;
    private float f;
    private float c;
    private ItemStack e;

    public void a(int n) {
        this.g = n;
    }

    public void a(ItemStack itemStack) {
        this.e = itemStack;
    }

    public void a(INetHandlerPlayServer iNetHandlerPlayServer) {
        SZ.a(iNetHandlerPlayServer, this);
    }

    public float c() {
        return this.b;
    }

    public BlockPos f() {
        return this.a;
    }

    public C08PacketPlayerBlockPlacement() {
    }

    public void c(float f) {
        this.c = f;
    }

    public void a(BlockPos blockPos) {
        this.a = blockPos;
    }

    public C08PacketPlayerBlockPlacement(ItemStack itemStack) {
        this(d, 255, itemStack, 0.0f, 0.0f, 0.0f);
    }

    public C08PacketPlayerBlockPlacement(BlockPos blockPos, int n, ItemStack itemStack, float f, float f2, float f3) {
        this.a = blockPos;
        this.g = n;
        this.e = act_2.C(itemStack);
        this.c = f;
        this.b = f2;
        this.f = f3;
    }

    public void a(float f) {
        this.b = f;
    }

    public void b(float f) {
        this.f = f;
    }

    public float e() {
        return this.c;
    }

    public int b() {
        return this.g;
    }

    @Override
    public void writePacketData(PacketBuffer packetBuffer) throws IOException {
        PacketBufferInvoker.a(packetBuffer, this.a);
        PacketBufferInvoker.c(packetBuffer, this.g);
        PacketBufferInvoker.a(packetBuffer, this.e);
        PacketBufferInvoker.c(packetBuffer, (int)(this.c * 16.0f));
        PacketBufferInvoker.c(packetBuffer, (int)(this.b * 16.0f));
        PacketBufferInvoker.c(packetBuffer, (int)(this.f * 16.0f));
    }

    public float a() {
        return this.f;
    }

    public ItemStack d() {
        return this.e;
    }

    public C08PacketPlayerBlockPlacement(BlockPos blockPos, ItemStack itemStack, float f, float f2, float f3) {
        this.a = blockPos;
        this.g = SJ.i(BlocksInvoker.a(blockPos));
        this.e = act_2.C(itemStack);
        this.c = f;
        this.b = f2;
        this.f = f3;
    }

    @Override
    public void readPacketData(PacketBuffer packetBuffer) throws IOException {
        this.a = PacketBufferInvoker.o(packetBuffer);
        this.g = PacketBufferInvoker.n(packetBuffer);
        this.e = PacketBufferInvoker.g(packetBuffer);
        this.c = (float)PacketBufferInvoker.n(packetBuffer) / 16.0f;
        this.b = (float)PacketBufferInvoker.n(packetBuffer) / 16.0f;
        this.f = (float)PacketBufferInvoker.n(packetBuffer) / 16.0f;
    }
}

