/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import net.minecraft.init.Blocks;
import java.util.Random;

import deobf.EnumFacing;
import net.IBlockState;
import net.J9;
import net.Material;
import net.World;
import net.a5_0;
import net.aV8;
import net.akm_1;
import net.amv_2;
import net.hf_1;

public class BlockStaticLiquid
extends BlockLiquid {
    protected BlockStaticLiquid(Material material) {
        super(material);
        this.a(false);
        if (material == Material.e) {
            this.a(true);
        }
    }

    protected boolean a(World world, BlockPos blockPos) {
        for (EnumFacing enumFacing : EnumFacing.values()) {
            if (!this.c(world, amv_2.a(blockPos, enumFacing))) continue;
            return true;
        }
        return false;
    }

    private boolean c(World world, BlockPos blockPos) {
        return akm_1.c(BlockStateInvoker.getBlock(aV8.q(world, blockPos)).w());
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        BlockDynamicLiquid blockDynamicLiquid = BlockStaticLiquid.b(this.o);
        aV8.a(world, blockPos, BlockStateInvoker.a(blockDynamicLiquid.m(), P, BlockStateInvoker.b(iBlockState, P)), 2);
        aV8.a(world, blockPos, (Block)blockDynamicLiquid, this.a(world));
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!this.a(world, blockPos, iBlockState)) {
            this.b(world, blockPos, iBlockState);
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (this.o == Material.e && J9.c(aV8.k(world), hf_1.a)) {
            int n = a5_0.a(random, 3);
            BlockPos blockPos2 = blockPos;
            for (int i = 0; i < n; ++i) {
                blockPos2 = amv_2.a(blockPos2, a5_0.a(random, 3) - 1, 1, a5_0.a(random, 3) - 1);
                Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos2));
                if (block.o == Material.air) {
                    if (!this.a(world, blockPos2)) continue;
                    aV8.a(world, blockPos2, Blocks.c.m());
                    return;
                }
                if (!akm_1.d(block.o)) continue;
                return;
            }
        }
    }
}

