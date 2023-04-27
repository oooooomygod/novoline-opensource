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
 * Renamed from net.hl
 */
public class hl_2
extends Block {
    public static JC<aeo_1> P = xu_0.a(avt_2.a, aeo_1.class);

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.z;
    }

    @Override
    public int d(IBlockState iBlockState) {
        return le_1.a((aeo_1)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (aeo_1 aeo_12 : aeo_1.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, le_1.a(aeo_12)));
        }
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)le_1.a(n)));
    }

    public hl_2() {
        super(Material.y);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)aeo_1.DEFAULT)));
        this.a(CreativeTabs.m);
    }

    @Override
    public int h(IBlockState iBlockState) {
        return le_1.a((aeo_1)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }
}

