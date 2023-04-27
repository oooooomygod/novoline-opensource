/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.BlocksInvoker;
import net.World;
import net.a9z_0;
import net.aOT;
import net.mi_1;
import net.mm_2;

/*
 * Renamed from net.asv
 */
public class asv_2
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        return aOT.a(new mm_2(world, d, d2, d3, d4, d5, d6, BlocksInvoker.b(nArray[0])));
    }
}

