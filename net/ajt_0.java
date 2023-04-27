/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.StringInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import deobf.NBTBase;
import net.minecraft.util.ReportedException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

/*
 * Renamed from net.ajt
 */
public abstract class ajt_0
extends ajf_0 {
    private aac_1 f;
    private wz_1 e;
    protected Map<Long, aKU> d = MapsInvoker.a();

    protected aKU b(BlockPos blockPos) {
        Iterator iterator = ms_0.a(this.d.values());
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            aKU aKU2 = (aKU)object;
            if (!a4C.d(aKU2) || !aqu_2.a(a4C.e(aKU2), blockPos)) continue;
            Iterator iterator2 = aky_1.f(a4C.b(aKU2));
            while (dz_0.c(iterator2)) {
                Y_ y_ = (Y_)dz_0.b(iterator2);
                if (!aqu_2.a(any_2.c(y_), blockPos)) continue;
                return aKU2;
            }
        }
        return null;
    }

    private void a(int n, int n2, aKU aKU2) {
        wp_0.a(this.e, a4C.a(aKU2, n, n2), n, n2);
        wp_0.b(this.e);
    }

    private static String lambda$recursiveGenerate$1(int n, int n2) throws Exception {
        return StringInvoker.a(aV0.a(n, n2));
    }

    private void a(World world) {
        if (this.e == null) {
            Object object;
            if (ayy_0.d(ail_0.p)) {
                object = (ads_1)aDb.f(world, ail_0.p, new Object[0]);
                this.e = (wz_1)P7.a((ads_1)object, wz_1.class, this.b());
            } else {
                this.e = (wz_1)aV8.a(world, wz_1.class, this.b());
            }
            if (this.e == null) {
                this.e = new wz_1(this.b());
                if (ayy_0.d(ail_0.p)) {
                    object = (ads_1)aDb.f(world, ail_0.p, new Object[0]);
                    P7.a((ads_1)object, this.b(), this.e);
                } else {
                    aV8.a(world, this.b(), this.e);
                }
            } else {
                object = wp_0.a(this.e);
                Iterator iterator = aS0.f(tn_0.c((NBTTagCompound)object));
                while (dz_0.c(iterator)) {
                    NBTTagCompound nBTTagCompound;
                    String string = (String)dz_0.b(iterator);
                    NBTBase nBTBase = tn_0.h((NBTTagCompound)object, string);
                    if (a5N.b(nBTBase) != 10 || !tn_0.b(nBTTagCompound = (NBTTagCompound)nBTBase, a0B.c) || !tn_0.b(nBTTagCompound, a0B.f)) continue;
                    int n = tn_0.g(nBTTagCompound, a0B.k);
                    int n2 = tn_0.g(nBTTagCompound, a0B.a);
                    aKU aKU2 = azx_1.b(nBTTagCompound, world);
                    MapInvoker.c(this.d, lx_2.b(aV0.a(n, n2)), aKU2);
                    IX.a(this.f, aV0.a(n, n2), aKU2);
                }
            }
        }
    }

    protected abstract aKU a(int var1, int var2);

    private static Exception a(Exception exception) {
        return exception;
    }

    protected List a() {
        return null;
    }

    public BlockPos a(World world, BlockPos blockPos) {
        this.b = world;
        this.a(world);
        a5_0.a(this.a, aV8.w(world));
        long l4 = a5_0.b(this.a);
        long l5 = a5_0.b(this.a);
        long l6 = (long)(amv_2.j(blockPos) >> 4) * l4;
        long l7 = (long)(amv_2.i(blockPos) >> 4) * l5;
        a5_0.a(this.a, l6 ^ l7 ^ aV8.w(world));
        this.a(world, amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4, 0, 0, null);
        double d = Double.MAX_VALUE;
        BlockPos blockPos2 = null;
        Iterator iterator = ms_0.a(this.d.values());
        while (dz_0.c(iterator)) {
            Y_ y_;
            BlockPos blockPos3;
            double d2;
            Object object = dz_0.b(iterator);
            aKU aKU2 = (aKU)object;
            if (!a4C.d(aKU2) || !((d2 = amv_2.c(blockPos3 = any_2.a(y_ = (Y_)aky_1.a(a4C.b(aKU2), 0)), blockPos)) < d)) continue;
            d = d2;
            blockPos2 = blockPos3;
        }
        return blockPos2;
    }

    private String lambda$recursiveGenerate$0(int n, int n2) throws Exception {
        return this.b(n, n2) ? a0B.i : a0B.b;
    }

    public boolean b(World world, BlockPos blockPos) {
        this.a(world);
        Iterator iterator = ms_0.a(this.d.values());
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            aKU aKU2 = (aKU)object;
            if (!a4C.d(aKU2) || !aqu_2.a(a4C.e(aKU2), blockPos)) continue;
            return true;
        }
        return false;
    }

    public boolean a(BlockPos blockPos) {
        this.a(this.b);
        return this.b(blockPos) != null;
    }

    public abstract String b();

    public boolean a(World world, Random random, ChunkCoordIntPair chunkCoordIntPair) {
        this.a(world);
        int n = (chunkCoordIntPair.b << 4) + 8;
        int n2 = (chunkCoordIntPair.a << 4) + 8;
        boolean bl = false;
        Iterator iterator = ms_0.a(this.d.values());
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            aKU aKU2 = (aKU)object;
            if (!a4C.d(aKU2) || !a4C.a(aKU2, chunkCoordIntPair) || !aqu_2.a(a4C.e(aKU2), n, n2, n + 15, n2 + 15)) continue;
            a4C.a(aKU2, world, random, new HF(n, n2, n + 15, n2 + 15));
            a4C.b(aKU2, chunkCoordIntPair);
            bl = true;
            this.a(a4C.a(aKU2), a4C.c(aKU2), aKU2);
        }
        return bl;
    }

    protected abstract boolean b(int var1, int var2);

    public ajt_0() {
        this.f = new aac_1();
    }

    private String lambda$recursiveGenerate$2() throws Exception {
        return ara_2.k(this.getClass());
    }

    @Override
    protected void a(World world, int n, int n2, int n3, int n4, xb_1 xb_12) {
        this.a(world);
        if (!IX.b(this.f, aV0.a(n, n2))) {
            a5_0.d(this.a);
            try {
                if (this.b(n, n2)) {
                    aKU aKU2 = this.a(n, n2);
                    MapInvoker.c(this.d, lx_2.b(aV0.a(n, n2)), aKU2);
                    IX.a(this.f, aV0.a(n, n2), aKU2);
                    this.a(n, n2, aKU2);
                }
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, a0B.l);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, a0B.g);
                CrashReportCategoryInvoker.a(crashReportCategory, a0B.d, () -> this.lambda$recursiveGenerate$0(n, n2));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, a0B.h, StringInvoker.a(a0B.m, new Object[]{P8.d(n), P8.d(n2)}));
                CrashReportCategoryInvoker.a(crashReportCategory, a0B.e, () -> ajt_0.lambda$recursiveGenerate$1(n, n2));
                CrashReportCategoryInvoker.a(crashReportCategory, a0B.j, this::lambda$recursiveGenerate$2);
                throw new ReportedException(crashReport);
            }
        }
    }
}

