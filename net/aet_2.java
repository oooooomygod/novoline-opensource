/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.CrashInvoker;
import cc.novoline.invoke.CrashReportCategoryInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.Chunk;
import net.minecraft.block.BlockPos;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.logging.log4j.Logger;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aet
 */
public class aet_2
implements em_1 {
    private ku_1 a;
    public boolean d = true;
    private static Logger b = LogManagerInvoker.c();
    private aac_1 f;
    private List<Chunk> g;
    private Set<Long> i = asg_0.b(new ConcurrentHashMap());
    private Chunk h;
    private em_1 c;
    private WorldServer e;

    @Override
    public void a(Chunk chunk, int n, int n2) {
    }

    private void b(Chunk chunk) {
        if (this.a != null) {
            try {
                aqp_2.c(chunk, a3V.k(this.e));
                acV.a(this.a, this.e, chunk);
            }
            catch (IOException iOException) {
                LoggerInvoker.a(b, h0_0.g, iOException);
            }
            catch (cd_1 cd_12) {
                LoggerInvoker.a(b, h0_0.l, cd_12);
            }
        }
    }

    @Override
    public boolean b(int n, int n2) {
        return IX.b(this.f, aV0.a(n, n2));
    }

    public List<Chunk> a() {
        return this.g;
    }

    @Override
    public boolean a() {
        return !this.e.P;
    }

    @Override
    public Chunk a(int n, int n2) {
        Chunk cfr_ignored_0 = (Chunk)IX.c(this.f, aV0.a(n, n2));
        return !a3V.r(this.e) && !this.d ? this.h : this.b(n, n2);
    }

    @Override
    public BlockPos a(World world, String string, BlockPos blockPos) {
        return this.c.a(world, string, blockPos);
    }

    @Override
    public boolean a(boolean bl, IProgressUpdate iProgressUpdate) {
        int n = 0;
        ArrayList arrayList = my_0.a(this.g);
        for (int i = 0; i < ListInvoker.size(arrayList); ++i) {
            Chunk chunk = (Chunk)ListInvoker.get(arrayList, i);
            this.a(chunk);
            if (!aqp_2.a(chunk, bl)) continue;
            this.b(chunk);
            aqp_2.b(chunk, false);
            if (++n != 24) continue;
            return false;
        }
        return true;
    }

    public void d(int n, int n2) {
        if (qq_2.l(this.e.d)) {
            if (!a3V.a(this.e, n, n2)) {
                aS0.b(this.i, lx_2.b(aV0.a(n, n2)));
            }
        } else {
            aS0.b(this.i, lx_2.b(aV0.a(n, n2)));
        }
    }

    public void b() {
        Iterator iterator = ListInvoker.iterator(this.g);
        while (dz_0.c(iterator)) {
            Chunk chunk = (Chunk)dz_0.b(iterator);
            this.d(chunk.f, chunk.v);
        }
    }

    @Override
    public boolean a(em_1 em_12, Chunk chunk, int n, int n2) {
        if (this.c != null && this.c.a(em_12, chunk, n, n2)) {
            Chunk chunk2 = this.a(n, n2);
            aqp_2.t(chunk2);
            return true;
        }
        return false;
    }

    @Override
    public String d() {
        return aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), h0_0.e), IX.a(this.f)), h0_0.h), aS0.d(this.i)).toString();
    }

    @Override
    public List<cp_0> a(a40 a402, BlockPos blockPos) {
        return this.c.a(a402, blockPos);
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
    }

    @Override
    public int e() {
        return IX.a(this.f);
    }

    private Chunk c(int n, int n2) {
        Chunk chunk;
        block4: {
            if (this.a == null) {
                return null;
            }
            try {
                chunk = acV.a(this.a, this.e, n, n2);
                aqp_2.c(chunk, a3V.k(this.e));
                if (this.c == null) break block4;
            }
            catch (Exception exception) {
                LoggerInvoker.a(b, h0_0.d, exception);
                return null;
            }
            this.c.a(chunk, n, n2);
        }
        return chunk;
    }

    @Override
    public void a(em_1 em_12, int n, int n2) {
        Chunk chunk = this.a(n, n2);
        if (!aqp_2.b(chunk)) {
            aqp_2.c(chunk);
            if (this.c != null) {
                this.c.a(em_12, n, n2);
                aqp_2.t(chunk);
            }
        }
    }

    public Chunk b(int n, int n2) {
        long l4 = aV0.a(n, n2);
        aS0.a(this.i, lx_2.b(l4));
        Chunk chunk = (Chunk)IX.c(this.f, l4);
        chunk = this.c(n, n2);
        if (this.c == null) {
            chunk = this.h;
        } else {
            try {
                chunk = this.c.a(n, n2);
            }
            catch (Throwable throwable) {
                CrashReport crashReport = CrashInvoker.makeCrashReport(throwable, h0_0.k);
                CrashReportCategory crashReportCategory = CrashInvoker.a(crashReport, h0_0.i);
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, h0_0.f, StringInvoker.a(h0_0.b, new Object[]{P8.d(n), P8.d(n2)}));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, h0_0.j, lx_2.b(l4));
                CrashReportCategoryInvoker.addCrashSection(crashReportCategory, h0_0.a, this.c.d());
                throw new ReportedException(crashReport);
            }
        }
        IX.a(this.f, l4, chunk);
        ListInvoker.add(this.g, chunk);
        aqp_2.u(chunk);
        aqp_2.a(chunk, this, this, n, n2);
        return chunk;
    }

    @Override
    public boolean b() {
        if (!this.e.P) {
            int n = 0;
            while (true) {
                if (!aS0.b(this.i)) {
                    Long l4 = (Long)dz_0.b(aS0.f(this.i));
                    Chunk chunk = (Chunk)IX.c(this.f, lx_2.a(l4));
                    aqp_2.h(chunk);
                    this.b(chunk);
                    this.a(chunk);
                    IX.a(this.f, lx_2.a(l4));
                    ListInvoker.remove(this.g, chunk);
                    aS0.a(this.i, l4);
                }
                ++n;
            }
        }
        return this.c.b();
    }

    public aet_2(WorldServer worldServer, ku_1 ku_12, em_1 em_12) {
        this.f = new aac_1();
        this.g = my_0.c();
        this.h = new jp_2(worldServer, 0, 0);
        this.e = worldServer;
        this.a = ku_12;
        this.c = em_12;
    }

    private void a(Chunk chunk) {
        if (this.a != null) {
            try {
                acV.b(this.a, this.e, chunk);
            }
            catch (Exception exception) {
                LoggerInvoker.a(b, h0_0.c, exception);
            }
        }
    }

    @Override
    public void c() {
        if (this.a != null) {
            this.a.a();
        }
    }

    @Override
    public Chunk a(BlockPos blockPos) {
        return this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }
}

