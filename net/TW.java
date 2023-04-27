/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.Logger
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.Chunk;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.BlockPos;
import org.apache.logging.log4j.Logger;


public class TW
implements em_1 {
    private World d;
    private aac_1 b = new aac_1();
    private Chunk c;
    private List<Chunk> a = my_0.c();
    private static Logger e = LogManagerInvoker.c();

    @Override
    public Chunk a(int n, int n2) {
        Chunk cfr_ignored_0 = (Chunk)IX.c(this.b, aV0.a(n, n2));
        return this.c;
    }

    @Override
    public boolean b() {
        long l4 = SystemInvoker.f();
        Iterator iterator = ListInvoker.iterator(this.a);
        while (dz_0.c(iterator)) {
            Chunk chunk = (Chunk)dz_0.b(iterator);
            aqp_2.c(chunk, SystemInvoker.f() - l4 > 5L);
        }
        if (SystemInvoker.f() - l4 > 100L) {
            LoggerInvoker.e(e, DN.a, new Object[]{lx_2.b(SystemInvoker.f() - l4)});
        }
        return false;
    }

    public void c(int n, int n2) {
        Chunk chunk = this.a(n, n2);
        if (!aqp_2.o(chunk)) {
            aqp_2.h(chunk);
        }
        IX.a(this.b, aV0.a(n, n2));
        ListInvoker.remove(this.a, chunk);
    }

    @Override
    public void c() {
    }

    @Override
    public void a(Chunk chunk, int n, int n2) {
    }

    @Override
    public int e() {
        return ListInvoker.size(this.a);
    }

    @Override
    public List<cp_0> a(a40 a402, BlockPos blockPos) {
        return null;
    }

    @Override
    public void a(em_1 em_12, int n, int n2) {
    }

    @Override
    public BlockPos a(World world, String string, BlockPos blockPos) {
        return null;
    }

    @Override
    public boolean a(boolean bl, IProgressUpdate iProgressUpdate) {
        return true;
    }

    public Chunk b(int n, int n2) {
        Chunk chunk = new Chunk(this.d, n, n2);
        IX.a(this.b, aV0.a(n, n2), chunk);
        ListInvoker.add(this.a, chunk);
        aqp_2.g(chunk, true);
        return chunk;
    }

    @Override
    public boolean a(em_1 em_12, Chunk chunk, int n, int n2) {
        return false;
    }

    @Override
    public boolean a() {
        return false;
    }

    public TW(World world) {
        this.c = new jp_2(world, 0, 0);
        this.d = world;
    }

    @Override
    public String d() {
        return aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), DN.b), IX.a(this.b)), DN.c), ListInvoker.size(this.a)).toString();
    }

    @Override
    public Chunk a(BlockPos blockPos) {
        return this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }

    @Override
    public boolean b(int n, int n2) {
        return true;
    }
}

