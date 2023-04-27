/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.EnchantmentHelperInvoker;
import cc.novoline.invoke.InventoryInvoker;
import deobf.Entity;
import deobf.EntityArrow;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class ItemBow
extends Item {
    public static String[] m = new String[]{GV.a, GV.d, GV.b};

    @Override
    public int q() {
        return 1;
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        if (aSY.a(entityPlayer.abilities) || InventoryInvoker.a(entityPlayer.inventory, Items.arrow)) {
            a6w_0.a(entityPlayer, itemStack, this.getMaxItemUseDuration(itemStack));
        }
        return itemStack;
    }

    @Override
    public ItemStack c(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        return itemStack;
    }

    @Override
    public void onPlayerStoppedUsing(ItemStack itemStack, World world, EntityPlayer entityPlayer, int n) {
        boolean bl = aSY.a(entityPlayer.abilities) || alf_0.a(yl_2.t.c, itemStack) > 0;
        if (InventoryInvoker.a(entityPlayer.inventory, Items.arrow)) {
            int n2 = this.getMaxItemUseDuration(itemStack) - n;
            float f = (float)n2 / 20.0f;
            if ((double)(f = (f * f + f * 2.0f) / 3.0f) < 0.1) {
                return;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            EntityArrow entityArrow = new EntityArrow(world, entityPlayer, f * 2.0f);
            if (f == 1.0f) {
                EnchantmentHelperInvoker.a(entityArrow, true);
            }
            int n3 = alf_0.a(yl_2.j.c, itemStack);
            EnchantmentHelperInvoker.a(entityArrow, EnchantmentHelperInvoker.b(entityArrow) + (double)n3 * 0.5 + 0.5);
            int n4 = alf_0.a(yl_2.E.c, itemStack);
            EnchantmentHelperInvoker.a(entityArrow, n4);
            if (alf_0.a(yl_2.a.c, itemStack) > 0) {
                EnchantmentHelperInvoker.b(entityArrow, 100);
            }
            act_2.damageItem(itemStack, 1, entityPlayer);
            aV8.a(world, (Entity)entityPlayer, GV.c, 1.0f, 1.0f / (a5_0.e(j) * 0.4f + 1.2f) + f * 0.5f);
            entityArrow.au = 2;
            a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
            if (!world.isRemote) {
                aV8.b(world, entityArrow);
            }
        }
    }

    public ItemBow() {
        this.c = 1;
        this.setMaxDamage(384);
        this.a(CreativeTabs.a);
    }

    @Override
    public int getMaxItemUseDuration(ItemStack itemStack) {
        return 72000;
    }

    @Override
    public ti_1 c(ItemStack itemStack) {
        return ti_1.BOW;
    }
}

