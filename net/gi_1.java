/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import java.util.List;
import java.util.Random;

import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.gI
 */
public class gi_1
extends Block {
    public static J_ P;
    public static jw_0 Q;

    public gi_1() {
        super(Material.y, MapColor.N);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)EnumFacing.NORTH)), P, Boolean.FALSE));
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return auk_2.a((Boolean)BlockStateInvoker.b(aV8.q(world, blockPos), P)) ? 15 : 0;
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase)))), P, Boolean.FALSE);
    }

    @Override
    protected a42 s() {
        return new a42(this, Q, P);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        if (auk_2.a((Boolean)BlockStateInvoker.b(aV8.q(world, blockPos), P))) {
            this.a(0.3125f, 0.8125f, 0.3125f, 0.6875f, 1.0f, 0.6875f);
            super.a(world, blockPos, iBlockState, rm_22, list, entity);
        }
        this.o();
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(BlockStateInvoker.a(this.m(), P, auk_2.b((n & 4) != 0)), Q, (Comparable)((Object)SJ.b(n & 3)));
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= SJ.j((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)));
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 4;
        }
        return n;
    }

    @Override
    public void o() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.8125f, 1.0f);
    }

    static {
        Q = au_2.a(azl_2.b, cs_1.HORIZONTAL);
        P = aWq.a(azl_2.a);
    }
}

