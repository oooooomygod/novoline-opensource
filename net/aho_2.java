/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;

/*
 * Renamed from net.aho
 */
class aho_2
extends ahg_2 {
    ahu_2 g;

    @Override
    public void a(int n, int n2, int n3) {
        ahv_2.d();
        if (this.e(n, n2) && n3 == 0) {
            ((ahu_2)this.c()).a(false);
            ahr_2 ahr_22 = new ahr_2((ahu_2)this.c());
            ahr_22.a(true);
            ListInvoker.add(avf_2.b((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), ahr_22);
        }
    }

    aho_2(ahu_2 ahu_22, ahu_2 ahu_23) {
        this.g = ahu_22;
        super(ahu_23);
    }

    @Override
    public void b(int n, int n2) {
    }

    @Override
    public void d(int n, int n2) {
        ahv_2.e();
        if (this.e(n, n2) || this.b()) {
            this.a(this.a() + (1.0f - this.a()) * 0.04f);
        }
        this.a(this.a() - this.a() * 0.04f);
        aV3.a(aV3.a(), this.e(), this.a(), 45.0, 57.0, 12.0, 2.0, new Color(a1V.a(new Color(26, 26, 26), new Color(20, 20, 20), (double)this.a())), avf_2.e((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), true);
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 97.0;
    }

    @Override
    public double e() {
        return super.e() + 165.0;
    }

    @Override
    public boolean e(int n, int n2) {
        ahv_2.d();
        return (double)n > this.e() && (double)n < this.e() + 45.0 && (double)n2 > this.a() && (double)n2 < this.a() + 57.0;
    }

    @Override
    public void c(int n, int n2) {
        FontRenderer fontRenderer = adj_1.a(ay7_0.a, 45);
        a7l_0.a(fontRenderer, (CharSequence)tw_2.b, this.e() + 22.0 - (double)(a7l_0.a(fontRenderer, tw_2.a) / 2), this.a() + 28.0 - (double)(a7l_0.a(fontRenderer) / 2), -1);
    }
}

