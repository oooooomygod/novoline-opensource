/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import net.ayj_0;

/*
 * Renamed from net.vo
 */
class vo_2
implements Predicate<Entity> {
    vo_2() {
    }

    public boolean a(Entity entity) {
        return ayj_0.a(entity) && entity.h == null && entity.r == null;
    }
}

