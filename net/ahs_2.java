/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import net.rm_2;

/*
 * Renamed from net.ahs
 */
class ahs_2
implements Predicate<Entity> {
    rm_2 a;

    public boolean a(Entity entity) {
        return entity.posX >= this.a.e && entity.posY >= this.a.a && entity.posZ >= this.a.f && entity.posX < this.a.b && entity.posY < this.a.c && entity.posZ < this.a.d;
    }

    ahs_2(rm_2 rm_22) {
        this.a = rm_22;
    }
}

