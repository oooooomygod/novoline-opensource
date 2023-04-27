/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.*;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


public class BlockDynamicLiquid
extends BlockLiquid {
    int Q;

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P));
        int n2 = 1;
        if (this.o == Material.e && !qq_2.i(world.d)) {
            n2 = 2;
        }
        int n3 = this.a(world);
        int n4 = -100;
        this.Q = 0;
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            Object object = dz_0.b(iterator);
            n4 = this.a(world, amv_2.a(blockPos, (EnumFacing)object), n4);
        }
        int n5 = n4 + n2;
        n5 = -1;
        if (this.a((IBlockAccess)world, amv_2.e(blockPos)) >= 0) {
            int n6 = this.a((IBlockAccess)world, amv_2.e(blockPos));
            n5 = n6 >= 8 ? n6 : n6 + 8;
        }
        if (this.Q >= 2 && this.o == Material.M) {
            IBlockState iBlockState2 = aV8.q(world, amv_2.g(blockPos));
            if (akm_1.i(BlockStateInvoker.getBlock(iBlockState2).w())) {
                n5 = 0;
            } else if (BlockStateInvoker.getBlock(iBlockState2).w() == this.o && P8.b((Integer)BlockStateInvoker.b(iBlockState2, P)) == 0) {
                n5 = 0;
            }
        }
        if (this.o == Material.e && n < 8 && n5 > n && a5_0.a(random, 4) != 0) {
            n3 *= 4;
        }
        if (n5 == n) {
            this.e(world, blockPos, iBlockState);
        } else {
            n = n5;
            aV8.j(world, blockPos);
        }
        IBlockState iBlockState3 = aV8.q(world, amv_2.g(blockPos));
        if (this.c(world, amv_2.g(blockPos), iBlockState3)) {
            if (this.o == Material.e && BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))).w() == Material.M) {
                aV8.a(world, amv_2.g(blockPos), Blocks.stone.m());
                this.a(world, amv_2.g(blockPos));
                return;
            }
            this.b(world, amv_2.g(blockPos), iBlockState3, n + 8);
        } else if (this.b(world, amv_2.g(blockPos), iBlockState3)) {
            Set<EnumFacing> set = this.a(world, blockPos);
            int n7 = n + n2;
            Iterator iterator2 = aS0.f(set);
            while (dz_0.c(iterator2)) {
                EnumFacing enumFacing = (EnumFacing)dz_0.b(iterator2);
                this.b(world, amv_2.a(blockPos, enumFacing), aV8.q(world, amv_2.a(blockPos, enumFacing)), n7);
            }
        }
    }

    protected int a(World world, BlockPos blockPos, int n) {
        this.a((IBlockAccess)world, blockPos);
        return n;
    }

    private boolean c(World world, BlockPos blockPos, IBlockState iBlockState) {
        Material material = BlockStateInvoker.getBlock(iBlockState).w();
        return material != this.o && material != Material.e && !this.b(world, blockPos, iBlockState);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.a(world, blockPos, iBlockState)) {
            aV8.a(world, blockPos, (Block)this, this.a(world));
        }
    }

    private void e(World world, BlockPos blockPos, IBlockState iBlockState) {
        aV8.a(world, blockPos, BlockStateInvoker.a(BlockDynamicLiquid.a(this.o).m(), P, BlockStateInvoker.b(iBlockState, P)), 2);
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState, int n) {
        if (this.c(world, blockPos, iBlockState)) {
            if (BlockStateInvoker.getBlock(iBlockState) != Blocks.air) {
                if (this.o == Material.e) {
                    this.a(world, blockPos);
                } else {
                    BlockStateInvoker.getBlock(iBlockState).a(world, blockPos, iBlockState, 0);
                }
            }
            aV8.a(world, blockPos, BlockStateInvoker.a(this.m(), P, P8.d(n)), 3);
        }
    }

    protected BlockDynamicLiquid(Material material) {
        super(material);
    }

    private boolean b(World world, BlockPos blockPos, IBlockState iBlockState) {
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        return block instanceof g7_0 || block == Blocks.bp || block == Blocks.bm || block == Blocks.P || block.o == Material.m || akm_1.d(block.o);
    }

    private Set<EnumFacing> a(World world, BlockPos blockPos) {
        int n = 1000;
        EnumSet enumSet = ace_2.b(EnumFacing.class);
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            IBlockState iBlockState;
            Object object = dz_0.b(iterator);
            BlockPos blockPos2 = amv_2.a(blockPos, (EnumFacing)object);
            if (this.b(world, blockPos2, iBlockState = aV8.q(world, blockPos2)) || BlockStateInvoker.getBlock(iBlockState).w() == this.o && P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) <= 0) continue;
            int n2 = this.b(world, amv_2.g(blockPos2), aV8.q(world, amv_2.g(blockPos2))) ? this.a(world, blockPos2, 1, SJ.b((EnumFacing)object)) : 0;
            aS0.e(enumSet);
            aS0.b((Set)enumSet, (EnumFacing)object);
            n = n2;
        }
        return enumSet;
    }

    private int a(World world, BlockPos blockPos, int n, EnumFacing enumFacing) {
        int n2 = 1000;
        Iterator iterator = abw_2.b(cs_1.HORIZONTAL);
        while (dz_0.c(iterator)) {
            int n3;
            IBlockState iBlockState;
            BlockPos blockPos2;
            Object object = dz_0.b(iterator);
            if (object == enumFacing || this.b(world, blockPos2 = amv_2.a(blockPos, (EnumFacing)object), iBlockState = aV8.q(world, blockPos2)) || BlockStateInvoker.getBlock(iBlockState).w() == this.o && P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) <= 0) continue;
            if (!this.b(world, amv_2.g(blockPos2), iBlockState)) {
                return n;
            }
            if (n >= 4 || (n3 = this.a(world, blockPos2, n + 1, SJ.b((EnumFacing)object))) >= n2) continue;
            n2 = n3;
        }
        return n2;
    }
}

