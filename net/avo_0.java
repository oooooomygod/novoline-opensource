/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.TileEntity;
import java.util.ArrayDeque;

import deobf.EnumCreateEntityType;
import net.minecraft.block.BlockPos;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.aVo
 */
public class avo_0
extends avn_0 {
    private static IBlockState j;
    private static ArrayDeque<int[]> h;
    private BlockPos l;
    private static String i;
    private static ArrayDeque<IBlockState[]> k;
    private int[] m;
    private static int f;
    private IBlockState[] g;

    private int b(BlockPos blockPos) {
        int n = amv_2.j(blockPos) - amv_2.j(this.l);
        int n2 = amv_2.h(blockPos) - amv_2.h(this.l);
        int n3 = amv_2.i(blockPos) - amv_2.i(this.l);
        return n * 400 + n3 * 20 + n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "Ygx~vVx(\u001e\u0011{".toCharArray();
        int n2 = 0;
        int n3 = 97;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x7B));
            n3 = n3;
        }
    }

    @Override
    public IBlockState b(BlockPos blockPos) {
        int n = this.b(blockPos);
        IBlockState iBlockState = this.g[n];
        this.g[n] = iBlockState = this.a(blockPos);
        return iBlockState;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(int[] nArray) {
        ArrayDeque<int[]> arrayDeque = h;
        synchronized (arrayDeque) {
            if (a8O.a(h) < f) {
                a8O.b(h, nArray);
            }
            return;
        }
    }

    private IBlockState a(BlockPos blockPos) {
        if (amv_2.h(blockPos) >= 0 && amv_2.h(blockPos) < 256) {
            int n = (amv_2.j(blockPos) >> 4) - this.e;
            int n2 = (amv_2.i(blockPos) >> 4) - this.d;
            return this.a[n][n2].d(blockPos);
        }
        return j;
    }

    @Override
    public int a(BlockPos blockPos, int n) {
        int n2 = this.b(blockPos);
        int n3 = this.m[n2];
        if (n3 == -1) {
            n3 = super.a(blockPos, n);
            if (ys_2.I() && !BlocksInvoker.L(BlockStateInvoker.getBlock(this.b(blockPos)))) {
                n3 = aDP.a(blockPos, n3);
            }
            this.m[n2] = n3;
        }
        return n3;
    }

    public avo_0(World world, BlockPos blockPos, BlockPos blockPos2, int n) {
        super(world, blockPos, blockPos2, n);
        this.l = amv_2.b(blockPos, new zl_2(n, n, n));
        this.m = avo_0.b(8000);
        a7r_0.a(this.m, -1);
        this.g = avo_0.a(8000);
    }

    @Override
    public TileEntity c(BlockPos blockPos) {
        int n = (amv_2.j(blockPos) >> 4) - this.e;
        int n2 = (amv_2.i(blockPos) >> 4) - this.d;
        return aqp_2.a(this.a[n][n2], blockPos, EnumCreateEntityType.QUEUED);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static int[] b(int n) {
        ArrayDeque<int[]> arrayDeque = h;
        synchronized (arrayDeque) {
            int[] nArray = (int[])a8O.b(h);
            if (nArray.length >= n) return nArray;
            return new int[n];
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static IBlockState[] a(int n) {
        ArrayDeque<IBlockState[]> arrayDeque = k;
        synchronized (arrayDeque) {
            Object[] objectArray = (IBlockState[])a8O.b(k);
            if (objectArray.length < n) return new IBlockState[n];
            a7r_0.b(objectArray, null);
            return objectArray;
        }
    }

    public void a() {
        avo_0.a(this.m);
        avo_0.a(this.g);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(IBlockState[] iBlockStateArray) {
        ArrayDeque<IBlockState[]> arrayDeque = k;
        synchronized (arrayDeque) {
            if (a8O.a(k) < f) {
                a8O.b(k, iBlockStateArray);
            }
            return;
        }
    }
}

