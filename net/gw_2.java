/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.gw
 */
public class gw_2
extends Block {
    private boolean P;

    @Override
    public int a(int n, Random random) {
        return this.a(random) + a5_0.a(random, n + 1);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        this.a(world, blockPos);
        return super.a(world, blockPos, iBlockState, entityPlayer, enumFacing, f, f2, f3);
    }

    @Override
    public void a(World world, BlockPos blockPos, Entity entity) {
        this.a(world, blockPos);
        super.a(world, blockPos, entity);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (this.P) {
            this.b(world, blockPos);
        }
    }

    @Override
    public int a(Random random) {
        return 4 + a5_0.a(random, 2);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
        super.a(world, blockPos, iBlockState, f, n);
        if (this.a(iBlockState, world.o, n) != px_0.a(this)) {
            int n2 = 1 + a5_0.a(world.o, 5);
            this.a(world, blockPos, n2);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        this.a(world, blockPos);
        super.a(world, blockPos, entityPlayer);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (this == Blocks.b4) {
            aV8.a(world, blockPos, Blocks.b5.m());
        }
    }

    public gw_2(boolean bl) {
        super(Material.y);
        this.a(true);
        this.P = bl;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.redstone;
    }

    private void b(World world, BlockPos blockPos) {
        Random random = world.o;
        int n = 0;
        while (true) {
            double d = (float)amv_2.j(blockPos) + a5_0.e(random);
            double d2 = (float)amv_2.h(blockPos) + a5_0.e(random);
            double d3 = (float)amv_2.i(blockPos) + a5_0.e(random);
            if (!BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).f()) {
                d2 = (double)amv_2.h(blockPos) + 0.0625 + 1.0;
            }
            if (d < (double)amv_2.j(blockPos) || d > (double)(amv_2.j(blockPos) + 1) || d2 < 0.0 || d2 > (double)(amv_2.h(blockPos) + 1) || d3 < (double)amv_2.i(blockPos) || d3 > (double)(amv_2.i(blockPos) + 1)) {
                aV8.a(world, B7.REDSTONE, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
            }
            ++n;
        }
    }

    private void a(World world, BlockPos blockPos) {
        this.b(world, blockPos);
        if (this == Blocks.b5) {
            aV8.a(world, blockPos, Blocks.b4.m());
        }
    }

    @Override
    public int a(World world) {
        return 30;
    }

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        return new ItemStack(Blocks.b5);
    }
}

