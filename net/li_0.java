/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlockStateInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import deobf.EnumFacing;
import net.minecraft.block.BlockPos;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.List;
import java.util.Map;

/*
 * Renamed from net.Li
 */
public class li_0
extends Item {
    private static Map<String, li_0> n = MapsInvoker.a();
    public String m;

    @Override
    public void a(ItemStack itemStack, EntityPlayer entityPlayer, List<String> list, boolean bl) {
        ListInvoker.add(list, this.a());
    }

    public static li_0 a(String string) {
        return (li_0)MapInvoker.c(n, string);
    }

    public String a() {
        return ahq_0.b(aL0.a(aL0.a(aL0.a(new StringBuilder(), amu_1.b), this.m), amu_1.a).toString());
    }

    protected li_0(String string) {
        this.m = string;
        this.c = 1;
        this.a(CreativeTabs.b);
        MapInvoker.c(n, aL0.a(aL0.a(new StringBuilder(), amu_1.c), string).toString(), this);
    }

    @Override
    public arq_0 d(ItemStack itemStack) {
        return arq_0.RARE;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, World world, BlockPos blockPos, EnumFacing enumFacing, float f, float f2, float f3) {
        IBlockState iBlockState = aV8.q(world, blockPos);
        if (BlockStateInvoker.getBlock(iBlockState) == Blocks.a5 && !auk_2.a((Boolean)BlockStateInvoker.b(iBlockState, fk_1.P))) {
            if (!world.isRemote) {
                azc_0.a((fk_1)Blocks.a5, world, blockPos, iBlockState, itemStack);
                aV8.a(world, (EntityPlayer)null, 1005, blockPos, Item.b(this));
                --itemStack.a;
                a6w_0.a(entityPlayer, aop_1.S);
            }
            return true;
        }
        return false;
    }
}

