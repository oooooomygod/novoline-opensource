/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import deobf.TileEntity;
import java.util.Random;

/*
 * Renamed from net.hQ
 */
public class hq_1
extends Block {
    public static js_0 P = a7X.a(afw_2.a, 1, 8);

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Random random) {
        if (aV8.b(world, YG.BLOCK, blockPos) > 11) {
            this.a(world, blockPos, aV8.q(world, blockPos), 0);
            aV8.j(world, blockPos);
        }
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return enumFacing == EnumFacing.UP || super.b(iBlockAccess, blockPos, enumFacing);
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return P8.b((Integer)BlockStateInvoker.b(aG3.c(iBlockAccess, blockPos), P)) < 5;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, P8.d((n & 7) + 1));
    }

    @Override
    public void a(World world, EntityPlayer entityPlayer, BlockPos blockPos, IBlockState iBlockState, TileEntity tileEntity) {
        hq_1.a(world, blockPos, new ItemStack(Items.snowball, P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) + 1, 0));
        aV8.j(world, blockPos);
        a6w_0.a(entityPlayer, aop_1.v[Block.a(this)]);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        IBlockState iBlockState = aG3.c(iBlockAccess, blockPos);
        this.a(P8.b((Integer)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public void o() {
        this.a(0);
    }

    protected hq_1() {
        super(Material.G);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, P8.d(1)));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.a(true);
        this.a(CreativeTabs.l);
        this.o();
    }

    @Override
    public int d(IBlockState iBlockState) {
        return P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) - 1;
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        this.a(world, blockPos, iBlockState);
    }

    @Override
    public boolean f() {
        return false;
    }

    private boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.e(world, blockPos)) {
            this.a(world, blockPos, iBlockState, 0);
            aV8.j(world, blockPos);
            return false;
        }
        return true;
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    protected void a(int n) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, (float)n / 8.0f, 1.0f);
    }

    @Override
    public boolean b(World world, BlockPos blockPos) {
        return P8.b((Integer)BlockStateInvoker.b(aV8.q(world, blockPos), P)) == 1;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return Items.snowball;
    }

    @Override
    public boolean e(World world, BlockPos blockPos) {
        IBlockState iBlockState = aV8.q(world, amv_2.g(blockPos));
        Block block = BlockStateInvoker.getBlock(iBlockState);
        return block != Blocks.I && block != Blocks.bJ && (block.w() == Material.z || block == this && P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) >= 7 || block.f() && akm_1.d(block.o));
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        int n = P8.b((Integer)BlockStateInvoker.b(iBlockState, P)) - 1;
        return new rm_2((double)amv_2.j(blockPos) + this.t, (double)amv_2.h(blockPos) + this.N, (double)amv_2.i(blockPos) + this.w, (double)amv_2.j(blockPos) + this.d, (float)amv_2.h(blockPos) + (float)n * 0.125f, (double)amv_2.i(blockPos) + this.n);
    }
}

