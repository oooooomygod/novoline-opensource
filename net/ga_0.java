/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityLivingBase;
import deobf.IBlockAccess;
import java.util.Iterator;

import net.CreativeTabs;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ga
 */
public class ga_0
extends Block {
    public static jw_0 P = au_2.a(vt_1.a, cs_1.HORIZONTAL);

    protected ga_0() {
        super(Material.I);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)));
        this.a(CreativeTabs.l);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == this) {
            switch ((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P))) {
                case NORTH: {
                    this.a(0.0f, 0.0f, 0.875f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                case SOUTH: {
                    this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.125f);
                    break;
                }
                case WEST: {
                    this.a(0.875f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                    break;
                }
                default: {
                    this.a(0.0f, 0.0f, 0.0f, 0.125f, 1.0f, 1.0f);
                }
            }
        }
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    protected boolean b(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, SJ.b(enumFacing)))).D();
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
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
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        return super.b(world, blockPos, iBlockState);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public rm_2 f(World world, BlockPos blockPos) {
        this.a((IBlockAccess)world, blockPos);
        return super.f(world, blockPos);
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        return BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos))).D() || BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos))).D() || BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos))).D() || BlockStateInvoker.getBlock(aV8.q(world, amv_2.b(blockPos))).D();
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P));
        if (!this.b(world, blockPos, enumFacing)) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
        }
        super.a(world, blockPos, iBlockState, block);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        if (eh_0.b(SJ.h(enumFacing)) && this.b(world, blockPos, enumFacing)) {
            return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing));
        }
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            if (!this.b(world, blockPos, (EnumFacing)object)) continue;
            return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)((EnumFacing)object)));
        }
        return this.m();
    }
}

