/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import deobf.EntityLivingBase;
import deobf.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPos;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.gM
 */
public class gm_1
extends Block {
    public static JC<MQ> P = xu_0.a(aQM.a, MQ.class);

    @Override
    protected ItemStack b(IBlockState iBlockState) {
        MQ mQ = (MQ)((Object)BlockStateInvoker.b(iBlockState, P));
        return mQ != MQ.LINES_X && mQ != MQ.LINES_Z ? super.b(iBlockState) : new ItemStack(px_0.a(this), 1, ad_0.a(MQ.LINES_Y));
    }

    public gm_1() {
        super(Material.y);
        this.f(BlockStateInvoker.a(aXF.c(this.D), P, (Comparable)((Object)MQ.DEFAULT)));
        this.a(CreativeTabs.m);
    }

    @Override
    public IBlockState a(World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3, int n, EntityLivingBase entityLivingBase) {
        if (n == ad_0.a(MQ.LINES_Y)) {
            switch (azr_0.a[SJ.h(enumFacing).ordinal()]) {
                case 1: {
                    return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)MQ.LINES_Z));
                }
                case 2: {
                    return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)MQ.LINES_X));
                }
            }
            return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)MQ.LINES_Y));
        }
        return n == ad_0.a(MQ.CHISELED) ? BlockStateInvoker.a(this.m(), P, (Comparable)((Object)MQ.CHISELED)) : BlockStateInvoker.a(this.m(), P, (Comparable)((Object)MQ.DEFAULT));
    }

    @Override
    protected a42 s() {
        return new a42(this, P);
    }

    @Override
    public int d(IBlockState iBlockState) {
        return ad_0.a((MQ)((Object)BlockStateInvoker.b(iBlockState, P)));
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, ad_0.a(MQ.DEFAULT)));
        ListInvoker.add(list, new ItemStack(item, 1, ad_0.a(MQ.CHISELED)));
        ListInvoker.add(list, new ItemStack(item, 1, ad_0.a(MQ.LINES_Y)));
    }

    @Override
    public int h(IBlockState iBlockState) {
        MQ mQ = (MQ)((Object)BlockStateInvoker.b(iBlockState, P));
        return mQ != MQ.LINES_X && mQ != MQ.LINES_Z ? ad_0.a(mQ) : ad_0.a(MQ.LINES_Y);
    }

    @Override
    public MapColor g(IBlockState iBlockState) {
        return MapColor.E;
    }

    @Override
    public IBlockState c(int n) {
        return BlockStateInvoker.a(this.m(), P, (Comparable)((Object)ad_0.a(n)));
    }
}

