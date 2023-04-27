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
 * Renamed from net.ii
 */
public class ii_2
extends i7_0 {
    private Block b;

    public ii_2(Block block) {
        this.b = block;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        void var5_5;
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))) != Blocks.stone) {
            return false;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))) != Blocks.stone) {
            return false;
        }
        if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos))) != Material.air && BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != Blocks.stone) {
            return false;
        }
        int n = 0;
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos))) == Blocks.stone) {
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos))) == Blocks.stone) {
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos))) == Blocks.stone) {
            ++n;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.b(blockPos))) == Blocks.stone) {
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
        return true;
    }
}

