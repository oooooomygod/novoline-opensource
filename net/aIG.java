/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import net.ar0_0;
import net.ayj_0;

class aIG
implements Predicate<Entity> {
    aIG() {
    }

    public boolean a(Entity entity) {
        return entity instanceof ar0_0 && !ayj_0.L(entity);
    }
}

