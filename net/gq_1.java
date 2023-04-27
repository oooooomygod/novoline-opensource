/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.BlockPos;

import java.util.Random;

/*
 * Renamed from net.gQ
 */
public class gq_1
extends Block {
    @Override
    public void a(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        this.b(world, blockPos);
    }

    @Override
    public int a(World world) {
        return 5;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        this.a(world, blockPos);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        this.b(world, blockPos);
        return true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        aV8.a(world, blockPos, (Block)this, this.a(world));
    }

    private void a(World world, BlockPos blockPos) {
        if (kc_0.a(world, amv_2.g(blockPos)) && amv_2.h(blockPos) >= 0) {
            if (!BlockFalling.P && aV8.b(world, amv_2.a(blockPos, -32, -32, -32), amv_2.a(blockPos, 32, 32, 32))) {
                aV8.b(world, new oq_1(world, (float)amv_2.j(blockPos) + 0.5f, amv_2.h(blockPos), (float)amv_2.i(blockPos) + 0.5f, this.m()));
            } else {
                aV8.j(world, blockPos);
                BlockPos blockPos2 = blockPos;
                while (kc_0.a(world, blockPos2) && amv_2.h(blockPos2) > 0) {
                    blockPos2 = amv_2.g(blockPos2);
                }
                if (amv_2.h(blockPos2) > 0) {
                    aV8.a(world, blockPos2, this.m(), 2);
                }
            }
        }
    }

    public gq_1() {
        super(Material.i, MapColor.o);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 1.0f, 0.9375f);
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return true;
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return null;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        aV8.a(world, blockPos, (Block)this, this.a(world));
    }

    @Override
    public boolean f() {
        return false;
    }

    private void b(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == this) {
            int n = 0;
            while (true) {
                BlockPos blockPos2 = amv_2.a(blockPos, a5_0.a(world.o, 16) - a5_0.a(world.o, 16), a5_0.a(world.o, 8) - a5_0.a(world.o, 8), a5_0.a(world.o, 16) - a5_0.a(world.o, 16));
                if (BlockStateInvoker.getBlock((IBlockState)aV8.q((World)world, (BlockPos)blockPos2)).o == Material.air) {
                    if (world.isRemote) {
                        int n2 = 0;
                        while (true) {
                            double d = a5_0.c(world.o);
                            float f = (a5_0.e(world.o) - 0.5f) * 0.2f;
                            float f2 = (a5_0.e(world.o) - 0.5f) * 0.2f;
                            float f3 = (a5_0.e(world.o) - 0.5f) * 0.2f;
                            double d2 = (double)amv_2.j(blockPos2) + (double)(amv_2.j(blockPos) - amv_2.j(blockPos2)) * d + (a5_0.c(world.o) - 0.5) * 1.0 + 0.5;
                            double d3 = (double)amv_2.h(blockPos2) + (double)(amv_2.h(blockPos) - amv_2.h(blockPos2)) * d + a5_0.c(world.o) * 1.0 - 0.5;
                            double d4 = (double)amv_2.i(blockPos2) + (double)(amv_2.i(blockPos) - amv_2.i(blockPos2)) * d + (a5_0.c(world.o) - 0.5) * 1.0 + 0.5;
                            aV8.a(world, B7.PORTAL, d2, d3, d4, f, f2, f3, new int[0]);
                            ++n2;
                        }
                    }
                    aV8.a(world, blockPos2, iBlockState, 2);
                    aV8.j(world, blockPos);
                    return;
                }
                ++n;
            }
        }
    }
}

