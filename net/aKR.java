/*
 * Decompiled with CFR 0.152.
 */
package net;

import java.util.Random;
import net.World;
import net.Y1;
import net.aKU;
import net.aWX;
import net.aky_1;

public class aKR
extends aKU {
    public aKR() {
    }

    public aKR(World world, Random random, int n, int n2) {
        super(n, n2);
        Y1 y1 = new Y1(0, random, (n << 4) + 2, (n2 << 4) + 2);
        aky_1.a(this.c, y1);
        aWX.a(y1, y1, this.c, random);
        this.b();
        this.a(world, random, 10);
    }
}

