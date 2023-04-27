/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import net.ub_1;

class aOU
implements Predicate<Entity> {
    String b;
    boolean a;

    aOU(String string, boolean bl) {
        this.b = string;
        this.a = bl;
    }

    public boolean a(Entity entity) {
        return ub_1.a(entity, this.b) != this.a;
    }
}

