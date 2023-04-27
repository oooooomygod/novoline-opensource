/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EntityLivingBase;
import net.WorldServer;
import net.atn_0;

/*
 * Renamed from net.vD
 */
class vd_1
implements Predicate<EntityLivingBase> {
    WorldServer a;

    public boolean a(EntityLivingBase entityLivingBase) {
        return atn_0.J(entityLivingBase) && this.a.B(atn_0.K(entityLivingBase));
    }

    vd_1(WorldServer worldServer) {
        this.a = worldServer;
    }
}

