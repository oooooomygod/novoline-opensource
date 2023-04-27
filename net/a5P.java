/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.events.Render2DEvent;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.modules.visual.HUD;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

class a5P {
    private double e;
    HUD d;
    private int b;
    private ItemStack f;
    private double a;
    private double c;

    static double b(a5P a5P2, double d) {
        a5P2.e = d;
        return a5P2.e;
    }

    static ItemStack a(a5P a5P2, ItemStack itemStack) {
        a5P2.f = itemStack;
        return a5P2.f;
    }

    public a5P(HUD hUD, int n) {
        this.d = hUD;
        this.a = 1.0;
        this.b = n;
    }

    static double a(a5P a5P2) {
        return a5P2.a;
    }

    static double c(a5P a5P2, double d) {
        a5P2.a = d;
        return a5P2.a;
    }

    static double a(a5P a5P2, double d) {
        a5P2.c = d;
        return a5P2.c;
    }

    public void a(Render2DEvent render2DEvent, int n) {
        HUD.t();
        GlStateManagerInvoker.enableAlpha();
        GL11.glAlphaFunc((int)516, (float)0.0f);
        double d = 0.0;
        double d2 = d - 14.0;
        int cfr_ignored_1 = d2 == 0.0 ? 0 : (d2 < 0.0 ? -1 : 1);
        a1V.a(this.e - 12.5, this.c - d + 20.0, 30.0, d, (double)((float)(d / 2.0)), hb_2.a(n, (int)(14.0 - d)));
        d += 0.5;
        GlStateManagerInvoker.C();
        if (this.f != null) {
            GL11.glScaled((double)this.a, (double)this.a, (double)this.a);
            d = this.e * (1.0 / this.a);
            double d3 = this.c * (1.0 / this.a);
            a1V.a(this.f, (float)(d -= 6.5), (float)(d3 -= 6.0));
            if (this.f.a > 1) {
                String string = StringInvoker.a(this.f.a);
                GlStateManagerInvoker.disableDepth();
                cw_2.a(this.d, 19, string, d + (double)(StringInvoker.c(string) == 1 ? 11 : 7), d3 + 9.5, 0xFFFFFF, true, true);
                GlStateManagerInvoker.enableDepth();
            }
            GL11.glScaled((double)(1.0 / this.a), (double)(1.0 / this.a), (double)(1.0 / this.a));
            int n2 = act_2.u(this.f) - act_2.s(this.f);
            a1V.b(this.e - 12.5, this.c + 18.5, this.e + 17.5, this.c + 19.5, hb_2.a(asx_1.BLACK));
            a1V.b(this.e - 12.5, this.c + 18.5, this.e - 12.5 + 30.0 / (double)act_2.u(this.f) * (double)n2, this.c + 19.5, n);
            a1V.b(this.e - 12.5, this.c + 18.5, this.e + 17.5, this.c + 19.5, n);
        }
        a1V.b(this.e - 12.5, this.c + 18.5, this.e + 17.5, this.c + 19.5, n);
    }

    static int b(a5P a5P2) {
        return a5P2.b;
    }
}

