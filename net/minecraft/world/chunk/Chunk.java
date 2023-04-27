/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.world.chunk;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.NBTInvoker;
import cc.novoline.invoke.ProfilerInvoker;
import cc.novoline.invoke.SystemInvoker;
import com.google.common.base.Predicate;
import net.minecraft.init.Blocks;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.ChunkCoordIntPair;
import net.CrashReport;
import deobf.EnumCreateEntityType;
import deobf.EnumFacing;
import net.IBlockState;
import net.Material;
import net.MathHelper;
import net.OV;
import net.SJ;
import net.World;
import net.WorldType;
import net.YG;
import net.a0P;
import net.a3_0;
import net.a4f_0;
import net.a7r_0;
import net.aL0;
import net.aV8;
import net.abw_2;
import net.ach_2;
import net.ain_1;
import net.akm_1;
import net.am7_0;
import net.amv_2;
import net.ano_2;
import net.apx_0;
import net.aqo_0;
import net.aqs_0;
import net.aqv_2;
import net.ard_0;
import net.asz_0;
import net.ave_1;
import net.awc_0;
import net.ayj_0;
import net.azy_0;
import net.bs_0;
import net.c5;
import net.cs_1;
import net.ct_2;
import net.dz_0;
import net.em_1;
import net.h__0;
import net.hw_0;
import net.il_0;
import net.ms_0;
import net.qq_2;
import net.qx_0;
import net.rm_2;
import net.sf_0;
import net.t__0;
import net.xb_1;
import net.z6_0;
import org.apache.logging.log4j.Logger;

public class Chunk {
    private boolean[] j;
    private boolean l;
    private boolean c;
    private boolean o;
    private Map<BlockPos, TileEntity> t;
    private boolean i;
    private int[] a;
    private boolean g;
    private long s;
    private ano_2[] d = new ano_2[16];
    private int n = 4096;
    private World p;
    private long q;
    private int[] m;
    private qx_0<Entity>[] h;
    private ConcurrentLinkedQueue<BlockPos> r;
    public int f;
    private boolean k;
    private int b;
    private byte[] e = new byte[256];
    public int v;
    private boolean u;
    private static Logger w = LogManagerInvoker.c();

    public int d(int n, int n2) {
        return this.a[n2 << 4 | n];
    }

    public IBlockState a(BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity;
        int n;
        int n2;
        int n3 = amv_2.j(blockPos) & 0xF;
        int n4 = amv_2.h(blockPos);
        if (n4 >= this.m[n2 = (n = amv_2.i(blockPos) & 0xF) << 4 | n3] - 1) {
            this.m[n2] = -999;
        }
        int n5 = this.a[n2];
        IBlockState iBlockState2 = this.d(blockPos);
        if (iBlockState2 == iBlockState) {
            return null;
        }
        Block block = BlockStateInvoker.getBlock(iBlockState);
        Block block2 = BlockStateInvoker.getBlock(iBlockState2);
        ano_2 ano_22 = this.d[n4 >> 4];
        if (block == Blocks.air) {
            return null;
        }
        ano_2 ano_23 = new ano_2(n4 >> 4 << 4, !qq_2.e(this.p.d));
        this.d[n4 >> 4] = ano_23;
        ano_22 = ano_23;
        boolean bl = n4 >= n5;
        a4f_0.a(ano_22, n3, n4 & 0xF, n, iBlockState);
        if (block2 != block) {
            if (!this.p.isRemote) {
                BlocksInvoker.b(block2, this.p, blockPos, iBlockState2);
            } else if (block2 instanceof ITileEntityProvider) {
                this.p.s(blockPos);
            }
        }
        if (a4f_0.c(ano_22, n3, n4 & 0xF, n) != block) {
            return null;
        }
        this.j();
        if (block2 instanceof ITileEntityProvider) {
            tileEntity = this.a(blockPos, EnumCreateEntityType.CHECK);
            NBTInvoker.i(tileEntity);
        }
        if (!this.p.isRemote && block2 != block) {
            BlocksInvoker.d(block, this.p, blockPos, iBlockState);
        }
        if (block instanceof ITileEntityProvider) {
            tileEntity = this.a(blockPos, EnumCreateEntityType.CHECK);
            tileEntity = azy_0.a((ITileEntityProvider)((Object)block), this.p, BlocksInvoker.c(block, iBlockState));
            aV8.b(this.p, blockPos, tileEntity);
            NBTInvoker.i(tileEntity);
        }
        this.o = true;
        return iBlockState2;
    }

    public long w() {
        return this.q;
    }

    public void j() {
        int n = this.k();
        this.b = Integer.MAX_VALUE;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            this.m[n2 + (n3 << 4)] = -999;
            int n4 = n + 16;
            while (true) {
                if (this.c(n2, n4 - 1, n3) != 0) {
                    this.a[n3 << 4 | n2] = n4;
                    if (n4 >= this.b) break;
                    this.b = n4;
                    break;
                }
                --n4;
            }
            if (!qq_2.e(this.p.d)) {
                n4 = 15;
                int n5 = n + 16 - 1;
                int n6 = this.c(n2, n5, n3);
                ano_2 ano_22 = this.d[n5 >> 4];
                a4f_0.a(ano_22, n2, n5 & 0xF, n3, n4 -= n6);
                aV8.t(this.p, new BlockPos((this.f << 4) + n2, n5, (this.v << 4) + n3));
                --n5;
            }
            ++n3;
        }
    }

    public int f(BlockPos blockPos) {
        return this.d(amv_2.j(blockPos) & 0xF, amv_2.i(blockPos) & 0xF);
    }

    public void a(Entity entity, int n) {
        n = 0;
        if (n >= this.h.length) {
            n = this.h.length - 1;
        }
        ave_1.a(this.h[n], entity);
    }

    public void a(Entity entity) {
        this.u = true;
        int n = MathHelper.floor_double(entity.posX / 16.0);
        int n2 = MathHelper.floor_double(entity.posZ / 16.0);
        if (n != this.f || n2 != this.v) {
            LoggerInvoker.warn(w, aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), bs_0.l), n), bs_0.f), n2), bs_0.h), this.f), bs_0.g), this.v), bs_0.m), entity).toString());
            ayj_0.D(entity);
        }
        int n3 = MathHelper.floor_double(entity.posY / 16.0);
        n3 = 0;
        if (n3 >= this.h.length) {
            n3 = this.h.length - 1;
        }
        entity.a = true;
        entity.V = this.f;
        entity.M = n3;
        entity.s = this.v;
        ave_1.b(this.h[n3], entity);
    }

    public World m() {
        return this.p;
    }

    public void a(ano_2[] ano_2Array) {
        if (this.d.length != ano_2Array.length) {
            LoggerInvoker.warn(w, aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), bs_0.r), ano_2Array.length), bs_0.k), this.d.length).toString());
        } else {
            for (int i = 0; i < this.d.length; ++i) {
                this.d[i] = ano_2Array[i];
            }
        }
    }

    public TileEntity a(BlockPos blockPos, EnumCreateEntityType enumCreateEntityType) {
        TileEntity tileEntity = (TileEntity)MapInvoker.c(this.t, blockPos);
        if (enumCreateEntityType == EnumCreateEntityType.IMMEDIATE) {
            tileEntity = this.e(blockPos);
            aV8.b(this.p, blockPos, tileEntity);
        } else if (enumCreateEntityType == EnumCreateEntityType.QUEUED) {
            a3_0.a(this.r, blockPos);
        }
        return tileEntity;
    }

    public void c(boolean bl) {
        if (this.k && !qq_2.e(this.p.d)) {
            this.g(this.p.isRemote);
        }
        this.g = true;
        if (!this.l && this.c) {
            this.b();
        }
        while (!this.r.isEmpty()) {
            BlockPos blockPos = (BlockPos)a3_0.a(this.r);
            if (this.a(blockPos, EnumCreateEntityType.CHECK) != null || !BlocksInvoker.c(this.c(blockPos))) continue;
            TileEntity tileEntity = this.e(blockPos);
            aV8.b(this.p, blockPos, tileEntity);
            aV8.a(this.p, blockPos, blockPos);
        }
    }

    private TileEntity e(BlockPos blockPos) {
        Block block = this.c(blockPos);
        return !BlocksInvoker.c(block) ? null : azy_0.a((ITileEntityProvider)((Object)block), this.p, this.h(blockPos));
    }

    public Random a(long l4) {
        return new Random(aV8.w(this.p) + (long)(this.f * this.f * 4987142) + (long)(this.f * 5947611) + (long)(this.v * this.v) * 4392871L + (long)(this.v * 389711) ^ l4);
    }

    public int f() {
        return this.b;
    }

    public il_0 a(BlockPos blockPos, ct_2 ct_22) {
        il_0 il_02;
        int n = amv_2.j(blockPos) & 0xF;
        int n2 = amv_2.i(blockPos) & 0xF;
        int n3 = this.e[n2 << 4 | n] & 0xFF;
        if (n3 == 255) {
            il_02 = aqo_0.a(ct_22, blockPos, il_0.G);
            n3 = il_02.s;
            this.e[n2 << 4 | n] = (byte)(n3 & 0xFF);
        }
        il_02 = hw_0.a(n3);
        return il_0.G;
    }

    public boolean x() {
        return this.c;
    }

    public Block c(BlockPos blockPos) {
        try {
            return this.f(amv_2.j(blockPos) & 0xF, amv_2.h(blockPos), amv_2.i(blockPos) & 0xF);
        }
        catch (ReportedException reportedException) {
            CrashReportCategory crashReportCategory = CrashInvoker.a(apx_0.a(reportedException), bs_0.c);
            CrashReportCategoryInvoker.a(crashReportCategory, bs_0.b, new ach_2(this, blockPos));
            throw reportedException;
        }
    }

    private void b(int n, int n2) {
        this.j[n + n2 * 16] = true;
        this.k = true;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public Chunk(World world, int n, int n2) {
        this.m = new int[256];
        this.j = new boolean[256];
        this.t = MapsInvoker.a();
        this.r = ard_0.b();
        this.h = new qx_0[16];
        this.p = world;
        this.f = n;
        this.v = n2;
        this.a = new int[256];
        for (int i = 0; i < this.h.length; ++i) {
            this.h[i] = new qx_0<Entity>(Entity.class);
        }
        a7r_0.a(this.m, -999);
        a7r_0.a(this.e, (byte)-1);
    }

    public void d(boolean bl) {
        this.o = bl;
    }

    public boolean s() {
        return this.i;
    }

    public void a(TileEntity tileEntity) {
        this.a(NBTInvoker.g(tileEntity), tileEntity);
        if (this.i) {
            this.p.b(tileEntity);
        }
    }

    private void b(int n, int n2, int n3) {
        int n4 = amv_2.h(aV8.r(this.p, new BlockPos(n, 0, n2)));
        if (n4 > n3) {
            this.a(n, n2, n3, n4 + 1);
        } else if (n4 < n3) {
            this.a(n, n2, n4, n3 + 1);
        }
    }

    public void b(long l4) {
        this.s = l4;
    }

    private void g(boolean bl) {
        ProfilerInvoker.startSection(this.p.A, bs_0.q);
        if (aV8.b(this.p, new BlockPos(this.f * 16 + 8, 0, this.v * 16 + 8), 16)) {
            int n = 0;
            int n2 = 0;
            while (true) {
                if (this.j[n + n2 * 16]) {
                    Object object;
                    this.j[n + n2 * 16] = false;
                    int n3 = this.d(n, n2);
                    int n4 = this.f * 16 + n;
                    int n5 = this.v * 16 + n2;
                    int n6 = Integer.MAX_VALUE;
                    Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
                    while (dz_0.c(iterator)) {
                        object = dz_0.b(iterator);
                        n6 = MathInvoker.b(n6, aV8.b(this.p, n4 + SJ.k((EnumFacing)object), n5 + SJ.a((EnumFacing)object)));
                    }
                    this.b(n4, n5, n6);
                    iterator = abw_2.b(cs_1.HORIZONTAL);
                    while (dz_0.c(iterator)) {
                        object = dz_0.b(iterator);
                        this.b(n4 + SJ.k((EnumFacing)object), n5 + SJ.a((EnumFacing)object), n3);
                    }
                    ProfilerInvoker.endSection(this.p.A);
                    return;
                }
                ++n2;
            }
        }
        ProfilerInvoker.endSection(this.p.A);
    }

    public void a(YG yG, BlockPos blockPos, int n) {
        int n2 = amv_2.j(blockPos) & 0xF;
        int n3 = amv_2.h(blockPos);
        int n4 = amv_2.i(blockPos) & 0xF;
        ano_2 ano_22 = this.d[n3 >> 4];
        ano_2 ano_23 = new ano_2(n3 >> 4 << 4, !qq_2.e(this.p.d));
        this.d[n3 >> 4] = ano_23;
        ano_22 = ano_23;
        this.j();
        this.o = true;
        if (yG == YG.SKY) {
            if (!qq_2.e(this.p.d)) {
                a4f_0.a(ano_22, n2, n3 & 0xF, n4, n);
            }
        } else if (yG == YG.BLOCK) {
            a4f_0.b(ano_22, n2, n3 & 0xF, n4, n);
        }
    }

    public void c(long l4) {
        this.q = l4;
    }

    public void l() {
        this.i = false;
        qx_0<Entity>[] qx_0Array = ms_0.a(this.t.values());
        while (dz_0.c((Iterator)qx_0Array)) {
            TileEntity tileEntity = (TileEntity)dz_0.b((Iterator)qx_0Array);
            aV8.a(this.p, tileEntity);
        }
        for (qx_0<Entity> qx_02 : this.h) {
            aV8.b(this.p, qx_02);
        }
    }

    public void b() {
        this.c = true;
        this.l = true;
        BlockPos blockPos = new BlockPos(this.f << 4, 0, this.v << 4);
        if (!qq_2.e(this.p.d)) {
            if (aV8.b(this.p, amv_2.a(blockPos, -1, 0, -1), amv_2.a(blockPos, 16, aV8.c(this.p), 16))) {
                int n = 0;
                int n2 = 0;
                while (true) {
                    if (!this.c(n, n2)) break;
                    ++n2;
                }
                this.l = false;
                if (this.l) {
                    Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
                    while (dz_0.c(iterator)) {
                        Object object = dz_0.b(iterator);
                        int n3 = SJ.e((EnumFacing)object) == asz_0.POSITIVE ? 16 : 1;
                        aV8.x(this.p, amv_2.a(blockPos, (EnumFacing)object, n3)).a(SJ.b((EnumFacing)object));
                    }
                    this.d();
                }
            } else {
                this.l = false;
            }
        }
    }

    public boolean g(BlockPos blockPos) {
        int n;
        int n2 = amv_2.j(blockPos) & 0xF;
        int n3 = amv_2.h(blockPos);
        return n3 >= this.a[(n = amv_2.i(blockPos) & 0xF) << 4 | n2];
    }

    public void f(boolean bl) {
        this.i = bl;
    }

    private void d(int n, int n2, int n3) {
        int n4;
        int n5 = n4 = this.a[n3 << 4 | n] & 0xFF;
        if (n2 > n4) {
            n5 = n2;
        }
        while (this.c(n, n5 - 1, n3) == 0) {
            --n5;
        }
        if (n5 != n4) {
            aV8.a(this.p, n + this.f * 16, n3 + this.v * 16, n5, n4);
            this.a[n3 << 4 | n] = n5;
            int n6 = this.f * 16 + n;
            int n7 = this.v * 16 + n3;
            if (!qq_2.e(this.p.d)) {
                ano_2 ano_22;
                int n8;
                if (n5 < n4) {
                    for (n8 = n5; n8 < n4; ++n8) {
                        ano_22 = this.d[n8 >> 4];
                        a4f_0.a(ano_22, n, n8 & 0xF, n3, 15);
                        aV8.t(this.p, new BlockPos((this.f << 4) + n, n8, (this.v << 4) + n3));
                    }
                } else {
                    for (n8 = n4; n8 < n5; ++n8) {
                        ano_22 = this.d[n8 >> 4];
                        a4f_0.a(ano_22, n, n8 & 0xF, n3, 0);
                        aV8.t(this.p, new BlockPos((this.f << 4) + n, n8, (this.v << 4) + n3));
                    }
                }
                n8 = 15;
                while (true) {
                    int n9 = this.c(n, --n5, n3);
                    n9 = 1;
                    n8 -= n9;
                    n8 = 0;
                    ano_2 ano_23 = this.d[n5 >> 4];
                    a4f_0.a(ano_23, n, n5 & 0xF, n3, n8);
                }
            }
            int n10 = this.a[n3 << 4 | n];
            int n11 = n4;
            int n12 = n10;
            if (n10 < n4) {
                n11 = n10;
                n12 = n4;
            }
            if (n10 < this.b) {
                this.b = n10;
            }
            if (!qq_2.e(this.p.d)) {
                Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
                while (dz_0.c(iterator)) {
                    Object object = dz_0.b(iterator);
                    this.a(n6 + SJ.k((EnumFacing)object), n7 + SJ.a((EnumFacing)object), n11, n12);
                }
                this.a(n6, n7, n11, n12);
            }
            this.o = true;
        }
    }

    public void c() {
        this.n = 0;
    }

    public boolean p() {
        return this.l;
    }

    public Block a(int n, int n2, int n3) {
        try {
            return this.f(n & 0xF, n2, n3 & 0xF);
        }
        catch (ReportedException reportedException) {
            CrashReportCategory crashReportCategory = CrashInvoker.a(apx_0.a(reportedException), bs_0.a);
            CrashReportCategoryInvoker.a(crashReportCategory, bs_0.t, new a0P(this, n, n2, n3));
            throw reportedException;
        }
    }

    public ano_2[] i() {
        return this.d;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    public boolean e() {
        return this.g && this.c && this.l;
    }

    public boolean a(int n, int n2) {
        n = 0;
        if (n2 >= 256) {
            n2 = 255;
        }
        for (int i = n; i <= n2; i += 16) {
            ano_2 ano_22 = this.d[i >> 4];
            if (ano_22.b()) continue;
            return false;
        }
        return true;
    }

    public void a(byte[] byArray) {
        if (this.e.length != byArray.length) {
            LoggerInvoker.warn(w, aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), bs_0.p), byArray.length), bs_0.n), this.e.length).toString());
        } else {
            for (int i = 0; i < this.e.length; ++i) {
                this.e[i] = byArray[i];
            }
        }
    }

    public void g() {
        this.i = true;
        aV8.c(this.p, this.t.values());
        for (qx_0<Entity> qx_02 : this.h) {
            Iterator iterator = ave_1.a(qx_02);
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                entity.O();
            }
            aV8.a(this.p, qx_02);
        }
    }

    private int e(int n, int n2, int n3) {
        if (n2 >> 4 >= this.d.length) {
            return 0;
        }
        ano_2 ano_22 = this.d[n2 >> 4];
        return a4f_0.e(ano_22, n, n2 & 0xF, n3);
    }

    public void a(int[] nArray) {
        if (this.a.length != nArray.length) {
            LoggerInvoker.warn(w, aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), bs_0.i), nArray.length), bs_0.j), this.a.length).toString());
        } else {
            for (int i = 0; i < this.a.length; ++i) {
                this.a[i] = nArray[i];
            }
        }
    }

    public void a(em_1 em_12, em_1 em_13, int n, int n2) {
        sf_0.b(em_12, n, n2 - 1);
        sf_0.b(em_12, n + 1, n2);
        sf_0.b(em_12, n, n2 + 1);
        sf_0.b(em_12, n - 1, n2);
        sf_0.b(em_12, n - 1, n2 - 1);
        sf_0.b(em_12, n + 1, n2 + 1);
        sf_0.b(em_12, n - 1, n2 + 1);
        sf_0.b(em_12, n + 1, n2 - 1);
        if (!this.c) {
            sf_0.a(em_12, em_13, n, n2);
        } else {
            sf_0.a(em_12, em_13, this, n, n2);
        }
        Chunk chunk = sf_0.a(em_12, n - 1, n2);
        if (!chunk.c) {
            sf_0.a(em_12, em_13, n - 1, n2);
        } else {
            sf_0.a(em_12, em_13, chunk, n - 1, n2);
        }
        chunk = sf_0.a(em_12, n, n2 - 1);
        if (!chunk.c) {
            sf_0.a(em_12, em_13, n, n2 - 1);
        } else {
            sf_0.a(em_12, em_13, chunk, n, n2 - 1);
        }
        chunk = sf_0.a(em_12, n - 1, n2 - 1);
        if (!chunk.c) {
            sf_0.a(em_12, em_13, n - 1, n2 - 1);
        } else {
            sf_0.a(em_12, em_13, chunk, n - 1, n2 - 1);
        }
    }

    public int h(BlockPos blockPos) {
        return this.e(amv_2.j(blockPos) & 0xF, amv_2.h(blockPos), amv_2.i(blockPos) & 0xF);
    }

    private int c(int n, int n2, int n3) {
        return BlocksInvoker.b(this.f(n, n2, n3));
    }

    public void b(boolean bl) {
        this.u = bl;
    }

    public void h() {
        BlockPos blockPos = new BlockPos(this.f << 4, 0, this.v << 4);
        boolean bl = false;
        if (this.n >= 4096) {
            return;
        }
        int n = this.n % 16;
        int n2 = this.n / 16 % 16;
        int n3 = this.n / 256;
        ++this.n;
        int n4 = 0;
        while (true) {
            BlockPos blockPos2 = amv_2.a(blockPos, n2, (n << 4) + n4, n3);
            boolean bl2 = n2 == 15 || n3 == 15;
            if (this.d[n] == null) {
                // empty if block
            }
            if (this.d[n] != null && BlocksInvoker.getBlockState(a4f_0.c(this.d[n], n2, n4, n3)) == Material.air) {
                for (EnumFacing enumFacing : EnumFacing.values()) {
                    BlockPos blockPos3 = amv_2.a(blockPos2, enumFacing);
                    if (BlocksInvoker.G(BlockStateInvoker.getBlock(this.p.b(blockPos3))) <= 0) continue;
                    aV8.c(this.p, blockPos3);
                }
                aV8.c(this.p, blockPos2);
            }
            ++n4;
        }
    }

    public void b(BlockPos blockPos) {
        if (this.i) {
            TileEntity tileEntity = (TileEntity)MapInvoker.a(this.t, blockPos);
            NBTInvoker.a(tileEntity);
        }
    }

    public Map<BlockPos, TileEntity> t() {
        return this.t;
    }

    public byte[] q() {
        return this.e;
    }

    private boolean c(int n, int n2) {
        int n3 = this.k();
        z6_0 z6_02 = new z6_0((this.f << 4) + n, 0, (this.v << 4) + n2);
        int n4 = n3 + 16 - 1;
        while (true) {
            if (n4 <= aV8.c(this.p)) {
                // empty if block
            }
            ain_1.a(z6_02, ain_1.e(z6_02), n4, ain_1.a(z6_02));
            int n5 = this.i(z6_02);
            if (n5 != 255 || ain_1.g(z6_02) < aV8.c(this.p)) {
                // empty if block
            }
            --n4;
        }
    }

    public void a(byte[] byArray, int n, boolean bl) {
        Object object;
        int n2;
        int n3 = 0;
        boolean bl2 = !qq_2.e(this.p.d);
        for (n2 = 0; n2 < this.d.length; ++n2) {
            if ((n & 1 << n2) != 0) {
                if (this.d[n2] == null) {
                    this.d[n2] = new ano_2(n2 << 4, bl2);
                }
                object = a4f_0.g(this.d[n2]);
                for (int i = 0; i < ((char[])object).length; ++i) {
                    object[i] = (char)((byArray[n3 + 1] & 0xFF) << 8 | byArray[n3] & 0xFF);
                    n3 += 2;
                }
                continue;
            }
            if (this.d[n2] == null) continue;
            this.d[n2] = null;
        }
        for (n2 = 0; n2 < this.d.length; ++n2) {
            if ((n & 1 << n2) == 0 || this.d[n2] == null) continue;
            object = a4f_0.b(this.d[n2]);
            SystemInvoker.a(byArray, n3, awc_0.a((aqs_0)object), 0, awc_0.a((aqs_0)object).length);
            n3 += awc_0.a((aqs_0)object).length;
        }
        for (n2 = 0; n2 < this.d.length; ++n2) {
            if ((n & 1 << n2) == 0 || this.d[n2] == null) continue;
            object = a4f_0.f(this.d[n2]);
            SystemInvoker.a(byArray, n3, awc_0.a((aqs_0)object), 0, awc_0.a((aqs_0)object).length);
            n3 += awc_0.a((aqs_0)object).length;
        }
        SystemInvoker.a(byArray, n3, this.e, 0, this.e.length);
        n2 = n3 + this.e.length;
        for (n2 = 0; n2 < this.d.length; ++n2) {
            if (this.d[n2] == null || (n & 1 << n2) == 0) continue;
            a4f_0.c(this.d[n2]);
        }
        this.l = true;
        this.c = true;
        this.o();
        Iterator iterator = ms_0.a(this.t.values());
        while (dz_0.c(iterator)) {
            object = (TileEntity)dz_0.b(iterator);
            NBTInvoker.i((TileEntity)object);
        }
    }

    public Chunk(World world, xb_1 xb_12, int n, int n2) {
        this(world, n, n2);
        boolean bl = !qq_2.e(world.d);
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;
        while (true) {
            int n6;
            IBlockState iBlockState;
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(iBlockState = c5.a(xb_12, n6 = n3 * 256 * 16 | n4 * 256 | n5))) != Material.air) {
                int n7 = n5 >> 4;
                if (this.d[n7] == null) {
                    this.d[n7] = new ano_2(n7 << 4, bl);
                }
                a4f_0.a(this.d[n7], n3, n5 & 0xF, n4, iBlockState);
            }
            ++n5;
        }
    }

    public void h(boolean bl) {
        this.l = bl;
    }

    public ChunkCoordIntPair v() {
        return new ChunkCoordIntPair(this.f, this.v);
    }

    public qx_0<Entity>[] n() {
        return this.h;
    }

    public boolean e(int n, int n2) {
        return n == this.f && n2 == this.v;
    }

    public int i(BlockPos blockPos) {
        return BlocksInvoker.b(this.c(blockPos));
    }

    public void a() {
        this.o = true;
    }

    public BlockPos a(BlockPos blockPos) {
        int n = amv_2.j(blockPos) & 0xF;
        int n2 = amv_2.i(blockPos) & 0xF;
        int n3 = n | n2 << 4;
        BlockPos blockPos2 = new BlockPos(amv_2.j(blockPos), this.m[n3], amv_2.i(blockPos));
        if (amv_2.h(blockPos2) == -999) {
            int n4 = this.k() + 15;
            blockPos2 = new BlockPos(amv_2.j(blockPos), n4, amv_2.i(blockPos));
            int n5 = -1;
            while (amv_2.h(blockPos2) > 0) {
                Block block = this.c(blockPos2);
                Material material = BlocksInvoker.getBlockState(block);
                if (!akm_1.d(material) && !akm_1.f(material)) {
                    blockPos2 = amv_2.g(blockPos2);
                    continue;
                }
                n5 = amv_2.h(blockPos2) + 1;
            }
            this.m[n3] = n5;
        }
        return new BlockPos(amv_2.j(blockPos), this.m[n3], amv_2.i(blockPos));
    }

    public boolean r() {
        return false;
    }

    public int a(YG yG, BlockPos blockPos) {
        int cfr_ignored_0 = amv_2.j(blockPos) & 0xF;
        int n = amv_2.h(blockPos);
        int cfr_ignored_1 = amv_2.i(blockPos) & 0xF;
        ano_2 cfr_ignored_2 = this.d[n >> 4];
        return this.g(blockPos) ? yG.defaultLightValue : 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public IBlockState d(BlockPos blockPos) {
        if (aV8.i(this.p) == WorldType.l) {
            IBlockState iBlockState = null;
            if (amv_2.h(blockPos) == 60) {
                iBlockState = BlocksInvoker.t(Blocks.ao);
            }
            if (amv_2.h(blockPos) != 70) return BlocksInvoker.t(Blocks.air);
            iBlockState = t__0.a(amv_2.j(blockPos), amv_2.i(blockPos));
            return BlocksInvoker.t(Blocks.air);
        }
        try {
            if (amv_2.h(blockPos) < 0 || amv_2.h(blockPos) >> 4 >= this.d.length) return BlocksInvoker.t(Blocks.air);
        }
        catch (Throwable throwable) {
            CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, bs_0.s);
            CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, bs_0.o);
            CrashReportCategoryInvoker.a(crashReportCategory, bs_0.d, new am7_0(this, blockPos));
            throw new ReportedException(crashReport);
        }
        ano_2 ano_22 = this.d[amv_2.h(blockPos) >> 4];
        int n = amv_2.j(blockPos) & 0xF;
        int n2 = amv_2.h(blockPos) & 0xF;
        int n3 = amv_2.i(blockPos) & 0xF;
        return a4f_0.a(ano_22, n, n2, n3);
    }

    public void b(Entity entity) {
        this.a(entity, entity.M);
    }

    public void a(Entity entity, rm_2 rm_22, List<Entity> list, Predicate<? super Entity> predicate) {
        int n = MathHelper.floor_double((rm_22.a - 2.0) / 16.0);
        int n2 = MathHelper.floor_double((rm_22.c + 2.0) / 16.0);
        n = MathHelper.a(n, 0, this.h.length - 1);
        n2 = MathHelper.a(n2, 0, this.h.length - 1);
        for (int i = n; i <= n2; ++i) {
            if (this.h[i].isEmpty()) continue;
            Iterator iterator = ave_1.a(this.h[i]);
            while (dz_0.c(iterator)) {
                Entity[] entityArray;
                Entity entity2 = (Entity)dz_0.b(iterator);
                if (!h__0.b(ayj_0.u(entity2), rm_22) || entity2 == entity) continue;
                if (aqv_2.a(predicate, entity2)) {
                    ListInvoker.add(list, entity2);
                }
                for (Entity entity3 : entityArray = ayj_0.E(entity2)) {
                    entity2 = entity3;
                    if (entity2 == entity || !h__0.b(ayj_0.u(entity2), rm_22) || !aqv_2.a(predicate, entity2)) continue;
                    ListInvoker.add(list, entity2);
                }
            }
        }
    }

    public int[] u() {
        return this.a;
    }

    protected void o() {
        int n = this.k();
        this.b = Integer.MAX_VALUE;
        int n2 = 0;
        int n3 = 0;
        while (true) {
            this.m[n2 + (n3 << 4)] = -999;
            int n4 = n + 16;
            while (true) {
                Block block;
                if (BlocksInvoker.b(block = this.f(n2, n4 - 1, n3)) != 0) {
                    this.a[n3 << 4 | n2] = n4;
                    if (n4 >= this.b) break;
                    this.b = n4;
                    break;
                }
                --n4;
            }
            ++n3;
        }
    }

    public int a(BlockPos blockPos, int n) {
        int cfr_ignored_0 = amv_2.j(blockPos) & 0xF;
        int n2 = amv_2.h(blockPos);
        int cfr_ignored_1 = amv_2.i(blockPos) & 0xF;
        ano_2 cfr_ignored_2 = this.d[n2 >> 4];
        return !qq_2.e(this.p.d) && n < YG.SKY.defaultLightValue ? YG.SKY.defaultLightValue - n : 0;
    }

    public <T extends Entity> void a(Class<? extends T> clazz, rm_2 rm_22, List<T> list, Predicate<? super T> predicate) {
        int n = MathHelper.floor_double((rm_22.a - 2.0) / 16.0);
        int n2 = MathHelper.floor_double((rm_22.c + 2.0) / 16.0);
        n = MathHelper.a(n, 0, this.h.length - 1);
        n2 = MathHelper.a(n2, 0, this.h.length - 1);
        for (int i = n; i <= n2; ++i) {
            Iterator iterator = OV.a(ave_1.a(this.h[i], clazz));
            while (dz_0.c(iterator)) {
                Entity entity = (Entity)dz_0.b(iterator);
                if (!h__0.b(ayj_0.u(entity), rm_22) || !aqv_2.a(predicate, entity)) continue;
                ListInvoker.add(list, entity);
            }
        }
    }

    private void a(EnumFacing enumFacing) {
        if (this.c) {
            switch (enumFacing) {
                case EAST: {
                    int n = 0;
                    while (true) {
                        this.c(15, n);
                        ++n;
                    }
                }
                case WEST: {
                    int n = 0;
                    while (true) {
                        this.c(0, n);
                        ++n;
                    }
                }
                case SOUTH: {
                    int n = 0;
                    while (true) {
                        this.c(n, 15);
                        ++n;
                    }
                }
                case NORTH: {
                    int n = 0;
                    while (true) {
                        this.c(n, 0);
                        ++n;
                    }
                }
            }
        }
    }

    public void a(BlockPos blockPos, TileEntity tileEntity) {
        NBTInvoker.a(tileEntity, this.p);
        NBTInvoker.a(tileEntity, blockPos);
        if (this.c(blockPos) instanceof ITileEntityProvider) {
            if (MapInvoker.b(this.t, blockPos)) {
                NBTInvoker.a((TileEntity)MapInvoker.c(this.t, blockPos));
            }
            NBTInvoker.d(tileEntity);
            MapInvoker.c(this.t, blockPos, tileEntity);
        }
    }

    public Block f(int n, int n2, int n3) {
        Block block = Blocks.air;
        if (n2 >> 4 < this.d.length) {
            ano_2 ano_22 = this.d[n2 >> 4];
            try {
                block = a4f_0.c(ano_22, n, n2 & 0xF, n3);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, bs_0.e);
                throw new ReportedException(crashReport);
            }
        }
        return block;
    }

    public int k() {
        int n = this.d.length - 1;
        while (this.d[n] == null) {
            --n;
        }
        return a4f_0.e(this.d[n]);
    }

    private void a(int n, int n2, int n3, int n4) {
        if (n4 > n3 && aV8.b(this.p, new BlockPos(n, 0, n2), 16)) {
            for (int i = n3; i < n4; ++i) {
                aV8.a(this.p, YG.SKY, new BlockPos(n, i, n2));
            }
            this.o = true;
        }
    }

    public boolean e(boolean bl) {
        if (this.u && aV8.d(this.p) != this.s || this.o) {
            return true;
        }
        return this.o;
    }

    private void d() {
        for (int i = 0; i < this.j.length; ++i) {
            this.j[i] = true;
        }
        this.g(false);
    }
}

