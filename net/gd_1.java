/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityLivingBase;
import java.util.Random;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.gD
 */
public class gd_1
extends Block {
    private Block Q;
    public static JC<zq_1> P = xu_0.a(acr_0.a, zq_1.class);

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(this.Q);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(this.Q);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    public gd_1(Material material, MapColor mapColor, Block block) {
        super(material, mapColor);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)zq_1.ALL_OUTSIDE)));
        this.Q = block;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return aar_0.a((zq_1)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return this.m();
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)aar_0.a(n)));
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        switch (ahs_1.a[((zq_1)((Object)BlockStateInvoker.b(iBlockState, P))).ordinal()]) {
            case 1: {
                return MapColor.M;
            }
            case 2: {
                return MapColor.z;
            }
            case 3: {
                return MapColor.z;
            }
        }
        return super.g(iBlockState);
    }

    @Override
    public int a(Random random) {
        return MathInvoker.max(0, a5_0.a(random, 10) - 7);
    }
}

