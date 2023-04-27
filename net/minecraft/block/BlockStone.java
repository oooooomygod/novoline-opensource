/*
 * Decompiled with CFR 0.152.
 */
package net.minecraft.block;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.*;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class BlockStone
extends Block {
    public static JC<UI> P = xu_0.a(N3.b, UI.class);

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)XR.a(n)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (UI uI : UI.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, XR.b(uI)));
        }
    }

    @Override
    public int d(IBlockState iBlockState) {
        return XR.b((UI)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return XR.b((UI)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return XR.a((UI)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public Item a(IBlockState iBlockState, Random random, int n) {
        return BlockStateInvoker.b(iBlockState, P) == UI.STONE ? px_0.a(Blocks.cobblestone) : px_0.a(Blocks.stone);
    }

    @Override
    public String C() {
        return ahq_0.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.J()), N3.a), UI.STONE.b()), N3.c).toString());
    }

    public BlockStone() {
        super(Material.y);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)UI.STONE)));
        this.a(CreativeTabs.m);
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }
}

