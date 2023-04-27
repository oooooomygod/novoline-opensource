/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import com.google.common.base.Predicate;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;

/*
 * Renamed from net.gV
 */
public class gv_1
extends gj_1 {
    private static Predicate<IBlockState> T = new yz_2();
    private ov_0 U;
    private ov_0 Q;
    private ov_0 S;
    private ov_0 R;

    public boolean a(World world, BlockPos blockPos) {
        return av_2.a(this.c(), world, blockPos) != null || av_2.a(this.a(), world, blockPos) != null;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(n)));
    }

    protected ov_0 a() {
        if (this.Q == null) {
            this.Q = gb_0.a(gb_0.a(gb_0.a(gb_0.a(gb_0.a(), new String[]{ot_0.i, ot_0.k, ot_0.b}), '#', at_0.a(E6.a(Blocks.co))), '~', at_0.a(E6.a(Blocks.air))));
        }
        return this.Q;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    protected gv_1() {
        super(Material.h, MapColor.J);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object) EnumFacing.NORTH)));
        this.a(true);
        this.a(CreativeTabs.m);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    private void b(World world, BlockPos blockPos) {
        x__0 x__02 = av_2.a(this.b(), world, blockPos);
        if (x__02 != null) {
            Object object;
            for (int i = 0; i < av_2.a(this.b()); ++i) {
                object = a2n_0.a(x__02, 0, i, 0);
                aV8.a(world, at_0.c((auo_0)object), Blocks.air.m(), 2);
            }
            nq_2 nq_22 = new nq_2(world);
            object = at_0.c(a2n_0.a(x__02, 0, 2, 0));
            yh_2.a(nq_22, (double)amv_2.j((BlockPos)object) + 0.5, (double)amv_2.h((BlockPos)object) + 0.05, (double)amv_2.i((BlockPos)object) + 0.5, 0.0f, 0.0f);
            aV8.b(world, nq_22);
            int n = 0;
            while (true) {
                aV8.a(world, B7.SNOW_SHOVEL, (double)amv_2.j((BlockPos)object) + a5_0.c(world.o), (double)amv_2.h((BlockPos)object) + a5_0.c(world.o) * 2.5, (double)amv_2.i((BlockPos)object) + a5_0.c(world.o), 0.0, 0.0, 0.0, new int[0]);
                ++n;
            }
        }
        x__02 = av_2.a(this.d(), world, blockPos);
        if (x__02 != null) {
            for (int i = 0; i < av_2.b(this.d()); ++i) {
                for (int j = 0; j < av_2.a(this.d()); ++j) {
                    aV8.a(world, at_0.c(a2n_0.a(x__02, i, j, 0)), Blocks.air.m(), 2);
                }
            }
            BlockPos blockPos2 = at_0.c(a2n_0.a(x__02, 1, 2, 0));
            nf_2 nf_22 = new nf_2(world);
            avp_0.a(nf_22, true);
            avp_0.a(nf_22, (double)amv_2.j(blockPos2) + 0.5, (double)amv_2.h(blockPos2) + 0.05, (double)amv_2.i(blockPos2) + 0.5, 0.0f, 0.0f);
            aV8.b(world, nf_22);
            int n = 0;
            while (true) {
                aV8.a(world, B7.SNOWBALL, (double)amv_2.j(blockPos2) + a5_0.c(world.o), (double)amv_2.h(blockPos2) + a5_0.c(world.o) * 3.9, (double)amv_2.i(blockPos2) + a5_0.c(world.o), 0.0, 0.0, 0.0, new int[0]);
                ++n;
            }
        }
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase))));
    }

    protected ov_0 d() {
        if (this.S == null) {
            this.S = gb_0.a(gb_0.a(gb_0.a(gb_0.a(gb_0.a(gb_0.a(), new String[]{ot_0.a, ot_0.c, ot_0.d}), '^', at_0.a(T)), '#', at_0.a(E6.a(Blocks.co))), '~', at_0.a(E6.a(Blocks.air))));
        }
        return this.S;
    }

    protected ov_0 b() {
        if (this.U == null) {
            this.U = gb_0.a(gb_0.a(gb_0.a(gb_0.a(gb_0.a(), new String[]{ot_0.g, ot_0.h, ot_0.l}), '^', at_0.a(T)), '#', at_0.a(E6.a(Blocks.bq))));
        }
        return this.U;
    }

    protected ov_0 c() {
        if (this.R == null) {
            this.R = gb_0.a(gb_0.a(gb_0.a(gb_0.a(), new String[]{ot_0.f, ot_0.j, ot_0.e}), '#', at_0.a(E6.a(Blocks.bq))));
        }
        return this.R;
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return akm_1.e(BlockStateInvoker.getBlock((IBlockState)aV8.q((World)world, (BlockPos)blockPos)).o) && aV8.a((IBlockAccess)world, amv_2.g(blockPos));
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.c(world, blockPos, iBlockState);
        this.b(world, blockPos);
    }
}

