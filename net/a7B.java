/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.InventoryInvoker;
import cc.novoline.invoke.MathInvoker;
import net.minecraft.init.Blocks;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class a7B
extends Slot {
    private int h;
    private EntityPlayer g;
    private adb_1 f;

    @Override
    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        this.b(itemStack);
        ItemStack[] itemStackArray = am5_0.a(am5_0.c(), this.f, entityPlayer.worldObj);
        for (int i = 0; i < itemStackArray.length; ++i) {
            aVF.b(this.f, i);
            ItemStack itemStack2 = itemStackArray[i];
            aVF.a(this.f, i, 1);
            if (aVF.b(this.f, i) == null) {
                aVF.a(this.f, i, itemStack2);
                continue;
            }
            if (InventoryInvoker.b(this.g.inventory, itemStack2)) continue;
            a6w_0.a(this.g, itemStack2, false);
        }
    }

    @Override
    protected void a(ItemStack itemStack, int n) {
        this.h += n;
        this.b(itemStack);
    }

    @Override
    protected void b(ItemStack itemStack) {
        if (this.h > 0) {
            act_2.a(itemStack, this.g.worldObj, this.g, this.h);
        }
        this.h = 0;
        if (act_2.k(itemStack) == px_0.a(Blocks.aq)) {
            a6w_0.a(this.g, apf_0.k);
        }
        if (act_2.k(itemStack) instanceof LY) {
            a6w_0.a(this.g, apf_0.f);
        }
        if (act_2.k(itemStack) == px_0.a(Blocks.ab)) {
            a6w_0.a(this.g, apf_0.u);
        }
        if (act_2.k(itemStack) instanceof LZ) {
            a6w_0.a(this.g, apf_0.K);
        }
        if (act_2.k(itemStack) == Items.bread) {
            a6w_0.a(this.g, apf_0.d);
        }
        if (act_2.k(itemStack) == Items.cake) {
            a6w_0.a(this.g, apf_0.M);
        }
        if (act_2.k(itemStack) instanceof LY && ag8_0.a((LY)act_2.k(itemStack)) != anh_2.WOOD) {
            a6w_0.a(this.g, apf_0.j);
        }
        if (act_2.k(itemStack) instanceof LC) {
            a6w_0.a(this.g, apf_0.g);
        }
        if (act_2.k(itemStack) == px_0.a(Blocks.bw)) {
            a6w_0.a(this.g, apf_0.x);
        }
        if (act_2.k(itemStack) == px_0.a(Blocks.at)) {
            a6w_0.a(this.g, apf_0.n);
        }
        if (act_2.k(itemStack) == Items.golden_apple && act_2.c(itemStack) == 1) {
            a6w_0.a(this.g, apf_0.o);
        }
    }

    public a7B(EntityPlayer entityPlayer, adb_1 adb_12, rs_1 rs_12, int n, int n2, int n3) {
        super(rs_12, n, n2, n3);
        this.g = entityPlayer;
        this.f = adb_12;
    }

    @Override
    public ItemStack a(int n) {
        if (this.d()) {
            this.h += MathInvoker.b(n, this.f().a);
        }
        return super.a(n);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return false;
    }
}

