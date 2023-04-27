/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class a7P
extends Slot {
    private a7K i;
    private EntityPlayer h;
    private int g;
    private anb_1 f;

    @Override
    public ItemStack a(int n) {
        if (this.d()) {
            this.g += MathInvoker.b(n, this.f().a);
        }
        return super.a(n);
    }

    @Override
    protected void b(ItemStack itemStack) {
        act_2.a(itemStack, this.h.worldObj, this.h, this.g);
        this.g = 0;
    }

    @Override
    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        this.b(itemStack);
        ahh_0 ahh_02 = aoo_2.b(this.f);
        ItemStack itemStack2 = aoo_2.a(this.f, 0);
        ItemStack itemStack3 = aoo_2.a(this.f, 1);
        if (this.a(ahh_02, itemStack2, itemStack3) || this.a(ahh_02, itemStack3, itemStack2)) {
            ze_1.a(this.i, ahh_02);
            a6w_0.a(entityPlayer, aop_1.t);
            if (itemStack2.a <= 0) {
                itemStack2 = null;
            }
            if (itemStack3.a <= 0) {
                itemStack3 = null;
            }
            aoo_2.a(this.f, 0, itemStack2);
            aoo_2.a(this.f, 1, itemStack3);
        }
    }

    @Override
    protected void a(ItemStack itemStack, int n) {
        this.g += n;
        this.b(itemStack);
    }

    private boolean a(ahh_0 ahh_02, ItemStack itemStack, ItemStack itemStack2) {
        ItemStack itemStack3 = aEU.e(ahh_02);
        ItemStack itemStack4 = aEU.f(ahh_02);
        if (act_2.k(itemStack) == act_2.k(itemStack3)) {
            if (act_2.k(itemStack4) == act_2.k(itemStack2)) {
                itemStack.a -= itemStack3.a;
                itemStack2.a -= itemStack4.a;
                return true;
            }
            itemStack.a -= itemStack3.a;
            return true;
        }
        return false;
    }

    public a7P(EntityPlayer entityPlayer, a7K a7K2, anb_1 anb_12, int n, int n2, int n3) {
        super(anb_12, n, n2, n3);
        this.h = entityPlayer;
        this.i = a7K2;
        this.f = anb_12;
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return false;
    }
}

