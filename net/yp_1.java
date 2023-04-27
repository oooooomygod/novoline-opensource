/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.b_0;
import net.ws_2;
import net.yl_2;

/*
 * Renamed from net.yp
 */
public class yp_1
extends yl_2 {
    @Override
    public int c() {
        return 2;
    }

    @Override
    public int a(int n) {
        return 12 + (n - 1) * 20;
    }

    @Override
    public int d(int n) {
        return this.a(n) + 25;
    }

    public yp_1(int n, ResourceLocation resourceLocation, int n2) {
        super(n, resourceLocation, n2, b_0.BOW);
        this.a(ws_2.a);
    }
}

