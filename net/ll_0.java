/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ObjectMouseOverInvoker;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;

/*
 * Renamed from net.Ll
 */
public class ll_0
extends KJ {
    public ll_0(Block block) {
        super(block, false);
    }

    @Override
    public int a(ItemStack itemStack, int n) {
        return BlocksInvoker.e(Blocks.an, BlocksInvoker.a(Blocks.an, act_2.c(itemStack)));
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        MovingObjectPosition movingObjectPosition = this.a(world, entityPlayer, true);
        if (movingObjectPosition.typeOfHit == I.BLOCK) {
            BlockPos blockPos = ObjectMouseOverInvoker.getBlockPos(movingObjectPosition);
            if (!aV8.a(world, entityPlayer, blockPos)) {
                return itemStack;
            }
            if (!a6w_0.a(entityPlayer, amv_2.a(blockPos, movingObjectPosition.facing), movingObjectPosition.facing, itemStack)) {
                return itemStack;
            }
            BlockPos blockPos2 = amv_2.e(blockPos);
            IBlockState iBlockState = aV8.q(world, blockPos);
            if (BlocksInvoker.getBlockState(iBlockState.b()) == Material.M && P8.b((Integer)BlockStateInvoker.b(iBlockState, BlockLiquid.P)) == 0 && aV8.k(world, blockPos2)) {
                aV8.a(world, blockPos2, BlocksInvoker.t(Blocks.an));
                if (!aSY.a(entityPlayer.abilities)) {
                    --itemStack.a;
                }
                a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
            }
        }
        return itemStack;
    }
}

