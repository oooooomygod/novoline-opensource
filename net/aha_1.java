/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;

/*
 * Renamed from net.ahA
 */
class aha_1
extends ahr_1 {
    ahv_2 j;

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.d();
        if (this.a(n, n2) && n3 == 0) {
            ((ahv_2)this.c()).a(false);
            ahw_1 ahw_12 = new ahw_1((ahv_2)this.c());
            ahw_12.a(true);
            ListInvoker.add(avf_2.b((AltList)((ahv_2)this.c()).c()), ahw_12);
        }
    }

    @Override
    public double e() {
        return ((ahv_2)this.c()).e() - avf_2.h((AltList)((ahv_2)this.c()).c()) + 192.0 - (double)(a7l_0.a(adj_1.a(ay7_0.a, 40), aUB.a) / 2);
    }

    aha_1(ahv_2 ahv_22, ahv_2 ahv_23, FontRenderer fontRenderer, String string) {
        this.j = ahv_22;
        super(ahv_23, fontRenderer, string);
    }
}

