/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockInvoker;
import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import cc.novoline.invoke.ItemBlockInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import deobf.MCInvoker;
import net.minecraft.client.Minecraft;

public class ajI {
    private static Minecraft a = MCInvoker.f();

    public static boolean a(ItemBlock itemBlock, ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        W8.b();
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (!BlocksInvoker.d(block, world, blockPos)) {
            blockPos = amv_2.a(blockPos, enumFacing);
        }
        if (itemStack.a == 0) {
            return false;
        }
        if (!a6w_0.a(entityPlayer, blockPos, enumFacing, itemStack)) {
            return false;
        }
        if (aV8.a(world, ItemBlockInvoker.a(itemBlock), blockPos, false, enumFacing, null, itemStack)) {
            int n = ItemBlockInvoker.a(itemBlock, act_2.c(itemStack));
            IBlockState iBlockState2 = BlocksInvoker.a(ItemBlockInvoker.a(itemBlock), world, blockPos, enumFacing, f, f2, f3, n, entityPlayer);
            if (aV8.a(world, blockPos, iBlockState2, 3)) {
                iBlockState2 = aV8.q(world, blockPos);
                if (BlockStateInvoker.getBlock(iBlockState2) == ItemBlockInvoker.a(itemBlock)) {
                    ItemBlockInvoker.a(world, entityPlayer, blockPos, itemStack);
                    BlocksInvoker.a(ItemBlockInvoker.a(itemBlock), world, blockPos, iBlockState2, entityPlayer, itemStack);
                }
                if (fo_0.a(fo_0.a()) != 47) {
                    BlockInvoker.a(ajI.a.world, amv_2.a(blockPos, 0.5, 0.5, 0.5), an6_0.a(ItemBlockInvoker.a((ItemBlock)itemBlock).l), (an6_0.d(ItemBlockInvoker.a((ItemBlock)itemBlock).l) + 1.0f) / 2.0f, an6_0.b(ItemBlockInvoker.a((ItemBlock)itemBlock).l) * 0.8f, false);
                }
                aV8.a(world, (float)amv_2.j(blockPos) + 0.5f, (double)((float)amv_2.h(blockPos) + 0.5f), (double)((float)amv_2.i(blockPos) + 0.5f), an6_0.a(ItemBlockInvoker.a((ItemBlock)itemBlock).l), (an6_0.d(ItemBlockInvoker.a((ItemBlock)itemBlock).l) + 1.0f) / 2.0f, an6_0.b(ItemBlockInvoker.a((ItemBlock)itemBlock).l) * 0.8f);
                --itemStack.a;
            }
            return true;
        }
        if (ListInvoker.b() != null) {
            W8.b(new ListInvoker[1]);
        }
        return false;
    }

    public static boolean a(World world, BlockPos blockPos, boolean bl) {
        W8.b();
        IBlockState iBlockState = aV8.q(world, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        aV8.c(world, 2001, blockPos, BlocksInvoker.a(iBlockState));
        if (BlocksInvoker.getBlockState(block) == Material.air) {
            return false;
        }
        if (bl) {
            BlocksInvoker.a(block, world, blockPos, iBlockState, 0);
        }
        boolean bl2 = aV8.a(world, blockPos, BlocksInvoker.t(Blocks.air), 3);
        ListInvoker.b(new ListInvoker[2]);
        return bl2;
    }
}

