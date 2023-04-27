/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.gl
 */
public class gl_2
extends fj_1 {
    public static js_0 P = a7X.a(av2_0.a, 0, 15);

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    public gl_2() {
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))).w())) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
        super.a(world, blockPos, iBlockState, block);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }
}

