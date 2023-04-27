/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.GlStateManagerInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.TessellatorInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.invoke.WorldRendererInvoker;
import deobf.DefaultVertexFormats;
import deobf.GuiScreen;
import deobf.MCInvoker;
import deobf.Tessellator;
import net.minecraft.renderer.WorldRenderer;
import java.io.IOException;
import java.util.Random;
import java.util.function.Predicate;


public class RI
extends GuiScreen
implements sp_2,
aYM {
    private R7 v;
    private Random P;
    private boolean y = false;
    private asi_2 x;
    protected String w;
    private asi_2 B;
    private QG D;
    protected String z;
    private Predicate<String> K;
    protected String I = aWv.bh;
    private QG C;
    private QG A;
    private QG L;
    protected String[] O;
    private QG G;
    private QG F;
    private QG J;
    private QG E;
    private int M = 0;
    private boolean N = false;
    private a86 H;

    @Override
    public void a(int n, boolean bl) {
        switch (n) {
            case 148: {
                this.B.N = bl;
                break;
            }
            case 149: {
                this.B.d = bl;
                break;
            }
            case 150: {
                this.B.ab = bl;
                break;
            }
            case 151: {
                this.B.j = bl;
                break;
            }
            case 152: {
                this.B.ah = bl;
                break;
            }
            case 153: {
                this.B.af = bl;
                break;
            }
            case 154: {
                this.B.Z = bl;
                break;
            }
            case 155: {
                this.B.D = bl;
                break;
            }
            case 156: {
                this.B.C = bl;
                break;
            }
            case 161: {
                this.B.X = bl;
                break;
            }
            case 210: {
                this.B.ak = bl;
            }
        }
        if (!this.B.equals(this.x)) {
            this.b(true);
        }
    }

    @Override
    public void a(int n, float f) {
        switch (n) {
            case 100: {
                this.B.S = f;
                break;
            }
            case 101: {
                this.B.al = f;
                break;
            }
            case 102: {
                this.B.i = f;
                break;
            }
            case 103: {
                this.B.G = f;
                break;
            }
            case 104: {
                this.B.ai = f;
                break;
            }
            case 105: {
                this.B.ao = f;
                break;
            }
            case 106: {
                this.B.z = f;
                break;
            }
            case 107: {
                this.B.E = f;
                break;
            }
            case 108: {
                this.B.a = f;
                break;
            }
            case 109: {
                this.B.b = f;
                break;
            }
            case 110: {
                this.B.m = f;
                break;
            }
            case 111: {
                this.B.ac = f;
                break;
            }
            case 112: {
                this.B.y = f;
                break;
            }
            case 113: {
                this.B.f = f;
                break;
            }
            case 114: {
                this.B.W = f;
                break;
            }
            case 115: {
                this.B.ag = f;
            }
            default: {
                break;
            }
            case 157: {
                this.B.I = (int)f;
                break;
            }
            case 158: {
                this.B.x = (int)f;
                break;
            }
            case 159: {
                this.B.J = (int)f;
                break;
            }
            case 160: {
                this.B.O = (int)f;
                break;
            }
            case 162: {
                this.B.ap = (int)f;
                break;
            }
            case 163: {
                this.B.u = (int)f;
                break;
            }
            case 164: {
                this.B.az = (int)f;
                break;
            }
            case 165: {
                this.B.t = (int)f;
                break;
            }
            case 166: {
                this.B.as = (int)f;
                break;
            }
            case 167: {
                this.B.aq = (int)f;
                break;
            }
            case 168: {
                this.B.L = (int)f;
                break;
            }
            case 169: {
                this.B.R = (int)f;
                break;
            }
            case 170: {
                this.B.F = (int)f;
                break;
            }
            case 171: {
                this.B.B = (int)f;
                break;
            }
            case 172: {
                this.B.am = (int)f;
                break;
            }
            case 173: {
                this.B.H = (int)f;
                break;
            }
            case 174: {
                this.B.an = (int)f;
                break;
            }
            case 175: {
                this.B.P = (int)f;
                break;
            }
            case 176: {
                this.B.p = (int)f;
                break;
            }
            case 177: {
                this.B.v = (int)f;
                break;
            }
            case 178: {
                this.B.h = (int)f;
                break;
            }
            case 179: {
                this.B.av = (int)f;
                break;
            }
            case 180: {
                this.B.K = (int)f;
                break;
            }
            case 181: {
                this.B.aa = (int)f;
                break;
            }
            case 182: {
                this.B.at = (int)f;
                break;
            }
            case 183: {
                this.B.s = (int)f;
                break;
            }
            case 184: {
                this.B.k = (int)f;
                break;
            }
            case 185: {
                this.B.w = (int)f;
                break;
            }
            case 186: {
                this.B.g = (int)f;
                break;
            }
            case 187: {
                this.B.q = (int)f;
                break;
            }
            case 189: {
                this.B.ae = (int)f;
                break;
            }
            case 190: {
                this.B.T = (int)f;
                break;
            }
            case 191: {
                this.B.aw = (int)f;
                break;
            }
            case 192: {
                this.B.aA = (int)f;
                break;
            }
            case 193: {
                this.B.o = (int)f;
                break;
            }
            case 194: {
                this.B.M = (int)f;
                break;
            }
            case 195: {
                this.B.Q = (int)f;
                break;
            }
            case 196: {
                this.B.au = (int)f;
                break;
            }
            case 197: {
                this.B.n = (int)f;
                break;
            }
            case 198: {
                this.B.U = (int)f;
                break;
            }
            case 199: {
                this.B.r = (int)f;
                break;
            }
            case 200: {
                this.B.e = (int)f;
                break;
            }
            case 201: {
                this.B.A = (int)f;
                break;
            }
            case 202: {
                this.B.V = (int)f;
                break;
            }
            case 203: {
                this.B.ar = (int)f;
                break;
            }
            case 204: {
                this.B.ax = (int)f;
                break;
            }
            case 205: {
                this.B.l = (int)f;
                break;
            }
            case 206: {
                this.B.Y = (int)f;
                break;
            }
            case 207: {
                this.B.c = (int)f;
                break;
            }
            case 208: {
                this.B.ad = (int)f;
                break;
            }
            case 209: {
                this.B.aj = (int)f;
            }
        }
        if (n >= 100 && n < 116) {
            Gui gui = avz_1.d(this.H, n - 100 + 132);
            hc_1.b((sc_0)gui, this.a(n, f));
        }
        if (!this.B.equals(this.x)) {
            this.b(true);
        }
    }

    private void b(boolean bl) {
        this.N = bl;
        this.A.g = bl;
    }

    private void a(boolean bl) {
        this.G.j = bl;
        this.L.j = bl;
        this.D.g = true;
        this.F.g = true;
        this.C.g = true;
        this.J.g = true;
        this.A.g = this.N;
        this.E.g = true;
        avz_1.a(this.H, true);
    }

    private void a(float f) {
        Gui gui = avz_1.c(this.H);
        if (gui instanceof sc_0) {
            float f2 = f;
            if (GuiScreen.j()) {
                f2 = f * 0.1f;
                if (GuiScreen.m()) {
                    f2 *= 0.1f;
                }
            } else if (GuiScreen.m()) {
                f2 = f * 10.0f;
                if (GuiScreen.k()) {
                    f2 *= 10.0f;
                }
            }
            sc_0 sc_02 = (sc_0)gui;
            Float f3 = aNS.a(hc_1.a(sc_02));
            f3 = axx_1.a(axx_1.a(f3) + f2);
            int n = hc_1.f(sc_02);
            String string = this.a(hc_1.f(sc_02), axx_1.a(f3));
            hc_1.b(sc_02, string);
            this.a(n, string);
        }
    }

    private void a() {
        e2[] e2Array = new e2[]{new e5_0(160, I18n.format(aWv.ac, new Object[0]), true, this, 1.0f, 255.0f, this.B.O), new eu_1(148, I18n.format(aWv.a1, new Object[0]), true, this.B.N), new eu_1(150, I18n.format(aWv.h, new Object[0]), true, this.B.ab), new eu_1(151, I18n.format(aWv.as, new Object[0]), true, this.B.j), new eu_1(152, I18n.format(aWv.a0, new Object[0]), true, this.B.ah), new eu_1(153, I18n.format(aWv.bo, new Object[0]), true, this.B.af), new eu_1(210, I18n.format(aWv.F, new Object[0]), true, this.B.ak), new eu_1(154, I18n.format(aWv.a5, new Object[0]), true, this.B.Z), new eu_1(149, I18n.format(aWv.ah, new Object[0]), true, this.B.d), new e5_0(157, I18n.format(aWv.u, new Object[0]), true, this, 1.0f, 100.0f, this.B.I), new eu_1(155, I18n.format(aWv.D, new Object[0]), true, this.B.D), new e5_0(158, I18n.format(aWv.H, new Object[0]), true, this, 1.0f, 100.0f, this.B.x), new eu_1(156, I18n.format(aWv.a, new Object[0]), true, this.B.C), new e5_0(159, I18n.format(aWv.ab, new Object[0]), true, this, 10.0f, 100.0f, this.B.J), new eu_1(161, I18n.format(aWv.bE, new Object[0]), true, this.B.X), new e5_0(162, I18n.format(aWv.ap, new Object[0]), true, this, -1.0f, 37.0f, this.B.ap), new e5_0(163, I18n.format(aWv.aS, new Object[0]), true, this, 1.0f, 8.0f, this.B.u), new e5_0(164, I18n.format(aWv.T, new Object[0]), true, this, 1.0f, 5.0f, this.B.az)};
        e2[] e2Array2 = new e2[]{new e4_0(416, I18n.format(aWv.bn, new Object[0]), false), null, new e5_0(165, I18n.format(aWv.ak, new Object[0]), false, this, 1.0f, 50.0f, this.B.t), new e5_0(166, I18n.format(aWv.bH, new Object[0]), false, this, 0.0f, 40.0f, this.B.as), new e5_0(167, I18n.format(aWv.r, new Object[0]), false, this, 0.0f, 255.0f, this.B.aq), new e5_0(168, I18n.format(aWv.c, new Object[0]), false, this, 0.0f, 255.0f, this.B.L), new e4_0(417, I18n.format(aWv.aN, new Object[0]), false), null, new e5_0(169, I18n.format(aWv.m, new Object[0]), false, this, 1.0f, 50.0f, this.B.R), new e5_0(170, I18n.format(aWv.I, new Object[0]), false, this, 0.0f, 40.0f, this.B.F), new e5_0(171, I18n.format(aWv.A, new Object[0]), false, this, 0.0f, 255.0f, this.B.B), new e5_0(172, I18n.format(aWv.L, new Object[0]), false, this, 0.0f, 255.0f, this.B.am), new e4_0(418, I18n.format(aWv.aU, new Object[0]), false), null, new e5_0(173, I18n.format(aWv.q, new Object[0]), false, this, 1.0f, 50.0f, this.B.H), new e5_0(174, I18n.format(aWv.Z, new Object[0]), false, this, 0.0f, 40.0f, this.B.an), new e5_0(175, I18n.format(aWv.al, new Object[0]), false, this, 0.0f, 255.0f, this.B.P), new e5_0(176, I18n.format(aWv.am, new Object[0]), false, this, 0.0f, 255.0f, this.B.p), new e4_0(419, I18n.format(aWv.E, new Object[0]), false), null, new e5_0(177, I18n.format(aWv.z, new Object[0]), false, this, 1.0f, 50.0f, this.B.v), new e5_0(178, I18n.format(aWv.aK, new Object[0]), false, this, 0.0f, 40.0f, this.B.h), new e5_0(179, I18n.format(aWv.aC, new Object[0]), false, this, 0.0f, 255.0f, this.B.av), new e5_0(180, I18n.format(aWv.bx, new Object[0]), false, this, 0.0f, 255.0f, this.B.K), new e4_0(420, I18n.format(aWv.bN, new Object[0]), false), null, new e5_0(181, I18n.format(aWv.a_, new Object[0]), false, this, 1.0f, 50.0f, this.B.aa), new e5_0(182, I18n.format(aWv.bT, new Object[0]), false, this, 0.0f, 40.0f, this.B.at), new e5_0(183, I18n.format(aWv.bd, new Object[0]), false, this, 0.0f, 255.0f, this.B.s), new e5_0(184, I18n.format(aWv.be, new Object[0]), false, this, 0.0f, 255.0f, this.B.k), new e4_0(421, I18n.format(aWv.o, new Object[0]), false), null, new e5_0(185, I18n.format(aWv.bg, new Object[0]), false, this, 1.0f, 50.0f, this.B.w), new e5_0(186, I18n.format(aWv.by, new Object[0]), false, this, 0.0f, 40.0f, this.B.g), new e5_0(187, I18n.format(aWv.bA, new Object[0]), false, this, 0.0f, 255.0f, this.B.q), new e5_0(189, I18n.format(aWv.aR, new Object[0]), false, this, 0.0f, 255.0f, this.B.ae), new e4_0(422, I18n.format(aWv.f, new Object[0]), false), null, new e5_0(190, I18n.format(aWv.bV, new Object[0]), false, this, 1.0f, 50.0f, this.B.T), new e5_0(191, I18n.format(aWv.a6, new Object[0]), false, this, 0.0f, 40.0f, this.B.aw), new e5_0(192, I18n.format(aWv.M, new Object[0]), false, this, 0.0f, 255.0f, this.B.aA), new e5_0(193, I18n.format(aWv.aL, new Object[0]), false, this, 0.0f, 255.0f, this.B.o), new e4_0(423, I18n.format(aWv.aP, new Object[0]), false), null, new e5_0(194, I18n.format(aWv.a9, new Object[0]), false, this, 1.0f, 50.0f, this.B.M), new e5_0(195, I18n.format(aWv.j, new Object[0]), false, this, 0.0f, 40.0f, this.B.Q), new e5_0(196, I18n.format(aWv.x, new Object[0]), false, this, 0.0f, 255.0f, this.B.au), new e5_0(197, I18n.format(aWv.i, new Object[0]), false, this, 0.0f, 255.0f, this.B.n), new e4_0(424, I18n.format(aWv.bR, new Object[0]), false), null, new e5_0(198, I18n.format(aWv.e, new Object[0]), false, this, 1.0f, 50.0f, this.B.U), new e5_0(199, I18n.format(aWv.bm, new Object[0]), false, this, 0.0f, 40.0f, this.B.r), new e5_0(200, I18n.format(aWv.aG, new Object[0]), false, this, 0.0f, 255.0f, this.B.e), new e5_0(201, I18n.format(aWv.d, new Object[0]), false, this, 0.0f, 255.0f, this.B.A), new e4_0(425, I18n.format(aWv.bC, new Object[0]), false), null, new e5_0(202, I18n.format(aWv.ax, new Object[0]), false, this, 1.0f, 50.0f, this.B.V), new e5_0(203, I18n.format(aWv.aw, new Object[0]), false, this, 0.0f, 40.0f, this.B.ar), new e5_0(204, I18n.format(aWv.V, new Object[0]), false, this, 0.0f, 255.0f, this.B.ax), new e5_0(205, I18n.format(aWv.a2, new Object[0]), false, this, 0.0f, 255.0f, this.B.l), new e4_0(426, I18n.format(aWv.R, new Object[0]), false), null, new e5_0(206, I18n.format(aWv.az, new Object[0]), false, this, 1.0f, 50.0f, this.B.Y), new e5_0(207, I18n.format(aWv.W, new Object[0]), false, this, 0.0f, 40.0f, this.B.c), new e5_0(208, I18n.format(aWv.P, new Object[0]), false, this, 0.0f, 255.0f, this.B.ad), new e5_0(209, I18n.format(aWv.bK, new Object[0]), false, this, 0.0f, 255.0f, this.B.aj)};
        e2[] e2Array3 = new e2[]{new e5_0(100, I18n.format(aWv.bq, new Object[0]), false, this, 1.0f, 5000.0f, this.B.S), new e5_0(101, I18n.format(aWv.aq, new Object[0]), false, this, 1.0f, 5000.0f, this.B.al), new e5_0(102, I18n.format(aWv.aB, new Object[0]), false, this, 1.0f, 5000.0f, this.B.i), new e5_0(103, I18n.format(aWv.av, new Object[0]), false, this, 1.0f, 2000.0f, this.B.G), new e5_0(104, I18n.format(aWv.k, new Object[0]), false, this, 1.0f, 2000.0f, this.B.ai), new e5_0(105, I18n.format(aWv.v, new Object[0]), false, this, 0.01f, 20.0f, this.B.ao), new e5_0(106, I18n.format(aWv.bB, new Object[0]), false, this, 1.0f, 25.0f, this.B.z), new e5_0(107, I18n.format(aWv.ai, new Object[0]), false, this, 1.0f, 6000.0f, this.B.E), new e5_0(108, I18n.format(aWv.aE, new Object[0]), false, this, 1.0f, 6000.0f, this.B.a), new e5_0(109, I18n.format(aWv.bU, new Object[0]), false, this, 0.01f, 50.0f, this.B.b), new e5_0(110, I18n.format(aWv.bu, new Object[0]), false, this, 1.0f, 5000.0f, this.B.m), new e5_0(111, I18n.format(aWv.aZ, new Object[0]), false, this, 1.0f, 5000.0f, this.B.ac), new e5_0(112, I18n.format(aWv.b, new Object[0]), false, this, 1.0f, 20.0f, this.B.y), new e5_0(113, I18n.format(aWv.S, new Object[0]), false, this, 0.0f, 20.0f, this.B.f), new e5_0(114, I18n.format(aWv.bF, new Object[0]), false, this, 1.0f, 20.0f, this.B.W), new e5_0(115, I18n.format(aWv.aV, new Object[0]), false, this, 0.0f, 20.0f, this.B.ag)};
        e2[] e2Array4 = new e2[32];
        e2Array4[0] = new e4_0(400, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.N, new Object[0])), aWv.aI).toString(), false);
        e2Array4[1] = new el_1(132, StringInvoker.a(aWv.Y, new Object[]{axx_1.a(this.B.S)}), false, this.K);
        e2Array4[2] = new e4_0(401, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.aj, new Object[0])), aWv.aW).toString(), false);
        e2Array4[3] = new el_1(133, StringInvoker.a(aWv.aa, new Object[]{axx_1.a(this.B.al)}), false, this.K::test);
        e2Array4[4] = new e4_0(402, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.a3, new Object[0])), aWv.ae).toString(), false);
        e2Array4[5] = new el_1(134, StringInvoker.a(aWv.s, new Object[]{axx_1.a(this.B.i)}), false, this.K::test);
        e2Array4[6] = new e4_0(403, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.aX, new Object[0])), aWv.U).toString(), false);
        e2Array4[7] = new el_1(135, StringInvoker.a(aWv.aA, new Object[]{axx_1.a(this.B.G)}), false, this.K::test);
        e2Array4[8] = new e4_0(404, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.bc, new Object[0])), aWv.aO).toString(), false);
        e2Array4[9] = new el_1(136, StringInvoker.a(aWv.g, new Object[]{axx_1.a(this.B.ai)}), false, this.K::test);
        e2Array4[10] = new e4_0(405, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.bM, new Object[0])), aWv.af).toString(), false);
        e2Array4[11] = new el_1(137, StringInvoker.a(aWv.n, new Object[]{axx_1.a(this.B.ao)}), false, this.K::test);
        e2Array4[12] = new e4_0(406, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.bl, new Object[0])), aWv.bp).toString(), false);
        e2Array4[13] = new el_1(138, StringInvoker.a(aWv.bS, new Object[]{axx_1.a(this.B.z)}), false, this.K::test);
        e2Array4[14] = new e4_0(407, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.ao, new Object[0])), aWv.t).toString(), false);
        e2Array4[15] = new el_1(139, StringInvoker.a(aWv.w, new Object[]{axx_1.a(this.B.E)}), false, this.K::test);
        e2Array4[16] = new e4_0(408, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.J, new Object[0])), aWv.bG).toString(), false);
        e2Array4[17] = new el_1(140, StringInvoker.a(aWv.bb, new Object[]{axx_1.a(this.B.a)}), false, this.K::test);
        e2Array4[18] = new e4_0(409, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.ad, new Object[0])), aWv.aQ).toString(), false);
        e2Array4[19] = new el_1(141, StringInvoker.a(aWv.bt, new Object[]{axx_1.a(this.B.b)}), false, this.K::test);
        e2Array4[20] = new e4_0(410, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.bf, new Object[0])), aWv.aM).toString(), false);
        e2Array4[21] = new el_1(142, StringInvoker.a(aWv.bi, new Object[]{axx_1.a(this.B.m)}), false, this.K::test);
        e2Array4[22] = new e4_0(411, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.bs, new Object[0])), aWv.B).toString(), false);
        e2Array4[23] = new el_1(143, StringInvoker.a(aWv.aT, new Object[]{axx_1.a(this.B.ac)}), false, this.K::test);
        e2Array4[24] = new e4_0(412, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.br, new Object[0])), aWv.bP).toString(), false);
        e2Array4[25] = new el_1(144, StringInvoker.a(aWv.bJ, new Object[]{axx_1.a(this.B.y)}), false, this.K::test);
        e2Array4[26] = new e4_0(413, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.at, new Object[0])), aWv.l).toString(), false);
        e2Array4[27] = new el_1(145, StringInvoker.a(aWv.p, new Object[]{axx_1.a(this.B.f)}), false, this.K::test);
        e2Array4[28] = new e4_0(414, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.bQ, new Object[0])), aWv.ba).toString(), false);
        e2Array4[29] = new el_1(146, StringInvoker.a(aWv.bD, new Object[]{axx_1.a(this.B.W)}), false, this.K::test);
        e2Array4[30] = new e4_0(415, aL0.a(aL0.a(new StringBuilder(), I18n.format(aWv.aD, new Object[0])), aWv.bk).toString(), false);
        e2Array4[31] = new el_1(147, StringInvoker.a(aWv.ag, new Object[]{axx_1.a(this.B.ag)}), false, this.K::test);
        e2[] e2Array5 = e2Array4;
        this.H = new a86(this.t, this.n, this.f, 32, this.f - 32, 25, this, e2Array, e2Array2, e2Array3, e2Array5);
        int n = 0;
        while (true) {
            this.O[n] = I18n.format(aL0.c(aL0.a(new StringBuilder(), aWv.aF), n).toString(), new Object[0]);
            ++n;
        }
    }

    @Override
    protected void b(int n, int n2, int n3) throws IOException {
        super.b(n, n2, n3);
        if (this.M == 0 && !this.y) {
            avz_1.a(this.H, n, n2, n3);
        }
    }

    public void a(String string) {
        this.B = !StringInvoker.g(string) ? fl_2.a(string) : new asi_2();
    }

    private void j() {
        this.C.g = avz_1.f(this.H) != 0;
        this.J.g = avz_1.f(this.H) != avz_1.e(this.H) - 1;
        this.z = I18n.format(aWv.bL, new Object[]{P8.d(avz_1.f(this.H) + 1), P8.d(avz_1.e(this.H))});
        this.w = this.O[avz_1.f(this.H)];
        this.D.g = avz_1.f(this.H) != avz_1.e(this.H) - 1;
    }

    private void a(int n) {
        this.M = n;
        this.a(true);
    }

    public String k() {
        return StringInvoker.a(this.B.toString(), (CharSequence)aWv.K, (CharSequence)aWv.Q);
    }

    private void d() {
        fl_2.b(this.B);
        this.a();
        this.b(false);
    }

    @Override
    public void l() {
        int n = 0;
        int n2 = 0;
        if (this.H != null) {
            n = avz_1.f(this.H);
            n2 = avz_1.g(this.H);
        }
        this.I = I18n.format(aWv.aY, new Object[0]);
        ListInvoker.clear(this.l);
        this.C = new QG(302, 20, 5, 80, 20, I18n.format(aWv.ay, new Object[0]));
        ListInvoker.add(this.l, this.C);
        this.J = new QG(303, this.n - 100, 5, 80, 20, I18n.format(aWv.bO, new Object[0]));
        ListInvoker.add(this.l, this.J);
        this.A = new QG(304, this.n / 2 - 187, this.f - 27, 90, 20, I18n.format(aWv.ar, new Object[0]));
        ListInvoker.add(this.l, this.A);
        this.D = new QG(301, this.n / 2 - 92, this.f - 27, 90, 20, I18n.format(aWv.C, new Object[0]));
        ListInvoker.add(this.l, this.D);
        this.E = new QG(305, this.n / 2 + 3, this.f - 27, 90, 20, I18n.format(aWv.bw, new Object[0]));
        ListInvoker.add(this.l, this.E);
        this.F = new QG(300, this.n / 2 + 98, this.f - 27, 90, 20, I18n.format(aWv.au, new Object[0]));
        ListInvoker.add(this.l, this.F);
        this.A.g = this.N;
        this.G = new QG(306, this.n / 2 - 55, 160, 50, 20, I18n.format(aWv.bv, new Object[0]));
        this.G.j = false;
        ListInvoker.add(this.l, this.G);
        this.L = new QG(307, this.n / 2 + 5, 160, 50, 20, I18n.format(aWv.an, new Object[0]));
        this.L.j = false;
        ListInvoker.add(this.l, this.L);
        if (this.M != 0) {
            this.G.j = true;
            this.L.j = true;
        }
        this.a();
        avz_1.b(this.H, n);
        avz_1.a(this.H, n2);
        this.j();
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.H.g();
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    @Override
    protected void a(char c, int n) throws IOException {
        super.a(c, n);
        if (this.M == 0) {
            switch (n) {
                case 200: {
                    this.a(1.0f);
                    break;
                }
                case 208: {
                    this.a(-1.0f);
                    break;
                }
                default: {
                    avz_1.a(this.H, c, n);
                }
            }
        }
    }

    @Override
    public String a(int n, String string, float f) {
        return aL0.a(aL0.a(aL0.a(new StringBuilder(), string), aWv.aJ), this.a(n, f)).toString();
    }

    @Override
    protected void a(QG qG) throws IOException {
        if (qG.g) {
            switch (qG.m) {
                case 300: {
                    this.v.K = this.B.toString();
                    MCInvoker.displayGuiScreen(this.t, this.v);
                    break;
                }
                case 301: {
                    for (int i = 0; i < avz_1.a(this.H); ++i) {
                        Gui gui;
                        anx_2 anx_22 = avz_1.c(this.H, i);
                        Gui gui2 = O5.b(anx_22);
                        if (gui2 instanceof QG) {
                            gui = (QG)gui2;
                            if (gui instanceof QX) {
                                float f = O2.a((QX)gui) * (0.75f + a5_0.e(this.P) * 0.5f) + (a5_0.e(this.P) * 0.1f - 0.05f);
                                O2.a((QX)gui, MathHelper.b(f, 0.0f, 1.0f));
                            } else if (gui instanceof QP) {
                                xh_0.a((QP)gui, a5_0.a(this.P));
                            }
                        }
                        if (!((gui = O5.a(anx_22)) instanceof QG)) continue;
                        Gui gui3 = gui;
                        if (gui3 instanceof QX) {
                            float f = O2.a((QX)gui3) * (0.75f + a5_0.e(this.P) * 0.5f) + (a5_0.e(this.P) * 0.1f - 0.05f);
                            O2.a((QX)gui3, MathHelper.b(f, 0.0f, 1.0f));
                            continue;
                        }
                        if (!(gui3 instanceof QP)) continue;
                        xh_0.a((QP)gui3, a5_0.a(this.P));
                    }
                    return;
                }
                case 302: {
                    avz_1.b(this.H);
                    this.j();
                    break;
                }
                case 303: {
                    avz_1.d(this.H);
                    this.j();
                    break;
                }
                case 304: {
                    if (!this.N) break;
                    this.a(304);
                    break;
                }
                case 305: {
                    MCInvoker.displayGuiScreen(this.t, new Rh(this));
                    break;
                }
                case 306: {
                    this.b();
                    break;
                }
                case 307: {
                    this.M = 0;
                    this.b();
                }
            }
        }
    }

    @Override
    protected void a(int n, int n2, int n3) {
        super.a(n, n2, n3);
        if (this.y) {
            this.y = false;
        } else if (this.M == 0) {
            avz_1.b(this.H, n, n2, n3);
        }
    }

    public RI(GuiScreen guiScreen, String string) {
        this.z = aWv.G;
        this.w = aWv.a8;
        this.O = new String[4];
        this.K = RI::lambda$new$0;
        this.x = new asi_2();
        this.P = new Random();
        this.v = (R7)guiScreen;
        this.a(string);
    }

    private void b() throws IOException {
        switch (this.M) {
            case 300: {
                this.a((QP)avz_1.d(this.H, 300));
                break;
            }
            case 304: {
                this.d();
            }
        }
        this.M = 0;
        this.y = true;
        this.a(false);
    }

    private static boolean lambda$new$0(String string) {
        Float f = aNS.a(string);
        return StringInvoker.g(string) || aNS.a(axx_1.a(f)) && axx_1.a(f) >= 0.0f;
    }

    @Override
    public void a(int n, int n2, float f) {
        this.h();
        this.H.a(n, n2, f);
        this.b(this.q, this.I, this.n / 2, 2, 0xFFFFFF);
        this.b(this.q, this.z, this.n / 2, 12, 0xFFFFFF);
        this.b(this.q, this.w, this.n / 2, 22, 0xFFFFFF);
        super.a(n, n2, f);
        if (this.M != 0) {
            this.a(0, 0, this.n, this.f, Integer.MIN_VALUE);
            this.b(this.n / 2 - 91, this.n / 2 + 90, 99, -2039584);
            this.b(this.n / 2 - 91, this.n / 2 + 90, 185, -6250336);
            this.a(this.n / 2 - 91, 99, 185, -2039584);
            this.a(this.n / 2 + 90, 99, 185, -6250336);
            GlStateManagerInvoker.disableLighting();
            GlStateManagerInvoker.disableFog();
            Tessellator tessellator = TessellatorInvoker.getInstance();
            WorldRenderer worldRenderer = TessellatorInvoker.getWorldRenderer(tessellator);
            TextureManagerInvoker.bindTexture(MCInvoker.E(this.t), a);
            GlStateManagerInvoker.color(1.0f, 1.0f, 1.0f, 1.0f);
            WorldRendererInvoker.begin(worldRenderer, 7, DefaultVertexFormats.POSITION_TEX_COLOR);
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.n / 2 - 90, 185.0, 0.0), 0.0, 2.65625), 64, 64, 64, 64));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.n / 2 + 90, 185.0, 0.0), 5.625, 2.65625), 64, 64, 64, 64));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.n / 2 + 90, 100.0, 0.0), 5.625, 0.0), 64, 64, 64, 64));
            WorldRendererInvoker.pos(WorldRendererInvoker.tex(WorldRendererInvoker.color(WorldRendererInvoker.endVertex(worldRenderer, this.n / 2 - 90, 100.0, 0.0), 0.0, 0.0), 64, 64, 64, 64));
            TessellatorInvoker.draw(tessellator);
            this.b(this.q, I18n.format(aWv.bz, new Object[0]), this.n / 2, 105, 0xFFFFFF);
            this.b(this.q, I18n.format(aWv.bj, new Object[0]), this.n / 2, 125, 0xFFFFFF);
            this.b(this.q, I18n.format(aWv.bI, new Object[0]), this.n / 2, 135, 0xFFFFFF);
            atB.b(this.G, this.t, n, n2);
            atB.b(this.L, this.t, n, n2);
        }
    }

    @Override
    public void a(int n, String string) {
        float f = 0.0f;
        try {
            f = axx_1.a(string);
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        float f2 = 0.0f;
        switch (n) {
            case 132: {
                f2 = this.B.S = MathHelper.b(f, 1.0f, 5000.0f);
                break;
            }
            case 133: {
                f2 = this.B.al = MathHelper.b(f, 1.0f, 5000.0f);
                break;
            }
            case 134: {
                f2 = this.B.i = MathHelper.b(f, 1.0f, 5000.0f);
                break;
            }
            case 135: {
                f2 = this.B.G = MathHelper.b(f, 1.0f, 2000.0f);
                break;
            }
            case 136: {
                f2 = this.B.ai = MathHelper.b(f, 1.0f, 2000.0f);
                break;
            }
            case 137: {
                f2 = this.B.ao = MathHelper.b(f, 0.01f, 20.0f);
                break;
            }
            case 138: {
                f2 = this.B.z = MathHelper.b(f, 1.0f, 25.0f);
                break;
            }
            case 139: {
                f2 = this.B.E = MathHelper.b(f, 1.0f, 6000.0f);
                break;
            }
            case 140: {
                f2 = this.B.a = MathHelper.b(f, 1.0f, 6000.0f);
                break;
            }
            case 141: {
                f2 = this.B.b = MathHelper.b(f, 0.01f, 50.0f);
                break;
            }
            case 142: {
                f2 = this.B.m = MathHelper.b(f, 1.0f, 5000.0f);
                break;
            }
            case 143: {
                f2 = this.B.ac = MathHelper.b(f, 1.0f, 5000.0f);
                break;
            }
            case 144: {
                f2 = this.B.y = MathHelper.b(f, 1.0f, 20.0f);
                break;
            }
            case 145: {
                f2 = this.B.f = MathHelper.b(f, 0.0f, 20.0f);
                break;
            }
            case 146: {
                f2 = this.B.W = MathHelper.b(f, 1.0f, 20.0f);
                break;
            }
            case 147: {
                f2 = this.B.ag = MathHelper.b(f, 0.0f, 20.0f);
            }
        }
        int cfr_ignored_0 = f2 == f ? 0 : (f2 > f ? 1 : -1);
        O2.a((QX)avz_1.d(this.H, n - 132 + 100), f2, false);
        if (!this.B.equals(this.x)) {
            this.b(true);
        }
    }

    private String a(int n, float f) {
        switch (n) {
            case 100: 
            case 101: 
            case 102: 
            case 103: 
            case 104: 
            case 107: 
            case 108: 
            case 110: 
            case 111: 
            case 132: 
            case 133: 
            case 134: 
            case 135: 
            case 136: 
            case 139: 
            case 140: 
            case 142: 
            case 143: {
                return StringInvoker.a(aWv.y, new Object[]{axx_1.a(f)});
            }
            case 105: 
            case 106: 
            case 109: 
            case 112: 
            case 113: 
            case 114: 
            case 115: 
            case 137: 
            case 138: 
            case 141: 
            case 144: 
            case 145: 
            case 146: 
            case 147: {
                return StringInvoker.a(aWv.a4, new Object[]{axx_1.a(f)});
            }
            default: {
                return StringInvoker.a(aWv.a7, new Object[]{P8.d((int)f)});
            }
            case 162: 
        }
        if (f < 0.0f) {
            return I18n.format(aWv.O, new Object[0]);
        }
        if ((int)f >= il_0.q.s) {
            il_0 il_02 = hw_0.d()[(int)f + 2];
            return il_02.Y;
        }
        il_0 il_03 = hw_0.d()[(int)f];
        return il_03.Y;
    }
}

