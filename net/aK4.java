/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.List;
import java.util.Random;
import net.World;
import net.Y_;
import net.a5_0;
import net.aKU;
import net.aky_1;
import net.any_2;
import net.aqm_1;
import net.zr_0;

public class aK4
extends aKU {
    public aK4() {
    }

    public aK4(World world, Random random, int n, int n2) {
        super(n, n2);
        zr_0 zr_02 = new zr_0(random, (n << 4) + 2, (n2 << 4) + 2);
        aky_1.a(this.c, zr_02);
        aqm_1.a(zr_02, zr_02, this.c, random);
        List<Y_> list = zr_02.e;
        while (!ListInvoker.isEmpty(list)) {
            int n3 = a5_0.a(random, ListInvoker.size(list));
            Y_ y_ = (Y_)ListInvoker.remove(list, n3);
            any_2.a(y_, zr_02, this.c, random);
        }
        this.b();
        this.a(world, random, 48, 70);
    }
}

