/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.Entity;
import net.ne_1;
import net.nf_1;
import net.ng_1;

/*
 * Renamed from net.w
 */
class w_0
implements Predicate<Entity> {
    nf_1 a;

    public boolean a(Entity entity) {
        return entity instanceof ne_1 || entity instanceof ng_1;
    }

    w_0(nf_1 nf_12) {
        this.a = nf_12;
    }
}

