/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;
import java.util.function.Consumer;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ah3
 */
public class ah3_0
extends ahp_2<ahw_1> {
    private Consumer<ah3_0> a;
    private double h;
    private Consumer<ah3_0> i;
    private double g;
    private String j;

    public ah3_0(ahw_1 ahw_12, String string, Consumer<ah3_0> consumer, Consumer<ah3_0> consumer2) {
        super(ahw_12);
        this.j = string;
        this.i = consumer;
        this.a = consumer2;
    }

    public boolean a(int n, int n2) {
        ahx_1.b();
        return (double)n > this.e() && (double)n < this.e() + 67.0 && (double)n2 > this.a() && (double)n2 < this.a() + 70.0;
    }

    @Override
    public double e() {
        return this.h;
    }

    @Override
    public void a(int n, int n2, int n3) {
        ahx_1.b();
        if (this.a(n, n2) && n3 == 0) {
            a8D.a((ahw_1)this.c(), null);
            aan_1.a(this.a, this);
        }
    }

    public void a(double d) {
        this.h = d;
    }

    @Override
    public void b(int n, int n2) {
        ahx_1.b();
        if (this.a(n, n2) || this.b()) {
            this.g += (1.0 - this.g) * (double)0.04f;
        }
        this.g -= this.g * (double)0.04f;
        aV3.a(aV3.a(), this.e(), this.a(), 67.0, 70.0, 10.0, 2.0, new Color(a1V.a(new Color(26, 26, 26), new Color(20, 20, 20), this.g)), avf_2.e((AltList)((ahv_2)((ahw_1)this.c()).c()).c()), true);
        if (ListInvoker.b() != null) {
            ahx_1.b("fqhsG");
        }
    }

    @Override
    public void c(int n, int n2) {
        FontRenderer fontRenderer = adj_1.a(ob_0.a, 20);
        ahx_1.b();
        a7l_0.b(fontRenderer, this.j, this.e() + 33.0 - (double)(a7l_0.a(fontRenderer, this.j) / 2), this.a() + 50.0, -1, true);
        aan_1.a(this.i, this);
        if (a8D.b((ahw_1)this.c()) != null && this.b()) {
            a7l_0.b(adj_1.a(cf_0.a, 22), abz_1.a, this.e() + 53.0, this.a() + 6.0, aol_1.b(new Color(30, 210, 1)), true);
        }
    }

    @Override
    public double a() {
        return ((ahw_1)this.c()).a() + 140.0;
    }

    @Override
    public void a(int n, int n2) {
    }

    @Override
    public void a(char c, int n) {
    }
}

