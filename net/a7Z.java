/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class a7Z
extends Slot {
    private int g;
    private EntityPlayer f;

    @Override
    protected void b(ItemStack itemStack) {
        act_2.a(itemStack, this.f.worldObj, this.f, this.g);
        if (!this.f.worldObj.isRemote) {
            int n;
            int n2 = this.g;
            float f = a3q_0.b(a3q_0.a(), itemStack);
            if (f == 0.0f) {
                n2 = 0;
            } else if (f < 1.0f) {
                n = MathHelper.f((float)n2 * f);
                if (n < MathHelper.c((float)n2 * f) && MathInvoker.a() < (double)((float)n2 * f - (float)n)) {
                    ++n;
                }
                n2 = n;
            }
            while (true) {
                n = TC.a(n2);
                n2 -= n;
                aV8.b(this.f.worldObj, new oa_2(this.f.worldObj, this.f.posX, this.f.posY + 0.5, this.f.posZ + 0.5, n));
            }
        }
        this.g = 0;
        if (act_2.k(itemStack) == Items.iron_ingot) {
            a6w_0.a(this.f, apf_0.y);
        }
        if (act_2.k(itemStack) == Items.cooked_fish) {
            a6w_0.a(this.f, apf_0.D);
        }
    }

    @Override
    protected void a(ItemStack itemStack, int n) {
        this.g += n;
        this.b(itemStack);
    }

    @Override
    public void a(EntityPlayer entityPlayer, ItemStack itemStack) {
        this.b(itemStack);
        super.a(entityPlayer, itemStack);
    }

    @Override
    public ItemStack a(int n) {
        if (this.d()) {
            this.g += MathInvoker.b(n, this.f().a);
        }
        return super.a(n);
    }

    @Override
    public boolean a(ItemStack itemStack) {
        return false;
    }

    public a7Z(EntityPlayer entityPlayer, rs_1 rs_12, int n, int n2, int n3) {
        super(rs_12, n, n2, n3);
        this.f = entityPlayer;
    }
}

