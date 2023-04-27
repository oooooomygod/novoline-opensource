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
import net.rs_1;

/*
 * Renamed from net.ayZ
 */
class ayz_1
implements Predicate<Entity> {
    ayz_1() {
    }

    public boolean a(Entity entity) {
        return entity instanceof rs_1 && ayj_0.a(entity);
    }
}

