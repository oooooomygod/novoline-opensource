/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 */
package net;

import com.google.common.base.Predicate;
import net.az_1;

/*
 * Renamed from net.z2
 */
class z2_0
implements Predicate<az_1> {
    public boolean a(az_1 az_12) {
        return az_12 != az_1.NORTH_EAST && az_12 != az_1.NORTH_WEST && az_12 != az_1.SOUTH_EAST && az_12 != az_1.SOUTH_WEST;
    }

    z2_0() {
    }
}

