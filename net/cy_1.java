/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import net.GuiContainer;
import net.a1V;
import net.a7l_0;
import net.aL0;
import net.aV3;
import net.adj_1;
import net.aej_1;
import net.ax4_0;
import net.hb_2;
import net.pI;
import net.wc_1;

/*
 * Renamed from net.cY
 */
public class cy_1 {
    private int e;
    private double g;
    private double d;
    private double h;
    private AbstractModule i;
    private FontRenderer c;
    private ax4_0 a;
    private double b;
    GuiContainer f;

    static double d(cy_1 cy_12) {
        return cy_12.d;
    }

    static int a(cy_1 cy_12, int n) {
        cy_12.e = n;
        return cy_12.e;
    }

    public boolean a(int n, int n2) {
        return (double)n > this.d && (double)n <= this.d + this.g && (double)n2 > this.b && (double)n2 <= this.b + this.h;
    }

    static double e(cy_1 cy_12) {
        return cy_12.h;
    }

    public void b(int n, int n2) {
        if (this.a(n, n2) && wc_1.g(this.i)) {
            wc_1.k(this.i);
        }
    }

    static ax4_0 a(cy_1 cy_12) {
        return cy_12.a;
    }

    public void a() {
        aV3.a(aV3.a(), this.d, this.b, this.g, this.h, 0.0, 4.0, new Color(0, 0, 0, 130), false);
        a7l_0.a(this.c, (CharSequence)aL0.a(aL0.a(new StringBuilder(), aej_1.a), wc_1.a(this.i)).toString(), this.d + this.g / 2.0, this.b + this.h / 2.0 - (double)(a7l_0.a(this.c) / 2), this.e, true);
        a1V.b(this.d - 1.0, this.b + this.h, this.d + this.g + 1.0, this.b + this.h + 1.0, hb_2.a(0L));
    }

    static double b(cy_1 cy_12) {
        return cy_12.g;
    }

    static double c(cy_1 cy_12) {
        return cy_12.b;
    }

    public cy_1(GuiContainer guiContainer, AbstractModule abstractModule, double d, double d2, double d3, double d4) {
        this.f = guiContainer;
        this.a = new ax4_0();
        this.c = adj_1.a(pI.a, 19);
        this.i = abstractModule;
        this.e = 0xFFFFFF;
        this.d = d;
        this.b = d2;
        this.g = d3;
        this.h = d4;
    }

    public cy_1(GuiContainer guiContainer, AbstractModule abstractModule) {
        this.f = guiContainer;
        this.a = new ax4_0();
        this.c = adj_1.a(pI.a, 19);
        this.i = abstractModule;
        this.e = 0xFFFFFF;
    }
}

