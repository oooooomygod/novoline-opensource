/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;

public class LF
extends Item {
    private Class<? extends nc_2> m;

    public LF(Class<? extends nc_2> clazz) {
        this.m = clazz;
        this.a(CreativeTabs.l);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        if (enumFacing == EnumFacing.DOWN) {
            return false;
        }
        if (enumFacing == EnumFacing.UP) {
            return false;
        }
        BlockPos blockPos2 = amv_2.a(blockPos, enumFacing);
        if (!a6w_0.a(entityPlayer, blockPos2, enumFacing, itemStack)) {
            return false;
        }
        nc_2 nc_22 = this.a(world, blockPos2, enumFacing);
        if (m6_0.a(nc_22)) {
            if (!world.isRemote) {
                aV8.b(world, nc_22);
            }
            --itemStack.a;
        }
        return true;
    }

    private nc_2 a(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return this.m == nk_2.class ? new nk_2(world, blockPos, enumFacing) : (this.m == no_2.class ? new no_2(world, blockPos, enumFacing) : null);
    }
}

