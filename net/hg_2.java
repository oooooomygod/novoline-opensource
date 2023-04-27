/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.CreativeTabs;

/*
 * Renamed from net.hg
 */
public class hg_2
extends Block {
    public hg_2() {
        super(Material.a, MapColor.a);
        this.a(CreativeTabs.m);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Entity entity) {
        entity.motionX *= 0.4;
        entity.motionZ *= 0.4;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return new rm_2(amv_2.j(blockPos), amv_2.h(blockPos), amv_2.i(blockPos), amv_2.j(blockPos) + 1, (float)(amv_2.h(blockPos) + 1) - 0.125f, amv_2.i(blockPos) + 1);
    }
}

