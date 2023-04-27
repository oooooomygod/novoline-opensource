/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import deobf.IBlockAccess;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.fP
 */
public class fp_1
extends Block {
    public static JC<YZ> P = xu_0.a(a6T.a, YZ.class);

    @Override
    public int d(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return my_2.b((YZ)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    protected fp_1() {
        super(Material.D);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)YZ.WHITE)));
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this.a(true);
        this.a(CreativeTabs.l);
        this.a(0);
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState, Block block) {
        this.a(world, blockPos, iBlockState);
    }

    protected void a(int n) {
        this.a(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
    }

    @Override
    public boolean b(IBlockAccess iBlockAccess, BlockPos blockPos, EnumFacing enumFacing) {
        return enumFacing == EnumFacing.UP || super.b(iBlockAccess, blockPos, enumFacing);
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
    public boolean e(World world, BlockPos blockPos) {
        return super.e(world, blockPos) && this.a(world, blockPos);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(0);
    }

    @Override
    public void o() {
        this.a(0);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)my_2.a(n)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        int n = 0;
        while (true) {
            ListInvoker.add(list, new ItemStack(item, 1, n));
            ++n;
        }
    }

    private boolean a(World world, BlockPos blockPos) {
        return !aV8.k(world, amv_2.g(blockPos));
    }

    private boolean a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!this.a(world, blockPos)) {
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
}

