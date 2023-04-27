/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.SoundHandlerInvoker;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.MCInvoker;
import java.awt.Color;
import net.minecraft.client.Minecraft;

public class aYF {
    private double g;
    private String f;
    private double b;
    private boolean c;
    private int e = aol_1.b(Color.WHITE);
    private double h;
    private int a;
    private double d;

    public void a(Minecraft minecraft, int n, int n2, float f, Color color, Color color2) {
        ant_0.b();
        this.c = (double)n >= this.b && (double)n2 >= this.h && (double)n < this.b + this.g && (double)n2 < this.h + this.d;
        aV3.a(aV3.a(), (double)((float)this.b), (double)((float)this.h), this.g, this.d, (double)f, 4.0, color, false);
        if (this.c) {
            color2 = aol_1.a(color2);
        }
        FontRenderer fontRenderer = adj_1.a(ob_0.a, 20);
        a7l_0.a(fontRenderer, (CharSequence)this.f, (double)((float)this.b) + this.g / 2.0, (double)((float)this.h) + this.d / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), aol_1.b(color2), true);
    }

    public aYF(int n, int n2, int n3, int n4, String string) {
        this.b = n;
        this.h = n2;
        this.g = n3;
        this.d = n4;
        this.f = string;
    }

    public void a(double d) {
        this.h = d;
    }

    public void b(double d) {
        this.b = d;
    }

    public String b() {
        return this.f;
    }

    public void a(Minecraft minecraft, int n, int n2, float f) {
        ant_0.b();
        this.c = (double)n >= this.b && (double)n2 >= this.h && (double)n < this.b + this.g && (double)n2 < this.h + this.d;
        aV3.a(aV3.a(), (double)((float)this.b), (double)((float)this.h), this.g, this.d, (double)f, 3.5, new Color(this.a), false);
        if (this.c) {
            this.e = aol_1.b(aol_1.a(new Color(this.e)));
        }
        FontRenderer fontRenderer = adj_1.a(ob_0.a, 20);
        a7l_0.a(fontRenderer, (CharSequence)this.f, (double)((float)this.b) + this.g / 2.0 - (double)(a7l_0.a(fontRenderer, this.f) / 2) + 2.0, (double)((float)this.h) + this.d / 2.0 - (double)(a7l_0.a(fontRenderer) / 2), this.e, 1.5f);
        if (ListInvoker.b() != null) {
            ant_0.b(new int[1]);
        }
    }

    public void a(String string) {
        this.f = string;
    }

    public boolean a(int n, int n2) {
        ant_0.b();
        return (double)n >= this.b && (double)n2 >= this.h && (double)n < this.b + this.g && (double)n2 < this.h + this.d;
    }

    public void b(int n) {
        this.a = n;
    }

    public void a(int n) {
        this.e = n;
    }

    public void a(float f, float f2) {
        this.b = f;
        this.h = f2;
    }

    public void a() {
        SoundHandlerInvoker.c(MCInvoker.l(MCInvoker.f()), aih_1.a(new ResourceLocation(apq_0.a), 1.0f));
    }
}

