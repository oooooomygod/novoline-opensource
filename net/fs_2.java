/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.NBTInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.fs
 */
public class fs_2
extends ft_2 {
    public static jw_0 Q = au_2.a(gv_0.a, cs_1.HORIZONTAL);
    private boolean R;
    private static boolean P;

    @Override
    public IBlockState a(IBlockState iBlockState) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object) EnumFacing.SOUTH));
    }

    private void b(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            Block block = BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos)));
            Block block2 = BlockStateInvoker.getBlock(aV8.q(world, amv_2.b(blockPos)));
            Block block3 = BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos)));
            Block block4 = BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos)));
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q));
            if (enumFacing == EnumFacing.NORTH && block.z() && !block2.z()) {
                enumFacing = EnumFacing.SOUTH;
            } else if (enumFacing == EnumFacing.SOUTH && block2.z() && !block.z()) {
                enumFacing = EnumFacing.NORTH;
            } else if (enumFacing == EnumFacing.WEST && block3.z() && !block4.z()) {
                enumFacing = EnumFacing.EAST;
            } else if (enumFacing == EnumFacing.EAST && block4.z() && !block3.z()) {
                enumFacing = EnumFacing.WEST;
            }
            aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)enumFacing)), 2);
        }
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return afy_2.a(aV8.z(world, blockPos));
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase))));
    }

    @Override
    protected a42 s() {
        return new a42(this, Q);
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6Z();
    }

    @Override
    public int q() {
        return 3;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.b(world, blockPos, iBlockState);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity;
        if (!P && (tileEntity = aV8.z(world, blockPos)) instanceof a6Z) {
            iz_0.a(world, blockPos, (rs_1)((a6Z)tileEntity));
            aV8.d(world, blockPos, this);
        }
        super.a(world, blockPos, iBlockState);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (this.R) {
            EnumFacing enumFacing = (EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q));
            double d = (double)amv_2.j(blockPos) + 0.5;
            double d2 = (double)amv_2.h(blockPos) + a5_0.c(random) * 6.0 / 16.0;
            double d3 = (double)amv_2.i(blockPos) + 0.5;
            double d4 = a5_0.c(random) * 0.6 - 0.3;
            switch (as3_0.a[enumFacing.ordinal()]) {
                case 1: {
                    aV8.a(world, B7.SMOKE_NORMAL, d - 0.52, d2, d3 + d4, 0.0, 0.0, 0.0, new int[0]);
                    aV8.a(world, B7.FLAME, d - 0.52, d2, d3 + d4, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 2: {
                    aV8.a(world, B7.SMOKE_NORMAL, d + 0.52, d2, d3 + d4, 0.0, 0.0, 0.0, new int[0]);
                    aV8.a(world, B7.FLAME, d + 0.52, d2, d3 + d4, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 3: {
                    aV8.a(world, B7.SMOKE_NORMAL, d + d4, d2, d3 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    aV8.a(world, B7.FLAME, d + d4, d2, d3 - 0.52, 0.0, 0.0, 0.0, new int[0]);
                    break;
                }
                case 4: {
                    aV8.a(world, B7.SMOKE_NORMAL, d + d4, d2, d3 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                    aV8.a(world, B7.FLAME, d + d4, d2, d3 + 0.52, 0.0, 0.0, 0.0, new int[0]);
                }
            }
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity;
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase)))), 2);
        if (act_2.g(itemStack) && (tileEntity = aV8.z(world, blockPos)) instanceof a6Z) {
            aRZ.a((a6Z)tileEntity, act_2.w(itemStack));
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6Z) {
            a6w_0.a(entityPlayer, (a6Z)tileEntity);
            a6w_0.a(entityPlayer, aop_1.U);
        }
        return true;
    }

    @Override
    public IBlockState c(int n) {
        EnumFacing enumFacing = SJ.a(n);
        if (SJ.h(enumFacing) == kl_1.Y) {
            enumFacing = EnumFacing.NORTH;
        }
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)enumFacing));
    }

    @Override
    public boolean i() {
        return true;
    }

    protected fs_2(boolean bl) {
        super(Material.y);
        this.f(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)EnumFacing.NORTH)));
        this.R = bl;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.ab);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.ab);
    }

    public static void a(boolean bl, World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        TileEntity tileEntity = aV8.z(world, blockPos);
        P = true;
        aV8.a(world, blockPos, BlockStateInvoker.a(Blocks.a.m(), Q, BlockStateInvoker.b(iBlockState, Q)), 3);
        aV8.a(world, blockPos, BlockStateInvoker.a(Blocks.a.m(), Q, BlockStateInvoker.b(iBlockState, Q)), 3);
        P = false;
        NBTInvoker.d(tileEntity);
        aV8.b(world, blockPos, tileEntity);
    }
}

