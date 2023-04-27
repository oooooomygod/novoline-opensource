/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.hk
 */
public class hk_1
extends Block {
    public static int Q;
    public static int T;
    public static int S;
    public static int R;
    public static JC<aCq> P;

    public hk_1() {
        super(Material.y);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)aCq.DEFAULT)));
        this.a(CreativeTabs.m);
    }

    static {
        P = xu_0.a(aE6.a, aCq.class);
        S = ahu_0.a(aCq.DEFAULT);
        R = ahu_0.a(aCq.MOSSY);
        Q = ahu_0.a(aCq.CRACKED);
        T = ahu_0.a(aCq.CHISELED);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return ahu_0.a((aCq)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)ahu_0.a(n)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (aCq aCq2 : aCq.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, ahu_0.a(aCq2)));
        }
    }

    @Override
    public int h(IBlockState iBlockState) {
        return ahu_0.a((aCq)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }
}

