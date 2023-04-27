/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class LX
extends Item {
    private Block m;

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        IBlockState iBlockState;
        IBlockState iBlockState2 = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState2);
        if (block == Blocks.cm && P8.b((Integer)BlockStateInvoker.b(iBlockState2, hq_1.P)) < 1) {
            enumFacing = EnumFacing.UP;
        } else if (!BlocksInvoker.d(block, world, blockPos)) {
            blockPos = amv_2.a(blockPos, enumFacing);
        }
        if (!a6w_0.a(entityPlayer, blockPos, enumFacing, itemStack)) {
            return false;
        }
        if (itemStack.a == 0) {
            return false;
        }
        if (aV8.a(world, this.m, blockPos, false, enumFacing, null, itemStack) && aV8.a(world, blockPos, iBlockState = BlocksInvoker.a(this.m, world, blockPos, enumFacing, f, f2, f3, 0, entityPlayer), 3)) {
            iBlockState = aV8.q(world, blockPos);
            if (BlockStateInvoker.getBlock(iBlockState) == this.m) {
                ItemBlockInvoker.a(world, entityPlayer, blockPos, itemStack);
                BlocksInvoker.a(BlockStateInvoker.getBlock(iBlockState), world, blockPos, iBlockState, entityPlayer, itemStack);
            }
            aV8.a(world, (float)amv_2.j(blockPos) + 0.5f, (double)((float)amv_2.h(blockPos) + 0.5f), (double)((float)amv_2.i(blockPos) + 0.5f), an6_0.a(this.m.l), (an6_0.d(this.m.l) + 1.0f) / 2.0f, an6_0.b(this.m.l) * 0.8f);
            --itemStack.a;
            return true;
        }
        return false;
    }

    public LX(Block block) {
        this.m = block;
    }
}

