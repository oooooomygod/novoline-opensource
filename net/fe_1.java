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
 * Renamed from net.fe
 */
public class fe_1
extends Block {
    public static JC<YZ> P = xu_0.a(S4.a, YZ.class);

    @Override
    public int h(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (YZ yZ : YZ.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, my_2.a(yZ)));
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)my_2.a(n)));
    }

    public fe_1(Material material) {
        super(material);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)YZ.WHITE)));
        this.a(CreativeTabs.m);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return my_2.b((YZ)((Object)BlockStateInvoker.b(iBlockState, P)));
    }
}

