/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class LS
extends Item {
    @Override
    public boolean a(ItemStack itemStack, EntityLivingBase entityLivingBase, EntityLivingBase entityLivingBase2) {
        this.a(itemStack, (EntityPlayer)null, entityLivingBase);
        return true;
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        if (entityLivingBase instanceof nh_1) {
            nh_1 nh_12 = (nh_1)entityLivingBase;
            if (!ark_0.c(nh_12) && !ark_0.a(nh_12)) {
                ark_0.a(nh_12, true);
                aV8.a(nh_12.worldObj, nh_12, a7S.a, 0.5f, 1.0f);
                --itemStack.a;
            }
            return true;
        }
        return false;
    }

    public LS() {
        this.c = 1;
        this.a(CreativeTabs.f);
    }
}

