/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package net;

import cc.novoline.events.EventTarget;
import cc.novoline.events.events.Render2DEvent;
import cc.novoline.events.events.RenderGuiEvent;
import cc.novoline.invoke.EventManagerInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.utils.Timer;
import deobf.EntityPlayer;
import deobf.FontRenderer;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import cc.novoline.modules.combat.TargetHUD;
import java.awt.Color;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.Oi
 */
class oi_0 {
    private double e;
    private double n;
    private ax4_0 f;
    private double a;
    private int l;
    private EntityPlayer b;
    private double i;
    private double m;
    TargetHUD d;
    private Timer k;
    private aCT g;
    private float h;
    private double j;
    private boolean c;

    private double a(double d) {
        _j_0.b(this.f);
        double d2 = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.b(d * (1.0 - d2), 0.05, 1.0);
    }

    public void d() {
        if (this.b != null) {
            double d = ua_2.a(true);
            this.a(this.b);
            ua_2.a(d);
        }
    }

    public void a(RenderGuiEvent renderGuiEvent) {
        KillAura.w();
        if (HN.d(renderGuiEvent) instanceof GuiChat) {
            boolean bl;
            double d = ua_2.a(HN.b(renderGuiEvent));
            double d2 = ua_2.b(HN.a(renderGuiEvent));
            double d3 = db_0.b((Double)MD.b(TargetHUD.j(this.d)));
            double d4 = db_0.b((Double)MD.b(TargetHUD.e(this.d)));
            boolean bl2 = bl = d > d3 && d <= d3 + this.n && d2 > d4 && d2 <= d4 + this.j;
            if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                if (HN.e(renderGuiEvent) == 0) {
                    // empty if block
                }
            } else if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                if (this.c) {
                    MD.b(TargetHUD.j(this.d), db_0.a(MathHelper.b(this.a + d, db_0.b((Double)MD.a(TargetHUD.j(this.d))), db_0.b((Double)MD.c(TargetHUD.j(this.d))))));
                    MD.b(TargetHUD.e(this.d), db_0.a(MathHelper.b(this.m + d2, db_0.b((Double)MD.a(TargetHUD.e(this.d))), db_0.b((Double)MD.c(TargetHUD.e(this.d))))));
                }
                if (!TargetHUD.b(this.d)) {
                    this.b = TargetHUD.r((TargetHUD)this.d).player;
                    this.c(this.b);
                }
            } else {
                if (HN.c(renderGuiEvent) == alw_0.RELEASE && HN.e(renderGuiEvent) == 0) {
                    this.c = false;
                }
                if (HN.c(renderGuiEvent) == alw_0.INITIAL && !TargetHUD.b(this.d)) {
                    this.a();
                }
                if (HN.c(renderGuiEvent) == alw_0.CLOSE && !TargetHUD.l(this.d)) {
                    this.c();
                }
            }
        }
    }

    public void a() {
        _j_0.a(this.f, 0.2);
        abl_1.b(this.k);
        this.l = -1;
        EventManagerInvoker.b(this);
    }

    private oi_0(TargetHUD targetHUD) {
        this.d = targetHUD;
        this.f = new ax4_0();
        this.k = new Timer();
        this.g = new aCT();
    }

    private void a(EntityPlayer entityPlayer) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        FontRenderer fontRenderer = TargetHUD.B((TargetHUD)this.d).fontRendererCrack;
        double d = TargetHUD.D(this.d);
        double d2 = TargetHUD.E(this.d);
        this.n = MathInvoker.max(92, 44 + FontRendererInvoker.a(fontRenderer, a6w_0.C(entityPlayer)));
        this.j = 42.0;
        this.e = d + this.n * 0.5;
        this.i = d2 + this.j * 0.5;
        int n = hb_2.a(P8.b(aUL.f(TargetHUD.q(this.d))), this.a(255));
        int n2 = hb_2.a(P8.b(aUL.f(TargetHUD.i(this.d))), this.a(255));
        int n3 = hb_2.a(P8.b(aUL.f(TargetHUD.s(this.d))), this.a(255));
        this.a(() -> this.lambda$drawTargetHud$0(d, d2));
        this.g.a = d + 21.0;
        this.g.c = d2 + 21.0;
        this.b();
        this.a(() -> this.lambda$drawTargetHud$1(entityPlayer, d, d2, fontRenderer, hUD, n, n2, n3));
    }

    private int a(int n) {
        _j_0.b(this.f);
        double d = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.a((int)((double)n * (1.0 - d)), 35, 255);
    }

    private void a(EntityPlayer entityPlayer, double d, double d2, double d3, double d4) {
        ResourceLocation resourceLocation;
        KillAura.w();
        NetworkPlayerInfo networkPlayerInfo = aDM.a(a6w_0.g(entityPlayer));
        if (networkPlayerInfo == null) {
            resourceLocation = af__0.a(a6w_0.g(entityPlayer));
        }
        resourceLocation = aNL.k(networkPlayerInfo);
        TextureManagerInvoker.bindTexture(MCInvoker.E(TargetHUD.A(this.d)), resourceLocation);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.alphaFunc(516, 0.0f);
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)d4);
        wh_1.a(d -= d3 * 0.5, d2 -= d3 * 0.5, 8.0f, 8.0f, 8, 8, d3, d3, 64.0f, 64.0f);
        a1V.b(d, d2, d + d3, d2 + d3, hb_2.a(255, 0, 0, 10 * entityPlayer.a8));
    }

    public void c(EntityPlayer entityPlayer) {
        double d = ua_2.a(true);
        this.a(entityPlayer);
        ua_2.a(d);
    }

    private float a(float f) {
        _j_0.b(this.f);
        double d = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.b((float)((double)f * (1.0 - d)), 0.05f, 1.0f);
    }

    static ax4_0 a(oi_0 oi_02) {
        return oi_02.f;
    }

    public void c() {
        _j_0.c(this.f);
        abl_1.b(this.k);
        EventManagerInvoker.a(this);
    }

    public void b() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.d), aYZ.e)) {
            aop_0.a(this.g, false, P8.b(aUL.f(TargetHUD.q(this.d))), true);
        }
        aop_0.a(this.g, false, true);
    }

    public void b(EntityPlayer entityPlayer) {
        KillAura.w();
        this.b = entityPlayer;
        if (auk_2.a((Boolean)Ba.b(TargetHUD.d(this.d))) && this.b != null && this.b.a8 == 9) {
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.d), aYZ.f)) {
                aop_0.a(this.g, P8.b(aUL.f(TargetHUD.i(this.d))), P8.b(aUL.f(TargetHUD.s(this.d))), 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.d))));
            }
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.d), aYZ.c)) {
                aop_0.a(this.g, P8.b(aUL.f(TargetHUD.q(this.d))), 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.d))));
            }
            aop_0.a(this.g, 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.d))));
        }
    }

    private void a(EntityPlayer entityPlayer, HUD hUD, double d, double d2, double d3, double d4, int n, int n2, int n3, boolean bl) {
        KillAura.w();
        float f = a6w_0.z(entityPlayer);
        float f2 = a6w_0.O(entityPlayer);
        float f3 = 2000 / MCInvoker.O(TargetHUD.u(this.d));
        if (this.l != a6w_0.r(entityPlayer)) {
            this.h = f;
            this.l = a6w_0.r(entityPlayer);
        }
        if (this.h > f) {
            this.h = MathHelper.b(this.h - 0.00625f * f3, f, 999.0f);
        }
        if (this.h < f) {
            this.h = MathHelper.b(this.h + 0.00625f * f3, 0.0f, f);
        }
        a1V.b(d - 1.0, d2 - 1.0, d + d3 + 1.0, d2 + d4 + 1.0, hb_2.a(50, 50, 50, this.a(255)));
        double d5 = d3 / (double)f2 * (double)this.h;
        Color color = new Color(n);
        Color color2 = new Color(n2);
        Color color3 = new Color(n3);
        if (abl_1.a(this.k) > 800L) {
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.d), aYZ.g)) {
                a1V.b(d, d2, d5, d4, aol_1.b(aol_1.d(color2)), aol_1.b(aol_1.d(color3)));
            }
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.d), aYZ.b)) {
                a1V.b(d, d2, d + d5, d2 + d4, aol_1.b(aol_1.d(color)));
            }
            a1V.b(d, d2, d + d5, d2 + d4, aol_1.b(aol_1.d(new Color(hb_2.a(n)))));
        }
        d5 = d3 / (double)f2 * (double)f;
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.d), aYZ.a)) {
            a1V.b(d, d2, d5, d4, n2, n3);
        }
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.d), aYZ.h)) {
            a1V.b(d, d2, d + d5, d2 + d4, n);
        }
        a1V.b(d, d2, d + d5, d2 + d4, hb_2.a(n));
        String string = aL0.a(aL0.a(new StringBuilder(), MathHelper.a(100.0 / (double)f2 * (double)this.h, 1)), aYZ.d).toString();
        FontRendererInvoker.b(TargetHUD.h((TargetHUD)this.d).fontRendererCrack, string, d + d3 * 0.5 - (double)(FontRendererInvoker.a(TargetHUD.c((TargetHUD)this.d).fontRendererCrack, string) / 2), d2 + 1.0, hb_2.a(0xFFFFFF, this.a(255)), true);
    }

    private void lambda$drawTargetHud$0(double d, double d2) {
        a1V.b(d, d2, d + this.n, d2 + this.j, hb_2.a(50, 50, 50, this.a(255)));
        a1V.b(d + 1.0, d2 + 1.0, d + this.n - 1.0, d2 + this.j - 1.0, hb_2.a(60, 60, 60, this.a(255)));
    }

    public void a(Runnable runnable) {
        _j_0.a(this.f, this.e, this.i, 0.1, runnable, 200L, 300L);
    }

    oi_0(TargetHUD targetHUD, aUN aUN2) {
        this(targetHUD);
    }

    private void lambda$drawTargetHud$1(EntityPlayer entityPlayer, double d, double d2, FontRenderer fontRenderer, HUD hUD, int n, int n2, int n3) {
        this.a(entityPlayer, d + 21.0, d2 + 21.0, 38.0 - 0.2 * (double)entityPlayer.a8, this.a(1.0));
        FontRendererInvoker.b(fontRenderer, a6w_0.C(entityPlayer), d + 42.0, d2 + this.j * 0.5 - 12.0, hb_2.a(0xFFFFFF, this.a(255)), true);
        this.a(entityPlayer, hUD, d + 42.0, d2 + this.j * 0.5, this.n - 45.0, 10.0, n, n2, n3, true);
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        KillAura.w();
        if (_j_0.a(this.f) <= 0.05) {
            EventManagerInvoker.b(this);
        }
        this.d();
    }
}

