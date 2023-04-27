/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EntityPlayerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ServerInvoker;
import deobf.Entity;
import deobf.EntityPlayer;
import deobf.MinecraftServer;
import net.minecraft.network.packts.S25PacketBlockBreakAnim;
import net.minecraft.network.packts.S28PacketEffect;
import net.minecraft.network.packts.S29PacketSoundEffect;
import java.util.Iterator;

import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

public class HK
implements IWorldAccess {
    private WorldServer b;
    private MinecraftServer a;

    @Override
    public void a(BlockPos blockPos) {
        a3V.i(this.b).a(blockPos);
    }

    @Override
    public void a(int n, boolean bl, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
    }

    @Override
    public void b(BlockPos blockPos) {
    }

    @Override
    public void a(Entity entity) {
        a7Y.b(a3V.a(this.b), entity);
        VM.a(a3V.b(this.b), entity);
    }

    @Override
    public void a(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    @Override
    public void b(int n, BlockPos blockPos, int n2) {
        Iterator iterator = ListInvoker.iterator(aek_1.l(ServerInvoker.R(this.a)));
        while (dz_0.c(iterator)) {
            double d;
            double d2;
            double d3;
            EntityPlayerMP entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            if (entityPlayerMP.worldObj != this.b || EntityPlayerInvoker.B(entityPlayerMP) == n || !((d3 = (double)amv_2.j(blockPos) - entityPlayerMP.posX) * d3 + (d2 = (double)amv_2.h(blockPos) - entityPlayerMP.posY) * d2 + (d = (double)amv_2.i(blockPos) - entityPlayerMP.posZ) * d < 1024.0)) continue;
            qv_0.a(entityPlayerMP.playerNetServerHandler, new S25PacketBlockBreakAnim(n, blockPos, n2));
        }
    }

    @Override
    public void b(Entity entity) {
        a7Y.a(a3V.a(this.b), entity);
    }

    @Override
    public void a(String string, BlockPos blockPos) {
    }

    @Override
    public void a(EntityPlayer entityPlayer, int n, BlockPos blockPos, int n2) {
        aek_1.a(ServerInvoker.R(this.a), entityPlayer, amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos), 64.0, qq_2.j(this.b.d), new S28PacketEffect(n, blockPos, n2, false));
    }

    @Override
    public void a(EntityPlayer entityPlayer, String string, double d, double d2, double d3, float f, float f2) {
        aek_1.a(ServerInvoker.R(this.a), entityPlayer, d, d2, d3, f > 1.0f ? (double)(16.0f * f) : 16.0, qq_2.j(this.b.d), new S29PacketSoundEffect(string, d, d2, d3, f, f2));
    }

    @Override
    public void a(int n, BlockPos blockPos, int n2) {
        aek_1.a(ServerInvoker.R(this.a), new S28PacketEffect(n, blockPos, n2, true));
    }

    public HK(MinecraftServer minecraftServer, WorldServer worldServer) {
        this.a = minecraftServer;
        this.b = worldServer;
    }

    @Override
    public void a(String string, double d, double d2, double d3, float f, float f2) {
        aek_1.a(ServerInvoker.R(this.a), d, d2, d3, f > 1.0f ? (double)(16.0f * f) : 16.0, qq_2.j(this.b.d), new S29PacketSoundEffect(string, d, d2, d3, f, f2));
    }
}

