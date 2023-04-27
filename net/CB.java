/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

public class CB {
    public static boolean a(Block block, World world, BlockPos blockPos, EnumFacing enumFacing, boolean bl) {
        return gi_2.a(block, world, blockPos, enumFacing, bl);
    }

    public static IBlockState a(gi_2 gi_22, int n) {
        return gi_22.c(n);
    }

    public static EnumFacing a(World world, BlockPos blockPos, EntityLivingBase entityLivingBase) {
        return gi_2.a(world, blockPos, entityLivingBase);
    }
}

