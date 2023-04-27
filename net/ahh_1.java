/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;

/*
 * Renamed from net.ahh
 */
class ahh_1
extends ahr_1 {
    ahv_2 j;

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.e();
        if (this.a(n, n2) && n3 == 0) {
            ((ahv_2)this.c()).a(false);
            ahu_2 ahu_22 = new ahu_2((ahv_2)this.c());
            ahu_22.a(true);
            ListInvoker.add(avf_2.b((AltList)((ahv_2)this.c()).c()), ahu_22);
        }
    }

    @Override
    public double a() {
        return ((ahv_2)this.c()).a() + 231.0;
    }

    @Override
    public double e() {
        return ((ahv_2)this.c()).e() - avf_2.h((AltList)((ahv_2)this.c()).c()) + 215.0 - (double)(a7l_0.a(adj_1.a(ay7_0.a, 45), YQ.a) / 2);
    }

    ahh_1(ahv_2 ahv_22, ahv_2 ahv_23, FontRenderer fontRenderer, String string) {
        this.j = ahv_22;
        super(ahv_23, fontRenderer, string);
    }
}

