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
import net.aS_;
import net.atn_0;

/*
 * Renamed from net.anp
 */
class anp_2
implements Predicate<Entity> {
    boolean b;
    String a;

    public boolean a(Entity entity) {
        if (!(entity instanceof EntityLivingBase)) {
            return false;
        }
        EntityLivingBase entityLivingBase = (EntityLivingBase)entity;
        atn_0.d(entityLivingBase);
        String string = aS_.a;
        return string.equals(this.a) != this.b;
    }

    anp_2(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }
}

