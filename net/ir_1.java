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
 * Renamed from net.iR
 */
public class ir_1
extends i7_0 {
    private Block b;

    public ir_1() {
        super(false);
    }

    public ir_1(Block block) {
        super(true);
        this.b = block;
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        if (this.b == null) {
            this.b = a5_0.a(random) ? Blocks.aj : Blocks.Q;
        }
        int n = a5_0.a(random, 3) + 4;
        if (amv_2.h(blockPos) >= 1 && amv_2.h(blockPos) + n + 1 < 256) {
            for (int i = amv_2.h(blockPos); i <= amv_2.h(blockPos) + 1 + n; ++i) {
                int n2 = 3;
                if (i <= amv_2.h(blockPos) + 3) {
                    n2 = 0;
                }
                z6_0 z6_02 = new z6_0();
                for (int j = amv_2.j(blockPos) - n2; j <= amv_2.j(blockPos) + n2; ++j) {
                    for (int k = amv_2.i(blockPos) - n2; k <= amv_2.i(blockPos) + n2; ++k) {
                        Block block;
                        if (i < 256 && BlocksInvoker.getBlockState(block = BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, j, i, k)))) != Material.air && BlocksInvoker.getBlockState(block) == Material.z) continue;
                    }
                }
            }
            return false;
        }
        return false;
    }
}

