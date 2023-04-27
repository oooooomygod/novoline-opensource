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
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.StringPropertyInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.utils.Timer;
import cc.novoline.utils.fonts.api.FontRenderer;
import deobf.EntityPlayer;
import cc.novoline.modules.visual.HUD;
import deobf.MCInvoker;
import deobf.ModuleRegistry;
import cc.novoline.modules.combat.TargetHUD;
import java.awt.Color;

import org.lwjgl.opengl.GL11;

/*
 * Renamed from net.Ta
 */
class ta_0 {
    private double a;
    TargetHUD l;
    private ax4_0 n;
    private double c;
    private int g;
    private double i;
    private EntityPlayer f;
    private double j;
    private aCT m;
    private double d;
    private double h;
    private Timer k;
    private float b;
    private boolean e;

    private void lambda$drawTargetHud$1(double d, double d2, double d3) {
        aV3.a(aV3.a(), d, d2, this.h, this.j, d3 * 2.0, 2.0, new Color(0, 0, 0, this.a(P8.b((Integer)adt_2.a(TargetHUD.o(this.l))))), true);
    }

    private float a(float f) {
        _j_0.b(this.n);
        double d = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.b((float)((double)f * (1.0 - d)), 0.05f, 1.0f);
    }

    public void d() {
        _j_0.c(this.n);
        abl_1.b(this.k);
        EventManagerInvoker.a(this);
    }

    public void a(EntityPlayer entityPlayer) {
        KillAura.w();
        this.f = entityPlayer;
        if (auk_2.a((Boolean)Ba.b(TargetHUD.d(this.l))) && this.f != null && this.f.a8 == 9) {
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.f)) {
                aop_0.a(this.m, P8.b(aUL.f(TargetHUD.i(this.l))), P8.b(aUL.f(TargetHUD.s(this.l))), 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.l))));
            }
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.l)) {
                aop_0.a(this.m, P8.b(aUL.f(TargetHUD.q(this.l))), 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.l))));
            }
            aop_0.a(this.m, 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.l))));
        }
    }

    public void e() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.d)) {
            aop_0.a(this.m, ava_0.b(TargetHUD.w(this.l), aVC.a), P8.b(aUL.f(TargetHUD.q(this.l))), StringPropertyInvoker.isMode(TargetHUD.g(this.l), aVC.p));
        }
        aop_0.a(this.m, ava_0.b(TargetHUD.w(this.l), aVC.k), StringPropertyInvoker.isMode(TargetHUD.g(this.l), aVC.b));
    }

    private int a(int n) {
        _j_0.b(this.n);
        double d = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.a((int)((double)n * (1.0 - d)), 35, 255);
    }

    private static void lambda$drawSmoothRect$4(double d, double d2, double d3, double d4, int n) {
        a1V.a(d, d2, d3, d4, n);
    }

    public void a() {
        if (this.f != null) {
            double d = ua_2.a(true);
            this.b(this.f);
            ua_2.a(d);
        }
    }

    private void lambda$onBlur$0() {
        a1V.a(TargetHUD.D(this.l), TargetHUD.E(this.l), this.h, this.j, 12.0, hb_2.a(asx_1.BLACK));
    }

    private void b(EntityPlayer entityPlayer) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        KillAura.w();
        FontRenderer fontRenderer = adj_1.a(pt_0.a, 19);
        FontRenderer fontRenderer2 = adj_1.a(is_1.a, 19);
        boolean bl = _j_0.a(this.n) != 1.0;
        String string = aVC.c;
        String string2 = a6w_0.C(entityPlayer);
        double d = TargetHUD.D(this.l);
        double d2 = TargetHUD.E(this.l);
        this.h = MathInvoker.max(98, 91 + a7l_0.a(fontRenderer2, string2));
        this.j = 44.0;
        this.a = d + this.h * 0.5;
        this.c = d2 + this.j * 0.5;
        int n = hb_2.a(P8.b(aUL.f(TargetHUD.q(this.l))), this.a(255));
        int n2 = hb_2.a(P8.b(aUL.f(TargetHUD.i(this.l))), this.a(255));
        int n3 = hb_2.a(P8.b(aUL.f(TargetHUD.s(this.l))), this.a(255));
        double d3 = MathInvoker.max(P8.b((Integer)adt_2.a(TargetHUD.n(this.l))), 4);
        this.a(() -> this.lambda$drawTargetHud$1(d, d2, d3));
        this.m.a = d + 22.0;
        this.m.c = d2 + 22.0;
        this.e();
        this.a(() -> this.lambda$drawTargetHud$2(fontRenderer, string, d, d2, bl, hUD, fontRenderer2, string2, n2, n3, n));
        this.a(entityPlayer, hUD, d + 44.0, d2 + 28.0, this.h - (double)(auk_2.a((Boolean)Ba.b(TargetHUD.x(this.l))) ? 68 : 54), 8.0, 8.0, n, n2, n3, bl);
        double d4 = _j_0.a(this.n);
        double d5 = MathInvoker.a(d + 22.0 - this.a);
        this.a(entityPlayer, d + 22.0 + (d5 - d5 * d4), d2 + 22.0, 34.0 * d4 - 0.2 * (double)entityPlayer.a8, d3 * 2.0 * d4);
    }

    private void lambda$null$5(double d, double d2, double d3, double d4, double d5, int n, int n2, int n3) {
        KillAura.w();
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.i)) {
            a1V.a(d + d2, d3, d4 - d2 * 2.0, d5, d5 * 0.5, n, n2);
        }
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.o)) {
            a1V.a(d + d2, d3, d4 - d2 * 2.0, d5, d5 * 0.5, n3);
        }
        a1V.a(d + d2, d3, d4 - d2 * 2.0, d5, d5 * 0.5, hb_2.a(n3));
    }

    ta_0(TargetHUD targetHUD, aUN aUN2) {
        this(targetHUD);
    }

    private void lambda$drawHealthBar$7(HUD hUD, double d, double d2, double d3, boolean bl, int n, int n2, int n3) {
        KillAura.w();
        FontRenderer fontRenderer = adj_1.a(pI.a, 16);
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.n)) {
            cw_2.a(hUD, fontRenderer, StringInvoker.a(MathHelper.a((double)this.b, 1)), d + d2 + 2.0, d3 + 1.5, true, bl, n, n2);
        }
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.e)) {
            a7l_0.a(fontRenderer, (CharSequence)StringInvoker.a(MathHelper.a((double)this.b, 1)), d + d2 + 2.0, d3 + 1.5, n3, true, bl);
        }
        a7l_0.a(fontRenderer, (CharSequence)StringInvoker.a(MathHelper.a((double)this.b, 1)), d + d2 + 2.0, d3 + 1.5, hb_2.a(n3), true, bl);
    }

    private static void lambda$drawSmoothRect$3(double d, double d2, double d3, double d4, int n, int n2) {
        a1V.a(d, d2, d3, d4, n, n2);
    }

    private void a(double d, double d2, double d3, double d4, double d5, int n, float f) {
        aby_0.a(aby_0.a(), d, d2, d3, d4, d5, 2.0, 0.96f, () -> ta_0.lambda$drawSmoothRect$4(d, d2, d3, d4, n), f);
    }

    private void lambda$drawTargetHud$2(FontRenderer fontRenderer, String string, double d, double d2, boolean bl, HUD hUD, FontRenderer fontRenderer2, String string2, int n, int n2, int n3) {
        KillAura.w();
        a7l_0.a(fontRenderer, (CharSequence)string, d + 44.0, d2 + 11.0, hb_2.a(0xFFFFFF, this.a(255)), true, bl);
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.j)) {
            cw_2.a(hUD, fontRenderer2, string2, d + 44.0 + (double)a7l_0.a(fontRenderer, string), d2 + 11.0, true, bl, n, n2);
        }
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.m)) {
            a7l_0.a(fontRenderer2, (CharSequence)string2, d + 44.0 + (double)a7l_0.a(fontRenderer, string), d2 + 11.0, hb_2.a(n3), true, bl);
        }
        a7l_0.a(fontRenderer2, (CharSequence)string2, d + 44.0 + (double)a7l_0.a(fontRenderer, string), d2 + 11.0, n3, true, bl);
    }

    private void a(EntityPlayer entityPlayer, HUD hUD, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3, boolean bl) {
        float f = a6w_0.z(entityPlayer);
        KillAura.w();
        float f2 = a6w_0.O(entityPlayer);
        float f3 = 2000 / MCInvoker.O(TargetHUD.C(this.l));
        if (this.g != a6w_0.r(entityPlayer)) {
            this.b = f;
            this.g = a6w_0.r(entityPlayer);
        }
        if (this.b > f) {
            this.b = MathHelper.b(this.b - 0.00625f * f3, f, 999.0f);
        }
        if (this.b < f) {
            this.b = MathHelper.b(this.b + 0.00625f * f3, 0.0f, f);
        }
        double d6 = MathInvoker.d(10.0, d3 / (double)f2 * (double)this.b);
        double d7 = 1.5 / d3 * d6;
        if (ava_0.b(TargetHUD.w(this.l), aVC.q)) {
            agg_2.a(agg_2.c(), 12, this.a(255), true, () -> this.lambda$drawHealthBar$6(d, d7, d2, d6, d4, n2, n3, n), null);
        }
        double d8 = _j_0.a(this.n);
        double d9 = this.a - d;
        double d10 = this.c - d2;
        this.a(d + (d9 - d9 * d8), d2 + (d10 - d10 * d8), d3 * d8, d4 * d8, d5 * d8, aol_1.b(Color.BLACK), this.a(0.4f));
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.h)) {
            this.a(d + (d9 - d9 * d8), d2 + (d10 - d10 * d8), d6 * d8, d4 * d8, d5 * d8, n2, n3, this.a(1.0f));
        }
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.l), aVC.g)) {
            this.a(d + (d9 - d9 * d8), d2 + (d10 - d10 * d8), d6 * d8, d4 * d8, d5 * d8, n, this.a(1.0f));
        }
        this.a(d + (d9 - d9 * d8), d2 + (d10 - d10 * d8), d6 * d8, d4 * d8, d5 * d8, hb_2.a(n), this.a(1.0f));
        if (auk_2.a((Boolean)Ba.b(TargetHUD.x(this.l)))) {
            this.a(() -> this.lambda$drawHealthBar$7(hUD, d, d3, d2, bl, n2, n3, n));
        }
    }

    private void lambda$drawHealthBar$6(double d, double d2, double d3, double d4, double d5, int n, int n2, int n3) {
        this.a(() -> this.lambda$null$5(d, d2, d3, d4, d5, n, n2, n3));
    }

    public void c(EntityPlayer entityPlayer) {
        double d = ua_2.a(true);
        this.b(entityPlayer);
        ua_2.a(d);
    }

    private void a(EntityPlayer entityPlayer, double d, double d2, double d3, double d4) {
        ResourceLocation resourceLocation;
        KillAura.w();
        NetworkPlayerInfo networkPlayerInfo = aDM.a(a6w_0.g(entityPlayer));
        if (networkPlayerInfo == null) {
            resourceLocation = af__0.a(a6w_0.g(entityPlayer));
        }
        resourceLocation = aNL.k(networkPlayerInfo);
        double d5 = d -= d3 * 0.5;
        double d6 = d2 -= d3 * 0.5;
        aby_0.a(aby_0.a(), d, d2, d3, d3, d4, 2.0, 0.96f, () -> this.lambda$drawHead$8(resourceLocation, d5, d6, d3), this.a(1.0f));
        aV3.a(aV3.a(), d, d2, d3, d3, d4, 2.0, new Color(255, 0, 0, 18 * entityPlayer.a8), 0.96f, true);
    }

    public void b() {
        if (this.f != null) {
            double d = ua_2.a(true);
            this.a(this::lambda$onBlur$0);
            ua_2.a(d);
        }
    }

    private void lambda$drawHead$8(ResourceLocation resourceLocation, double d, double d2, double d3) {
        TextureManagerInvoker.bindTexture(MCInvoker.E(TargetHUD.f(this.l)), resourceLocation);
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        wh_1.a(d, d2, 8.0f, 8.0f, 8, 8, d3, d3, 64.0f, 64.0f);
    }

    private ta_0(TargetHUD targetHUD) {
        this.l = targetHUD;
        this.n = new ax4_0();
        this.k = new Timer();
        this.m = new aCT();
    }

    private void a(double d, double d2, double d3, double d4, double d5, int n, int n2, float f) {
        aby_0.a(aby_0.a(), d, d2, d3, d4, d5, 2.0, 0.96f, () -> ta_0.lambda$drawSmoothRect$3(d, d2, d3, d4, n, n2), f);
    }

    public void c() {
        _j_0.a(this.n, 0.2);
        abl_1.b(this.k);
        this.g = -1;
        EventManagerInvoker.b(this);
    }

    public void a(Runnable runnable) {
        _j_0.a(this.n, this.a, this.c, 0.1, runnable, 200L, 300L);
    }

    public void a(RenderGuiEvent renderGuiEvent) {
        KillAura.w();
        if (HN.d(renderGuiEvent) instanceof GuiChat) {
            boolean bl;
            double d = ua_2.a(HN.b(renderGuiEvent));
            double d2 = ua_2.b(HN.a(renderGuiEvent));
            double d3 = db_0.b((Double)MD.b(TargetHUD.j(this.l)));
            double d4 = db_0.b((Double)MD.b(TargetHUD.e(this.l)));
            boolean bl2 = bl = d > d3 && d <= d3 + this.h && d2 > d4 && d2 <= d4 + this.j;
            if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                if (HN.e(renderGuiEvent) == 0) {
                    // empty if block
                }
            } else if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                if (this.e) {
                    MD.b(TargetHUD.j(this.l), db_0.a(MathHelper.b(this.d + d, db_0.b((Double)MD.a(TargetHUD.j(this.l))), db_0.b((Double)MD.c(TargetHUD.j(this.l))))));
                    MD.b(TargetHUD.e(this.l), db_0.a(MathHelper.b(this.i + d2, db_0.b((Double)MD.a(TargetHUD.e(this.l))), db_0.b((Double)MD.c(TargetHUD.e(this.l))))));
                }
                if (!TargetHUD.b(this.l)) {
                    this.f = TargetHUD.t((TargetHUD)this.l).player;
                    this.c(this.f);
                }
            } else {
                if (HN.c(renderGuiEvent) == alw_0.RELEASE && HN.e(renderGuiEvent) == 0) {
                    this.e = false;
                }
                if (HN.c(renderGuiEvent) == alw_0.INITIAL && !TargetHUD.b(this.l)) {
                    this.c();
                }
                if (HN.c(renderGuiEvent) == alw_0.CLOSE && !TargetHUD.l(this.l)) {
                    this.d();
                }
            }
        }
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        KillAura.w();
        if (_j_0.a(this.n) <= 0.05) {
            EventManagerInvoker.b(this);
        }
        this.a();
    }

    static ax4_0 a(ta_0 ta_02) {
        return ta_02.n;
    }
}

