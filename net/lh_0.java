/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.List;

/*
 * Renamed from net.Lh
 */
public class lh_0
extends LA {
    @Override
    public arq_0 d(ItemStack itemStack) {
        return act_2.c(itemStack) == 0 ? arq_0.RARE : arq_0.EPIC;
    }

    public lh_0(int n, float f, boolean bl) {
        super(n, f, bl);
        this.a(true);
    }

    @Override
    protected void b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (!world.isRemote) {
            a6w_0.a(entityPlayer, new a2l_0(ari_0.f(Potion.absorption), 2400, 0));
        }
        if (act_2.c(itemStack) > 0) {
            if (!world.isRemote) {
                a6w_0.a(entityPlayer, new a2l_0(ari_0.f(Potion.regeneration), 600, 4));
                a6w_0.a(entityPlayer, new a2l_0(ari_0.f(Potion.resistance), 6000, 0));
                a6w_0.a(entityPlayer, new a2l_0(ari_0.f(Potion.fireResistance), 6000, 0));
            }
        } else {
            super.b(itemStack, world, entityPlayer);
        }
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        ListInvoker.add(list, new ItemStack(item, 1, 0));
        ListInvoker.add(list, new ItemStack(item, 1, 1));
    }

    @Override
    public boolean h(ItemStack itemStack) {
        return act_2.c(itemStack) > 0;
    }
}

