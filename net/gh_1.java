/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.gH
 */
public class gh_1
extends g9_0 {
    public static JC<az_1> Q = xu_0.a(l3.a, az_1.class);

    @Override
    public int d(IBlockState iBlockState) {
        return amm_1.a((az_1)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)amm_1.a(n)));
    }

    @Override
    protected a42 s() {
        return new a42(this, Q);
    }

    @Override
    public a4_0<az_1> a() {
        return Q;
    }

    @Override
    protected void b(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (block.b() && new aft_0(this, world, blockPos, iBlockState).b() == 3) {
            this.a(world, blockPos, iBlockState, false);
        }
    }

    protected gh_1() {
        super(false);
        this.f(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)az_1.NORTH_SOUTH)));
    }
}

