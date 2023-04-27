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
import net.akl_1;
import net.aky_1;
import net.any_2;
import net.n_0;
import net.ze_0;

public class aKD
extends aKU {
    public aKD() {
    }

    public aKD(World world, Random random, int n, int n2) {
        super(n, n2);
        akl_1.a();
        ze_0 ze_02 = new ze_0(0, random, (n << 4) + 2, (n2 << 4) + 2);
        aky_1.a(this.c, ze_02);
        n_0.a(ze_02, ze_02, this.c, random);
        List<Y_> list = ze_02.h;
        while (!ListInvoker.isEmpty(list)) {
            int n3 = a5_0.a(random, ListInvoker.size(list));
            Y_ y_ = (Y_)ListInvoker.remove(list, n3);
            any_2.a(y_, ze_02, this.c, random);
        }
        this.b();
        this.a(world, random, 10);
    }
}

