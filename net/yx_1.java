/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.ResourceLocation;
import net.b_0;
import net.xi_0;
import net.yl_2;

/*
 * Renamed from net.yx
 */
public class yx_1
extends yl_2 {
    protected yx_1(int n, ResourceLocation resourceLocation, int n2, b_0 b_02) {
        super(n, resourceLocation, n2, b_02);
        if (b_02 == b_0.DIGGER) {
            this.a(xi_0.a);
        } else if (b_02 == b_0.FISHING_ROD) {
            this.a(xi_0.c);
        } else {
            this.a(xi_0.b);
        }
    }

    @Override
    public boolean a(yl_2 yl_22) {
        return super.a(yl_22) && yl_22.c != yx_1.w.c;
    }

    @Override
    public int c() {
        return 3;
    }

    @Override
    public int a(int n) {
        return 15 + (n - 1) * 9;
    }

    @Override
    public int d(int n) {
        return super.a(n) + 50;
    }
}

