/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.a0n_0;
import net.b_0;
import net.yl_2;

/*
 * Renamed from net.yu
 */
public class yu_2
extends yl_2 {
    @Override
    public int c() {
        return 3;
    }

    @Override
    public int a(int n) {
        return 15 + (n - 1) * 9;
    }

    protected yu_2(int n, ResourceLocation resourceLocation, int n2, b_0 b_02) {
        super(n, resourceLocation, n2, b_02);
        this.a(a0n_0.a);
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }
}

