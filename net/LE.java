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

public class LE
extends LA {
    private Block w;
    private Block v;

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing != EnumFacing.UP) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, enumFacing), enumFacing, itemStack)) {
            return false;
        }
        if (BlockStateInvoker.getBlock(aV8.q(world, blockPos)) == this.w && aV8.k(world, amv_2.e(blockPos))) {
            aV8.a(world, amv_2.e(blockPos), BlocksInvoker.t(this.v));
            --itemStack.a;
            return true;
        }
        return false;
    }

    public LE(int n, float f, Block block, Block block2) {
        super(n, f, false);
        this.v = block;
        this.w = block2;
    }
}

