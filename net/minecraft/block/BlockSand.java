/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.CreativeTabs;
import net.IBlockState;
import net.Item;
import net.JC;
import net.MapColor;
import net.a42;
import net.aCR;
import net.aSQ;
import net.aXF;
import net.pl_0;
import net.xu_0;

public class BlockSand
extends BlockFalling {
    public static JC<aSQ> Q = xu_0.a(aCR.a, aSQ.class);

    @Override
    protected a42 s() {
        return new a42(this, Q);
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)pl_0.a(n)));
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return pl_0.b((aSQ)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return pl_0.a((aSQ)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (aSQ aSQ2 : aSQ.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, pl_0.a(aSQ2)));
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return pl_0.a((aSQ)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    public BlockSand() {
        this.f(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)aSQ.SAND)));
    }
}

