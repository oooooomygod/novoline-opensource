/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.World;
import net.a3x_0;
import net.a5_0;
import net.a9z_0;
import net.lz_2;
import net.mi_1;
import net.nq_1;

/*
 * Renamed from net.aFu
 */
public class afu_0
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        nq_1 nq_12 = new nq_1(world, d, d2, d3, d4, d5, d6);
        a3x_0.a(nq_12, 144);
        float f = a5_0.e(world.o) * 0.5f + 0.35f;
        lz_2.a(nq_12, 1.0f * f, 0.0f * f, 1.0f * f);
        return nq_12;
    }
}

