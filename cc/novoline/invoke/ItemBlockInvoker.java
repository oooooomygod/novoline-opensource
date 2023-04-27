/*
 * Decompiled with CFR 0.152.
 */
package cc.novoline.invoke;

import deobf.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import deobf.EnumFacing;
import net.World;

public class ItemBlockInvoker {
    public static boolean a(World world, EntityPlayer entityPlayer, BlockPos blockPos, ItemStack itemStack) {
        return ItemBlock.a(world, entityPlayer, blockPos, itemStack);
    }

    public static Block a(ItemBlock itemBlock) {
        return itemBlock.a();
    }

    public static int a(ItemBlock itemBlock, int n) {
        return itemBlock.c(n);
    }

    public static boolean a(ItemBlock itemBlock, World world, BlockPos blockPos, EnumFacing enumFacing, EntityPlayer entityPlayer, ItemStack itemStack) {
        return itemBlock.a(world, blockPos, enumFacing, entityPlayer, itemStack);
    }
}

