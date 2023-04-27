/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.LoadingCache
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import com.google.common.cache.LoadingCache;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.IBlockAccess;
import java.util.Random;

/*
 * Renamed from net.fQ
 */
public class fq_1
extends f3_0 {
    public static JC<kl_1> Q = xu_0.a(jx_2.b, kl_1.class, new kl_1[]{kl_1.X, kl_1.Z});

    @Override
    protected a42 s() {
        return new a42(this, Q);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        as__0 as__02;
        kl_1 kl_12 = (kl_1)((Object)BlockStateInvoker.b(iBlockState, Q));
        if (kl_12 == kl_1.X) {
            as__0 as__03 = new as__0(world, blockPos, kl_1.X);
            if (!xr_2.d(as__03) || as__0.e(as__03) < as__0.b(as__03) * as__0.a(as__03)) {
                aV8.a(world, blockPos, Blocks.air.m());
            }
        } else if (!(kl_12 != kl_1.Z || xr_2.d(as__02 = new as__0(world, blockPos, kl_1.Z)) && as__0.e(as__02) >= as__0.b(as__02) * as__0.a(as__02))) {
            aV8.a(world, blockPos, Blocks.air.m());
        }
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        kl_1 kl_12 = (kl_1)((Object)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), Q));
        float f = 0.125f;
        float f2 = 0.125f;
        if (kl_12 == kl_1.X) {
            f = 0.5f;
        }
        if (kl_12 == kl_1.Z) {
            f2 = 0.5f;
        }
        this.a(0.5f - f, 0.0f, 0.5f - f2, 0.5f + f, 1.0f, 0.5f + f2);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        if (entity.r == null && entity.h == null) {
            ayj_0.a(entity, blockPos);
        }
    }

    public boolean a(World world, BlockPos blockPos) {
        as__0 as__02 = new as__0(world, blockPos, kl_1.X);
        if (xr_2.d(as__02) && as__0.e(as__02) == 0) {
            xr_2.c(as__02);
            return true;
        }
        as__0 as__03 = new as__0(world, blockPos, kl_1.Z);
        if (xr_2.d(as__03) && as__0.e(as__03) == 0) {
            xr_2.c(as__03);
            return true;
        }
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        super.a(world, blockPos, iBlockState, random);
        if (qq_2.d(world.d) && J9.c(aV8.k(world), jx_2.a) && a5_0.a(random, 2000) < aYj.a(aV8.p(world))) {
            amv_2.h(blockPos);
            BlockPos blockPos2 = blockPos;
            while (!aV8.a((IBlockAccess)world, blockPos2) && amv_2.h(blockPos2) > 0) {
                blockPos2 = amv_2.g(blockPos2);
            }
            if (!BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos2))).D()) {
                Entity entity = amd_0.a(world, 57, (double)amv_2.j(blockPos2) + 0.5, (double)amv_2.h(blockPos2) + 1.1, (double)amv_2.i(blockPos2) + 0.5);
                entity.timeUntilPortal = ayj_0.H(entity);
            }
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)((n & 3) == 2 ? kl_1.Z : kl_1.X)));
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return null;
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (a5_0.a(random, 100) == 0) {
            aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, jx_2.c, 0.5f, a5_0.e(random) * 0.4f + 0.8f, false);
        }
        int n = 0;
        while (true) {
            double d = (float)amv_2.j(blockPos) + a5_0.e(random);
            double d2 = (float)amv_2.h(blockPos) + a5_0.e(random);
            double d3 = (float)amv_2.i(blockPos) + a5_0.e(random);
            double d4 = ((double)a5_0.e(random) - 0.5) * 0.5;
            double d5 = ((double)a5_0.e(random) - 0.5) * 0.5;
            double d6 = ((double)a5_0.e(random) - 0.5) * 0.5;
            int n2 = a5_0.a(random, 2) * 2 - 1;
            if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos))) != this && BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos))) != this) {
                d = (double)amv_2.j(blockPos) + 0.5 + 0.25 * (double)n2;
                d4 = a5_0.e(random) * 2.0f * (float)n2;
            } else {
                d3 = (double)amv_2.i(blockPos) + 0.5 + 0.25 * (double)n2;
                d6 = a5_0.e(random) * 2.0f * (float)n2;
            }
            aV8.a(world, B7.PORTAL, d, d2, d3, d4, d5, d6, new int[0]);
            ++n;
        }
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        kl_1 kl_12 = null;
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        if (BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)) == this) {
            kl_12 = (kl_1)((Object)BlockStateInvoker.b(iBlockState, Q));
            return false;
        }
        boolean bl = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.d(blockPos))) == this && BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.f(blockPos, 2))) != this;
        boolean bl2 = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.f(blockPos))) == this && BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.e(blockPos, 2))) != this;
        boolean bl3 = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos))) == this && BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.b(blockPos, 2))) != this;
        boolean bl4 = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.b(blockPos))) == this && BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos, 2))) != this;
        boolean bl5 = kl_12 == kl_1.X;
        boolean bl6 = kl_12 == kl_1.Z;
        return enumFacing == EnumFacing.WEST || enumFacing == EnumFacing.EAST || enumFacing == EnumFacing.NORTH || enumFacing == EnumFacing.SOUTH;
    }

    /*
     * WARNING - void declaration
     */
    public x__0 b(World world, BlockPos blockPos) {
        void var9_11;
        kl_1 kl_12 = kl_1.Z;
        as__0 as__02 = new as__0(world, blockPos, kl_1.X);
        LoadingCache loadingCache = av_2.a(world, true);
        if (!xr_2.d(as__02)) {
            kl_12 = kl_1.X;
            as__02 = new as__0(world, blockPos, kl_1.Z);
        }
        if (!xr_2.d(as__02)) {
            return new x__0(blockPos, EnumFacing.NORTH, EnumFacing.UP, (LoadingCache<BlockPos, auo_0>)loadingCache, 1, 1, 1);
        }
        int[] nArray = new int[asz_0.values().length];
        EnumFacing enumFacing = SJ.c(as__0.c(as__02));
        BlockPos blockPos2 = amv_2.c(as__0.d(as__02), xr_2.a(as__02) - 1);
        for (asz_0 asz_02 : asz_0.values()) {
            Object object = new x__0(SJ.e(enumFacing) == asz_02 ? blockPos2 : amv_2.a(blockPos2, as__0.c(as__02), xr_2.b(as__02) - 1), SJ.a(asz_02, kl_12), EnumFacing.UP, (LoadingCache<BlockPos, auo_0>)loadingCache, xr_2.b(as__02), xr_2.a(as__02), 1);
            for (int i = 0; i < xr_2.b(as__02); ++i) {
                for (int j = 0; j < xr_2.a(as__02); ++j) {
                    auo_0 auo_02 = a2n_0.a((x__0)object, i, j, 1);
                    if (at_0.a(auo_02) == null || BlockStateInvoker.getBlock(at_0.a(auo_02)).w() == Material.air) continue;
                    int n = asz_02.ordinal();
                    nArray[n] = nArray[n] + 1;
                }
            }
        }
        asz_0 asz_03 = asz_0.POSITIVE;
        for (Object object : asz_0.values()) {
            if (nArray[object.ordinal()] >= nArray[var9_11.ordinal()]) continue;
            Object object2 = object;
        }
        return new x__0(SJ.e(enumFacing) == var9_11 ? blockPos2 : amv_2.a(blockPos2, as__0.c(as__02), xr_2.b(as__02) - 1), SJ.a((asz_0)var9_11, kl_12), EnumFacing.UP, (LoadingCache<BlockPos, auo_0>)loadingCache, xr_2.b(as__02), xr_2.a(as__02), 1);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return fq_1.a((kl_1)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public a5w_0 K() {
        return a5w_0.TRANSLUCENT;
    }

    public fq_1() {
        super(Material.m, false);
        this.f(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)kl_1.X)));
        this.a(true);
    }

    public static int a(kl_1 kl_12) {
        return kl_12 == kl_1.X ? 1 : (kl_12 == kl_1.Z ? 2 : 0);
    }

    @Override
    public int a(Random random) {
        return 0;
    }
}

