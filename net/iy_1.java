/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EntityPlayerMP;

/*
 * Renamed from net.iY
 */
class iy_1
implements Predicate<Entity> {
    int a;

    iy_1(int n) {
        this.a = n;
    }

    public boolean a(Entity entity) {
        if (!(entity instanceof EntityPlayerMP)) {
            return false;
        }
        EntityPlayerMP entityPlayerMP = (EntityPlayerMP)entity;
        return ar3_0.a(Uf.a(entityPlayerMP.bX)) == this.a;
    }
}

