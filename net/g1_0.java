/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityLivingBase;
import java.util.Iterator;

import net.CreativeTabs;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.g1
 */
public abstract class g1_0
extends gk_1 {
    public static JC<cs_2> Q = xu_0.a(MR.a, cs_2.class);

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (aV8.b(world, amv_2.a(blockPos, -5, -5, -5), amv_2.a(blockPos, 5, 5, 5))) {
            Iterator iterator = OV.a(amv_2.b(amv_2.a(blockPos, -4, -4, -4), amv_2.a(blockPos, 4, 4, 4)));
            while (dz_0.c(iterator)) {
                BlockPos blockPos2 = (BlockPos)dz_0.b(iterator);
                IBlockState iBlockState2 = aV8.q(world, blockPos2);
                if (BlockStateInvoker.getBlock(iBlockState2).w() != Material.z || auk_2.a((Boolean)BlockStateInvoker.b(iBlockState2, BlockLeaves.V))) continue;
                aV8.a(world, blockPos2, BlockStateInvoker.a(iBlockState2, BlockLeaves.V, Boolean.TRUE), 4);
            }
        }
    }

    public g1_0() {
        super(Material.wood);
        this.a(CreativeTabs.m);
        this.setHardness(2.0f);
        this.a(u);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(super.a(world, blockPos, enumFacing, f, f2, f3, n, entityLivingBase), Q, (Comparable)((Object)avd_1.a(SJ.h(enumFacing))));
    }
}

