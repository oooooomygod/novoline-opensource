/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.IBlockAccess;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.fz
 */
public class fz_2
extends Block {
    public fz_2(Material material, MapColor mapColor) {
        super(material, mapColor);
    }

    @Override
    public boolean b() {
        return true;
    }

    @Override
    public int a(IBlockAccess iBlockAccess, BlockPos blockPos, IBlockState iBlockState, EnumFacing enumFacing) {
        return 15;
    }
}

