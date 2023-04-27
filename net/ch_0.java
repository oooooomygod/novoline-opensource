/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EntityRenderer;

/*
 * Renamed from net.Ch
 */
class ch_0
implements Predicate {
    EntityRenderer a;

    ch_0(EntityRenderer entityRenderer) {
        this.a = entityRenderer;
    }

    public boolean apply(Object object) {
        return this.a((Entity)object);
    }

    public boolean a(Entity entity) {
        return ayj_0.z(entity);
    }
}

