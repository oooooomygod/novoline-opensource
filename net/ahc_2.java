/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;

/*
 * Renamed from net.ahc
 */
class ahc_2
extends ahg_2 {
    ahu_2 g;

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 35.0;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.e();
        if (this.e(n, n2) && n3 == 0) {
            ((ahu_2)this.c()).a(false);
            ahv_1 ahv_12 = new ahv_1((ahu_2)this.c());
            ahv_12.a(true);
            ListInvoker.add(avf_2.b((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), ahv_12);
        }
    }

    @Override
    public void c(int n, int n2) {
        FontRenderer fontRenderer = adj_1.a(ay7_0.a, 80);
        a7l_0.b(fontRenderer, te_2.b, this.e() + 105.0 - (double)(a7l_0.a(fontRenderer, te_2.c) / 2), this.a() + 28.0 - (double)(a7l_0.a(fontRenderer) / 2) - 8.0, aol_1.b(aol_1.d(new Color(172, 82, 220))), true);
        FontRenderer fontRenderer2 = adj_1.a(ob_0.a, 25);
        a7l_0.b(fontRenderer2, te_2.a, this.e() + 105.0 - (double)(a7l_0.a(fontRenderer2, te_2.d) / 2), this.a() + 28.0 - (double)(a7l_0.a(fontRenderer2) / 2) + 18.0, -1, true);
    }

    ahc_2(ahu_2 ahu_22, ahu_2 ahu_23) {
        this.g = ahu_22;
        super(ahu_23);
    }
}

