/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import net._x_0;
import net.aCE;
import net.aMY;
import net.ayj_0;

class aEV
implements Predicate<Entity> {
    _x_0 a;

    public boolean a(Entity entity) {
        return ayj_0.a(entity) && aCE.a(aMY.l(this.a.j), entity);
    }

    aEV(_x_0 _x_02) {
        this.a = _x_02;
    }
}

