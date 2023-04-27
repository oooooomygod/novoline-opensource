/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.minecraft.item.ItemStack;

public class OZ
implements Predicate<Entity> {
    private ItemStack a;

    public boolean a(Entity entity) {
        if (!ayj_0.a(entity)) {
            return false;
        }
        if (!(entity instanceof EntityLivingBase)) {
            return false;
        }
        EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
        return atn_0.f(entityLivingBase, CG.a(this.a)) == null && (entityLivingBase instanceof nl_1 ? CG.w((nl_1)entityLivingBase) : entityLivingBase instanceof ol_2 || entityLivingBase instanceof EntityPlayer);
    }

    public OZ(ItemStack itemStack) {
        this.a = itemStack;
    }
}

