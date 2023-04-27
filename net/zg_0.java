/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;

/*
 * Renamed from net.Zg
 */
public abstract class zg_0
extends Y_ {
    protected static int n;
    protected ajM j;
    protected static IBlockState l;
    protected static IBlockState h;
    protected static int g;
    protected static IBlockState e;
    protected static IBlockState d;
    protected static int f;
    protected static IBlockState m;
    protected static IBlockState i;
    protected static int k;

    protected boolean a(World world, HF hF, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6 = this.b(n, n3);
        if (aqu_2.a(hF, new BlockPos(n6, n5 = this.a(n2), n4 = this.a(n, n3)))) {
            nx_1 nx_12 = new nx_1(world);
            aBR.a(nx_12, true);
            aBR.d(nx_12, aBR.b(nx_12));
            aBR.a(nx_12, (double)n6 + 0.5, n5, (double)n4 + 0.5, 0.0f, 0.0f);
            aBR.a(nx_12, aV8.b(world, new BlockPos(nx_12)), null);
            aV8.b(world, nx_12);
            return true;
        }
        return false;
    }

    protected void a(World world, HF hF, int n, int n2, boolean bl) {
        this.a(world, hF, n, 0, n2, n + 2, 0, n2 + 8 - 1, e, e, false);
        this.a(world, hF, n + 5, 0, n2, n + 8 - 1, 0, n2 + 8 - 1, e, e, false);
        this.a(world, hF, n + 3, 0, n2, n + 4, 0, n2 + 2, e, e, false);
        this.a(world, hF, n + 3, 0, n2 + 5, n + 4, 0, n2 + 8 - 1, e, e, false);
        this.a(world, hF, n + 3, 0, n2 + 2, n + 4, 0, n2 + 2, i, i, false);
        this.a(world, hF, n + 3, 0, n2 + 5, n + 4, 0, n2 + 5, i, i, false);
        this.a(world, hF, n + 2, 0, n2 + 3, n + 2, 0, n2 + 4, i, i, false);
        this.a(world, hF, n + 5, 0, n2 + 3, n + 5, 0, n2 + 4, i, i, false);
    }

    protected zg_0(int n, EnumFacing enumFacing, ajM ajM2, int n2, int n3, int n4) {
        super(n);
        this.c = enumFacing;
        this.j = ajM2;
        int n5 = ajM2.c;
        int n6 = n5 % 5;
        int n7 = n5 / 5 % 5;
        int n8 = n5 / 25;
        this.b = enumFacing != EnumFacing.NORTH && enumFacing != EnumFacing.SOUTH ? new HF(0, 0, 0, n4 * 8 - 1, n3 * 4 - 1, n2 * 8 - 1) : new HF(0, 0, 0, n2 * 8 - 1, n3 * 4 - 1, n4 * 8 - 1);
        switch (anr_2.a[enumFacing.ordinal()]) {
            case 1: {
                aqu_2.a(this.b, n6 * 8, n8 * 4, -(n7 + n4) * 8 + 1);
                break;
            }
            case 2: {
                aqu_2.a(this.b, n6 * 8, n8 * 4, n7 * 8);
                break;
            }
            case 3: {
                aqu_2.a(this.b, -(n7 + n4) * 8 + 1, n8 * 4, n6 * 8);
                break;
            }
            default: {
                aqu_2.a(this.b, n7 * 8, n8 * 4, n6 * 8);
            }
        }
    }

    protected void a(World world, HF hF, int n, int n2, int n3, int n4, int n5, int n6, IBlockState iBlockState) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (this.b(world, j, i, k, hF) != m) continue;
                    this.b(world, iBlockState, j, i, k, hF);
                }
            }
        }
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
    }

    static {
        e = BlocksInvoker.a(Blocks.aD, gs_0.Q);
        i = BlocksInvoker.a(Blocks.aD, gs_0.P);
        h = BlocksInvoker.a(Blocks.aD, gs_0.R);
        d = i;
        l = BlocksInvoker.t(Blocks.b6);
        m = aBF.a(Blocks.water);
        n = zg_0.a(2, 0, 0);
        g = zg_0.a(2, 2, 0);
        k = zg_0.a(0, 1, 0);
        f = zg_0.a(4, 1, 0);
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
    }

    protected void a(World world, HF hF, int n, int n2, int n3, int n4, int n5, int n6, boolean bl) {
        for (int i = n2; i <= n5; ++i) {
            for (int j = n; j <= n4; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(this.b(world, j, i, k, hF))) == Material.air) continue;
                    if (this.a(i) >= aV8.c(world)) {
                        this.b(world, BlocksInvoker.t(Blocks.air), j, i, k, hF);
                        continue;
                    }
                    this.b(world, m, j, i, k, hF);
                }
            }
        }
    }

    protected boolean a(HF hF, int n, int n2, int n3, int n4) {
        int n5 = this.b(n, n2);
        int n6 = this.a(n, n2);
        int n7 = this.b(n3, n4);
        int n8 = this.a(n3, n4);
        return aqu_2.a(hF, MathInvoker.b(n5, n7), MathInvoker.b(n6, n8), MathInvoker.max(n5, n7), MathInvoker.max(n6, n8));
    }

    public zg_0(EnumFacing enumFacing, HF hF) {
        super(1);
        this.c = enumFacing;
        this.b = hF;
    }

    protected static int a(int n, int n2, int n3) {
        return n2 * 25 + n3 * 5 + n;
    }

    public zg_0(int n) {
        super(n);
    }

    public zg_0() {
        super(0);
    }
}

