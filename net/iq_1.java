/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.iq
 */
public class iq_1
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        if (!aV8.k(world, blockPos)) {
            return false;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))) != Blocks.bu) {
            return false;
        }
        aV8.a(world, blockPos, BlocksInvoker.t(Blocks.bs), 2);
        int n = 0;
        while (true) {
            BlockPos blockPos2;
            if (BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = amv_2.a(blockPos, a5_0.a(random, 8) - a5_0.a(random, 8), -a5_0.a(random, 12), a5_0.a(random, 8) - a5_0.a(random, 8))))) == Material.air) {
                int n2 = 0;
                for (EnumFacing enumFacing : EnumFacing.values()) {
                    if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos2, enumFacing))) != Blocks.bs) continue;
                    ++n2;
                }
            }
            ++n;
        }
    }
}

