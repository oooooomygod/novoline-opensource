/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.Timer;
import cc.novoline.modules.visual.HUD;

/*
 * Renamed from net.jr
 */
public class jr_2 {
    private int c;
    private Timer b;
    aff_2 d;
    private int a;
    private Timer e;

    static int a(jr_2 jr_22) {
        return jr_22.c;
    }

    public void a(double d, double d2, int n) {
        this.c = (int)((double)this.a - abl_1.a(this.b, 700L, P8.b((Integer)adt_2.a(HUD.c(this.d.g)))));
        a1V.a(d, d2, abl_1.a(this.e, 500L, 32.0), hb_2.a(n, this.c));
    }

    public jr_2(aff_2 aff_22, int n) {
        this.d = aff_22;
        this.a = n;
        this.e = new Timer();
        this.b = new Timer();
    }
}

