/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EntityLivingBase;
import deobf.EntityPlayer;
import net.atn_0;
import net.nJ;
import net.nx_1;

/*
 * Renamed from net.aKw
 */
class akw_0
implements Predicate<EntityLivingBase> {
    private nx_1 a;

    public boolean a(EntityLivingBase entityLivingBase) {
        return (entityLivingBase instanceof EntityPlayer || entityLivingBase instanceof nJ) && atn_0.b(entityLivingBase, this.a) > 9.0;
    }

    public akw_0(nx_1 nx_12) {
        this.a = nx_12;
    }
}

