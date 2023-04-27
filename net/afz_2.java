/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.World;
import net.a9z_0;
import net.lz_2;
import net.mi_1;
import net.nq_1;

/*
 * Renamed from net.afz
 */
public class afz_2
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        nq_1 nq_12 = new nq_1(world, d, d2, d3, d4, d5, d6);
        lz_2.a(nq_12, (float)d4, (float)d5, (float)d6);
        return nq_12;
    }
}

