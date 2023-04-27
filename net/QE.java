/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.utils.fonts.api.FontRenderer;
import java.awt.Color;
import net.minecraft.client.Minecraft;

public class QE
extends QG {
    private int q;
    private int p = aol_1.b(Color.WHITE);

    public void c(int n) {
        this.p = n;
    }

    public boolean a(int n, int n2) {
        ant_0.b();
        return (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
    }

    public void a(double d, double d2) {
        this.n = d;
        this.h = d2;
    }

    public void a(Minecraft minecraft, int n, int n2, float f) {
        ant_0.b();
        if (this.j) {
            this.f = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            aV3.a(aV3.a(), (double)((float)this.n), (double)((float)this.h), (double)this.o, (double)this.i, (double)f, 3.5, new Color(this.q), true);
            if (this.f) {
                this.p = aol_1.b(aol_1.a(new Color(this.p)));
            }
            FontRenderer fontRenderer = adj_1.a(ob_0.a, 20);
            a7l_0.a(fontRenderer, (CharSequence)this.k, (double)((float)this.n + (float)(this.o / 2) - (float)(a7l_0.a(fontRenderer, this.k) / 2)), (double)((float)this.h + (float)(this.i / 2) - (float)(fontRenderer.b() / 2)), this.p, 1.5f);
        }
    }

    public void d(int n) {
        this.q = n;
    }

    public void a(Minecraft minecraft, int n, int n2, double d, Color color) {
        ant_0.b();
        if (this.j) {
            this.f = (double)n >= this.n && (double)n2 >= this.h && (double)n < this.n + (double)this.o && (double)n2 < this.h + (double)this.i;
            aV3.a(aV3.a(), (double)((float)this.n), (double)((float)this.h), (double)this.o, (double)this.i, d, 3.5, color, true);
            if (this.f) {
                this.p = aol_1.b(aol_1.a(new Color(this.p)));
            }
            FontRenderer fontRenderer = adj_1.a(ob_0.a, 20);
            a7l_0.a(fontRenderer, (CharSequence)this.k, (double)((float)this.n + (float)(this.o / 2) - (float)(a7l_0.a(fontRenderer, this.k) / 2)), (double)((float)this.h + (float)(this.i / 2) - (float)(fontRenderer.b() / 2)), this.p, 1.5f);
        }
    }

    public QE(int n, int n2, int n3, int n4, int n5, String string) {
        super(n, n2, n3, n4, n5, string);
    }
}

