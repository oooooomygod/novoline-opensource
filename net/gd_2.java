/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.Entity;
import deobf.IBlockAccess;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.gd
 */
public class gd_2
extends Block {
    public static J_ R;
    public static J_ S;
    private boolean Q;
    public static J_ T;
    public static J_ P;

    public boolean a(Block block) {
        return block.z() || block == this || block == Blocks.a8 || block == Blocks.am || block == Blocks.ad || block instanceof gd_2;
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        float f = 0.4375f;
        float f2 = 0.5625f;
        float f3 = 0.4375f;
        float f4 = 0.5625f;
        this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos))));
        this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.b(blockPos))));
        this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.d(blockPos))));
        this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.f(blockPos))));
        f = 0.0f;
        f3 = 0.0f;
        this.a(f, 0.0f, f3, f2, 1.0f, f4);
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public boolean f() {
        return false;
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos)) != this && super.b(iBlockAccess, blockPos, enumFacing);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, rm_2 rm_22, List<rm_2> list, Entity entity) {
        this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.a(blockPos))));
        this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.b(blockPos))));
        this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.d(blockPos))));
        this.a(BlockStateInvoker.getBlock(aV8.q(world, amv_2.f(blockPos))));
        this.a(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
        this.a(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
        super.a(world, blockPos, iBlockState, rm_22, list, entity);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, T, auk_2.b(this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.a(blockPos)))))), P, auk_2.b(this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.b(blockPos)))))), S, auk_2.b(this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.d(blockPos)))))), R, auk_2.b(this.a(BlockStateInvoker.getBlock(aG3.c(iBlockAccess, amv_2.f(blockPos))))));
    }

    @Override
    public a5w_0 K() {
        return a5w_0.CUTOUT_MIPPED;
    }

    @Override
    protected a42 s() {
        return new a42(this, T, R, S, P);
    }

    static {
        T = aWq.a(sz_2.d);
        R = aWq.a(sz_2.a);
        P = aWq.a(sz_2.b);
        S = aWq.a(sz_2.c);
    }

    @Override
    public void o() {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    protected gd_2(Material material, boolean bl) {
        super(material);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), T, Boolean.FALSE), R, Boolean.FALSE), P, Boolean.FALSE), S, Boolean.FALSE));
        this.Q = bl;
        this.a(CreativeTabs.l);
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return !this.Q ? null : super.a(iBlockState, random, n);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return 0;
    }
}

