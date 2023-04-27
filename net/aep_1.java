/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Renamed from net.aeP
 */
public class aep_1
implements em_1 {
    private World g;
    private in_1 i;
    private Random e;
    private boolean h;
    private List<ajt_0> f;
    private IBlockState[] c = new IBlockState[256];
    private in_1 d;
    private nv_0 a;
    private boolean b;

    @Override
    public boolean a(boolean bl, IProgressUpdate iProgressUpdate) {
        return true;
    }

    @Override
    public List<cp_0> a(a40 a402, BlockPos blockPos) {
        il_0 il_02 = aV8.o(this.g, blockPos);
        return hw_0.a(il_02, a402);
    }

    @Override
    public Chunk a(int n, int n2) {
        il_0[] il_0Array;
        xb_1 xb_12 = new xb_1();
        int n3 = 0;
        if (n3 < this.c.length) {
            IBlockState iBlockState = this.c[n3];
            int n4 = 0;
            int n5 = 0;
            while (true) {
                c5.a(xb_12, n4, n3, n5, iBlockState);
                ++n5;
            }
        }
        Object object = ListInvoker.iterator(this.f);
        while (dz_0.c((Iterator)object)) {
            il_0Array = (il_0[])dz_0.b((Iterator)object);
            kh_2.a((ajf_0)il_0Array, this, this.g, n, n2, xb_12);
        }
        object = new Chunk(this.g, xb_12, n, n2);
        il_0Array = aqo_0.a(aV8.q(this.g), (il_0[])null, n * 16, n2 * 16, 16, 16);
        byte[] byArray = aqp_2.i((Chunk)object);
        for (int i = 0; i < byArray.length; ++i) {
            byArray[i] = (byte)il_0Array[i].s;
        }
        aqp_2.l((Chunk)object);
        return object;
    }

    @Override
    public void a(em_1 em_12, int n, int n2) {
        int n3 = n * 16;
        int n4 = n2 * 16;
        BlockPos blockPos = new BlockPos(n3, 0, n4);
        il_0 il_02 = aV8.o(this.g, new BlockPos(n3 + 16, 0, n4 + 16));
        boolean bl = false;
        a5_0.a(this.e, aV8.w(this.g));
        long l4 = a5_0.b(this.e) / 2L * 2L + 1L;
        long l5 = a5_0.b(this.e) / 2L * 2L + 1L;
        a5_0.a(this.e, (long)n * l4 + (long)n2 * l5 ^ aV8.w(this.g));
        ChunkCoordIntPair chunkCoordIntPair = new ChunkCoordIntPair(n, n2);
        Object object = ListInvoker.iterator(this.f);
        while (dz_0.c((Iterator)object)) {
            ajt_0 ajt_02 = (ajt_0)dz_0.b((Iterator)object);
            boolean bl2 = ky_0.a(ajt_02, this.g, this.e, chunkCoordIntPair);
            if (!(ajt_02 instanceof ajX)) continue;
            bl |= bl2;
        }
        if (this.d != null && a5_0.a(this.e, 4) == 0) {
            OK.a(this.d, this.g, this.e, amv_2.a(blockPos, a5_0.a(this.e, 16) + 8, a5_0.a(this.e, 256), a5_0.a(this.e, 16) + 8));
        }
        if (this.i != null && a5_0.a(this.e, 8) == 0 && (amv_2.h((BlockPos)(object = amv_2.a(blockPos, a5_0.a(this.e, 16) + 8, a5_0.a(this.e, a5_0.a(this.e, 248) + 8), a5_0.a(this.e, 16) + 8))) < aV8.c(this.g) || a5_0.a(this.e, 10) == 0)) {
            OK.a(this.i, this.g, this.e, (BlockPos)object);
        }
        if (this.b) {
            int n5 = 0;
            while (true) {
                ar_1.a(new if_1(), this.g, this.e, amv_2.a(blockPos, a5_0.a(this.e, 16) + 8, a5_0.a(this.e, 256), a5_0.a(this.e, 16) + 8));
                ++n5;
            }
        }
        if (this.h) {
            hw_0.a(il_02, this.g, this.e, blockPos);
        }
    }

    @Override
    public String d() {
        return kf_1.s;
    }

    @Override
    public Chunk a(BlockPos blockPos) {
        return this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }

    @Override
    public boolean b(int n, int n2) {
        return true;
    }

    @Override
    public void a(Chunk chunk, int n, int n2) {
        Iterator iterator = ListInvoker.iterator(this.f);
        while (dz_0.c(iterator)) {
            ajt_0 ajt_02 = (ajt_0)dz_0.b(iterator);
            ky_0.a(ajt_02, this, this.g, n, n2, null);
        }
    }

    @Override
    public BlockPos a(World world, String string, BlockPos blockPos) {
        if (kf_1.a.equals(string)) {
            Iterator iterator = ListInvoker.iterator(this.f);
            while (dz_0.c(iterator)) {
                ajt_0 ajt_02 = (ajt_0)dz_0.b(iterator);
                if (!(ajt_02 instanceof aj8)) continue;
                return ky_0.a(ajt_02, world, blockPos);
            }
        }
        return null;
    }

    @Override
    public boolean b() {
        return false;
    }

    public aep_1(World world, long l4, boolean bl, String string) {
        this.f = my_0.c();
        this.g = world;
        this.e = new Random(l4);
        this.a = KX.a(string);
        Map map = KX.d(this.a);
        if (MapInvoker.b(map, kf_1.g)) {
            Map map2 = (Map)MapInvoker.c(map, kf_1.p);
            if (!MapInvoker.b(map2, kf_1.e)) {
                MapInvoker.c(map2, kf_1.d, kf_1.j);
            }
            ListInvoker.add(this.f, new ajX(map2));
        }
        if (MapInvoker.b(map, kf_1.l)) {
            ListInvoker.add(this.f, new aji_0((Map)MapInvoker.c(map, kf_1.c)));
        }
        if (MapInvoker.b(map, kf_1.q)) {
            ListInvoker.add(this.f, new ajd_0((Map)MapInvoker.c(map, kf_1.o)));
        }
        if (MapInvoker.b(map, kf_1.k)) {
            ListInvoker.add(this.f, new aj8((Map)MapInvoker.c(map, kf_1.n)));
        }
        if (MapInvoker.b(map, kf_1.i)) {
            ListInvoker.add(this.f, new ajS((Map)MapInvoker.c(map, kf_1.m)));
        }
        if (MapInvoker.b(KX.d(this.a), kf_1.h)) {
            this.d = new in_1(Blocks.water);
        }
        if (MapInvoker.b(KX.d(this.a), kf_1.r)) {
            this.i = new in_1(Blocks.lava);
        }
        this.b = MapInvoker.b(KX.d(this.a), kf_1.f);
        int n = 0;
        int n2 = 0;
        Iterator iterator = ListInvoker.iterator(KX.a(this.a));
        while (dz_0.c(iterator)) {
            wi_1 wi_12 = (wi_1)dz_0.b(iterator);
            for (int i = aFB.b(wi_12); i < aFB.b(wi_12) + aFB.c(wi_12); ++i) {
                IBlockState iBlockState = aFB.a(wi_12);
                if (BlockStateInvoker.getBlock(iBlockState) == Blocks.air) continue;
                this.c[i] = iBlockState;
            }
            if (BlockStateInvoker.getBlock(aFB.a(wi_12)) == Blocks.air) {
                n2 += aFB.c(wi_12);
                continue;
            }
            n += aFB.c(wi_12) + n2;
            n2 = 0;
        }
        aV8.a(world, n);
        this.h = MapInvoker.b(KX.d(this.a), kf_1.b);
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public boolean a(em_1 em_12, Chunk chunk, int n, int n2) {
        return false;
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public void c() {
    }
}

