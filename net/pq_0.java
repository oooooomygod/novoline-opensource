/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import deobf.EnumFacing;

/*
 * Renamed from net.Pq
 */
class pq_0
implements Predicate<EnumFacing> {
    public boolean a(EnumFacing enumFacing) {
        return enumFacing != EnumFacing.DOWN;
    }

    pq_0() {
    }
}

