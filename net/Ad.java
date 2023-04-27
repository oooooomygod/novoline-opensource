/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.NBTInvoker;
import deobf.Chunk;
import deobf.Packet;
import deobf.TileEntity;
import net.minecraft.network.packts.S21PacketChunkData;
import net.minecraft.network.packts.S22PacketMultiBlockChange;
import net.minecraft.network.packts.S23PacketBlockChange;
import java.util.Iterator;
import java.util.List;

import net.ChunkCoordIntPair;
import deobf.EntityPlayerMP;
import net.minecraft.block.BlockPos;

class Ad {
    private int d;
    private ChunkCoordIntPair a;
    private short[] c;
    private long e;
    avp_1 f;
    private int b;
    private List<EntityPlayerMP> g;

    static List b(Ad ad) {
        return ad.g;
    }

    public void a(Packet packet) {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            EntityPlayerMP entityPlayerMP;
            EntityPlayerMP entityPlayerMP2 = entityPlayerMP = (EntityPlayerMP)dz_0.b(iterator);
            if (ListInvoker.contains(entityPlayerMP2.b2, this.a)) continue;
            qv_0.a(entityPlayerMP2.playerNetServerHandler, packet);
        }
    }

    public Ad(avp_1 avp_12, int n, int n2) {
        this.f = avp_12;
        this.g = my_0.c();
        this.c = new short[64];
        this.a = new ChunkCoordIntPair(n, n2);
        rh_0.a(aoc_0.a((avp_1)avp_12).Z, n, n2);
    }

    public void b() {
        if (this.d != 0) {
            if (this.d == 1) {
                int n = (this.c[0] >> 12 & 0xF) + this.a.b * 16;
                int n2 = this.c[0] & 0xFF;
                int n3 = (this.c[0] >> 8 & 0xF) + this.a.a * 16;
                BlockPos blockPos = new BlockPos(n, n2, n3);
                this.a(new S23PacketBlockChange(avp_1.b(this.f), blockPos));
                if (BlocksInvoker.c(BlockStateInvoker.getBlock(a3V.f(avp_1.b(this.f), blockPos)))) {
                    this.a(a3V.d(avp_1.b(this.f), blockPos));
                }
            } else {
                if (this.d == 64) {
                    int n = this.a.b * 16;
                    int n4 = this.a.a * 16;
                    this.a(new S21PacketChunkData(a3V.b(avp_1.b(this.f), this.a.b, this.a.a), false, this.b));
                    int n5 = 0;
                    while (true) {
                        if ((this.b & 1 << n5) != 0) {
                            int n6 = n5 << 4;
                            List list = a3V.a(avp_1.b(this.f), n, n6, n4, n + 16, n6 + 16, n4 + 16);
                            Iterator iterator = ListInvoker.iterator(list);
                            while (dz_0.c(iterator)) {
                                TileEntity tileEntity = (TileEntity)dz_0.b(iterator);
                                this.a(tileEntity);
                            }
                        }
                        ++n5;
                    }
                }
                this.a(new S22PacketMultiBlockChange(this.d, this.c, a3V.b(avp_1.b(this.f), this.a.b, this.a.a)));
                for (int i = 0; i < this.d; ++i) {
                    int n = (this.c[i] >> 12 & 0xF) + this.a.b * 16;
                    int n7 = this.c[i] & 0xFF;
                    int n8 = (this.c[i] >> 8 & 0xF) + this.a.a * 16;
                    BlockPos blockPos = new BlockPos(n, n7, n8);
                    if (!BlocksInvoker.c(BlockStateInvoker.getBlock(a3V.f(avp_1.b(this.f), blockPos)))) continue;
                    this.a(a3V.d(avp_1.b(this.f), blockPos));
                }
            }
            this.d = 0;
            this.b = 0;
        }
    }

    public void b(EntityPlayerMP entityPlayerMP) {
        if (ListInvoker.contains(this.g, entityPlayerMP)) {
            Chunk chunk = a3V.b(avp_1.b(this.f), this.a.b, this.a.a);
            if (aqp_2.n(chunk)) {
                qv_0.a(entityPlayerMP.playerNetServerHandler, new S21PacketChunkData(chunk, true, 0));
            }
            ListInvoker.remove(this.g, entityPlayerMP);
            ListInvoker.remove(entityPlayerMP.b2, this.a);
            if (ListInvoker.isEmpty(this.g)) {
                long l4 = (long)this.a.b + Integer.MAX_VALUE | (long)this.a.a + Integer.MAX_VALUE << 32;
                this.a(chunk);
                IX.a(avp_1.c(this.f), l4);
                ListInvoker.remove(avp_1.d(this.f), this);
                if (this.d > 0) {
                    ListInvoker.remove(avp_1.a(this.f), this);
                }
                rh_0.b(aoc_0.a((avp_1)this.f).Z, this.a.b, this.a.a);
            }
        }
    }

    public void a(int n, int n2, int n3) {
        if (this.d == 0) {
            ListInvoker.add(avp_1.a(this.f), this);
        }
        this.b |= 1 << (n2 >> 4);
        if (this.d < 64) {
            short s = (short)(n << 12 | n3 << 8 | n2);
            for (int i = 0; i < this.d; ++i) {
                if (this.c[i] != s) continue;
                return;
            }
            this.c[this.d++] = s;
        }
    }

    static ChunkCoordIntPair a(Ad ad) {
        return ad.a;
    }

    private void a(Chunk chunk) {
        aqp_2.a(chunk, aqp_2.e(chunk) + a3V.k(avp_1.b(this.f)) - this.e);
        this.e = a3V.k(avp_1.b(this.f));
    }

    public void a() {
        this.a(a3V.b(avp_1.b(this.f), this.a.b, this.a.a));
    }

    public void a(EntityPlayerMP entityPlayerMP) {
        if (ListInvoker.contains(this.g, entityPlayerMP)) {
            LoggerInvoker.a(avp_1.a(), py_1.a, new Object[]{entityPlayerMP, P8.d(this.a.b), P8.d(this.a.a)});
        } else {
            if (ListInvoker.isEmpty(this.g)) {
                this.e = a3V.k(avp_1.b(this.f));
            }
            ListInvoker.add(this.g, entityPlayerMP);
            ListInvoker.add(entityPlayerMP.b2, this.a);
        }
    }

    private void a(TileEntity tileEntity) {
        Packet packet = NBTInvoker.c(tileEntity);
        this.a(packet);
    }
}

