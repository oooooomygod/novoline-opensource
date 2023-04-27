/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.P8;
import net.a5_0;
import net.a6_;

class a6C
extends a6_<Integer, Integer> {
    public int a(Random random) {
        return P8.b((Integer)this.b()) >= P8.b((Integer)this.a()) ? P8.b((Integer)this.b()) : P8.b((Integer)this.b()) + a5_0.a(random, P8.b((Integer)this.a()) - P8.b((Integer)this.b()) + 1);
    }

    public a6C(int n, int n2) {
        super(P8.d(n), P8.d(n2));
    }
}

