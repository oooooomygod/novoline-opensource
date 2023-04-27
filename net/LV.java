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
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class LV
extends ItemBlock {
    @Override
    public int c(int n) {
        return n;
    }

    public LV(Block block) {
        super(block);
        this.setMaxDamage(0);
        this.a(true);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        IBlockState iBlockState;
        rm_2 rm_22;
        int n;
        if (itemStack.a == 0) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, blockPos, enumFacing, itemStack)) {
            return false;
        }
        IBlockState iBlockState2 = aV8.q(world, blockPos);
        Block block = iBlockState2.b();
        BlockPos blockPos2 = blockPos;
        if (!(enumFacing == EnumFacing.UP && block == this.m || BlocksInvoker.d(block, world, blockPos))) {
            blockPos2 = amv_2.a(blockPos, enumFacing);
            iBlockState2 = aV8.q(world, blockPos2);
            block = iBlockState2.b();
        }
        if (block == this.m && (n = P8.b((Integer)BlockStateInvoker.b(iBlockState2, hq_1.P))) <= 7 && aV8.c(world, rm_22 = BlocksInvoker.a(this.m, world, blockPos2, iBlockState = BlockStateInvoker.a(iBlockState2, hq_1.P, P8.d(n + 1)))) && aV8.a(world, blockPos2, iBlockState, 2)) {
            aV8.a(world, (float)amv_2.j(blockPos2) + 0.5f, (double)((float)amv_2.h(blockPos2) + 0.5f), (double)((float)amv_2.i(blockPos2) + 0.5f), an6_0.a(this.m.l), (an6_0.d(this.m.l) + 1.0f) / 2.0f, an6_0.b(this.m.l) * 0.8f);
            --itemStack.a;
            return true;
        }
        return super.a(itemStack, entityPlayer, world, blockPos2, enumFacing, f, f2, f3);
    }
}

