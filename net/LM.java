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

public class LM
extends Item {
    private Block m;
    private Block n;

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing != EnumFacing.UP) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) == this.n && aV8.k(world, amv_2.e(blockPos))) {
            aV8.a(world, amv_2.e(blockPos), BlocksInvoker.t(this.m));
            --itemStack.a;
            return true;
        }
        return false;
    }

    public LM(Block block, Block block2) {
        this.m = block;
        this.n = block2;
        this.a(CreativeTabs.i);
    }
}

