/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.IBlockAccess;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.gy
 */
public class gy_2
extends fj_1 {
    public static jw_0 P = au_2.a(mb_0.a, cs_1.HORIZONTAL);

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        if (!akm_1.i(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, SJ.b(enumFacing)))).w())) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
        super.a(world, blockPos, iBlockState, block);
    }

    @Override
    public IBlockState c(int n) {
        EnumFacing enumFacing = SJ.a(n);
        if (SJ.h(enumFacing) == kl_1.Y) {
            enumFacing = EnumFacing.NORTH;
        }
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing));
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        switch (af1_0.a[enumFacing.ordinal()]) {
            case 1: {
                this.a(0.0f, 0.28125f, 0.875f, 1.0f, 0.78125f, 1.0f);
                break;
            }
            case 2: {
                this.a(0.0f, 0.28125f, 0.0f, 1.0f, 0.78125f, 0.125f);
                break;
            }
            case 3: {
                this.a(0.875f, 0.28125f, 0.0f, 1.0f, 0.78125f, 1.0f);
                break;
            }
            case 4: {
                this.a(0.0f, 0.28125f, 0.0f, 0.125f, 0.78125f, 1.0f);
            }
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    public gy_2() {
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)));
    }
}

