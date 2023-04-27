/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.World;
import net.a9z_0;
import net.lz_2;
import net.mi_1;
import net.mj_1;

/*
 * Renamed from net.an1
 */
public class an1_0
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        mj_1 mj_12 = new mj_1(world, d, d2 + 0.5, d3, d4, d5, d6);
        lz_2.a((mi_1)mj_12, 81);
        lz_2.a(mj_12, 1.0f, 1.0f, 1.0f);
        return mj_12;
    }
}

