/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.BlocksInvoker;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.Random;

public class ItemArmorStand
extends Item {
    private void a(ol_2 ol_22, Random random) {
        anl_0 anl_02 = awl_1.e(ol_22);
        float f = a5_0.e(random) * 5.0f;
        float f2 = a5_0.e(random) * 20.0f - 10.0f;
        anl_0 anl_03 = new anl_0(C3.a(anl_02) + f, C3.d(anl_02) + f2, C3.b(anl_02));
        awl_1.a(ol_22, anl_03);
        anl_02 = awl_1.g(ol_22);
        f = a5_0.e(random) * 10.0f - 5.0f;
        anl_03 = new anl_0(C3.a(anl_02), C3.d(anl_02) + f, C3.b(anl_02));
        awl_1.b(ol_22, anl_03);
    }

    public ItemArmorStand() {
        this.a(CreativeTabs.l);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing == EnumFacing.DOWN) {
            return false;
        }
        BlocksInvoker.d(BlockStateInvoker.getBlock(aV8.q(world, blockPos)), world, blockPos);
        BlockPos blockPos2 = blockPos;
        if (!a6w_0.a(entityPlayer, blockPos2, enumFacing, itemStack)) {
            return false;
        }
        BlockPos blockPos3 = amv_2.e(blockPos2);
        boolean bl = !aV8.k(world, blockPos2) && !BlocksInvoker.d(BlockStateInvoker.getBlock(aV8.q(world, blockPos2)), world, blockPos2);
        bl |= !aV8.k(world, blockPos3) && !BlocksInvoker.d(BlockStateInvoker.getBlock(aV8.q(world, blockPos3)), world, blockPos3);
        return false;
    }
}

