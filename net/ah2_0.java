/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ah2
 */
public class ah2_0
extends ahp_2<ahu_2> {
    private static int g;
    private float h;
    private String a;

    public static int a() {
        ah2_0.d();
        return 56;
    }

    public boolean a(int n, int n2) {
        ah2_0.a();
        return (double)n > this.e() && (double)n < this.e() + (double)this.b() && (double)n2 > this.a() && (double)n2 < this.a() + (double)this.c();
    }

    @Override
    public void a(int n, int n2) {
    }

    public float b() {
        return 210.0f;
    }

    @Override
    public void c(int n, int n2) {
        ah2_0.d();
        FontRenderer fontRenderer = adj_1.a(ob_0.a, 23);
        a7l_0.b(fontRenderer, this.a, this.e() + (double)(this.b() / 2.0f) - (double)(a7l_0.a(fontRenderer, this.a) / 2), this.a() + (double)(this.c() / 2.0f) - (double)(a7l_0.a(fontRenderer) / 2), this.b() ? aol_1.b(Color.WHITE) : aol_1.b(aol_1.d(Color.WHITE)), true);
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    public static int d() {
        return g;
    }

    public ah2_0(ahu_2 ahu_22, String string) {
        super(ahu_22);
        this.a = string;
    }

    @Override
    public void a(char c, int n) {
    }

    public static void b(int n) {
        g = n;
    }

    @Override
    public double a() {
        return ((ahu_2)this.c()).a() + 225.0;
    }

    static {
        if (ah2_0.d() == 0) {
            ah2_0.b(48);
        }
    }

    @Override
    public double e() {
        return ((ahu_2)this.c()).e() - (double)220.3f - avf_2.h((AltList)((ahv_2)((ahu_2)this.c()).c()).c());
    }

    @Override
    public float c() {
        return 20.0f;
    }

    @Override
    public void b(int n, int n2) {
        ah2_0.d();
        if (this.a(n, n2)) {
            this.h += (1.0f - this.h) * 0.04f;
        }
        this.h -= this.h * 0.04f;
        aV3.a(aV3.a(), this.e(), this.a(), (double)this.b(), (double)this.c(), 15.0, 2.0, this.b() ? new Color(a1V.a(new Color(22, 22, 22), new Color(15, 15, 15), (double)this.h)) : new Color(26, 26, 26), avf_2.e((AltList)((ahv_2)((ahu_2)this.c()).c()).c()), true);
    }
}

