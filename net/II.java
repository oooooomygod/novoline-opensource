/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import java.util.Random;
import net.World;
import net.ann_0;
import net.il_0;
import net.xb_1;

public class II
extends il_0 {
    @Override
    public ann_0 k() {
        return ann_0.OCEAN;
    }

    public II(int n) {
        super(n);
        ListInvoker.clear(this.P);
    }

    @Override
    public void a(World world, Random random, xb_1 xb_12, int n, int n2, double d) {
        super.a(world, random, xb_12, n, n2, d);
    }
}

