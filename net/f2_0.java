/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.f2
 */
public class f2_0
extends fc_2 {
    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        if (!world.isRemote && a6w_0.n(entityPlayer) != null && act_2.k(a6w_0.n(entityPlayer)) == Items.shears) {
            a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
            f2_0.a(world, blockPos, new ItemStack(Blocks.ca, 1, 0));
        } else {
            super.a(world, entityPlayer, blockPos, iBlockState, tileEntity);
        }
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.t;
    }

    @Override
    public boolean b(World world, BlockPos blockPos) {
        return true;
    }

    protected f2_0() {
        super(Material.f);
        this.a(0.099999994f, 0.0f, 0.099999994f, 0.9f, 0.8f, 0.9f);
    }

    @Override
    protected boolean a(Block block) {
        return block == Blocks.sand || block == Blocks.aJ || block == Blocks.cr || block == Blocks.dirt;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return null;
    }
}

