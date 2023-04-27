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
import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.PlayerInvoker;
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
 * Renamed from net.ayM
 */
class aym_0 {
    TargetHUD j;
    private aCT g;
    private double h;
    private double l;
    private ax4_0 d;
    private EntityPlayer i;
    private int f;
    private double m;
    private float e;
    private double a;
    private double c;
    private Timer k;
    private double b;
    private boolean n;

    static ax4_0 a(aym_0 aym_02) {
        return aym_02.d;
    }

    private void lambda$drawTargetHud$4(EntityPlayer entityPlayer, HUD hUD, double[] dArray, double[] dArray2, int n, int n2, int n3) {
        this.a(entityPlayer, hUD, dArray[0] + 5.0, dArray2[0] + this.h - 9.0, this.b - 10.0, 5.0, 0.0, n, n2, n3);
    }

    private void lambda$null$2(EntityPlayer entityPlayer, HUD hUD, double[] dArray, double[] dArray2, int n, int n2, int n3) {
        this.a(entityPlayer, hUD, dArray[0] + 5.0, dArray2[0] + this.h - 9.0, this.b - 10.0, 5.0, 0.0, n, n2, n3);
    }

    public void c() {
        KillAura.w();
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.j), ayt_1.m)) {
            aop_0.a(this.g, ava_0.b(TargetHUD.w(this.j), ayt_1.j), P8.b(aUL.f(TargetHUD.q(this.j))), StringPropertyInvoker.isMode(TargetHUD.g(this.j), ayt_1.f));
        }
        aop_0.a(this.g, ava_0.b(TargetHUD.w(this.j), ayt_1.b), StringPropertyInvoker.isMode(TargetHUD.g(this.j), ayt_1.a));
    }

    public void b() {
        if (this.i != null) {
            double d = ua_2.a(true);
            this.b(this.i);
            ua_2.a(d);
        }
    }

    public void d() {
        _j_0.c(this.d);
        abl_1.b(this.k);
        EventManagerInvoker.a(this);
    }

    public void e() {
        _j_0.a(this.d, 0.2);
        abl_1.b(this.k);
        this.f = -1;
        EventManagerInvoker.b(this);
    }

    public void a(Runnable runnable) {
        _j_0.a(this.d, this.m, this.l, 0.1, runnable, 200L, 300L);
    }

    public void a() {
        if (this.i != null) {
            double d = ua_2.a(true);
            this.a(this::lambda$onBlur$5);
            ua_2.a(d);
        }
    }

    private float a(float f) {
        _j_0.b(this.d);
        double d = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.b((float)((double)f * (1.0 - d)), 0.05f, 1.0f);
    }

    private int a(int n) {
        _j_0.b(this.d);
        double d = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.a((int)((double)n * (1.0 - d)), 35, 255);
    }

    @EventTarget
    public void a(Render2DEvent render2DEvent) {
        KillAura.w();
        if (_j_0.a(this.d) <= 0.05) {
            EventManagerInvoker.b(this);
        }
        this.b();
    }

    public void c(EntityPlayer entityPlayer) {
        KillAura.w();
        this.i = entityPlayer;
        if (auk_2.a((Boolean)Ba.b(TargetHUD.d(this.j))) && this.i != null && this.i.a8 == 9) {
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.j), ayt_1.d)) {
                aop_0.a(this.g, P8.b(aUL.f(TargetHUD.i(this.j))), P8.b(aUL.f(TargetHUD.s(this.j))), 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.j))));
            }
            if (StringPropertyInvoker.isMode(TargetHUD.m(this.j), ayt_1.e)) {
                aop_0.a(this.g, P8.b(aUL.f(TargetHUD.q(this.j))), 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.j))));
            }
            aop_0.a(this.g, 20.0, P8.b((Integer)adt_2.a(TargetHUD.a(this.j))));
        }
    }

    private void a(EntityPlayer entityPlayer, HUD hUD, double d, double d2, double d3, double d4, double d5, int n, int n2, int n3) {
        float f = a6w_0.z(entityPlayer);
        float f2 = a6w_0.O(entityPlayer);
        KillAura.w();
        float f3 = 2000 / MCInvoker.O(TargetHUD.k(this.j));
        if (this.f != a6w_0.r(entityPlayer)) {
            this.e = f;
            this.f = a6w_0.r(entityPlayer);
        }
        if (this.e > f) {
            this.e = MathHelper.b(this.e - 0.00625f * f3, f, 999.0f);
        }
        if (this.e < f) {
            this.e = MathHelper.b(this.e + 0.00625f * f3, 0.0f, f);
        }
        a1V.a(d, d2, d3, d4, d5, hb_2.a(0, 0, 0, this.a(50)));
        double d6 = d3 / (double)f2 * (double)this.e;
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.j), ayt_1.k)) {
            a1V.a(d, d2, d6, d4, d5, n2, n3);
        }
        if (StringPropertyInvoker.isMode(TargetHUD.m(this.j), ayt_1.c)) {
            a1V.a(d, d2, d6, d4, d5, n);
        }
        a1V.a(d, d2, d6, d4, d5, hb_2.a(hb_2.a(n), this.a(255)));
    }

    public void a(EntityPlayer entityPlayer) {
        double d = ua_2.a(true);
        this.b(entityPlayer);
        ua_2.a(d);
    }

    private void lambda$onBlur$5() {
        a1V.a(TargetHUD.D(this.j), TargetHUD.E(this.j), this.b, this.h, (double)P8.b((Integer)adt_2.a(TargetHUD.n(this.j))) * 0.5, hb_2.a(asx_1.BLACK));
    }

    private void b(EntityPlayer entityPlayer) {
        HUD hUD = (HUD)ModuleInvoker.isEnable(ModuleRegistry.HUD);
        FontRenderer fontRenderer = adj_1.a(VX.a, 19);
        double[] dArray = new double[]{TargetHUD.D(this.j)};
        double[] dArray2 = new double[]{TargetHUD.E(this.j)};
        this.b = MathInvoker.max(105, 78 + a7l_0.a(fontRenderer, a6w_0.C(entityPlayer)));
        this.h = 50.0;
        KillAura.w();
        this.m = dArray[0] + this.b * 0.5;
        this.l = dArray2[0] + this.h * 0.5;
        int n = hb_2.a(P8.b(aUL.f(TargetHUD.q(this.j))), this.a(255));
        int n2 = hb_2.a(P8.b(aUL.f(TargetHUD.i(this.j))), this.a(255));
        int n3 = hb_2.a(P8.b(aUL.f(TargetHUD.s(this.j))), this.a(255));
        this.a(() -> this.lambda$drawTargetHud$0(dArray, dArray2));
        this.g.a = dArray[0] + 21.0;
        this.g.c = dArray2[0] + 21.0;
        this.c();
        this.a(() -> this.lambda$drawTargetHud$1(entityPlayer, dArray, dArray2, fontRenderer));
        if (ava_0.b(TargetHUD.w(this.j), ayt_1.i)) {
            agg_2.a(agg_2.c(), 12, this.a(255), true, () -> this.lambda$drawTargetHud$3(entityPlayer, hUD, dArray, dArray2, n, n2, n3), null);
        }
        this.a(() -> this.lambda$drawTargetHud$4(entityPlayer, hUD, dArray, dArray2, n, n2, n3));
    }

    private void lambda$drawTargetHud$3(EntityPlayer entityPlayer, HUD hUD, double[] dArray, double[] dArray2, int n, int n2, int n3) {
        this.a(() -> this.lambda$null$2(entityPlayer, hUD, dArray, dArray2, n, n2, n3));
    }

    public void a(RenderGuiEvent renderGuiEvent) {
        KillAura.w();
        if (HN.d(renderGuiEvent) instanceof GuiChat) {
            boolean bl;
            double d = ua_2.a(HN.b(renderGuiEvent));
            double d2 = ua_2.b(HN.a(renderGuiEvent));
            double d3 = db_0.b((Double)MD.b(TargetHUD.j(this.j)));
            double d4 = db_0.b((Double)MD.b(TargetHUD.e(this.j)));
            boolean bl2 = bl = d > d3 && d <= d3 + this.b && d2 > d4 && d2 <= d4 + this.h;
            if (HN.c(renderGuiEvent) == alw_0.CLICK) {
                if (HN.e(renderGuiEvent) == 0) {
                    // empty if block
                }
            } else if (HN.c(renderGuiEvent) == alw_0.RENDER) {
                if (this.n) {
                    MD.b(TargetHUD.j(this.j), db_0.a(MathHelper.b(this.a + d, db_0.b((Double)MD.a(TargetHUD.j(this.j))), db_0.b((Double)MD.c(TargetHUD.j(this.j))))));
                    MD.b(TargetHUD.e(this.j), db_0.a(MathHelper.b(this.c + d2, db_0.b((Double)MD.a(TargetHUD.e(this.j))), db_0.b((Double)MD.c(TargetHUD.e(this.j))))));
                }
                if (!TargetHUD.b(this.j)) {
                    this.i = TargetHUD.z((TargetHUD)this.j).player;
                    this.a(this.i);
                }
            } else {
                if (HN.c(renderGuiEvent) == alw_0.RELEASE && HN.e(renderGuiEvent) == 0) {
                    this.n = false;
                }
                if (HN.c(renderGuiEvent) == alw_0.INITIAL && !TargetHUD.b(this.j)) {
                    this.e();
                }
                if (HN.c(renderGuiEvent) == alw_0.CLOSE && !TargetHUD.l(this.j)) {
                    this.d();
                }
            }
        }
    }

    private void lambda$drawTargetHud$0(double[] dArray, double[] dArray2) {
        aV3.a(aV3.a(), dArray[0], dArray2[0], this.b, this.h, (double)P8.b((Integer)adt_2.a(TargetHUD.n(this.j))), (double)P8.b((Integer)adt_2.a(TargetHUD.p(this.j))), new Color(0, 0, 0, this.a(P8.b((Integer)adt_2.a(TargetHUD.o(this.j))))), true);
    }

    private double a(double d) {
        _j_0.b(this.d);
        double d2 = abl_1.a(this.k, 800L, 1.0);
        return MathHelper.b(d * (1.0 - d2), 0.05, 1.0);
    }

    aym_0(TargetHUD targetHUD, aUN aUN2) {
        this(targetHUD);
    }

    private aym_0(TargetHUD targetHUD) {
        this.j = targetHUD;
        this.d = new ax4_0();
        this.k = new Timer();
        this.g = new aCT();
    }

    private void lambda$drawTargetHud$1(EntityPlayer entityPlayer, double[] dArray, double[] dArray2, FontRenderer fontRenderer) {
        KillAura.w();
        this.a(entityPlayer, dArray[0] + 21.0, dArray2[0] + 21.0, 32.0 - 0.2 * (double)entityPlayer.a8, this.a(1.0));
        String string = a6w_0.C(entityPlayer);
        String string2 = ayt_1.h;
        boolean bl = _j_0.a(this.d) != 1.0;
        a7l_0.a(fontRenderer, (CharSequence)string2, dArray[0] + 41.0, dArray2[0] + 7.0, hb_2.a(0xFFFFFFF, this.a(255)), true, bl);
        a7l_0.a(fontRenderer, (CharSequence)string, dArray[0] + 41.0 + (double)a7l_0.a(fontRenderer, string2), dArray2[0] + 7.0, hb_2.a(0xFFFFFFF, this.a(255)), true, bl);
        a7l_0.a(fontRenderer, (CharSequence)aL0.a(aL0.a(new StringBuilder(), ayt_1.g), MathHelper.a((double)PlayerInvoker.b(TargetHUD.v((TargetHUD)this.j).player, entityPlayer), 1)).toString(), dArray[0] + 41.0, dArray2[0] + 18.0, hb_2.a(0xFFFFFFF, this.a(255)), true, bl);
        a7l_0.a(fontRenderer, (CharSequence)aL0.a(aL0.a(new StringBuilder(), ayt_1.l), MathHelper.a((double)a6w_0.z(entityPlayer), 1)).toString(), dArray[0] + 41.0, dArray2[0] + 29.0, hb_2.a(0xFFFFFFF, this.a(255)), true, bl);
    }

    private void a(EntityPlayer entityPlayer, double d, double d2, double d3, double d4) {
        ResourceLocation resourceLocation;
        KillAura.w();
        NetworkPlayerInfo networkPlayerInfo = aDM.a(a6w_0.g(entityPlayer));
        if (networkPlayerInfo == null) {
            resourceLocation = af__0.a(a6w_0.g(entityPlayer));
        }
        resourceLocation = aNL.k(networkPlayerInfo);
        TextureManagerInvoker.bindTexture(MCInvoker.E(TargetHUD.y(this.j)), resourceLocation);
        GlStateManagerInvoker.enableBlend();
        GlStateManagerInvoker.alphaFunc(516, 0.0f);
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)d4);
        wh_1.a(d -= d3 * 0.5, d2 -= d3 * 0.5, 8.0f, 8.0f, 8, 8, d3, d3, 64.0f, 64.0f);
        a1V.b(d, d2, d + d3, d2 + d3, hb_2.a(255, 0, 0, 10 * entityPlayer.a8));
    }
}

