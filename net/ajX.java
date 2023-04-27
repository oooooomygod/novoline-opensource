/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.FG;
import net.MathHelper;
import net.a5_0;
import net.a7r_0;
import net.aKU;
import net.aS0;
import net.aV8;
import net.ajt_0;
import net.aka_0;
import net.aqo_0;
import net.dz_0;
import net.il_0;
import net.sa_0;

public class ajX
extends ajt_0 {
    public static List<il_0> i = a7r_0.a(new il_0[]{il_0.G, il_0.V, il_0.ac});
    private int j = 8;
    private int g = 32;
    private int h;

    @Override
    public String b() {
        return sa_0.a;
    }

    @Override
    protected boolean b(int n, int n2) {
        int n3 = n;
        int n4 = n2;
        int n5 = (n -= this.g - 1) / this.g;
        int n6 = (n2 -= this.g - 1) / this.g;
        Random random = aV8.a(this.b, n5, n6, 10387312);
        n5 *= this.g;
        n6 *= this.g;
        if (n3 == (n5 += a5_0.a(random, this.g - this.j)) && n4 == (n6 += a5_0.a(random, this.g - this.j))) {
            boolean bl = aqo_0.a(aV8.q(this.b), n3 * 16 + 8, n4 * 16 + 8, 0, i);
            return bl;
        }
        return false;
    }

    @Override
    protected aKU a(int n, int n2) {
        return new aka_0(this.b, this.a, n, n2, this.h);
    }

    public ajX() {
    }

    public ajX(Map<String, String> map) {
        this();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (((String)FG.b(entry)).equals(sa_0.b)) {
                this.h = MathHelper.a((String)FG.a(entry), this.h, 0);
                continue;
            }
            if (!((String)FG.b(entry)).equals(sa_0.c)) continue;
            this.g = MathHelper.a((String)FG.a(entry), this.g, this.j + 1);
        }
    }
}

