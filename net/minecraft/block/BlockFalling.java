/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import net.*;
import net.minecraft.init.Blocks;
import java.util.Random;

/*
 * Renamed from net.gg
 */
public class BlockFalling
extends Block {
    public static boolean P;

    public BlockFalling() {
        super(Material.a);
        this.a(CreativeTabs.m);
    }

    public BlockFalling(Material material) {
        super(material);
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        aV8.a(world, blockPos, (Block)this, this.a(world));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (!world.isRemote) {
            this.a(world, blockPos);
        }
    }

    public static boolean c(World world, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        Material material = block.o;
        return block == Blocks.c || material == Material.air || material == Material.M || material == Material.e;
    }

    @Override
    public int a(World world) {
        return 2;
    }

    public void b(World world, BlockPos blockPos) {
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        aV8.a(world, blockPos, (Block)this, this.a(world));
    }

    protected void a(oq_1 oq_12) {
    }

    private void a(World world, BlockPos blockPos) {
        if (BlockFalling.c(world, amv_2.g(blockPos)) && amv_2.h(blockPos) >= 0) {
            if (!P && aV8.b(world, amv_2.a(blockPos, -32, -32, -32), amv_2.a(blockPos, 32, 32, 32))) {
                if (!world.isRemote) {
                    oq_1 oq_12 = new oq_1(world, (double)amv_2.j(blockPos) + 0.5, amv_2.h(blockPos), (double)amv_2.i(blockPos) + 0.5, aV8.q(world, blockPos));
                    this.a(oq_12);
                    aV8.b(world, oq_12);
                }
            } else {
                aV8.j(world, blockPos);
                BlockPos blockPos2 = amv_2.g(blockPos);
                while (BlockFalling.c(world, blockPos2) && amv_2.h(blockPos2) > 0) {
                    blockPos2 = amv_2.g(blockPos2);
                }
                if (amv_2.h(blockPos2) > 0) {
                    aV8.a(world, amv_2.e(blockPos2), this.m());
                }
            }
        }
    }
}

