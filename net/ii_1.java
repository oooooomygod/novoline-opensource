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
 * Renamed from net.iI
 */
public abstract class ii_1
extends i7_0 {
    protected boolean a(Block block) {
        Material material = BlocksInvoker.getBlockState(block);
        return material == Material.air || material == Material.z || block == Blocks.grass || block == Blocks.dirt || block == Blocks.b2 || block == Blocks.bO || block == Blocks.sapling || block == Blocks.as;
    }

    protected void a(World world, BlockPos blockPos) {
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) != Blocks.dirt) {
            this.a(world, blockPos, BlocksInvoker.t(Blocks.dirt));
        }
    }

    public void a(World world, Random random, BlockPos blockPos) {
    }

    public ii_1(boolean bl) {
        super(bl);
    }
}

