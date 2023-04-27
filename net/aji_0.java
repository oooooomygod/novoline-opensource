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

/*
 * Renamed from net.aji
 */
public class aji_0
extends ajt_0 {
    private static List<il_0> g = a7r_0.a(new il_0[]{il_0.V, il_0.c, il_0.at, il_0.al, il_0.aw});
    private int h = 32;
    private int j = 8;
    private List<cp_0> i = my_0.c();

    public aji_0() {
        ListInvoker.add(this.i, new cp_0(nm_0.class, 1, 1, 1));
    }

    public List<cp_0> b() {
        return this.i;
    }

    public aji_0(Map<String, String> map) {
        this();
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (!((String)FG.b(entry)).equals(vn_1.a)) continue;
            this.h = MathHelper.a((String)FG.a(entry), this.h, this.j + 1);
        }
    }

    public boolean b(BlockPos blockPos) {
        aKU aKU2 = this.b(blockPos);
        if (aKU2 instanceof aK5 && !aky_1.c(aKU2.c)) {
            Y_ y_ = (Y_)aky_1.h(aKU2.c);
            return y_ instanceof YY;
        }
        return false;
    }

    @Override
    public String b() {
        return vn_1.b;
    }

    @Override
    protected boolean b(int n, int n2) {
        int n3 = n;
        int n4 = n2;
        int n5 = (n -= this.h - 1) / this.h;
        int n6 = (n2 -= this.h - 1) / this.h;
        Random random = aV8.a(this.b, n5, n6, 14357617);
        n5 *= this.h;
        n6 *= this.h;
        if (n3 == (n5 += a5_0.a(random, this.h - this.j)) && n4 == (n6 += a5_0.a(random, this.h - this.j))) {
            aqo_0.a(aV8.q(this.b), new BlockPos(n3 * 16 + 8, 0, n4 * 16 + 8));
            return false;
        }
        return false;
    }

    @Override
    protected aKU a(int n, int n2) {
        return new aK5(this.b, this.a, n, n2);
    }
}

