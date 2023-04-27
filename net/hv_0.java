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
 * Renamed from net.hV
 */
public abstract class hv_0
extends hj_2 {
    public static J_ Q = aWq.a(a4J.b);
    public static JC<mp_0> R = xu_0.a(a4J.c, mp_0.class);

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.bf);
    }

    @Override
    public a4_0<?> e() {
        return R;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.bf);
    }

    @Override
    protected a42 s() {
        return this.d() ? new a42(this, Q, R) : new a42(this, P, R);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= ahl_2.b((mp_0)((Object)BlockStateInvoker.b(iBlockState, R)));
        if (this.d()) {
            if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, Q))) {
                n |= 8;
            }
        } else if (BlockStateInvoker.b(iBlockState, P) == wj_2.TOP) {
            n |= 8;
        }
        return n;
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        if (item != px_0.a(Blocks.ah)) {
            for (mp_0 mp_02 : mp_0.values()) {
                ListInvoker.add(list, new ItemStack(item, 1, ahl_2.b(mp_02)));
            }
        }
    }

    @Override
    public String C() {
        return ahq_0.b(aL0.a(aL0.a(new StringBuilder(), this.J()), a4J.d).toString());
    }

    @Override
    public int h(IBlockState iBlockState) {
        return ahl_2.b((mp_0)((Object)BlockStateInvoker.b(iBlockState, R)));
    }

    public hv_0() {
        super(Material.y);
        IBlockState iBlockState = aXF.c(this.D);
        iBlockState = this.d() ? BlockStateInvoker.a(iBlockState, Q, Boolean.FALSE) : BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)wj_2.BOTTOM));
        this.f(BlockStateInvoker.a(iBlockState, R, (Comparable)((Object)mp_0.RED_SANDSTONE)));
        this.a(CreativeTabs.m);
    }

    @Override
    public String a(int n) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.J()), a4J.a), ahl_2.a(n).c()).toString();
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = BlockStateInvoker.a(this.m(), R, (Comparable)((Object)ahl_2.a(n & 7)));
        iBlockState = this.d() ? BlockStateInvoker.a(iBlockState, Q, auk_2.b((n & 8) != 0)) : BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)((n & 8) == 0 ? wj_2.BOTTOM : wj_2.TOP)));
        return iBlockState;
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return ahl_2.a((mp_0)((Object)BlockStateInvoker.b(iBlockState, R)));
    }

    @Override
    public Object a(ItemStack itemStack) {
        return ahl_2.a(act_2.c(itemStack) & 7);
    }
}

