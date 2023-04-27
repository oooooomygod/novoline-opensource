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
 * Renamed from net.i0
 */
public class i0_0
extends i7_0 {
    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        while (amv_2.h(blockPos) < 128) {
            if (aV8.k(world, blockPos)) {
                for (EnumFacing enumFacing : abw_2.a(cs_1.HORIZONTAL)) {
                    if (!BlocksInvoker.a(Blocks.as, world, blockPos, enumFacing)) continue;
                    IBlockState iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlocksInvoker.t(Blocks.as), ha_2.T, auk_2.b(enumFacing == EnumFacing.NORTH)), ha_2.Q, auk_2.b(enumFacing == EnumFacing.EAST)), ha_2.P, auk_2.b(enumFacing == EnumFacing.SOUTH)), ha_2.R, auk_2.b(enumFacing == EnumFacing.WEST));
                    aV8.a(world, blockPos, iBlockState, 2);
                    break;
                }
            } else {
                blockPos = amv_2.a(blockPos, a5_0.a(random, 4) - a5_0.a(random, 4), 0, a5_0.a(random, 4) - a5_0.a(random, 4));
            }
            blockPos = amv_2.e(blockPos);
        }
        return true;
    }
}

