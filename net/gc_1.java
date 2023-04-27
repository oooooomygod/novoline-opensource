/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.Random;

/*
 * Renamed from net.gC
 */
public class gc_1
extends Block {
    private boolean P;

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        return new ItemStack(Blocks.M);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            if (this.P && !aV8.B(world, blockPos)) {
                aV8.a(world, blockPos, (Block)this, 4);
            } else if (!this.P && aV8.B(world, blockPos)) {
                aV8.a(world, blockPos, Blocks.f.m(), 2);
            }
        }
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.M);
    }

    public gc_1(boolean bl) {
        super(Material.B);
        this.P = bl;
        this.c(1.0f);
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.M);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            if (this.P && !aV8.B(world, blockPos)) {
                aV8.a(world, blockPos, Blocks.M.m(), 2);
            } else if (!this.P && aV8.B(world, blockPos)) {
                aV8.a(world, blockPos, Blocks.f.m(), 2);
            }
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote && this.P && !aV8.B(world, blockPos)) {
            aV8.a(world, blockPos, Blocks.M.m(), 2);
        }
    }
}

