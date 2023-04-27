/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.GameSettings;
import deobf.IBlockAccess;
import java.util.BitSet;
import java.util.List;

import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

public class atV {
    private static ThreadLocal m = new ThreadLocal();
    private BlockPos k;
    private GameSettings i;
    private BitSet b;
    private zw_1 h = null;
    private VC f;
    private int g = -1;
    private int c = -1;
    private boolean[] l = null;
    private IBlockAccess d;
    private IBlockState e;
    private float[] j = new float[EnumFacing.VALUES.length * 2];
    private int a = -1;

    public static atV a(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos) {
        aP2.b();
        atV atV2 = (atV)aQW.a(m);
        if (atV2 == null) {
            atV2 = new atV(iBlockAccess, iBlockState, blockPos);
            aQW.a(m, atV2);
            return atV2;
        }
        atV2.b(iBlockAccess, iBlockState, blockPos);
        return atV2;
    }

    public VC d() {
        return this.f;
    }

    public boolean[] h() {
        aP2.b();
        if (this.l == null) {
            this.l = new boolean[4];
        }
        return this.l;
    }

    public boolean a(List list) {
        aP2.b();
        if (this.a < 0 && ListInvoker.size(list) > 0) {
            if (ListInvoker.get(list, 0) instanceof a9P) {
                this.a = 1;
            }
            this.a = 0;
        }
        return this.a == 1;
    }

    public boolean a(a9Z a9Z2) {
        aP2.b();
        if (this.a < 0) {
            if (a9Z2 instanceof a9P) {
                this.a = 1;
            }
            this.a = 0;
        }
        return this.a == 1;
    }

    public boolean a() {
        aP2.b();
        return this.a == 1;
    }

    public int g() {
        aP2.b();
        if (this.c < 0) {
            if (this.e instanceof afn_0) {
                afn_0 afn_02 = (afn_0)this.e;
                this.c = afn_02.c();
            }
            this.c = BlocksInvoker.v(BlockStateInvoker.getBlock(this.e));
        }
        return this.c;
    }

    public float[] i() {
        return this.j;
    }

    private atV(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos) {
        this.b = new BitSet(3);
        this.f = new VC();
        this.d = iBlockAccess;
        this.e = iBlockState;
        this.k = blockPos;
        this.i = ys_2.ax();
    }

    public IBlockState f() {
        return this.e;
    }

    public BitSet c() {
        return this.b;
    }

    private void b(IBlockAccess iBlockAccess, IBlockState iBlockState, BlockPos blockPos) {
        this.d = iBlockAccess;
        this.e = iBlockState;
        this.k = blockPos;
        this.c = -1;
        this.g = -1;
        this.a = -1;
        aM_.a(this.b);
    }

    public zw_1 b() {
        aP2.b();
        if (this.h == null) {
            this.h = new zw_1(0, 0, 0);
        }
        return this.h;
    }

    public int e() {
        aP2.b();
        if (this.g < 0) {
            if (this.e instanceof afn_0) {
                afn_0 afn_02 = (afn_0)this.e;
                this.g = afn_02.d();
            }
            this.g = BlocksInvoker.c(BlockStateInvoker.getBlock(this.e), this.e);
        }
        return this.g;
    }
}

