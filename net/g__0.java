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
 * Renamed from net.g_
 */
public class g__0
extends Block {
    public static JC<akv_1> P = xu_0.a(tg_0.a, akv_1.class);

    public g__0() {
        super(Material.y, pl_0.b(aSQ.RED_SAND));
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)akv_1.DEFAULT)));
        this.a(CreativeTabs.m);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)SX.a(n)));
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public int h(IBlockState iBlockState) {
        return SX.a((akv_1)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public int d(IBlockState iBlockState) {
        return SX.a((akv_1)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (akv_1 akv_12 : akv_1.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, SX.a(akv_12)));
        }
    }
}

