/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Ld
 */
public class ld_0
extends Item {
    public ld_0() {
        this.a(CreativeTabs.c);
    }

    @Override
    public boolean a(ItemStack itemStack, EntityPlayer entityPlayer, EntityLivingBase entityLivingBase) {
        if (!act_2.g(itemStack)) {
            return false;
        }
        if (entityLivingBase instanceof nl_1) {
            nl_1 nl_12 = (nl_1)entityLivingBase;
            CG.a(nl_12, act_2.w(itemStack));
            CG.f(nl_12);
            --itemStack.a;
            return true;
        }
        return super.a(itemStack, entityPlayer, entityLivingBase);
    }
}

