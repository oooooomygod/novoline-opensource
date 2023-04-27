/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.World;
import net.a9z_0;
import net.mi_1;
import net.ms_1;
import net.px_0;

public class a6V
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        int n2 = nArray.length > 1 ? nArray[1] : 0;
        return new ms_1(world, d, d2, d3, d4, d5, d6, px_0.a(nArray[0]), n2);
    }
}

