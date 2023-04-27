/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Lg
 */
public class lg_0
extends Item {
    private Block m;

    public static void a(World world, BlockPos blockPos, EnumFacing enumFacing, Block block) {
        BlockPos blockPos2 = amv_2.a(blockPos, SJ.l(enumFacing));
        BlockPos blockPos3 = amv_2.a(blockPos, SJ.c(enumFacing));
        int n = (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(world, blockPos3))) ? 1 : 0) + (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos3)))) ? 1 : 0);
        int n2 = (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(world, blockPos2))) ? 1 : 0) + (BlocksInvoker.x(BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos2)))) ? 1 : 0);
        boolean bl = BlockStateInvoker.getBlock(aV8.q(world, blockPos3)) == block || BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos3))) == block;
        boolean bl2 = BlockStateInvoker.getBlock(aV8.q(world, blockPos2)) == block || BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos2))) == block;
        BlockPos blockPos4 = amv_2.e(blockPos);
        IBlockState iBlockState = BlockStateInvoker.a(BlockStateInvoker.a(BlocksInvoker.t(block), g7_0.T, (Comparable)((Object)enumFacing)), g7_0.S, (Comparable)((Object)az_0.RIGHT));
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, g7_0.R, (Comparable)((Object)xq_1.LOWER)), 2);
        aV8.a(world, blockPos4, BlockStateInvoker.a(iBlockState, g7_0.R, (Comparable)((Object)xq_1.UPPER)), 2);
        aV8.c(world, blockPos, block);
        aV8.c(world, blockPos4, block);
    }

    public lg_0(Block block) {
        this.m = block;
        this.a(CreativeTabs.j);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing != EnumFacing.UP) {
            return false;
        }
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (!BlocksInvoker.d(block, world, blockPos)) {
            blockPos = amv_2.a(blockPos, enumFacing);
        }
        if (!a6w_0.a(entityPlayer, blockPos, enumFacing, itemStack)) {
            return false;
        }
        if (!BlocksInvoker.g(this.m, world, blockPos)) {
            return false;
        }
        lg_0.a(world, blockPos, SJ.a(entityPlayer.rotationYaw), this.m);
        --itemStack.a;
        return true;
    }
}

