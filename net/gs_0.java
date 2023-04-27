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
 * Renamed from net.gS
 */
public class gs_0
extends Block {
    public static JC<a2y_0> S = xu_0.a(MY.a, a2y_0.class);
    public static int R;
    public static int P;
    public static int Q;

    @Override
    public MapColor g(IBlockState iBlockState) {
        return BlockStateInvoker.b(iBlockState, S) == a2y_0.ROUGH ? MapColor.K : MapColor.v;
    }

    static {
        Q = mr_0.a(a2y_0.ROUGH);
        P = mr_0.a(a2y_0.BRICKS);
        R = mr_0.a(a2y_0.DARK);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return mr_0.a((a2y_0)((Object)BlockStateInvoker.b(iBlockState, S)));
    }

    public gs_0() {
        super(Material.y);
        this.f(BlockStateInvoker.a(aXF.c(this.D), S, (Comparable)((Object)a2y_0.ROUGH)));
        this.a(CreativeTabs.m);
    }

    @Override
    public int h(IBlockState iBlockState) {
        return mr_0.a((a2y_0)((Object)BlockStateInvoker.b(iBlockState, S)));
    }

    @Override
    protected a42 s() {
        return new a42(this, S);
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, Q));
        ListInvoker.add(list, new ItemStack(item, 1, P));
        ListInvoker.add(list, new ItemStack(item, 1, R));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), S, (Comparable)((Object)mr_0.a(n)));
    }

    @Override
    public String C() {
        return ahq_0.b(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.J()), MY.b), a2y_0.ROUGH.b()), MY.c).toString());
    }
}

