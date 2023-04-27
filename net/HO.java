/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.minecraft.block.BlockPos;

class HO {
    public BlockPos c;
    public NBTTagCompound b;
    public IBlockState a;

    public HO(BlockPos blockPos, IBlockState iBlockState, NBTTagCompound nBTTagCompound) {
        this.c = blockPos;
        this.a = iBlockState;
        this.b = nBTTagCompound;
    }
}

