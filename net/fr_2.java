/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.Entity;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.fr
 */
public class fr_2
extends fv_2 {
    public static js_0 P = a7X.a(asd_2.a, 0, 15);
    private int Q;

    protected fr_2(Material material, int n) {
        this(material, n, akm_1.j(material));
    }

    protected fr_2(Material material, int n, MapColor mapColor) {
        super(material, mapColor);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(0)));
        this.Q = n;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d(n));
    }

    @Override
    public int a(World world) {
        return 10;
    }

    @Override
    protected IBlockState a(IBlockState iBlockState, int n) {
        return BlockStateInvoker.a(iBlockState, P, P8.d(n));
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    protected int b(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
    }

    @Override
    protected int b(World world, BlockPos blockPos) {
        int n = MathInvoker.b(ListInvoker.size(aV8.a(world, Entity.class, this.a(blockPos))), this.Q);
        float f = (float)MathInvoker.b(this.Q, n) / (float)this.Q;
        return MathHelper.c(f * 15.0f);
    }
}

