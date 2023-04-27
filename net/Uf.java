/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.world.GameType;
import deobf.ItemInWorldManager;
import net.minecraft.item.ItemStack;

public class Uf {
    public static GameType a(ItemInWorldManager itemInWorldManager) {
        return itemInWorldManager.b();
    }

    public static void a(ItemInWorldManager itemInWorldManager, BlockPos blockPos, EnumFacing enumFacing) {
        itemInWorldManager.a(blockPos, enumFacing);
    }

    public static void a(ItemInWorldManager itemInWorldManager, GameType gameType) {
        itemInWorldManager.a(gameType);
    }

    public static void a(ItemInWorldManager itemInWorldManager, BlockPos blockPos) {
        itemInWorldManager.b(blockPos);
    }

    public static boolean d(ItemInWorldManager itemInWorldManager) {
        return itemInWorldManager.a();
    }

    public static boolean e(ItemInWorldManager itemInWorldManager) {
        return itemInWorldManager.d();
    }

    public static void c(ItemInWorldManager itemInWorldManager) {
        itemInWorldManager.e();
    }

    public static boolean a(ItemInWorldManager itemInWorldManager, EntityPlayer entityPlayer, World world, ItemStack itemStack, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        aek_1.b();
        boolean bl = itemInWorldManager.a(entityPlayer, world, itemStack, blockPos, enumFacing, f, f2, f3);
        ListInvoker.b(new ListInvoker[1]);
        return bl;
    }

    public static void b(ItemInWorldManager itemInWorldManager) {
        itemInWorldManager.c();
    }

    public static boolean a(ItemInWorldManager itemInWorldManager, EntityPlayer entityPlayer, World world, ItemStack itemStack) {
        return itemInWorldManager.a(entityPlayer, world, itemStack);
    }

    public static void a(ItemInWorldManager itemInWorldManager, WorldServer worldServer) {
        itemInWorldManager.a(worldServer);
    }
}

