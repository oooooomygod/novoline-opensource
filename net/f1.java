/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayer;
import deobf.TileEntity;
import java.util.List;

import net.CreativeTabs;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;

public class f1
extends ft_2 {
    private static List<String> P = my_0.a(new String[]{ux_2.b, ux_2.c, ux_2.a, ux_2.e, ux_2.d});

    @Override
    public int q() {
        return 3;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, int n, int n2) {
        float f = (float)MathInvoker.b(2.0, (double)(n2 - 12) / 12.0);
        aV8.a(world, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 0.5, (double)amv_2.i(blockPos) + 0.5, aL0.a(aL0.a(new StringBuilder(), ux_2.f), this.a(n)).toString(), 3.0f, f);
        aV8.a(world, B7.NOTE, (double)amv_2.j(blockPos) + 0.5, (double)amv_2.h(blockPos) + 1.2, (double)amv_2.i(blockPos) + 0.5, (double)n2 / 24.0, 0.0, 0.0, new int[0]);
        return true;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        boolean bl = aV8.B(world, blockPos);
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6q_0) {
            a6q_0 a6q_02 = (a6q_0)tileEntity;
            if (a6q_02.i != bl) {
                axp_1.a(a6q_02, world, blockPos);
                a6q_02.i = bl;
            }
        }
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6q_0();
    }

    public f1() {
        super(Material.wood);
        this.a(CreativeTabs.j);
    }

    @Override
    public void a(World world, BlockPos blockPos, EntityPlayer entityPlayer) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6q_0) {
            axp_1.a((a6q_0)tileEntity, world, blockPos);
            a6w_0.a(entityPlayer, aop_1.P);
        }
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6q_0) {
            a6q_0 a6q_02 = (a6q_0)tileEntity;
            axp_1.a(a6q_02);
            axp_1.a(a6q_02, world, blockPos);
            a6w_0.a(entityPlayer, aop_1.Q);
        }
        return true;
    }

    private String a(int n) {
        if (n >= ListInvoker.size(P)) {
            n = 0;
        }
        return (String)ListInvoker.get(P, n);
    }
}

