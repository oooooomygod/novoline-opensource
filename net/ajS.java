/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MapInvoker;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.block.BlockPos;

public class ajS
extends ajt_0 {
    private int j = 5;
    private int i = 32;
    private static List<cp_0> g;
    public static List<il_0> h;

    @Override
    protected boolean b(int n, int n2) {
        int n3 = n;
        int n4 = n2;
        int n5 = (n -= this.i - 1) / this.i;
        int n6 = (n2 -= this.i - 1) / this.i;
        Random random = aV8.a(this.b, n5, n6, 10387313);
        n5 *= this.i;
        n6 *= this.i;
        if (n3 == (n5 += (a5_0.a(random, this.i - this.j) + a5_0.a(random, this.i - this.j)) / 2) && n4 == (n6 += (a5_0.a(random, this.i - this.j) + a5_0.a(random, this.i - this.j)) / 2)) {
            if (aqo_0.a(aV8.q(this.b), new BlockPos(n3 * 16 + 8, 64, n4 * 16 + 8), null) != il_0.r) {
                return false;
            }
            boolean bl = aqo_0.a(aV8.q(this.b), n3 * 16 + 8, n4 * 16 + 8, 29, h);
            return bl;
        }
        return false;
    }

    public ajS(Map<String, String> map) {
        this();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (((String)FG.b(entry)).equals(adf_1.a)) {
                this.i = MathHelper.a((String)FG.a(entry), this.i, 1);
                continue;
            }
            if (!((String)FG.b(entry)).equals(adf_1.c)) continue;
            this.j = MathHelper.a((String)FG.a(entry), this.j, 1);
        }
    }

    @Override
    protected aKU a(int n, int n2) {
        return new aKA(this.b, this.a, n, n2);
    }

    @Override
    public String b() {
        return adf_1.b;
    }

    public ajS() {
    }

    public List<cp_0> b() {
        return g;
    }

    static {
        h = a7r_0.a(new il_0[]{il_0.u, il_0.r, il_0.am, il_0.aa, il_0.an});
        g = my_0.c();
        ListInvoker.add(g, new cp_0(nx_1.class, 1, 2, 4));
    }
}

