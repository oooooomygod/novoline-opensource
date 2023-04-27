/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.h3
 */
public abstract class h3_0
extends hj_2 {
    public static JC<F3> Q = xu_0.a(ak1_0.a, F3.class);

    @Override
    public a4_0<?> e() {
        return Q;
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return aER.a((F3)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.e);
    }

    @Override
    public String a(int n) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.J()), ak1_0.b), aER.a(n).b()).toString();
    }

    @Override
    public Object a(ItemStack itemStack) {
        return aER.a(act_2.c(itemStack) & 7);
    }

    public h3_0() {
        super(Material.wood);
        IBlockState iBlockState = aXF.c(this.D);
        if (!this.d()) {
            iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)wj_2.BOTTOM));
        }
        this.f(BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)F3.OAK)));
        this.a(CreativeTabs.m);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, Q)));
        if (!this.d() && BlockStateInvoker.b(iBlockState, P) == wj_2.TOP) {
            n |= 8;
        }
        return n;
    }

    @Override
    protected a42 s() {
        return this.d() ? new a42(this, Q) : new a42(this, P, Q);
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        if (item != px_0.a(Blocks.a_)) {
            for (F3 f3 : F3.values()) {
                ListInvoker.add(list, new ItemStack(item, 1, aER.b(f3)));
            }
        }
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.e);
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)aER.a(n & 7)));
        if (!this.d()) {
            iBlockState = BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)((n & 8) == 0 ? wj_2.BOTTOM : wj_2.TOP)));
        }
        return iBlockState;
    }
}

