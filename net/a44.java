/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class a44 {
    private static boolean b;

    static {
        if (a44.a()) {
            a44.b(true);
        }
    }

    public static boolean a(World world, BlockPos blockPos, boolean bl) {
        return ajI.a(world, blockPos, bl);
    }

    public static boolean a() {
        a44.b();
        return true;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean a(ItemBlock itemBlock, ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        a44.b();
        boolean bl = ajI.a(itemBlock, itemStack, entityPlayer, world, blockPos, enumFacing, f, f2, f3);
        ListInvoker.b(new ListInvoker[4]);
        return bl;
    }

    public static boolean b() {
        return b;
    }
}

