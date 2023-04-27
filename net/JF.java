/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.events.SettingEvent;
import cc.novoline.gui.screen.setting.Setting;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.ManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.modules.AbstractModule;
import cc.novoline.utils.fonts.api.FontRenderer;
import cc.novoline.modules.visual.ClickGui;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import deobf.SettingType;
import deobf.TimerUtil;
import java.awt.Color;
import java.util.Iterator;
import java.util.List;

import org.lwjgl.opengl.GL11;

public class JF {
    private boolean p;
    private float y;
    private double t;
    private r_0 d;
    private boolean j;
    private static int g;
    private Setting x;
    private boolean o;
    private boolean i;
    private boolean e;
    private boolean r;
    private float k;
    private boolean h;
    private Color w;
    private double l;
    private float f;
    private double c;
    private float z;
    private float s;
    private double n;
    private float v;
    private boolean b;
    private TimerUtil a;
    private TimerUtil m;
    public boolean q;
    private int u;

    static {
        if (JF.g() != 0) {
            JF.b(45);
        }
    }

    public void c(ClickGui clickGui, int n, int n2, int n3) {
        JF.c();
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        GL11.glEnable((int)3089);
        ahm_0.a((float)a13.g(ME.f(this.d)) + 6.0f, this.s, (float)(a13.g(ME.f(this.d)) + 95.0), this.s + 20.0f);
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), ahg_0.j(this.x), a13.g(ME.f(this.d)) - this.t, this.s + 6.0f, -1, true);
        GL11.glDisable((int)3089);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.E) && a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) > 100) {
            GlStateManagerInvoker.disableTexture2D();
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)5);
            int n4 = -2;
            if (n4 < a7l_0.a(adj_1.a(ng_0.a, 18)) + 3) {
                a1V.a(aol_1.b(new Color(55, 55, 55, 255)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 90.0), (double)(this.s + 5.0f + (float)n4));
                a1V.a(aol_1.b(new Color(55, 55, 55, 0)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 40.0), (double)(this.s + 5.0f + (float)n4));
                ++n4;
            }
            GL11.glEnd();
            GlStateManagerInvoker.enableTexture2D();
        }
        a1V.a(a13.g(ME.f(this.d)) + 117.0, (double)this.s + 8.5, 2.5f, -1, 6.0, this.r ? 90.0 - abl_1.a(ahg_0.A(this.x), 100L, 90.0) : abl_1.a(ahg_0.A(this.x), 100L, 90.0));
        if (this.r) {
            float f = this.s + 20.0f;
            float f2 = this.s + 20.0f + (float)(ListInvoker.size(ava_0.b(ahg_0.k(this.x))) * 15);
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.c)) {
                a1V.b(a13.g(ME.f(this.d)), (double)f, a13.g(ME.f(this.d)) + 130.0, (double)f2, aol_1.b(new Color(40, 40, 40)));
                a1V.a((float)(a13.g(ME.f(this.d)) + 6.0), f, 113.0f, f2 - f, 5.0f, aol_1.b(new Color(45, 45, 45)));
            }
            a1V.b(a13.g(ME.f(this.d)), (double)f, a13.g(ME.f(this.d)) + 130.0, (double)f2, aol_1.b(new Color(0, 0, 0, (int)(120.0 * z4_0.l(clickGui)))));
            int n5 = 0;
            if (n5 < ListInvoker.size(ava_0.b(ahg_0.k(this.x)))) {
                double d = this.s + 20.0f + (float)(n5 * 15);
                String string = (String)ListInvoker.get(ava_0.b(ahg_0.k(this.x)), n5);
                if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.o)) {
                    KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 25), aZQ.t, a13.g(ME.f(this.d)) + 12.0, d - 0.5, ListInvoker.contains((List)ava_0.a(ahg_0.k(this.x)), string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(120, 120, 120)), true);
                    KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 18), string, a13.g(ME.f(this.d)) + 18.0, d + 5.0, ListInvoker.contains((List)ava_0.a(ahg_0.k(this.x)), string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(120, 120, 120)), true);
                }
                KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 25), aZQ.n, a13.g(ME.f(this.d)) + 12.0, d - 0.5, ListInvoker.contains((List)ava_0.a(ahg_0.k(this.x)), string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(160, 160, 160)), true);
                KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 18), string, a13.g(ME.f(this.d)) + 18.0, d + 5.0, ListInvoker.contains((List)ava_0.a(ahg_0.k(this.x)), string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(160, 160, 160)), true);
                ++n5;
            }
        }
    }

    public double h() {
        JF.g();
        double d = ME.e(this.d) + 20.0;
        Iterator iterator = ListInvoker.iterator(ME.a(this.d));
        if (dz_0.c(iterator)) {
            JF jF = (JF)dz_0.b(iterator);
            if (jF == this) {
                // empty if block
            }
            d += (double)jF.u;
        }
        return d;
    }

    public void b(ClickGui clickGui, int n, int n2) {
        boolean bl;
        JF.g();
        boolean bl2 = bl = (double)n >= a13.g(ME.f(this.d)) + 5.0 && (double)n <= a13.g(ME.f(this.d)) + 120.0 && (float)n2 >= this.s && (float)n2 <= this.s + 15.0f;
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.m)) {
            a1V.b(a13.g(ME.f(this.d)) + 5.0, (double)this.s, a13.g(ME.f(this.d)) + 120.0, (double)(this.s + 15.0f), aol_1.b(new Color(44, 44, 44)));
            a1V.b(a13.g(ME.f(this.d)) + 6.0, (double)(this.s + 1.0f), a13.g(ME.f(this.d)) + 119.0, (double)(this.s + 14.0f), aol_1.b(new Color(37, 37, 37)));
        }
        a1V.b(a13.g(ME.f(this.d)) + 5.0, (double)this.s, a13.g(ME.f(this.d)) + 120.0, (double)(this.s + 15.0f), aol_1.b(new Color(0, 0, 0, 55)));
        a1V.b(a13.g(ME.f(this.d)) + 6.0, (double)(this.s + 1.0f), a13.g(ME.f(this.d)) + 119.0, (double)(this.s + 14.0f), aol_1.b(new Color(0, 0, 0, 55)));
        String string = ahg_0.j(this.x);
        a7l_0.a(adj_1.a(ng_0.a, 20), (CharSequence)string, (float)(a13.g(ME.f(this.d)) + 64.0), this.s + 4.0f, -1, true);
    }

    public void d(ClickGui clickGui, int n, int n2) {
        JF.c();
        FontRenderer fontRenderer = adj_1.a(pI.a, 19);
        Color color = new Color(225, 225, 225);
        Color color2 = new Color(110, 110, 110);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.w)) {
            color = new Color(255, 255, 255);
            color2 = new Color(200, 200, 200, 100);
        }
        if (ahg_0.l(this.x) != null && !auk_2.a((Boolean)Ba.b(ahg_0.l(this.x)))) {
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.r)) {
                color = new Color(255, 255, 255, 120);
                color2 = new Color(200, 200, 200, 70);
            }
            color = aol_1.d(color);
            color2 = aol_1.d(color2);
        }
        KN.b(a13.d(ME.f(this.d)), fontRenderer, ahg_0.j(this.x), (float)(a13.g(ME.f(this.d)) + 59.0 - (double)(a7l_0.a(fontRenderer, ahg_0.j(this.x)) / 2)) + 5.0f, this.s + 5.0f, aol_1.b(color), true);
        a1V.b(a13.g(ME.f(this.d)) + 5.0, (double)(this.s + 17.0f), a13.g(ME.f(this.d)) + 123.0, (double)(this.s + 18.0f), aol_1.b(color2));
    }

    public void k(int n, int n2, int n3) {
        JF.c();
        boolean bl = (double)n >= a13.g(ME.f(this.d)) + 5.0 && (double)n <= a13.g(ME.f(this.d)) + 110.0 && (float)n2 >= this.s && (float)n2 <= this.s + 15.0f;
    }

    public void d(int n, int n2, int n3) {
        JF.g();
        if ((double)n >= a13.g(ME.f(this.d)) && (double)n <= a13.g(ME.f(this.d)) + 125.0 && (float)n2 >= this.s && (float)n2 <= this.s + 20.0f && n3 == 0) {
            boolean bl = this.r = !this.r;
            if (this.r) {
                this.u = 103;
            }
            this.u = 20;
            this.w = aUL.c(ahg_0.D(this.x));
        }
        if (this.r) {
            if ((double)n >= a13.g(ME.f(this.d)) + 1.0 && (double)n <= a13.g(ME.f(this.d)) + 82.0 && (float)n2 >= this.s + 21.0f && (float)n2 <= this.s + 21.0f + 81.0f) {
                this.p = true;
            }
            if ((double)n >= a13.g(ME.f(this.d)) + 85.0 && (double)n <= a13.g(ME.f(this.d)) + 93.0 && (float)n2 >= this.s + 21.0f && (float)n2 <= this.s + 21.0f + 81.0f) {
                this.e = true;
            }
            if ((double)n >= a13.g(ME.f(this.d)) + 94.0 && (double)n <= a13.g(ME.f(this.d)) + 103.0 && (float)n2 >= this.s + 21.0f && (float)n2 <= this.s + 21.0f + 81.0f) {
                this.b = true;
            }
            if ((double)n >= a13.g(ME.f(this.d)) + 104.0 && (double)n <= a13.g(ME.f(this.d)) + 113.0 && (float)n2 >= this.s + 61.0f && (float)n2 <= this.s + 101.0f) {
                ahg_0.a(this.x, aol_1.b(this.w));
                Color color = aUL.c(ahg_0.D(this.x));
                this.y = 1.0f - (float)aol_1.e(color) / 255.0f;
                float[] fArray = aol_1.a(aol_1.c(color), aol_1.g(color), aol_1.f(color), new float[3]);
                this.k = fArray[0];
                this.c = fArray[1];
                this.l = 1.0f - fArray[2];
            }
        }
    }

    public void g(int n, int n2, int n3) {
        block12: {
            block8: {
                block11: {
                    block10: {
                        block9: {
                            JF.c();
                            if (!this.a(n, n2)) break block8;
                            if (this.h || !(this.t < (double)(n3 - 4))) break block9;
                            if (qh_1.c(this.m, 600L)) {
                                this.t += 0.25;
                            }
                            if (this.t != (double)(n3 - 4)) break block10;
                            qh_1.b(this.m);
                        }
                        this.h = true;
                    }
                    if (!this.h || !(this.t > -6.0)) break block11;
                    if (qh_1.c(this.m, 600L)) {
                        this.t -= 0.25;
                    }
                    if (this.t != -6.0) break block12;
                    qh_1.b(this.m);
                }
                this.h = false;
            }
            this.t = MathInvoker.d(-6.0, this.t - 0.25);
        }
    }

    public void a(int n, int n2, int n3) {
        JF.g();
        if ((double)n >= a13.g(ME.f(this.d)) + 95.0 && (double)n <= a13.g(ME.f(this.d)) + 120.0 && (float)n2 >= this.s + 3.0f && (float)n2 <= this.s + 17.0f && n3 == 0) {
            Ba.a(ahg_0.l(this.x), auk_2.b(!auk_2.a(ahg_0.i(this.x))));
            EventManagerInvoker.call(new SettingEvent(ME.c(this.d), ahg_0.n(this.x), ahg_0.j(this.x), ahg_0.l(this.x)));
        }
    }

    public boolean a(int n, int n2) {
        JF.c();
        return (double)n >= a13.g(ME.f(this.d)) + 5.0 && (float)n2 >= this.s && (double)n <= a13.g(ME.f(this.d)) + 120.0 && (float)n2 <= this.s + 20.0f;
    }

    public void c(ClickGui clickGui, int n, int n2) {
        int n3;
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        JF.c();
        GL11.glEnable((int)3089);
        ahm_0.a((float)a13.g(ME.f(this.d)) + 6.0f, this.s, (float)(a13.g(ME.f(this.d)) + 60.0), this.s + 20.0f);
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), ahg_0.j(this.x), a13.g(ME.f(this.d)) - this.t, this.s + 5.0f, -1, true);
        GL11.glDisable((int)3089);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.h) && a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) > 55) {
            GlStateManagerInvoker.disableTexture2D();
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)5);
            n3 = -2;
            if (n3 < a7l_0.a(adj_1.a(ng_0.a, 18)) + 3) {
                a1V.a(aol_1.b(new Color(55, 55, 55, 255)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 60.0), (double)(this.s + 5.0f + (float)n3));
                a1V.a(aol_1.b(new Color(55, 55, 55, 0)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 45.0), (double)(this.s + 5.0f + (float)n3));
                ++n3;
            }
            GL11.glEnd();
            GlStateManagerInvoker.enableTexture2D();
        }
        n3 = (double)n >= a13.g(ME.f(this.d)) + 55.0 && (double)n <= a13.g(ME.f(this.d)) + 112.0 && (float)n2 >= this.s + 2.0f && (float)n2 <= this.s + 15.0f ? 1 : 0;
        a1V.b(a13.g(ME.f(this.d)) + 65.0, (double)(this.s + 2.0f), a13.g(ME.f(this.d)) + 122.0, (double)(this.s + 15.0f), this.o ? aol_1.b(new Color(50, 50, 50)) : aol_1.b(new Color(45, 45, 45)));
        a1V.b(a13.g(ME.f(this.d)) + 66.0, (double)(this.s + 3.0f), a13.g(ME.f(this.d)) + 121.0, (double)(this.s + 14.0f), aol_1.b(new Color(44, 44, 44)));
        String string = ahg_0.g(this.x);
        a7l_0.b(adj_1.a(ng_0.a, 18), a7l_0.a(adj_1.a(ng_0.a, 18), string, 45, true), a13.g(ME.f(this.d)) + 68.0, this.s + 6.0f, -1, true);
        if (this.o && KeyboardInvoker.a(14) && qh_1.c(this.a, 200L) && StringInvoker.c(string) >= 1) {
            StringPropertyInvoker.b(ahg_0.a(this.x), StringInvoker.b(string, 0, StringInvoker.c(string) - 1));
            qh_1.b(this.a);
        }
    }

    public void b(int n, int n2, int n3) {
        boolean bl;
        JF.g();
        boolean bl2 = bl = (double)n >= a13.g(ME.f(this.d)) + 55.0 && (double)n <= a13.g(ME.f(this.d)) + 112.0 && (float)n2 >= this.s + 2.0f && (float)n2 <= this.s + 15.0f;
        if (this.o) {
            this.o = false;
        }
    }

    public int a() {
        return this.u;
    }

    public void i(int n, int n2, int n3) {
        JF.g();
        switch (avy_0.a[ahg_0.v(this.x).ordinal()]) {
            case 1: {
                this.a(n, n2, n3);
            }
            case 2: {
                this.h(n, n2, n3);
            }
            case 3: {
                this.j(n, n2, n3);
            }
            case 4: {
                this.e(n, n2, n3);
            }
            case 5: {
                this.d(n, n2, n3);
            }
            case 6: {
                this.b(n, n2, n3);
            }
            case 7: {
                this.f(n, n2, n3);
            }
            case 8: {
                this.l(n, n2, n3);
            }
            case 9: {
                this.c(n, n2, n3);
            }
        }
    }

    public void c(int n, int n2, int n3) {
        JF.c();
        if (ahg_0.l(this.x) != null) {
            boolean bl = (double)n >= a13.g(ME.f(this.d)) + 5.0 && (double)n <= a13.g(ME.f(this.d)) + 123.0 && (float)n2 >= this.s + 2.0f && (float)n2 <= this.s + 18.0f;
            Ba.a(ahg_0.l(this.x), auk_2.b(!auk_2.a(ahg_0.i(this.x))));
        }
    }

    public void b(int n, int n2) {
        JF.g();
        boolean bl = (double)n >= a13.g(ME.f(this.d)) + 5.0 && (double)n <= a13.g(ME.f(this.d)) + 120.0 && (float)n2 >= this.s && (float)n2 <= this.s + 15.0f;
        a1V.b(a13.g(ME.f(this.d)) + 5.0, (double)this.s, a13.g(ME.f(this.d)) + 120.0, (double)(this.s + 15.0f), aol_1.b(new Color(19, 19, 19)));
        a1V.b(a13.g(ME.f(this.d)) + 6.0, (double)(this.s + 1.0f), a13.g(ME.f(this.d)) + 119.0, (double)(this.s + 14.0f), aol_1.b(new Color(12, 12, 12)));
        String string = ahg_0.j(this.x);
        KN.a(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), string, (float)(a13.g(ME.f(this.d)) + 64.0), this.s + 4.0f, -1, true);
    }

    public void a(char c, int n) {
        block9: {
            block8: {
                JF.g();
                if (ahg_0.v(this.x) != SettingType.TEXTBOX) break block8;
                if (!this.o) break block9;
                if (n == 1 || n == 28) {
                    this.o = false;
                }
                if (n == 14 || n == 157 || n == 29 || n == 54 || n == 42 || n == 15 || n == 58 || n == 211 || n == 199 || n == 210 || n == 200 || n == 208 || n == 205 || n == 203 || n == 56 || n == 184 || n == 197 || n == 70 || n == 207 || n == 201 || n == 209 || n == 221 || n == 59 || n == 60 || n == 61 || n == 62 || n == 63 || n == 64 || n == 65 || n == 66 || n == 67 || n == 68 || n == 87 || n == 88) break block9;
                StringPropertyInvoker.a(ahg_0.a(this.x), aze_0.c(c));
            }
            if (ahg_0.v(this.x) == SettingType.BINDABLE && this.i) {
                AbstractModule abstractModule = ME.c(this.d);
                if (n == 1) {
                    if (ahg_0.n(this.x).equals(aZQ.f)) {
                        aoc_1.a(ahg_0.s((Setting)ListInvoker.get(ManagerInvoker.a(abstractModule), 0)), ast_0.a(0));
                        EventManagerInvoker.call(new OF(ahg_0.C((Setting)ListInvoker.get(ManagerInvoker.a(abstractModule), 0)), 0, KeyboardInvoker.b(age_2.a((ae6_0)aoc_1.a(ahg_0.s((Setting)ListInvoker.get(ManagerInvoker.a(abstractModule), 0)))))));
                    }
                    aoc_1.a(ahg_0.s(this.x), ast_0.a(0));
                }
                if (ahg_0.n(this.x).equals(aZQ.q)) {
                    aoc_1.a(ahg_0.s((Setting)ListInvoker.get(ManagerInvoker.a(abstractModule), 0)), ast_0.a(n));
                    EventManagerInvoker.call(new OF(ahg_0.C((Setting)ListInvoker.get(ManagerInvoker.a(abstractModule), 0)), n, KeyboardInvoker.b(age_2.a((ae6_0)aoc_1.a(ahg_0.s((Setting)ListInvoker.get(ManagerInvoker.a(abstractModule), 0)))))));
                }
                aoc_1.a(ahg_0.s(this.x), ast_0.a(n));
                this.i = false;
                this.q = true;
            }
        }
    }

    public void l(int n, int n2, int n3) {
        boolean bl;
        JF.c();
        String string = aL0.a(aL0.a(aL0.a(new StringBuilder(), aZQ.G), this.i ? aZQ.i : KeyboardInvoker.b(age_2.a((ae6_0)aoc_1.a(wc_1.h(ME.c(this.d)))))), aZQ.K).toString();
        this.i = bl = (double)n >= a13.g(ME.f(this.d)) + 112.0 - (double)a7l_0.a(adj_1.a(ng_0.a, 18), string) && (double)n <= a13.g(ME.f(this.d)) + 112.0 && (float)n2 >= this.s + 1.0f && (float)n2 <= this.s + 19.0f;
    }

    public static int g() {
        JF.c();
        return 125;
    }

    public void a(ClickGui clickGui, int n, int n2, float f, int n3) {
        JF.g();
        this.s = (float)this.h();
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.k)) {
            a1V.b(a13.g(ME.f(this.d)), (double)this.s, a13.g(ME.f(this.d)) + 130.0, (double)(this.s + 20.0f), aol_1.b(new Color(55, 55, 55)));
        }
        a1V.b(a13.g(ME.f(this.d)), (double)this.s, a13.g(ME.f(this.d)) + 130.0, (double)(this.s + 20.0f), aol_1.b(new Color(0, 0, 0, (int)(60.0 * z4_0.l(clickGui)))));
        switch (avy_0.a[ahg_0.v(this.x).ordinal()]) {
            case 1: {
                this.g(n, n2, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) - 55);
                this.a(clickGui, n3);
            }
            case 2: {
                this.g(n, n2, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) - 50);
                this.a(clickGui, n, n2, n3);
            }
            case 3: {
                this.g(n, n2, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) - 95);
                this.b(clickGui, n, n2, n3);
            }
            case 4: {
                this.g(n, n2, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) - 95);
                this.c(clickGui, n, n2, n3);
            }
            case 5: {
                this.g(n, n2, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) - 95);
                this.e(clickGui, n, n2);
            }
            case 6: {
                this.g(n, n2, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) - 40);
                this.c(clickGui, n, n2);
            }
            case 7: {
                this.b(clickGui, n, n2);
            }
            case 8: {
                this.a(clickGui, n, n2);
            }
            case 9: {
                this.d(clickGui, n, n2);
            }
        }
    }

    public void a(ClickGui clickGui, int n, int n2) {
        JF.c();
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), ahg_0.j(this.x), a13.g(ME.f(this.d)) + 5.5, this.s + 7.0f, -1, true);
        int n3 = ahg_0.n(this.x).equals(aZQ.j) ? age_2.a((ae6_0)aoc_1.a(wc_1.h(ME.c(this.d)))) : age_2.a((ae6_0)aoc_1.a(ahg_0.s(this.x)));
        String string = aL0.a(aL0.a(aL0.a(new StringBuilder(), aZQ.z), this.i ? aZQ.B : KeyboardInvoker.b(n3)), aZQ.A).toString();
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 18), string, a13.g(ME.f(this.d)) + 122.0 - (double)a7l_0.a(adj_1.a(ng_0.a, 18), string), this.s + 6.0f, -1, false);
    }

    public boolean e() {
        return this.o;
    }

    public void a(boolean bl) {
        this.o = bl;
    }

    public void j(int n, int n2, int n3) {
        int n4;
        JF.g();
        if ((double)n >= a13.g(ME.f(this.d)) && (double)n <= a13.g(ME.f(this.d)) + 125.0 && (float)n2 >= this.s && (float)n2 <= this.s + 20.0f && n3 == 0) {
            abl_1.b(ahg_0.A(this.x));
            boolean bl = this.r = !this.r;
            if (this.r) {
                this.u = 20 + ListInvoker.size(StringPropertyInvoker.a(ahg_0.y(this.x))) * 15;
            }
            this.u = 20;
        }
        if (this.r && (n4 = 0) < ListInvoker.size(StringPropertyInvoker.a(ahg_0.y(this.x)))) {
            double d = this.s + 20.0f + (float)(n4 * 15);
            if ((double)n >= a13.g(ME.f(this.d)) && (double)n <= a13.g(ME.f(this.d)) + 125.0 && (double)n2 >= d && (double)n2 <= d + 15.0) {
                StringPropertyInvoker.b(ahg_0.y(this.x), (String)ListInvoker.get(StringPropertyInvoker.a(ahg_0.y(this.x)), n4));
                EventManagerInvoker.call(new SettingEvent(ME.c(this.d), ahg_0.n(this.x), ahg_0.y(this.x)));
            }
            ++n4;
        }
    }

    public void e(ClickGui clickGui, int n, int n2) {
        JF.c();
        HUD cfr_ignored_4 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        GL11.glEnable((int)3089);
        ahm_0.a((float)a13.g(ME.f(this.d)) + 6.0f, this.s, (float)(a13.g(ME.f(this.d)) + 95.0), this.s + 20.0f);
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), ahg_0.j(this.x), a13.g(ME.f(this.d)) - this.t, this.s + 6.0f, -1, true);
        GL11.glDisable((int)3089);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.a) && a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) > 90) {
            GlStateManagerInvoker.disableTexture2D();
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)5);
            int n3 = -2;
            if (n3 < a7l_0.a(adj_1.a(ng_0.a, 18)) + 3) {
                a1V.a(aol_1.b(new Color(55, 55, 55, 255)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 100.0), (double)(this.s + 5.0f + (float)n3));
                a1V.a(aol_1.b(new Color(55, 55, 55, 0)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 50.0), (double)(this.s + 5.0f + (float)n3));
                ++n3;
            }
            GL11.glEnd();
            GlStateManagerInvoker.enableTexture2D();
        }
        a1V.c(a13.g(ME.f(this.d)) + 115.0, this.s + 10.0f, 14.0 * z4_0.q(clickGui), aol_1.b(aol_1.d(aol_1.d(ahg_0.p(this.x)))));
        a1V.c(a13.g(ME.f(this.d)) + 115.0, this.s + 10.0f, 12.0 * z4_0.q(clickGui), ahg_0.r(this.x));
        if (this.r) {
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.g)) {
                a1V.b(a13.g(ME.f(this.d)), (double)(this.s + 20.0f), a13.g(ME.f(this.d)) + 125.0, (double)(this.s + 20.0f + 83.0f), aol_1.b(new Color(45, 45, 45)));
            }
            a1V.b(a13.g(ME.f(this.d)), (double)(this.s + 20.0f), a13.g(ME.f(this.d)) + 125.0, (double)(this.s + 20.0f + 83.0f), aol_1.b(new Color(0, 0, 0, (int)(60.0 * z4_0.l(clickGui)))));
            double d = a13.g(ME.f(this.d)) + 2.0;
            double d2 = this.s + 21.0f;
            double d3 = 81.0;
            Color color = aUL.c(ahg_0.D(this.x));
            Color color2 = new Color(aol_1.c(color), aol_1.g(color), aol_1.f(color), 255);
            a1V.b(d - 1.0, d2 - 1.0, d + d3 + 20.0, d2 + d3 + 1.0, aol_1.b(new Color(45, 45, 45)));
            GlStateManagerInvoker.pushMatrix();
            GlStateManagerInvoker.disableTexture2D();
            GL11.glShadeModel((int)7425);
            int n4 = 0;
            double d4 = (double)n4 - d3;
            int cfr_ignored_5 = d4 == 0.0 ? 0 : (d4 < 0.0 ? -1 : 1);
            GL11.glBegin((int)7);
            float[] fArray = aol_1.a(aol_1.c(color2), aol_1.g(color2), aol_1.f(color2), new float[3]);
            int n5 = aol_1.a(fArray[0], 0.0f, 1.0f - (float)n4 / 81.0f);
            int n6 = aol_1.a(fArray[0], 1.0f, 1.0f - (float)n4 / 81.0f);
            a1V.a(n5);
            GL11.glVertex2d((double)d, (double)(d2 + (double)n4));
            GL11.glVertex2d((double)d, (double)(d2 + (double)n4 + 1.0));
            a1V.a(n6);
            GL11.glVertex2d((double)(d + d3), (double)(d2 + (double)n4 + 1.0));
            GL11.glVertex2d((double)(d + d3), (double)(d2 + (double)n4));
            GL11.glEnd();
            ++n4;
            GlStateManagerInvoker.enableTexture2D();
            GlStateManagerInvoker.popMatrix();
            n4 = 0;
            double d5 = (double)n4 - d3;
            int cfr_ignored_6 = d5 == 0.0 ? 0 : (d5 < 0.0 ? -1 : 1);
            int n7 = aol_1.a((float)n4 / 81.0f, 1.0f, 1.0f);
            a1V.b(d + d3 + 2.0, d2 + (double)n4, d + d3 + 10.0, d2 + (double)n4 + 1.0, n7);
            ++n4;
            n4 = 0;
            n7 = 0;
            double d6 = (double)n7 - d3 / 3.0;
            int cfr_ignored_7 = d6 == 0.0 ? 0 : (d6 < 0.0 ? -1 : 1);
            int cfr_ignored_8 = n4 % 2;
            int cfr_ignored_9 = n7 % 2;
            Color color3 = new Color(255, 255, 255);
            color3 = new Color(210, 210, 210);
            int cfr_ignored_10 = n7 % 2;
            color3 = new Color(210, 210, 210);
            color3 = new Color(255, 255, 255);
            a1V.b(d + d3 + 11.0 + (double)(3 * n4), d2 + (double)(3 * n7), d + d3 + 11.0 + (double)(3 * n4) + 3.0, d2 + (double)(3 * n7) + 3.0, aol_1.b(color3));
            ++n7;
            ++n4;
            n4 = 0;
            double d7 = (double)n4 - d3;
            int cfr_ignored_11 = d7 == 0.0 ? 0 : (d7 < 0.0 ? -1 : 1);
            a1V.b(d + d3 + 11.0, d2 + (double)n4, d + d3 + 20.0, d2 + (double)n4 + 1.0, aol_1.b(new Color(aol_1.c(color2), aol_1.g(color2), aol_1.f(color2), 255 - (int)((float)n4 / 81.0f * 255.0f))));
            ++n4;
            a1V.b(d + d3 + 22.0, d2, d + d3 + 30.0, d2 + 40.0, aol_1.b(new Color(aol_1.c(color2), aol_1.g(color2), aol_1.f(color2), aUL.g(ahg_0.D(this.x)))));
            a1V.b(d + d3 + 22.0, d2 + 41.0, d + d3 + 30.0, d2 + 81.0, aol_1.b(this.w));
            if (this.e) {
                double d8 = 79.0;
                double d9 = MathHelper.b((double)((float)n2 - (this.s + 22.0f)) / d8, 0.0, 1.0) * 1.0;
                this.k = (float)d9;
                float[] fArray2 = aol_1.a(aol_1.c(color), aol_1.g(color), aol_1.f(color), new float[3]);
                int n8 = aol_1.a(this.k, fArray2[1], fArray2[2]);
                Color color4 = new Color(n8);
                ahg_0.a(this.x, aol_1.b(new Color(aol_1.c(color4), aol_1.g(color4), aol_1.f(color4), aol_1.e(aUL.c(ahg_0.D(this.x))))));
            } else if (this.b) {
                double d10 = 79.0;
                double d11 = MathHelper.b((double)((float)n2 - (this.s + 22.0f)) / d10, 0.0, 1.0) * 1.0;
                this.y = (float)d11;
                Color color5 = ahg_0.p(this.x);
                int n9 = MathInvoker.max(4, 255 - MathHelper.a((int)(this.y * 255.0f), 0, 255));
                ahg_0.a(this.x, aol_1.b(new Color(aol_1.c(color5), aol_1.g(color5), aol_1.f(color5), n9)));
            } else if (this.p) {
                double d12 = MathHelper.b(((double)n - d) / d3, 0.0, 1.0);
                double d13 = MathHelper.b(((double)n2 - d2) / d3, 0.0, 1.0);
                this.c = MathHelper.b(d12, 0.04, 0.95);
                this.l = MathHelper.b(d13, 0.04, 0.95);
                Color color6 = ahg_0.p(this.x);
                float[] fArray3 = aol_1.a(aol_1.c(color6), aol_1.g(color6), aol_1.f(color6), new float[3]);
                int n10 = aol_1.b(aol_1.b(fArray3[0], (float)this.c, 1.0f - (float)this.l));
                Color color7 = new Color(n10);
                ahg_0.a(this.x, aol_1.b(new Color(aol_1.c(color7), aol_1.g(color7), aol_1.f(color7), aol_1.e(color6))));
            }
            if (this.e || this.b || this.p) {
                EventManagerInvoker.call(new SettingEvent(ME.c(this.d), ahg_0.n(this.x)));
            }
            a1V.a(a13.g(ME.f(this.d)) + 2.0 + this.c * 81.0, (double)(this.s + 21.0f) + this.l * 81.0, 1.0, 1.0f, aol_1.b(new Color(255, 255, 255, 255)), aol_1.b(new Color(255, 255, 255, 150)));
            a1V.b(d + d3 + 3.0, MathHelper.b(d2 + (double)(this.k * 81.0f), 0.0, d2 + 80.0), d + d3 + 9.0, MathHelper.b(d2 + (double)(this.k * 81.0f) + 1.0, 0.0, d2 + 81.0), aol_1.b(new Color(20, 20, 20)));
            a1V.b(d + d3 + 12.0, MathHelper.b(d2 + (double)(this.y * 81.0f), 0.0, d2 + 80.0), d + d3 + 19.0, MathHelper.b(d2 + (double)(this.y * 81.0f) + 1.0, 0.0, d2 + 81.0), aol_1.b(new Color(20, 20, 20)));
        }
    }

    public boolean f() {
        return this.i;
    }

    public void h(int n, int n2, int n3) {
        JF.g();
        double d = a13.g(ME.f(this.d)) + 110.0 - (a13.g(ME.f(this.d)) + 5.0 + (double)MathInvoker.b(45, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x))) + 5.0);
        double d2 = a13.g(ME.f(this.d)) + 120.0 - d;
        if ((double)n >= d2 && (double)n <= d2 + d && (float)n2 >= this.s + 6.0f && (float)n2 <= this.s + 11.0f && n3 == 0) {
            this.j = true;
        }
    }

    public static int c() {
        return g;
    }

    public void d() {
        JF.c();
        if (this.j && ahg_0.n(this.x).equals(aZQ.s)) {
            z4_0.a((ClickGui)ModuleInvoker.isEnable(ModuleRegistry.CLICKGUI), ahg_0.x(this.x));
        }
        this.j = false;
        this.e = false;
        this.p = false;
        this.b = false;
    }

    public static void b(int n) {
        g = n;
    }

    public void a(ClickGui clickGui, int n) {
        int n2;
        block10: {
            block9: {
                HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
                GL11.glEnable((int)3089);
                ahm_0.a((float)a13.g(ME.f(this.d)) + 6.0f, this.s, (float)(a13.g(ME.f(this.d)) + 80.0), this.s + 20.0f);
                int n3 = JF.g();
                KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), ahg_0.j(this.x), a13.g(ME.f(this.d)) - this.t, (double)this.s + 6.5, -1, true);
                n2 = n3;
                GL11.glDisable((int)3089);
                if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.D) && a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) > 75) {
                    GlStateManagerInvoker.disableTexture2D();
                    GL11.glShadeModel((int)7425);
                    GL11.glBegin((int)5);
                    int n4 = -2;
                    if (n4 < a7l_0.a(adj_1.a(ng_0.a, 18)) + 4) {
                        a1V.a(aol_1.b(new Color(55, 55, 55, 255)));
                        GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 80.0), (double)(this.s + 5.0f + (float)n4));
                        a1V.a(aol_1.b(new Color(55, 55, 55, 0)));
                        GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 60.0), (double)(this.s + 5.0f + (float)n4));
                        ++n4;
                    }
                    GL11.glEnd();
                    GlStateManagerInvoker.enableTexture2D();
                }
                double d = z4_0.l(clickGui);
                if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.x)) {
                    a1V.a((double)((float)(a13.g(ME.f(this.d)) + 86.0)), (double)(this.s + 3.0f), 35.0, 13.0, 6.0, 2.0f, aol_1.b(new Color(45, 45, 45)), aol_1.b(new Color(40, 40, 40)));
                }
                aV3.a(aV3.a(), (double)((float)(a13.g(ME.f(this.d)) + 86.0)), (double)(this.s + 3.0f), 35.0, 13.0, 12.0, 1.5, new Color(0, 0, 0, (int)(200.0 * d)), true);
                if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.u)) {
                    a1V.c(a13.g(ME.f(this.d)) + 92.5 + (double)this.v, (double)this.s + 9.5, 11.0 * z4_0.q(clickGui), a1V.a(new Color(55, 55, 55), new Color(n), (double)this.f));
                }
                a1V.c(a13.g(ME.f(this.d)) + 92.5 + (double)this.v, (double)this.s + 9.5, 11.0 * z4_0.q(clickGui), a1V.a(new Color(0, 0, 0, (int)(200.0 * d)), new Color(n), (double)this.f));
                this.v = (float)((double)this.v + (double)((float)(auk_2.a(ahg_0.i(this.x)) ? 22 : 0) - this.v) * 0.1);
                if (!auk_2.a(ahg_0.i(this.x))) break block9;
                if (!(this.f < 1.0f) && !(this.z < 1.0f)) break block10;
                this.f = (float)MathInvoker.a(1.0, (double)this.f + 0.05);
                this.z = (float)MathInvoker.a(1.0, (double)this.z + 0.05);
            }
            if (this.f > 0.0f || this.z > 0.0f) {
                this.f = (float)MathInvoker.d(0.0, (double)this.f - 0.05);
                this.z = (float)MathInvoker.d(0.0, (double)this.z - 0.05);
            }
        }
        if (ListInvoker.b() != null) {
            JF.b(++n2);
        }
    }

    public void e(int n, int n2, int n3) {
        Iterator iterator;
        JF.g();
        if ((double)n >= a13.g(ME.f(this.d)) && (double)n <= a13.g(ME.f(this.d)) + 125.0 && (float)n2 >= this.s && (float)n2 <= this.s + 20.0f && n3 == 0) {
            abl_1.b(ahg_0.A(this.x));
            boolean bl = this.r = !this.r;
            if (this.r) {
                this.u = 20 + ListInvoker.size(ava_0.b(ahg_0.k(this.x))) * 15;
            }
            this.u = 20;
        }
        if (this.r && dz_0.c(iterator = ListInvoker.iterator(ava_0.b(ahg_0.k(this.x))))) {
            String string = (String)dz_0.b(iterator);
            double d = this.s + 20.0f + (float)(ListInvoker.indexOf(ava_0.b(ahg_0.k(this.x)), string) * 15);
            if (n3 == 0 && (double)n >= a13.g(ME.f(this.d)) && (double)n <= a13.g(ME.f(this.d)) + 125.0 && (double)n2 >= d && (double)n2 <= d + 15.0) {
                if (ListInvoker.contains((List)ava_0.a(ahg_0.k(this.x)), string)) {
                    ListInvoker.remove((List)ava_0.a(ahg_0.k(this.x)), string);
                }
                ListInvoker.add((List)ava_0.a(ahg_0.k(this.x)), string);
                EventManagerInvoker.call(new SettingEvent(ME.c(this.d), ahg_0.n(this.x), ahg_0.k(this.x)));
            }
        }
    }

    public Setting b() {
        return this.x;
    }

    public JF(Setting setting, r_0 r_02) {
        JF.g();
        this.m = new TimerUtil();
        this.u = 20;
        this.w = Color.WHITE;
        this.a = new TimerUtil();
        this.x = setting;
        this.d = r_02;
        if (ahg_0.v(setting) == SettingType.COLOR_PICKER) {
            Color color;
            this.w = color = aUL.c(ahg_0.D(setting));
            this.y = 1.0f - (float)aol_1.e(color) / 255.0f;
            float[] fArray = aol_1.a(aol_1.c(color), aol_1.g(color), aol_1.f(color), new float[3]);
            this.k = fArray[0];
            this.c = fArray[1];
            this.l = 1.0f - fArray[2];
        }
    }

    public void b(ClickGui clickGui, int n, int n2, int n3) {
        JF.g();
        HUD cfr_ignored_0 = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        GL11.glEnable((int)3089);
        ahm_0.a((float)a13.g(ME.f(this.d)) + 6.0f, this.s, (float)a13.g(ME.f(this.d)) + 105.0f, this.s + 20.0f);
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), ahg_0.j(this.x), a13.g(ME.f(this.d)) - this.t, this.s + 6.0f, -1, true);
        GL11.glDisable((int)3089);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.v) && a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) > 100) {
            GlStateManagerInvoker.disableTexture2D();
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)5);
            int n4 = -2;
            if (n4 < a7l_0.a(adj_1.a(ng_0.a, 18)) + 3) {
                a1V.a(aol_1.b(new Color(55, 55, 55, 255)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 110.0), (double)(this.s + 5.0f + (float)n4));
                a1V.a(aol_1.b(new Color(55, 55, 55, 0)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 60.0), (double)(this.s + 5.0f + (float)n4));
                ++n4;
            }
            GL11.glEnd();
            GlStateManagerInvoker.enableTexture2D();
        }
        a1V.a(a13.g(ME.f(this.d)) + 117.0, (double)this.s + 8.5, 2.5f, -1, 6.0, this.r ? 90.0 - abl_1.a(ahg_0.A(this.x), 100L, 90.0) : abl_1.a(ahg_0.A(this.x), 100L, 90.0));
        if (this.r) {
            float f = this.s + 20.0f;
            float f2 = this.s + 20.0f + (float)(ListInvoker.size(StringPropertyInvoker.a(ahg_0.y(this.x))) * 15);
            if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.I)) {
                a1V.b(a13.g(ME.f(this.d)), (double)f, a13.g(ME.f(this.d)) + 125.0, (double)f2, aol_1.b(new Color(40, 40, 40)));
                a1V.a((float)(a13.g(ME.f(this.d)) + 6.0), f, 113.0f, f2 - f, 5.0f, aol_1.b(new Color(45, 45, 45)));
            }
            a1V.b(a13.g(ME.f(this.d)), (double)f, a13.g(ME.f(this.d)) + 125.0, (double)f2, aol_1.b(new Color(0, 0, 0, (int)(120.0 * z4_0.l(clickGui)))));
            int n5 = 0;
            if (n5 < ListInvoker.size(StringPropertyInvoker.a(ahg_0.y(this.x)))) {
                double d = this.s + 20.0f + (float)(n5 * 15);
                String string = (String)ListInvoker.get(StringPropertyInvoker.a(ahg_0.y(this.x)), n5);
                if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.C)) {
                    KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 25), aZQ.b, a13.g(ME.f(this.d)) + 12.0, d - 0.5, ((String)StringPropertyInvoker.b(ahg_0.y(this.x))).equals(string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(120, 120, 120)), true);
                    KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 18), string, a13.g(ME.f(this.d)) + 18.0, d + 5.0, ((String)StringPropertyInvoker.b(ahg_0.y(this.x))).equals(string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(120, 120, 120)), true);
                }
                KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 25), aZQ.y, a13.g(ME.f(this.d)) + 12.0, d - 0.5, ((String)StringPropertyInvoker.b(ahg_0.y(this.x))).equals(string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(160, 160, 160)), true);
                KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 18), string, a13.g(ME.f(this.d)) + 18.0, d + 5.0, ((String)StringPropertyInvoker.b(ahg_0.y(this.x))).equals(string) ? hb_2.a(n3, 1.0) : aol_1.b(new Color(160, 160, 160)), true);
                ++n5;
            }
        }
    }

    public void b(boolean bl) {
        this.i = bl;
    }

    public void a(ClickGui clickGui, int n, int n2, int n3) {
        JF.c();
        GL11.glEnable((int)3089);
        ahm_0.a((float)a13.g(ME.f(this.d)) + 6.0f, this.s, (float)a13.g(ME.f(this.d)) + 60.0f, this.s + 20.0f);
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 20), ahg_0.j(this.x), a13.g(ME.f(this.d)) - this.t, this.s + 5.0f, -1, true);
        GL11.glDisable((int)3089);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.H) && a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x)) > 55) {
            GlStateManagerInvoker.disableTexture2D();
            GL11.glShadeModel((int)7425);
            GL11.glBegin((int)5);
            int n4 = -2;
            if (n4 < a7l_0.a(adj_1.a(ng_0.a, 18)) + 3) {
                a1V.a(aol_1.b(new Color(55, 55, 55, 255)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 60.0), (double)(this.s + 5.0f + (float)n4));
                a1V.a(aol_1.b(new Color(55, 55, 55, 0)));
                GL11.glVertex2d((double)(a13.g(ME.f(this.d)) + 45.0), (double)(this.s + 5.0f + (float)n4));
                ++n4;
                ListInvoker.b(new ListInvoker[4]);
            }
            GL11.glEnd();
            GlStateManagerInvoker.enableTexture2D();
        }
        double d = a13.g(ME.f(this.d)) + 110.0 - (a13.g(ME.f(this.d)) + 5.0 + (double)MathInvoker.b(45, a7l_0.a(adj_1.a(ng_0.a, 20), ahg_0.j(this.x))) + 5.0);
        double d2 = a13.g(ME.f(this.d)) + 120.0 - d;
        double d3 = d / 100.0;
        double d4 = (ahg_0.x(this.x) - acU.d(aKE.c(ahg_0.w(this.x)))) / (acU.d(aKE.a(ahg_0.w(this.x))) - acU.d(aKE.c(ahg_0.w(this.x)))) * 100.0;
        double d5 = MathHelper.b((double)(MCInvoker.O(MCInvoker.f()) / 30), 1.0, 9999.0);
        this.n += (d4 - this.n) * (0.2 / d5);
        if (StringPropertyInvoker.isMode(z4_0.o(clickGui), aZQ.e)) {
            a1V.a((float)d2, this.s + 7.0f, (float)d, 3.0f, 1.0f, aol_1.b(new Color(45, 45, 45)));
        }
        a1V.a((float)d2, this.s + 7.0f, (float)d, 3.0f, 1.0f, aol_1.b(new Color(0, 0, 0, (int)(120.0 * z4_0.l(clickGui)))));
        if (this.n > 1.0) {
            a1V.a((float)d2, this.s + 7.0f, (float)(d3 * this.n), 3.0f, 1.0f, n3);
        }
        double d6 = (double)((int)(ahg_0.x(this.x) * 100.0)) / 100.0;
        KN.b(a13.d(ME.f(this.d)), adj_1.a(ng_0.a, 13), aL0.a(aL0.a(aL0.a(new StringBuilder(), d6), aZQ.l), ahg_0.q(this.x)).toString(), (float)MathHelper.b((double)((float)(d2 + d3 * this.n - (double)(a7l_0.a(adj_1.a(ng_0.a, 13), aL0.a(aL0.a(aL0.a(new StringBuilder(), d6), aZQ.p), ahg_0.q(this.x)).toString()) / 2))), a13.g(ME.f(this.d)) + (double)(a7l_0.a(adj_1.a(ng_0.a, 13), aL0.a(aL0.a(aL0.a(new StringBuilder(), d6), aZQ.J), ahg_0.q(this.x)).toString()) * 2), a13.g(ME.f(this.d)) + 110.0 - (double)a7l_0.a(adj_1.a(ng_0.a, 13), aL0.a(aL0.a(aL0.a(new StringBuilder(), d6), aZQ.F), ahg_0.q(this.x)).toString()) + 2.0), this.s + 14.5f, -1, false);
        if (this.j) {
            double d7 = acU.d(aKE.a(ahg_0.w(this.x))) - acU.d(aKE.c(ahg_0.w(this.x)));
            double d8 = acU.d(aKE.c(ahg_0.w(this.x))) + MathHelper.b(((double)n - (d2 + 1.0)) / d, 0.0, 1.0) * d7;
            double d9 = MathHelper.d(d8, ahg_0.t(this.x));
            ahg_0.a(this.x, d9);
            EventManagerInvoker.call(new SettingEvent(ME.c(this.d), ahg_0.n(this.x), ahg_0.w(this.x)));
        }
    }

    public void f(int n, int n2, int n3) {
        JF.g();
        boolean bl = (double)n >= a13.g(ME.f(this.d)) + 5.0 && (double)n <= a13.g(ME.f(this.d)) + 110.0 && (float)n2 >= this.s && (float)n2 <= this.s + 15.0f;
    }
}

