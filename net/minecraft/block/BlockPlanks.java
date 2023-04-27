/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.List;

import net.CreativeTabs;
import net.F3;
import net.IBlockState;
import net.Item;
import net.JC;
import net.MapColor;
import net.Material;
import net.a42;
import net.aER;
import net.aXF;
import net.hb_0;
import net.xu_0;

public class BlockPlanks
extends Block {
    public static JC<F3> P = xu_0.a(hb_0.a, F3.class);

    public BlockPlanks() {
        super(Material.wood);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)F3.OAK)));
        this.a(CreativeTabs.m);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return aER.a((F3)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)aER.a(n)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (F3 f3 : F3.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, aER.b(f3)));
        }
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return aER.b((F3)((Object)BlockStateInvoker.b(iBlockState, P)));
    }
}

