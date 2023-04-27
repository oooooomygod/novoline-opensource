/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.fC
 */
public class fc_1
extends ft_2 {
    public static jw_0 P = au_2.a(aGH.a, cs_1.HORIZONTAL);

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SJ.i((EnumFacing)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        int n = 0;
        while (true) {
            int n2 = a5_0.a(random, 2) * 2 - 1;
            int n3 = a5_0.a(random, 2) * 2 - 1;
            double d = (double)amv_2.j(blockPos) + 0.5 + 0.25 * (double)n2;
            double d2 = (float)amv_2.h(blockPos) + a5_0.e(random);
            double d3 = (double)amv_2.i(blockPos) + 0.5 + 0.25 * (double)n3;
            double d4 = a5_0.e(random) * (float)n2;
            double d5 = ((double)a5_0.e(random) - 0.5) * 0.125;
            double d6 = a5_0.e(random) * (float)n3;
            aV8.a(world, B7.PORTAL, d, d2, d3, d4, d5, d6, new int[0]);
            ++n;
        }
    }

    @Override
    public int a(Random random) {
        return 8;
    }

    @Override
    public int q() {
        return 2;
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase))));
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6R();
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.O);
    }

    @Override
    public IBlockState c(int n) {
        EnumFacing enumFacing = SJ.a(n);
        if (SJ.h(enumFacing) == kl_1.Y) {
            enumFacing = EnumFacing.NORTH;
        }
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)enumFacing));
    }

    protected fc_1() {
        super(Material.y);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)EnumFacing.NORTH)));
        this.a(CreativeTabs.l);
        this.a(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        wr_1 wr_12 = a6w_0.o(entityPlayer);
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6R) {
            if (BlockStateInvoker.getBlock(aV8.q(world, amv_2.e(blockPos))).D()) {
                return true;
            }
            if (world.isRemote) {
                return true;
            }
            ald_0.a(wr_12, (a6R)tileEntity);
            a6w_0.a(entityPlayer, wr_12);
            a6w_0.a(entityPlayer, aop_1.I);
            return true;
        }
        return true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        aV8.a(world, blockPos, BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)SJ.b(atn_0.D(entityLivingBase)))), 2);
    }
}

