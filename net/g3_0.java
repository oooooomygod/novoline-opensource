/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import java.util.Random;

/*
 * Renamed from net.g3
 */
public class g3_0
extends gr_2 {
    public static J_ R = aWq.a(agx_0.c);
    public static js_0 S = a7X.a(agx_0.a, 1, 4);

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!aSY.g(entityPlayer.abilities)) {
            return false;
        }
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, S), 3);
        return true;
    }

    @Override
    protected boolean c(Block block) {
        return g3_0.a(block);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
        return n |= P8.b((Integer)BlockStateInvoker.b(iBlockState, S)) - 1 << 2;
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState) {
        return this.b(iBlockAccess, blockPos, iBlockState) > 0;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.a(world, blockPos, iBlockState);
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.a(iBlockState, R, auk_2.b(this.c(iBlockAccess, blockPos, iBlockState)));
    }

    @Override
    protected a42 s() {
        return new a42(this, P, S, R);
    }

    @Override
    protected IBlockState c(IBlockState iBlockState) {
        Integer n = (Integer)BlockStateInvoker.b(iBlockState, S);
        Boolean bl = (Boolean)BlockStateInvoker.b(iBlockState, R);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(Blocks.ci.m(), P, (Comparable)((Object)enumFacing)), S, n), R, bl);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.repeater;
    }

    @Override
    protected int f(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, S)) * 2;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.repeater;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(n))), R, Boolean.FALSE), S, P8.d(1 + (n >> 2)));
    }

    @Override
    protected IBlockState b(IBlockState iBlockState) {
        Integer n = (Integer)BlockStateInvoker.b(iBlockState, S);
        Boolean bl = (Boolean)BlockStateInvoker.b(iBlockState, R);
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(Blocks.aP.m(), P, (Comparable)((Object)enumFacing)), S, n), R, bl);
    }

    protected g3_0(boolean bl) {
        super(bl);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)), S, P8.d(1)), R, Boolean.FALSE));
    }

    @Override
    public String C() {
        return ahq_0.b(agx_0.b);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (this.Q) {
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
            double d = (double)((float)amv_2.j(blockPos) + 0.5f) + (double)(a5_0.e(random) - 0.5f) * 0.2;
            double d2 = (double)((float)amv_2.h(blockPos) + 0.4f) + (double)(a5_0.e(random) - 0.5f) * 0.2;
            double d3 = (double)((float)amv_2.i(blockPos) + 0.5f) + (double)(a5_0.e(random) - 0.5f) * 0.2;
            float f = -5.0f;
            if (a5_0.a(random)) {
                f = P8.b((Integer)BlockStateInvoker.b(iBlockState, S)) * 2 - 1;
            }
            double d4 = (f /= 16.0f) * (float)SJ.k(enumFacing);
            double d5 = f * (float)SJ.a(enumFacing);
            aV8.a(world, B7.REDSTONE, d + d4, d2, d3 + d5, 0.0, 0.0, 0.0, new int[0]);
        }
    }
}

