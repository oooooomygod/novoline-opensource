/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.fX
 */
public class fx_1
extends ft_2 {
    public static J_[] P = new J_[]{aWq.a(aCG.a), aWq.a(aCG.c), aWq.a(aCG.d)};

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.brewing_stand;
    }

    @Override
    public void o() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }

    @Override
    public boolean f() {
        return false;
    }

    public fx_1() {
        super(Material.t);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), P[0], Boolean.FALSE), P[1], Boolean.FALSE), P[2], Boolean.FALSE));
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT;
    }

    @Override
    public String C() {
        return ahq_0.b(aCG.b);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.o();
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
    }

    @Override
    public void b(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        double d = (float)amv_2.j(blockPos) + 0.4f + a5_0.e(random) * 0.2f;
        double d2 = (float)amv_2.h(blockPos) + 0.7f + a5_0.e(random) * 0.3f;
        double d3 = (float)amv_2.i(blockPos) + 0.4f + a5_0.e(random) * 0.2f;
        aV8.a(world, B7.SMOKE_NORMAL, d, d2, d3, 0.0, 0.0, 0.0, new int[0]);
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = this.m();
        int n2 = 0;
        while (true) {
            iBlockState = BlockStateInvoker.a(iBlockState, P[n2], auk_2.b((n & 1 << n2) > 0));
            ++n2;
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, EntityLivingBase entityLivingBase, ItemStack itemStack) {
        TileEntity tileEntity;
        if (act_2.g(itemStack) && (tileEntity = aV8.z(world, blockPos)) instanceof a6E) {
            aAM.a((a6E)tileEntity, act_2.w(itemStack));
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        TileEntity tileEntity = aV8.z(world, blockPos);
        if (tileEntity instanceof a6E) {
            iz_0.a(world, blockPos, (rs_1)((a6E)tileEntity));
        }
        super.a(world, blockPos, iBlockState);
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    protected a42 s() {
        return new a42(this, P[0], P[1], P[2]);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean a(World world, BlockPos blockPos, IBlockState iBlockState, EntityPlayer entityPlayer, EnumFacing enumFacing, float f, float f2, float f3) {
        TileEntity tileEntity;
        if (!world.isRemote && (tileEntity = aV8.z(world, blockPos)) instanceof a6E) {
            a6w_0.a(entityPlayer, (a6E)tileEntity);
            a6w_0.a(entityPlayer, aop_1.b);
        }
        return true;
    }

    @Override
    public int q() {
        return 3;
    }

    @Override
    public TileEntity a(World world, int n) {
        return new a6E();
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return Items.brewing_stand;
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        int n2 = 0;
        while (true) {
            if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, P[n2]))) {
                n |= 1 << n2;
            }
            ++n2;
        }
    }

    @Override
    public int a(World world, BlockPos blockPos) {
        return afy_2.a(aV8.z(world, blockPos));
    }
}

