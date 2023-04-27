/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.CreativeTabs;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.hh
 */
public class hh_0
extends Block {
    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        if (!world.isRemote) {
            a6w_0.a(entityPlayer, new aAA(world, blockPos));
            a6w_0.a(entityPlayer, aop_1.R);
        }
        return true;
    }

    protected hh_0() {
        super(Material.wood);
        this.a(CreativeTabs.l);
    }
}

