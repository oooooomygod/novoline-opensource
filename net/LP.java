/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.Iterator;

public class LP
extends Item {
    public static boolean a(EntityPlayer entityPlayer, World world, BlockPos blockPos) {
        nn_1 nn_12 = ala_2.a(world, blockPos);
        boolean bl = false;
        double d = 7.0;
        int n = amv_2.j(blockPos);
        int n2 = amv_2.h(blockPos);
        int n3 = amv_2.i(blockPos);
        Iterator iterator = ListInvoker.iterator(aV8.a(world, nl_1.class, new rm_2((double)n - d, (double)n2 - d, (double)n3 - d, (double)n + d, (double)n2 + d, (double)n3 + d)));
        while (dz_0.c(iterator)) {
            nl_1 nl_12 = (nl_1)dz_0.b(iterator);
            if (!CG.t(nl_12) || CG.j(nl_12) != entityPlayer) continue;
            nn_12 = ala_2.b(world, blockPos);
            CG.a(nl_12, nn_12, true);
            bl = true;
        }
        return bl;
    }

    public LP() {
        this.a(CreativeTabs.c);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        Block block = BlockStateInvoker.getBlock(aV8.q(world, blockPos));
        if (block instanceof g2_0) {
            if (!world.isRemote) {
                LP.a(entityPlayer, world, blockPos);
            }
            return true;
        }
        return false;
    }
}

