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
 * Renamed from net.alv
 */
class alv_1
extends _v_0 {
    private nn_0 b;

    @Override
    public void d() {
        Random random = aax_2.d(this.b);
        World world = this.b.worldObj;
        int n = MathHelper.floor_double(this.b.posX - 1.0 + a5_0.c(random) * 2.0);
        int n2 = MathHelper.floor_double(this.b.posY + a5_0.c(random) * 2.0);
        int n3 = MathHelper.floor_double(this.b.posZ - 1.0 + a5_0.c(random) * 2.0);
        BlockPos blockPos = new BlockPos(n, n2, n3);
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        Block block2 = BlockStateInvoker.getBlock(aV8.q(world, amv_2.g(blockPos)));
        if (this.a(world, blockPos, BlockStateInvoker.getBlock(aax_2.c(this.b)), block, block2)) {
            aV8.a(world, blockPos, aax_2.c(this.b), 3);
            aax_2.a(this.b, BlocksInvoker.t(Blocks.air));
        }
    }

    public alv_1(nn_0 nn_02) {
        this.b = nn_02;
    }

    @Override
    public boolean g() {
        return J9.c(aV8.k(this.b.worldObj), g_0.a) && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aax_2.c(this.b))) != Material.air && a5_0.a(aax_2.d(this.b), 2000) == 0;
    }

    private boolean a(World world, BlockPos blockPos, Block block, Block block2, Block block3) {
        return BlocksInvoker.g(block, world, blockPos) && BlocksInvoker.getBlockState(block2) == Material.air && BlocksInvoker.getBlockState(block3) != Material.air && BlocksInvoker.p(block3);
    }
}

