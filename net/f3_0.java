/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;

/*
 * Renamed from net.f3
 */
public class f3_0
extends Block {
    private boolean P;

    protected f3_0(Material material, boolean bl, MapColor mapColor) {
        super(material, mapColor);
        this.P = bl;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        Block block = BlockStateInvoker.getBlock(iBlockState);
        if (this == Blocks.a8 || this == Blocks.am) {
            if (aG3.c(iBlockAccess, amv_2.a(blockPos, SJ.b(enumFacing))) != iBlockState) {
                return true;
            }
            if (block == this) {
                return false;
            }
        }
        return (this.P || block != this) && super.b(iBlockAccess, blockPos, enumFacing);
    }

    protected f3_0(Material material, boolean bl) {
        this(material, bl, akm_1.j(material));
    }
}

