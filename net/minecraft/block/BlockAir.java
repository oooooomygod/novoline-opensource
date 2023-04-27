/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import net.IBlockState;
import net.Material;
import net.World;
import net.rm_2;

public class BlockAir
extends Block {
    protected BlockAir() {
        super(Material.air);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, float f, int n) {
    }

    @Override
    public boolean a(IBlockState iBlockState, boolean bl) {
        return false;
    }

    @Override
    public int q() {
        return -1;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        return null;
    }

    @Override
    public boolean b(World world, BlockPos blockPos) {
        return true;
    }
}

