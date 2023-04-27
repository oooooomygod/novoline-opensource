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
 * Renamed from net.alV
 */
class alv_0
extends _v_0 {
    private nn_0 b;

    @Override
    public boolean g() {
        return J9.c(aV8.k(this.b.worldObj), asd_1.a) && BlocksInvoker.getBlockState(BlockStateInvoker.getBlock(aax_2.c(this.b))) == Material.air && a5_0.a(aax_2.d(this.b), 20) == 0;
    }

    @Override
    public void d() {
        Random random = aax_2.d(this.b);
        World world = this.b.worldObj;
        int n = MathHelper.floor_double(this.b.posX - 2.0 + a5_0.c(random) * 4.0);
        int n2 = MathHelper.floor_double(this.b.posY + a5_0.c(random) * 3.0);
        int n3 = MathHelper.floor_double(this.b.posZ - 2.0 + a5_0.c(random) * 4.0);
        BlockPos blockPos = new BlockPos(n, n2, n3);
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (aS0.c(nn_0.b(), block)) {
            aax_2.a(this.b, iBlockState);
            aV8.a(world, blockPos, BlocksInvoker.t(Blocks.air));
        }
    }

    public alv_0(nn_0 nn_02) {
        this.b = nn_02;
    }
}

