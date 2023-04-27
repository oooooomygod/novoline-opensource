/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;
import java.util.List;


public class LG
extends LA {
    private boolean v;

    @Override
    public String i(ItemStack itemStack) {
        return aC0.a(itemStack) == Ky.PUFFERFISH ? aco_1.a : null;
    }

    @Override
    public int b(ItemStack itemStack) {
        Ky ky = aC0.a(itemStack);
        return this.v && aC0.c(ky) ? aC0.a(ky) : aC0.f(ky);
    }

    @Override
    public String a(ItemStack itemStack) {
        Ky ky = aC0.a(itemStack);
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), this.d()), aco_1.e), ky.f()), aco_1.b), this.v && aC0.c(ky) ? aco_1.d : aco_1.c).toString();
    }

    @Override
    public void a(Item item, CreativeTabs creativeTabs, List<ItemStack> list) {
        for (Ky ky : Ky.values()) {
            if (this.v && !aC0.c(ky)) continue;
            ListInvoker.add(list, new ItemStack(this, 1, aC0.e(ky)));
        }
    }

    public LG(boolean bl) {
        super(0, 0.0f, false);
        this.v = bl;
    }

    @Override
    protected void b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        Ky ky = aC0.a(itemStack);
        if (ky == Ky.PUFFERFISH) {
            a6w_0.a(entityPlayer, new a2l_0(ari_0.f(Potion.poison), 1200, 3));
            a6w_0.a(entityPlayer, new a2l_0(ari_0.f(Potion.hunger), 300, 2));
            a6w_0.a(entityPlayer, new a2l_0(ari_0.f(Potion.confusion), 300, 1));
        }
        super.b(itemStack, world, entityPlayer);
    }

    @Override
    public float a(ItemStack itemStack) {
        Ky ky = aC0.a(itemStack);
        return this.v && aC0.c(ky) ? aC0.b(ky) : aC0.d(ky);
    }
}

