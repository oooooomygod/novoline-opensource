/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.fM
 */
public class fm_1
extends ft_2 {
    public static J_ P = aWq.a(awu_0.a);

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6U) {
            awn_1 awn_12 = anp_1.b((a6U)tileEntity);
            if (act_2.g(itemStack)) {
                awo_0.a(awn_12, act_2.w(itemStack));
            }
            if (!world.isRemote) {
                awo_0.a(awn_12, J9.c(aV8.k(world), awu_0.b));
            }
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        return tileEntity instanceof a6U && awo_0.a(anp_1.b((a6U)tileEntity), entityPlayer);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6U) {
            awo_0.a(anp_1.b((a6U)tileEntity), world);
            aV8.d(world, blockPos, this);
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P))) {
            n |= 1;
        }
        return n;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, auk_2.b((n & 1) > 0));
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6U();
    }

    @Override
    public int a(World world) {
        return 1;
    }

    public fm_1() {
        super(Material.t, MapColor.J);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, Boolean.FALSE));
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(this.m(), P, Boolean.FALSE);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        if (!world.isRemote) {
            aV8.B(world, blockPos);
            auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P));
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, Boolean.TRUE), 4);
            aV8.a(world, blockPos, (Block)this, this.a(world));
        }
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        return tileEntity instanceof a6U ? awo_0.d(anp_1.b((a6U)tileEntity)) : 0;
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public int q() {
        return 3;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }
}

