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
 * Renamed from net.iH
 */
public class ih_1
extends i7_0 {
    private Block b;

    public ih_1(Block block) {
        this.b = block;
    }

    @Override
    public boolean a(World world, Random random, BlockPos blockPos) {
        if (aV8.k(world, blockPos) && BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos))) == this.b) {
            int n;
            int n2;
            int n3;
            int n4;
            int n5 = a5_0.a(random, 32) + 6;
            int n6 = a5_0.a(random, 4) + 1;
            z6_0 z6_02 = new z6_0();
            for (n4 = amv_2.j(blockPos) - n6; n4 <= amv_2.j(blockPos) + n6; ++n4) {
                for (n3 = amv_2.i(blockPos) - n6; n3 <= amv_2.i(blockPos) + n6; ++n3) {
                    n2 = n4 - amv_2.j(blockPos);
                    if (n2 * n2 + (n = n3 - amv_2.i(blockPos)) * n > n6 * n6 + 1 || BlockStateInvoker.getBlock(aV8.q(world, ain_1.a(z6_02, n4, amv_2.h(blockPos) - 1, n3))) == this.b) continue;
                    return false;
                }
            }
            for (n4 = amv_2.h(blockPos); n4 < amv_2.h(blockPos) + n5 && n4 < 256; ++n4) {
                for (n3 = amv_2.j(blockPos) - n6; n3 <= amv_2.j(blockPos) + n6; ++n3) {
                    for (n2 = amv_2.i(blockPos) - n6; n2 <= amv_2.i(blockPos) + n6; ++n2) {
                        int n7;
                        n = n3 - amv_2.j(blockPos);
                        if (n * n + (n7 = n2 - amv_2.i(blockPos)) * n7 > n6 * n6 + 1) continue;
                        aV8.a(world, new BlockPos(n3, n4, n2), BlocksInvoker.t(Blocks.O), 2);
                    }
                }
            }
            ox_2 ox_22 = new ox_2(world);
            ayj_0.b(ox_22, (float)amv_2.j(blockPos) + 0.5f, amv_2.h(blockPos) + n5, (float)amv_2.i(blockPos) + 0.5f, a5_0.e(random) * 360.0f, 0.0f);
            aV8.b(world, ox_22);
            aV8.a(world, amv_2.c(blockPos, n5), BlocksInvoker.t(Blocks.bedrock), 2);
            return true;
        }
        return false;
    }
}

