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
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.Zd
 */
abstract class zd_0
extends Y_ {
    private int e;
    private boolean d;
    protected int f = -1;

    public zd_0() {
    }

    protected void a(World world, HF hF, int n, int n2, int n3, int n4) {
        if (this.e < n4) {
            int n5;
            int n6;
            int n7;
            for (int i = this.e; i < n4 && aqu_2.a(hF, new BlockPos(n7 = this.b(n + i, n3), n6 = this.a(n2), n5 = this.a(n + i, n3))); ++i) {
                ++this.e;
                nz_0 nz_02 = new nz_0(world);
                ayh_1.a(nz_02, (double)n7 + 0.5, n6, (double)n5 + 0.5, 0.0f, 0.0f);
                ayh_1.a(nz_02, aV8.b(world, new BlockPos(nz_02)), null);
                ayh_1.b(nz_02, this.c(i, ayh_1.m(nz_02)));
                aV8.b(world, nz_02);
            }
        }
    }

    @Override
    protected void b(NBTTagCompound nBTTagCompound) {
        this.f = tn_0.g(nBTTagCompound, aA0.f);
        this.e = tn_0.g(nBTTagCompound, aA0.b);
        this.d = tn_0.c(nBTTagCompound, aA0.a);
    }

    protected static boolean a(HF hF) {
        return hF.c > 10;
    }

    protected Y_ a(zw_0 zw_02, List<Y_> list, Random random, int n, int n2) {
        if (this.c != null) {
            switch (aaj_1.a[this.c.ordinal()]) {
                case 1: {
                    return aAU.a(zw_02, list, random, this.b.d + 1, this.b.c + n, this.b.b + n2, EnumFacing.EAST, this.a());
                }
                case 2: {
                    return aAU.a(zw_02, list, random, this.b.d + 1, this.b.c + n, this.b.b + n2, EnumFacing.EAST, this.a());
                }
                case 3: {
                    return aAU.a(zw_02, list, random, this.b.f + n2, this.b.c + n, this.b.e + 1, EnumFacing.SOUTH, this.a());
                }
                case 4: {
                    return aAU.a(zw_02, list, random, this.b.f + n2, this.b.c + n, this.b.e + 1, EnumFacing.SOUTH, this.a());
                }
            }
        }
        return null;
    }

    protected IBlockState a(IBlockState iBlockState) {
        if (this.d) {
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.b2 || BlockStateInvoker.getBlock(iBlockState) == Blocks.bO) {
                return BlocksInvoker.t(Blocks.bG);
            }
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.cobblestone) {
                return BlocksInvoker.a(Blocks.bG, le_1.a(aeo_1.DEFAULT));
            }
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.planks) {
                return BlocksInvoker.a(Blocks.bG, le_1.a(aeo_1.SMOOTH));
            }
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.a7) {
                return BlockStateInvoker.a(BlocksInvoker.t(Blocks.aO), hn_2.R, BlockStateInvoker.b(iBlockState, hn_2.R));
            }
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.U) {
                return BlockStateInvoker.a(BlocksInvoker.t(Blocks.aO), hn_2.R, BlockStateInvoker.b(iBlockState, hn_2.R));
            }
            if (BlockStateInvoker.getBlock(iBlockState) == Blocks.gravel) {
                return BlocksInvoker.t(Blocks.bG);
            }
        }
        return iBlockState;
    }

    @Override
    protected void a(NBTTagCompound nBTTagCompound) {
        tn_0.b(nBTTagCompound, aA0.c, this.f);
        tn_0.b(nBTTagCompound, aA0.d, this.e);
        tn_0.a(nBTTagCompound, aA0.e, this.d);
    }

    /*
     * WARNING - void declaration
     */
    protected int a(World world, HF hF) {
        int n = 0;
        z6_0 z6_02 = new z6_0();
        for (int i = this.b.b; i <= this.b.e; ++i) {
            for (int j = this.b.f; j <= this.b.d; ++j) {
                void var4_6;
                ain_1.a(z6_02, j, 64, i);
                if (!aqu_2.a(hF, z6_02)) continue;
                n += MathInvoker.max(amv_2.h(aV8.a(world, (BlockPos)z6_02)), qq_2.m(world.d));
                ++var4_6;
            }
        }
        return -1;
    }

    protected void a(boolean bl) {
        this.d = bl;
    }

    protected Y_ b(zw_0 zw_02, List<Y_> list, Random random, int n, int n2) {
        if (this.c != null) {
            switch (aaj_1.a[this.c.ordinal()]) {
                case 1: {
                    return aAU.a(zw_02, list, random, this.b.f - 1, this.b.c + n, this.b.b + n2, EnumFacing.WEST, this.a());
                }
                case 2: {
                    return aAU.a(zw_02, list, random, this.b.f - 1, this.b.c + n, this.b.b + n2, EnumFacing.WEST, this.a());
                }
                case 3: {
                    return aAU.a(zw_02, list, random, this.b.f + n2, this.b.c + n, this.b.b - 1, EnumFacing.NORTH, this.a());
                }
                case 4: {
                    return aAU.a(zw_02, list, random, this.b.f + n2, this.b.c + n, this.b.b - 1, EnumFacing.NORTH, this.a());
                }
            }
        }
        return null;
    }

    @Override
    protected void a(World world, HF hF, int n, int n2, int n3, int n4, int n5, int n6, IBlockState iBlockState, IBlockState iBlockState2, boolean bl) {
        IBlockState iBlockState3 = this.a(iBlockState);
        IBlockState iBlockState4 = this.a(iBlockState2);
        super.a(world, hF, n, n2, n3, n4, n5, n6, iBlockState3, iBlockState4, bl);
    }

    @Override
    protected void b(World world, IBlockState iBlockState, int n, int n2, int n3, HF hF) {
        IBlockState iBlockState2 = this.a(iBlockState);
        super.b(world, iBlockState2, n, n2, n3, hF);
    }

    protected zd_0(zw_0 zw_02, int n) {
        super(n);
        this.d = zw_02.m;
    }

    @Override
    protected void a(World world, IBlockState iBlockState, int n, int n2, int n3, HF hF) {
        IBlockState iBlockState2 = this.a(iBlockState);
        super.a(world, iBlockState2, n, n2, n3, hF);
    }

    protected int c(int n, int n2) {
        return n2;
    }
}

