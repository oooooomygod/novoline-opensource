/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.ia
 */
public class ia_1
extends id_1 {
    private IBlockState i;
    private IBlockState h;

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        Block block;
        while ((BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, blockPos))) == Material.air || BlocksInvoker.getBlockState(block) == Material.z) && amv_2.h(blockPos) > 0) {
            blockPos = amv_2.g(blockPos);
        }
        Block block2 = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (block2 == Blocks.dirt || block2 == Blocks.grass) {
            blockPos = amv_2.e(blockPos);
            this.a(world, blockPos, this.h);
            for (int i = amv_2.h(blockPos); i <= amv_2.h(blockPos) + 2; ++i) {
                int n = i - amv_2.h(blockPos);
                int n2 = 2 - n;
                for (int j = amv_2.j(blockPos) - n2; j <= amv_2.j(blockPos) + n2; ++j) {
                    int n3 = j - amv_2.j(blockPos);
                    for (int k = amv_2.i(blockPos) - n2; k <= amv_2.i(blockPos) + n2; ++k) {
                        BlockPos blockPos2;
                        int n4 = k - amv_2.i(blockPos);
                        if (MathInvoker.a(n3) == n2 && MathInvoker.a(n4) == n2 && a5_0.a(random, 2) == 0 || BlocksInvoker.g(BlockStateInvoker.getBlock(aV8.q(world, blockPos2 = new BlockPos(j, i, k))))) continue;
                        this.a(world, blockPos2, this.i);
                    }
                }
            }
        }
        return true;
    }

    public ia_1(IBlockState iBlockState, IBlockState iBlockState2) {
        super(false);
        this.h = iBlockState;
        this.i = iBlockState2;
    }
}

