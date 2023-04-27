/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.UB;
import net.b_0;
import net.yl_2;

/*
 * Renamed from net.yr
 */
public class yr_2
extends yl_2 {
    @Override
    public int a(int n) {
        return 10 + 20 * (n - 1);
    }

    protected yr_2(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.WEAPON);
        this.a(UB.a);
    }

    @Override
    public int c() {
        return 2;
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }
}

