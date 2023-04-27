/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

/*
 * Renamed from net.Lb
 */
public class lb_0
extends Item {
    public lb_0() {
        this.a(1);
    }

    public static boolean a(NBTTagCompound nBTTagCompound) {
        return false;
    }

    @Override
    public ItemStack b(ItemStack itemStack, World world, EntityPlayer entityPlayer) {
        a6w_0.a(entityPlayer, itemStack);
        a6w_0.a(entityPlayer, aop_1.p[Item.b(this)]);
        return itemStack;
    }
}

