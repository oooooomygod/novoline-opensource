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

class aPH
implements Predicate<Entity> {
    boolean b;
    String a;

    aPH(String string, boolean bl) {
        this.a = string;
        this.b = bl;
    }

    public boolean a(Entity entity) {
        return ayj_0.x(entity).equals(this.a) != this.b;
    }
}

