/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import deobf.EnumFacing;

class IC
implements Predicate<Entity> {
    gu_2 b;
    EnumFacing a;

    IC(gu_2 gu_22, EnumFacing enumFacing) {
        this.b = gu_22;
        this.a = enumFacing;
    }

    public boolean a(Entity entity) {
        return ayj_0.I(entity) == this.a;
    }
}

