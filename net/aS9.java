/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.World;
import net.a9z_0;
import net.lz_2;
import net.mh_1;
import net.mi_1;

public class aS9
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        mh_1 mh_12 = new mh_1(world, d, d2, d3, d4, d5, d6);
        lz_2.a(mh_12, lz_2.d(mh_12) * 0.3f, lz_2.g(mh_12) * 0.8f, lz_2.c(mh_12));
        lz_2.b(mh_12);
        return mh_12;
    }
}

