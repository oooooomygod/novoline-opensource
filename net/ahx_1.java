/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.gui.alt.AltList;
import java.awt.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 * Renamed from net.ahx
 */
public class ahx_1
extends ahp_2<ahw_1> {
    private String a;
    private float g;
    private static String h;

    public static void b(String string) {
        h = string;
    }

    @Override
    public void a(int n, int n2, int n3) {
    }

    static {
        if (ahx_1.b() != null) {
            ahx_1.b("L1HTjc");
        }
    }

    public static String b() {
        return h;
    }

    @Override
    public void a(char c, int n) {
    }

    @Override
    public void c(int n, int n2) {
        ahx_1.b();
        FontRenderer fontRenderer = adj_1.a(ob_0.a, 23);
        a7l_0.b(fontRenderer, this.a, this.e() + (double)(this.a() / 2.0f) - (double)(a7l_0.a(fontRenderer, this.a) / 2), this.a() + (double)(this.c() / 2.0f) - (double)(a7l_0.a(fontRenderer) / 2), this.b() ? aol_1.b(Color.WHITE) : aol_1.b(aol_1.d(Color.WHITE)), true);
    }

    @Override
    public float c() {
        return 20.0f;
    }

    public ahx_1(ahw_1 ahw_12, String string) {
        super(ahw_12);
        this.a = string;
    }

    @Override
    public void b(int n, int n2) {
        ahx_1.b();
        if (this.a(n, n2)) {
            this.g += (1.0f - this.g) * 0.04f;
        }
        this.g -= this.g * 0.04f;
        aV3.a(aV3.a(), this.e(), this.a(), (double)this.a(), (double)this.c(), 15.0, 2.0, this.b() ? new Color(a1V.a(new Color(22, 22, 22), new Color(15, 15, 15), (double)this.g)) : new Color(26, 26, 26), avf_2.e((AltList)((ahv_2)((ahw_1)this.c()).c()).c()), true);
    }

    @Override
    public void a(int n, int n2) {
    }

    public float a() {
        return 102.5f;
    }

    @Override
    public double e() {
        return ((ahw_1)this.c()).e() - (double)220.3f - avf_2.h((AltList)((ahv_2)((ahw_1)this.c()).c()).c());
    }

    @Override
    public double a() {
        return ((ahw_1)this.c()).a() + 225.0;
    }

    public boolean a(int n, int n2) {
        ahx_1.b();
        return (double)n > this.e() && (double)n < this.e() + (double)this.a() && (double)n2 > this.a() && (double)n2 < this.a() + (double)this.c();
    }
}

