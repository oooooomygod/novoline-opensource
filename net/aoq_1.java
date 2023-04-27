/*
 * Decompiled with CFR 0.152.
 */
package net;

import deobf.MCInvoker;
import net.World;
import net.a9z_0;
import net.anu_1;
import net.mi_1;
import net.my_1;

/*
 * Renamed from net.aoq
 */
public class aoq_1
implements a9z_0 {
    @Override
    public mi_1 a(int n, World world, double d, double d2, double d3, double d4, double d5, double d6, int ... nArray) {
        my_1 my_12 = new my_1(world, d, d2, d3, d4, d5, d6, MCInvoker.f().effectRenderer);
        anu_1.a(my_12, 0.99f);
        return my_12;
    }
}

