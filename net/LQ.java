/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class LQ
extends Item {
    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        nh_1 nh_12;
        if (a6w_0.B(entityPlayer) && entityPlayer.r instanceof nh_1 && awd_1.a(ark_0.b(nh_12 = (nh_1)entityPlayer.r)) && itemStack.s() - act_2.c(itemStack) >= 7) {
            awd_1.b(ark_0.b(nh_12));
            act_2.damageItem(itemStack, 7, entityPlayer);
            if (itemStack.a == 0) {
                ItemStack itemStack2 = new ItemStack(Items.fishing_rod);
                act_2.b(itemStack2, act_2.a(itemStack));
                return itemStack2;
            }
        }
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack;
    }

    @Override
    public boolean a() {
        return true;
    }

    public LQ() {
        this.a(CreativeTabs.f);
        this.a(1);
        this.setMaxDamage(25);
    }

    @Override
    public boolean l() {
        return true;
    }
}

