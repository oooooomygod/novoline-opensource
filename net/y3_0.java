/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.aEH;
import net.b_0;
import net.yl_2;

/*
 * Renamed from net.y3
 */
public class y3_0
extends yl_2 {
    @Override
    public int a(int n) {
        return 5 + 20 * (n - 1);
    }

    @Override
    public int c() {
        return 2;
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }

    protected y3_0(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.WEAPON);
        this.a(aEH.a);
    }
}

