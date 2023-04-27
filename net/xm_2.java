/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Chunk;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.xm
 */
public class xm_2
implements em_1 {
    private World d;
    private static int a;
    private static List<IBlockState> c;
    private static int b;

    @Override
    public boolean a() {
        return true;
    }

    public xm_2(World world) {
        this.d = world;
    }

    @Override
    public boolean a(em_1 em_12, Chunk chunk, int n, int n2) {
        return false;
    }

    @Override
    public BlockPos a(World world, String string, BlockPos blockPos) {
        return null;
    }

    @Override
    public Chunk a(int n, int n2) {
        xb_1 xb_12 = new xb_1();
        int n3 = 0;
        int n4 = 0;
        while (true) {
            int n5 = n * 16 + n3;
            int n6 = n2 * 16 + n4;
            c5.a(xb_12, n3, 60, n4, BlocksInvoker.t(Blocks.ao));
            IBlockState iBlockState = xm_2.a(n5, n6);
            c5.a(xb_12, n3, 70, n4, iBlockState);
            ++n4;
        }
    }

    @Override
    public String d() {
        return vh_2.a;
    }

    @Override
    public boolean b(int n, int n2) {
        return true;
    }

    public static IBlockState a(int n, int n2) {
        int n3;
        IBlockState iBlockState = null;
        if (n % 2 != 0 && n2 % 2 != 0 && (n /= 2) <= a && (n2 /= 2) <= b && (n3 = MathHelper.a(n * a + n2)) < ListInvoker.size(c)) {
            iBlockState = (IBlockState)ListInvoker.get(c, n3);
        }
        return iBlockState;
    }

    @Override
    public void a(em_1 em_12, int n, int n2) {
    }

    @Override
    public void a(Chunk chunk, int n, int n2) {
    }

    @Override
    public List<cp_0> a(a40 a402, BlockPos blockPos) {
        il_0 il_02 = aV8.o(this.d, blockPos);
        return hw_0.a(il_02, a402);
    }

    @Override
    public boolean b() {
        return false;
    }

    @Override
    public void c() {
    }

    @Override
    public boolean a(boolean bl, IProgressUpdate iProgressUpdate) {
        return true;
    }

    static {
        c = my_0.c();
        Iterator iterator = a82.a(Block.m);
        while (dz_0.c(iterator)) {
            Block block = (Block)dz_0.b(iterator);
            ListInvoker.addAll(c, (Collection)aXF.a(BlocksInvoker.E(block)));
        }
        a = MathHelper.c(MathHelper.g(ListInvoker.size(c)));
        b = MathHelper.c((float)ListInvoker.size(c) / (float)a);
    }

    @Override
    public int e() {
        return 0;
    }

    @Override
    public Chunk a(BlockPos blockPos) {
        return this.a(amv_2.j(blockPos) >> 4, amv_2.i(blockPos) >> 4);
    }
}

