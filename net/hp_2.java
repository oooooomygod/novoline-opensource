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
 * Renamed from net.hp
 */
public abstract class hp_2
extends hj_2 {
    public static JC<aAB> Q;
    public static J_ R;

    @Override
    public int h(IBlockState iBlockState) {
        return acz_0.a((aAB)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public IBlockState c(int n) {
        IBlockState iBlockState = BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)acz_0.a(n & 7)));
        iBlockState = this.d() ? BlockStateInvoker.a(iBlockState, R, auk_2.b((n & 8) != 0)) : BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)((n & 8) == 0 ? wj_2.BOTTOM : wj_2.TOP)));
        return iBlockState;
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return px_0.a(Blocks.bA);
    }

    @Override
    protected a42 s() {
        return this.d() ? new a42(this, R, Q) : new a42(this, P, Q);
    }

    @Override
    public Item d(World world, BlockPos blockPos) {
        return px_0.a(Blocks.bA);
    }

    @Override
    public a4_0<?> e() {
        return Q;
    }

    public hp_2() {
        super(Material.y);
        IBlockState iBlockState = aXF.c(this.D);
        iBlockState = this.d() ? BlockStateInvoker.a(iBlockState, R, Boolean.FALSE) : BlockStateInvoker.a(iBlockState, P, (Comparable)((Object)wj_2.BOTTOM));
        this.f(BlockStateInvoker.a(iBlockState, Q, (Comparable)((Object)aAB.STONE)));
        this.a(CreativeTabs.m);
    }

    @Override
    public String a(int n) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), super.J()), mt_2.a), acz_0.a(n).b()).toString();
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        if (item != px_0.a(Blocks.X)) {
            for (aAB aAB2 : aAB.values()) {
                if (aAB2 == aAB.WOOD) continue;
                ListInvoker.add(list, new ItemStack(item, 1, acz_0.a(aAB2)));
            }
        }
    }

    @Override
    public Object a(ItemStack itemStack) {
        return acz_0.a(act_2.c(itemStack) & 7);
    }

    static {
        R = aWq.a(mt_2.c);
        Q = xu_0.a(mt_2.b, aAB.class);
    }

    @Override
    public int d(IBlockState iBlockState) {
        int n = 0;
        n |= acz_0.a((aAB)((Object)BlockStateInvoker.b(iBlockState, Q)));
        if (this.d()) {
            if (auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, R))) {
                n |= 8;
            }
        } else if (BlockStateInvoker.b(iBlockState, P) == wj_2.TOP) {
            n |= 8;
        }
        return n;
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return acz_0.b((aAB)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }
}

