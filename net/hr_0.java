/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.IBlockAccess;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.hR
 */
public class hr_0
extends Block {
    public static J_ P;
    public static JC<akb_0> Q;
    public static J_ S;
    public static J_ T;
    public static J_ R;
    public static J_ U;

    static {
        R = aWq.a(axs_0.d);
        T = aWq.a(axs_0.a);
        U = aWq.a(axs_0.h);
        S = aWq.a(axs_0.g);
        P = aWq.a(axs_0.c);
        Q = xu_0.a(axs_0.b, akb_0.class);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)ya_1.a(n)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (akb_0 akb_02 : akb_0.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, ya_1.a(akb_02)));
        }
    }

    @Override
    public int h(IBlockState iBlockState) {
        return ya_1.a((akb_0)((Object)BlockStateInvoker.b(iBlockState, Q)));
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
        return enumFacing != EnumFacing.DOWN || super.b(iBlockAccess, blockPos, enumFacing);
    }

    @Override
    public String C() {
        return ahq_0.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.J()), axs_0.e), akb_0.NORMAL.b()), axs_0.f).toString());
    }

    public boolean a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        Block block = BlockStateInvoker.getBlock(aG3.c(iBlockAccess, blockPos));
        return block != Blocks.ao && (block == this || block instanceof gv_2 || akm_1.g(block.o) && block.v() && block.o != Material.h);
    }

    public hr_0(Block block) {
        super(block.o);
        this.f(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(aXF.c(this.D), R, Boolean.FALSE), T, Boolean.FALSE), U, Boolean.FALSE), S, Boolean.FALSE), P, Boolean.FALSE), Q, (Comparable)((Object)akb_0.NORMAL)));
        this.setHardness(block.K);
        this.a(block.s / 3.0f);
        this.a(block.l);
        this.a(CreativeTabs.m);
    }

    @Override
    public IBlockState a(IBlockState iBlockState, IBlockAccess iBlockAccess, BlockPos blockPos) {
        return BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(BlockStateInvoker.a(iBlockState, R, auk_2.b(!aG3.b(iBlockAccess, amv_2.e(blockPos)))), T, auk_2.b(this.a(iBlockAccess, amv_2.a(blockPos)))), U, auk_2.b(this.a(iBlockAccess, amv_2.f(blockPos)))), S, auk_2.b(this.a(iBlockAccess, amv_2.b(blockPos)))), P, auk_2.b(this.a(iBlockAccess, amv_2.d(blockPos))));
    }

    @Override
    public boolean c(IBlockAccess iBlockAccess, BlockPos blockPos) {
        return false;
    }

    @Override
    public rm_2 b(World world, BlockPos blockPos, IBlockState iBlockState) {
        this.a((IBlockAccess)world, blockPos);
        this.b = 1.5;
        return super.b(world, blockPos, iBlockState);
    }

    @Override
    public void a(IBlockAccess iBlockAccess, BlockPos blockPos) {
        this.a(iBlockAccess, amv_2.a(blockPos));
        this.a(iBlockAccess, amv_2.b(blockPos));
        this.a(iBlockAccess, amv_2.d(blockPos));
        this.a(iBlockAccess, amv_2.f(blockPos));
        float f = 0.25f;
        float f2 = 0.75f;
        float f3 = 0.25f;
        float f4 = 0.75f;
        float f5 = 1.0f;
        f3 = 0.0f;
        f4 = 1.0f;
        f = 0.0f;
        f2 = 1.0f;
        f5 = 0.8125f;
        f = 0.3125f;
        f2 = 0.6875f;
        this.a(f, 0.0f, f3, f2, f5, f4);
    }

    @Override
    protected a42 s() {
        return new a42(this, R, T, U, P, S, Q);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return ya_1.a((akb_0)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }
}

