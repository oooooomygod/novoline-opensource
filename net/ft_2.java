/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.NBTInvoker;
import deobf.ITileEntityProvider;
import deobf.TileEntity;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

/*
 * Renamed from net.ft
 */
public abstract class ft_2
extends Block
implements ITileEntityProvider {
    protected ft_2(Material material, MapColor mapColor) {
        super(material, mapColor);
        this.a = true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        super.a(world, blockPos, iBlockState);
        aV8.n(world, blockPos);
    }

    protected boolean b(World world, BlockPos blockPos, EnumFacing enumFacing) {
        return BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos, enumFacing))).w() == Material.A;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, int n, int n2) {
        super.a(world, blockPos, iBlockState, n, n2);
        TileEntity tileEntity = aV8.z(world, blockPos);
        return NBTInvoker.a(tileEntity, n, n2);
    }

    @Override
    public int q() {
        return -1;
    }

    protected boolean a(World world, BlockPos blockPos) {
        return this.b(world, blockPos, EnumFacing.NORTH) || this.b(world, blockPos, EnumFacing.SOUTH) || this.b(world, blockPos, EnumFacing.WEST) || this.b(world, blockPos, EnumFacing.EAST);
    }

    protected ft_2(Material material) {
        this(material, akm_1.j(material));
    }
}

