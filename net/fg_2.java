/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Random;

/*
 * Renamed from net.fg
 */
public class fg_2
extends f3_0 {
    public static JC<YZ> Q = xu_0.a(a58.a, YZ.class);

    @Override
    public int d(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), Q, (Comparable)((Object)my_2.a(n)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        return my_2.a((YZ)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (YZ yZ : YZ.values()) {
            ListInvoker.add(list, new ItemStack(item, 1, my_2.a(yZ)));
        }
    }

    @Override
    public void a(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            DO.a(world, blockPos);
        }
    }

    public fg_2(Material material) {
        super(material, false);
        this.f(BlockStateInvoker.a(aXF.c(this.D), Q, (Comparable)((Object)YZ.WHITE)));
        this.a(CreativeTabs.m);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return my_2.b((YZ)((Object)BlockStateInvoker.b(iBlockState, Q)));
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    protected boolean c() {
        return true;
    }

    @Override
    public a5w_0 K() {
        return a5w_0.TRANSLUCENT;
    }

    @Override
    protected a42 s() {
        return new a42(this, Q);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    @Override
    public void c(World world, BlockPos blockPos, IBlockState iBlockState) {
        if (!world.isRemote) {
            DO.a(world, blockPos);
        }
    }
}

