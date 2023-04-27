/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.gui.alt.AltList;

/*
 * Renamed from net.ah7
 */
class ah7_0
extends ahx_1 {
    ahw_1 i;

    ah7_0(ahw_1 ahw_12, ahw_1 ahw_13, String string) {
        this.i = ahw_12;
        super(ahw_13, string);
    }

    @Override
    public boolean b() {
        return ahw_1.b(this.i) != null;
    }

    @Override
    public double e() {
        return ((ahw_1)this.c()).e() - (double)220.3f + 107.5 - avf_2.h((AltList)((ahv_2)((ahw_1)this.c()).c()).c());
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.e();
        if (this.b() && this.a(n, n2)) {
            AltList altList = (AltList)((ahv_2)((ahw_1)this.c()).c()).c();
            aV9 aV92 = tq_0.b(((ahw_1)this.c()).b(), axz_1.a(ahw_1.a(this.i)));
            a0I.b(avf_2.a(altList), aV92);
            avf_2.c(altList);
            ((ahw_1)this.c()).a(false);
            ((ahv_2)((ahw_1)this.c()).c()).a(true);
        }
    }
}

