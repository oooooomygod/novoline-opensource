/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.Entity;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemFishingRod
extends Item {
    @Override
    public boolean l() {
        return true;
    }

    @Override
    public boolean b(ItemStack itemStack) {
        return super.b(itemStack);
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (entityPlayer.bk != null) {
            int n = Cc.a(entityPlayer.bk);
            act_2.damageItem(itemStack, n, entityPlayer);
            a6w_0.L(entityPlayer);
        } else {
            aV8.a(world, (Entity)entityPlayer, XA.a, 0.5f, 0.4f / (a5_0.e(j) * 0.4f + 0.8f));
            if (!world.isRemote) {
                aV8.b(world, new oo_1(world, entityPlayer));
            }
            a6w_0.L(entityPlayer);
            a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        }
        return itemStack;
    }

    @Override
    public boolean a() {
        return true;
    }

    public ItemFishingRod() {
        this.setMaxDamage(64);
        this.a(1);
        this.a(CreativeTabs.c);
    }

    @Override
    public int q() {
        return 1;
    }
}

