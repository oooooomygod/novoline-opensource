/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iz
 */
public class iz_2
extends i7_0 {
    private boolean c;
    private Block b;

    public iz_2(Block block, boolean bl) {
        this.b = block;
        this.c = bl;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        void var5_5;
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))) != Blocks.bu) {
            return false;
        }
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) != Material.air && BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != Blocks.bu) {
            return false;
        }
        int n = 0;
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos))) == Blocks.bu) {
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos))) == Blocks.bu) {
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos))) == Blocks.bu) {
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.b(blockPos))) == Blocks.bu) {
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))) == Blocks.bu) {
            ++n;
        }
        if (aV8.k(world, amv_2.d(blockPos))) {
            ++var5_5;
        }
        if (aV8.k(world, amv_2.f(blockPos))) {
            ++var5_5;
        }
        if (aV8.k(world, amv_2.a(blockPos))) {
            ++var5_5;
        }
        if (aV8.k(world, amv_2.b(blockPos))) {
            ++var5_5;
        }
        if (aV8.k(world, amv_2.g(blockPos))) {
            ++var5_5;
        }
        if (!this.c) {
            // empty if block
        }
        return true;
    }
}

