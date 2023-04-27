/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MathInvoker;
import java.util.Iterator;
import java.util.Map;
import net.FG;
import net.MathHelper;
import net.a5_0;
import net.aKR;
import net.aKU;
import net.aS0;
import net.ajt_0;
import net.cm_2;
import net.dz_0;

/*
 * Renamed from net.ajd
 */
public class ajd_0
extends ajt_0 {
    private double g = 0.004;

    public ajd_0() {
    }

    public ajd_0(Map<String, String> map) {
        Iterator iterator = aS0.f(MapInvoker.b(map));
        while (dz_0.c(iterator)) {
            Map.Entry entry = (Map.Entry)dz_0.b(iterator);
            if (!((String)FG.b(entry)).equals(cm_2.b)) continue;
            this.g = MathHelper.a((String)FG.a(entry), this.g);
        }
    }

    @Override
    protected boolean b(int n, int n2) {
        return a5_0.c(this.a) < this.g && a5_0.a(this.a, 80) < MathInvoker.max(MathInvoker.a(n), MathInvoker.a(n2));
    }

    @Override
    public String b() {
        return cm_2.a;
    }

    @Override
    protected aKU a(int n, int n2) {
        return new aKR(this.b, this.a, n, n2);
    }
}

