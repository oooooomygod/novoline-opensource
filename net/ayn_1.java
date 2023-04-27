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
 * Renamed from net.ayN
 */
class ayn_1
implements Predicate<EnumFacing> {
    ayn_1() {
    }

    public boolean a(EnumFacing enumFacing) {
        return enumFacing != EnumFacing.UP;
    }
}

