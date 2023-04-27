/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  org.apache.logging.log4j.Logger
 */
package net.minecraft.client.settings;

import cc.novoline.invoke.DisplayInvoker;
import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.GameSettingsInvoker;
import cc.novoline.invoke.IStreamInvoker;
import cc.novoline.invoke.KeyboardInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.LogManagerInvoker;
import cc.novoline.invoke.LoggerInvoker;
import cc.novoline.invoke.MapInvoker;
import cc.novoline.invoke.MapsInvoker;
import cc.novoline.invoke.ModuleInvoker;
import cc.novoline.invoke.MouseInvoker;
import cc.novoline.invoke.NovolineInvoker;
import cc.novoline.invoke.TextureManagerInvoker;
import cc.novoline.modules.visual.Camera;
import com.google.gson.Gson;
import net.minecraft.network.packts.C15PacketClientSettings;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.lang.reflect.ParameterizedType;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.Minecraft;
import deobf.EnumChatVisibility;
import net.GW;
import net.I18n;
import net.IN;
import net.MV;
import net.N6;
import net.P8;
import net.TargetStrafe;
import net.a07;
import net.a3c_0;
import net.a4W;
import net.a7r_0;
import net.aC8;
import net.aDM;
import net.aDY;
import net.aDb;
import net.aFC;
import net.aII;
import net.aL0;
import net.aMA;
import net.aMX;
import net.aO6;
import net.aS0;
import net.aVE;
import net.aYj;
import net.ad2_0;
import net.add_0;
import net.aea_1;
import net.aef_0;
import net.ail_0;
import net.aj2;
import net.ajT;
import net.alf_2;
import net.ani_2;
import net.aoe_2;
import net.aru_1;
import net.aux__0;
import net.axe_2;
import net.axx_1;
import net.azd_2;
import net.dz_0;
import net.h9;
import net.jv_0;
import net.kp_1;
import net.kt_1;
import net.minecraft.renderer.texture.TextureMap;
import net.my_0;
import net.tf_0;
import net.wt_0;
import net.xh_1;
import net.ys_2;
import org.apache.logging.log4j.Logger;

public class GameSettings {
    private static int[] aU;
    public float aE;
    public boolean bl;
    public int k = 2;
    private Set a6 = axe_2.a((Object[])aea_1.values());
    public float bb = 0.31690142f;
    public int f;
    private static ParameterizedType M;
    public aII cd;
    public boolean be;
    public boolean l;
    public String H;
    public boolean aC;
    private static Logger aW;
    public boolean P;
    public static String r;
    public aII ak;
    public boolean bS;
    public float ap = 1.0f;
    public boolean a5;
    public static int bc = 0;
    public boolean a1;
    public boolean ae;
    public boolean au;
    public boolean bs;
    public boolean o;
    public float av = 0.44366196f;
    public aII T;
    public boolean bF = true;
    public float ce;
    public boolean O = true;
    public List<String> bY;
    public int br;
    public aII keyBindStreamStartStop;
    public float bu = 0.5f;
    private static Gson bA;
    private static String[] bx;
    public boolean d;
    public float aD;
    public aII bd;
    public static int bL = 1;
    public int cc;
    public int bz;
    public aII L;
    public String gameSettings;
    public boolean x = true;
    public boolean bW;
    public boolean a3;
    public boolean bm;
    public float I = 1.0f;
    private static String[] b1;
    private int am;
    public boolean bC;
    public aII a_;
    public int at;
    public int aZ;
    public int b3 = 1;
    public boolean D;
    public boolean X;
    public static int Z = 3;
    public static int bH = 2;
    public aII J;
    public int bp = -1;
    public List<String> bg;
    public int bI = 120;
    public boolean ay;
    public boolean bN;
    public int F = 4;
    public boolean j;
    public boolean p;
    public int b5;
    private static String[] ah;
    public boolean aH;
    public String U;
    public int aN;
    public boolean g;
    public float al;
    public boolean bT;
    public int aA;
    public boolean s;
    public static int ag = 0;
    public aII bD;
    public boolean bV;
    public boolean cb;
    public boolean as;
    public boolean aQ = false;
    public aII aj;
    public static int bE = 2;
    public boolean b4;
    public aII a0;
    public boolean t = true;
    public boolean ax = true;
    public boolean bO;
    private static String[] aO;
    public boolean b9 = true;
    public aII[] E;
    public boolean K;
    private File N;
    public int by = 2;
    public aII bQ;
    public aII aS;
    public boolean bG;
    public static int aF = 4;
    public aII[] aP;
    public int aX;
    public aII bo;
    public boolean u;
    public boolean aT;
    public EnumChatVisibility b2;
    public EnumDifficulty aG;
    public float bt;
    public float bn = 1.0f;
    public boolean ad;
    public float af = 1.0f;
    public int aL;
    public int bi;
    public aII G;
    private static String aY;
    public int y;
    public aII ab;
    public float ai = 1.0f;
    public aII b6;
    public float aw = 0.5f;
    public boolean B;
    public boolean e;
    private Map bX = MapsInvoker.a(N6.class);
    private static int[] aI;
    public float ao = 1.0f;
    public boolean v;
    public boolean aB;
    public aII A;
    private static String[] a7;
    public int an;
    public boolean aR = true;
    public int bh;
    public aII bj;
    public int b;
    public int aK;
    public int V;
    public int bP;
    public int z;
    public boolean R;
    public boolean bk;
    public int aa;
    public int q;
    public boolean az = false;
    public boolean b0 = true;
    public boolean bR;
    public aII a9;
    public aII m;
    public boolean Y;
    public boolean C;
    public float bJ;
    public aII n;
    public int bv;
    protected Minecraft bM;
    private static String[] b7;
    public boolean a8 = true;
    public float b_ = 0.5412844f;
    private static String[] bq;
    public boolean ar;
    public boolean bB;
    public boolean i;
    public boolean S;
    public aII a;
    private File Q;
    public boolean W;
    public static int bw = 1;
    public String ba;
    public boolean aJ;
    public boolean bZ;
    public int overrideHeight;
    private static String[] h;
    public aII ac;
    public boolean bU;
    public boolean aV = true;
    public boolean a4 = true;
    public boolean b8;
    public boolean w = true;
    private static String[] bK;
    public boolean aq = true;
    public aII c;
    public int bf;

    public boolean c(aj2 aj22) {
        switch (aef_0.a[aj22.ordinal()]) {
            case 1: {
                return this.l;
            }
            case 2: {
                return this.aR;
            }
            case 3: {
                return this.bV;
            }
            case 4: {
                return this.a8;
            }
            case 5: {
                return this.ax;
            }
            case 6: {
                return this.aq;
            }
            case 7: {
                return this.bF;
            }
            case 8: {
                return this.b0;
            }
            case 9: {
                return this.bB;
            }
            case 10: {
                return this.x;
            }
            case 11: {
                return this.aQ;
            }
            case 12: {
                return this.Y;
            }
            case 13: {
                return this.t;
            }
            case 14: {
                return this.bN;
            }
            case 15: {
                return this.aV;
            }
            case 16: {
                return this.az;
            }
            case 17: {
                return this.p;
            }
        }
        return false;
    }

    public void a() {
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(this.N));
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.hj), this.bp).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.bF), this.y).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.gQ), this.bJ).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.f0), this.aa).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.bA), this.a1).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.fU), this.bU).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.E), this.aH).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.aZ), this.al).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.hL), this.bz).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.fu), this.bt).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.b2), this.aL).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.c9), this.aZ).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.eI), this.bv).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.eA), this.bh).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.ap), this.bP).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.hS), this.o).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.ht), this.bZ).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.eJ), this.as).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.eL), this.bT).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.a5), this.ay).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.ce), this.bS).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.dk), this.R).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.cC), this.D).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.dy), this.au).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.bh), this.e).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.dI), this.bk).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.dz), this.v).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.aY), this.d).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.m), this.b8).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.N), this.bG).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.g6), this.a3).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.I), this.bR).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.hl), this.b5).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.eQ), this.f).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.fo), this.cc).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.bE), this.j).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.d7), this.aB).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.ej), this.cb).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.V), this.be).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.gF), this.aK).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.ai), this.an).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.H), this.b4).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.L), this.bf).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.P), this.B).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.cp), this.V).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.dU), this.aN).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.ao), this.bs).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.a6), this.aT).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.gg), this.bO).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.q), this.u).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.bb), this.K).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.aS), this.ad).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.g0), this.bC).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.aa), this.aC).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.fi), this.C).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.dT), this.a5).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.bx), this.ae).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.bN), this.s).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.cX), this.P).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.ac), this.aA).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.cc), this.U).toString());
            aO6.a(printWriter, aL0.a(aL0.a(new StringBuilder(), aFC.hu), this.W).toString());
            aO6.a(printWriter, aL0.c(aL0.a(new StringBuilder(), aFC.K), this.q).toString());
            aO6.a(printWriter, aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aFC.gL), GameSettingsInvoker.f(this.J)), aFC.eP), GameSettingsInvoker.getKeyCode(this.J)).toString());
            aO6.a(printWriter);
        }
        catch (Throwable throwable) {
            ys_2.d(aFC.gG);
            LoggerInvoker.a(MCInvoker.H(this.bM), throwable);
        }
    }

    public void a(aea_1 aea_12, boolean bl) {
        aS0.b(this.a6, (Object)aea_12);
        this.d();
    }

    public static String b(int n) {
        return I18n.format(aFC.gt, new Object[]{P8.d(n + 101)});
    }

    public void k() {
        this.bp = 8;
        this.aR = true;
        this.bV = false;
        this.bI = (int)aDY.a(aj2.FRAMERATE_LIMIT);
        this.x = false;
        this.l();
        this.F = 4;
        this.a4 = true;
        this.k = 2;
        this.by = 2;
        this.aD = 70.0f;
        this.aE = 0.0f;
        this.z = 0;
        this.br = 0;
        this.w = true;
        this.aQ = false;
        this.aV = true;
        this.bN = false;
        this.y = 1;
        this.bJ = 0.8f;
        this.aa = 0;
        this.a1 = false;
        this.bU = false;
        ys_2.aP();
        this.aH = ys_2.n();
        this.s = ys_2.n();
        this.W = false;
        this.q = 0;
        this.P = true;
        this.aA = 3;
        this.al = 1.0f;
        this.V = 0;
        this.aN = 1;
        this.bz = 0;
        this.bt = 0.0f;
        this.aL = 0;
        this.bv = 0;
        this.f = 3;
        this.b5 = 4000;
        this.a3 = false;
        this.bR = false;
        this.bs = false;
        this.j = true;
        this.aB = true;
        this.cb = true;
        this.be = true;
        this.aK = 0;
        this.an = 1;
        this.b4 = false;
        this.bf = 0;
        this.B = false;
        this.aT = false;
        this.U = aFC.bG;
        this.bO = true;
        this.u = true;
        this.K = true;
        this.ad = true;
        this.bC = true;
        this.aC = true;
        this.C = true;
        this.a5 = true;
        this.cc = 2;
        this.ae = false;
        this.bh = 0;
        this.bP = 0;
        this.o = true;
        this.bZ = true;
        this.as = true;
        this.bT = true;
        this.ay = true;
        this.bS = true;
        this.R = true;
        this.D = true;
        this.bG = true;
        this.au = true;
        this.e = true;
        this.bk = true;
        this.v = true;
        this.d = true;
        this.b8 = true;
        a3c_0.g(aVE.cq);
        aVE.c1 = 0;
        a3c_0.M();
        a3c_0.k();
        this.b();
        MCInvoker.w(this.bM);
        this.f();
    }

    public boolean i() {
        return this.bl;
    }

    private String b(aj2 aj22) {
        String string = aL0.a(aL0.a(new StringBuilder(), I18n.format(aDY.c(aj22), new Object[0])), aFC.ax).toString();
        string = aDY.c(aj22);
        if (aj22 == aj2.RENDER_DISTANCE) {
            int n = (int)this.a(aj22);
            String string2 = I18n.format(aFC.f8, new Object[0]);
            int n2 = 2;
            if (n >= 4) {
                string2 = I18n.format(aFC.aM, new Object[0]);
                n2 = 4;
            }
            if (n >= 8) {
                string2 = I18n.format(aFC.hn, new Object[0]);
                n2 = 8;
            }
            if (n >= 16) {
                string2 = I18n.format(aFC.eG, new Object[0]);
                n2 = 16;
            }
            if (n >= 32) {
                string2 = IN.a(aFC.ek);
                n2 = 32;
            }
            int cfr_ignored_0 = this.bp - n2;
            String string3 = string2;
            string3 = aL0.a(aL0.a(new StringBuilder(), string2), aFC.aX).toString();
            return aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), string), n), aFC.g3), string3), aFC.gP).toString();
        }
        if (aj22 == aj2.FOG_FANCY) {
            switch (this.y) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.FOG_START) {
            return aL0.a(aL0.a(new StringBuilder(), string), this.bJ).toString();
        }
        if (aj22 == aj2.MIPMAP_TYPE) {
            switch (this.aa) {
                case 0: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.e7)).toString();
                }
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.cW)).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.fr)).toString();
                }
                case 3: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.aO)).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), aFC.bo).toString();
        }
        if (aj22 == aj2.SMOOTH_FPS) {
            return this.bU ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.SMOOTH_WORLD) {
            return this.aH ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.CLOUDS) {
            switch (this.bz) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
                case 3: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString();
        }
        if (aj22 == aj2.TREES) {
            switch (this.aL) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
                default: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString();
                }
                case 4: 
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.aU)).toString();
        }
        if (aj22 == aj2.DROPPED_ITEMS) {
            switch (this.aZ) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString();
        }
        if (aj22 == aj2.RAIN) {
            switch (this.bv) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
                case 3: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString();
        }
        if (aj22 == aj2.ANIMATED_WATER) {
            switch (this.bh) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.dV)).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString();
        }
        if (aj22 == aj2.ANIMATED_LAVA) {
            switch (this.bP) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.fV)).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString();
        }
        if (aj22 == aj2.ANIMATED_FIRE) {
            return this.o ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.ANIMATED_PORTAL) {
            return this.bZ ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.ANIMATED_REDSTONE) {
            return this.as ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.ANIMATED_EXPLOSION) {
            return this.bT ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.ANIMATED_FLAME) {
            return this.ay ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.ANIMATED_SMOKE) {
            return this.bS ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.VOID_PARTICLES) {
            return this.R ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.WATER_PARTICLES) {
            return this.D ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.PORTAL_PARTICLES) {
            return this.au ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.POTION_PARTICLES) {
            return this.e ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.FIREWORK_PARTICLES) {
            return this.bk ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.DRIPPING_WATER_LAVA) {
            return this.v ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.ANIMATED_TERRAIN) {
            return this.d ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.ANIMATED_TEXTURES) {
            return this.b8 ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.RAIN_SPLASH) {
            return this.bG ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.LAGOMETER) {
            return this.a3 ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.SHOW_FPS) {
            return this.bR ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.AUTOSAVE_TICKS) {
            return this.b5 <= 40 ? aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.fO)).toString() : (this.b5 <= 400 ? aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.ez)).toString() : (this.b5 <= 4000 ? aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.cU)).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.c0)).toString()));
        }
        if (aj22 == aj2.BETTER_GRASS) {
            switch (this.f) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.CONNECTED_TEXTURES) {
            switch (this.cc) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.WEATHER) {
            return this.j ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.SKY) {
            return this.aB ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.STARS) {
            return this.cb ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.SUN_MOON) {
            return this.be ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.VIGNETTE) {
            switch (this.aK) {
                case 1: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString();
                }
                case 2: {
                    return aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString();
                }
            }
            return aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString();
        }
        if (aj22 == aj2.CHUNK_UPDATES) {
            return aL0.c(aL0.a(new StringBuilder(), string), this.an).toString();
        }
        if (aj22 == aj2.CHUNK_UPDATES_DYNAMIC) {
            return this.b4 ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.TIME) {
            return this.bf == 1 ? aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.bM)).toString() : (this.bf == 2 ? aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.gX)).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString());
        }
        if (aj22 == aj2.CLEAR_WATER) {
            return this.B ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.AA_LEVEL) {
            String string4 = aFC.de;
            if (this.V != ys_2.ab()) {
                string4 = aL0.a(aL0.a(aL0.a(new StringBuilder(), aFC.fK), IN.a(aFC.am)), aFC.ae).toString();
            }
            return this.V == 0 ? aL0.a(aL0.a(aL0.a(new StringBuilder(), string), IN.b()), string4).toString() : aL0.a(aL0.c(aL0.a(new StringBuilder(), string), this.V), string4).toString();
        }
        if (aj22 == aj2.AF_LEVEL) {
            return this.aN == 1 ? aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString() : aL0.c(aL0.a(new StringBuilder(), string), this.aN).toString();
        }
        if (aj22 == aj2.PROFILER) {
            return this.bs ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.BETTER_SNOW) {
            return this.aT ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.SWAMP_COLORS) {
            return this.bO ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.RANDOM_MOBS) {
            return this.u ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.SMOOTH_BIOMES) {
            return this.K ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.CUSTOM_FONTS) {
            return this.ad ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.CUSTOM_COLORS) {
            return this.bC ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.CUSTOM_SKY) {
            return this.C ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.SHOW_CAPES) {
            return this.a5 ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.CUSTOM_ITEMS) {
            return this.aC ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.NATURAL_TEXTURES) {
            return this.ae ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.FAST_MATH) {
            return this.W ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.TRANSLUCENT_BLOCKS) {
            return this.q == 1 ? aL0.a(aL0.a(new StringBuilder(), string), IN.a()).toString() : (this.q == 2 ? aL0.a(aL0.a(new StringBuilder(), string), IN.f()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString());
        }
        if (aj22 == aj2.LAZY_CHUNK_LOADING) {
            return this.s ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.DYNAMIC_FOV) {
            return this.P ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.DYNAMIC_LIGHTS) {
            int n = GameSettings.c(this.aA, aI);
            return aL0.a(aL0.a(new StringBuilder(), string), GameSettings.a(h, n)).toString();
        }
        if (aj22 == aj2.FULLSCREEN_MODE) {
            return this.U.equals(aFC.gC) ? aL0.a(aL0.a(new StringBuilder(), string), IN.c()).toString() : aL0.a(aL0.a(new StringBuilder(), string), this.U).toString();
        }
        if (aj22 == aj2.HELD_ITEM_TOOLTIPS) {
            return this.w ? aL0.a(aL0.a(new StringBuilder(), string), IN.d()).toString() : aL0.a(aL0.a(new StringBuilder(), string), IN.b()).toString();
        }
        if (aj22 == aj2.FRAMERATE_LIMIT) {
            float f = this.a(aj22);
            return f == 0.0f ? aL0.a(aL0.a(new StringBuilder(), string), IN.a(aFC.bi)).toString() : (f == aj2.a(aj22) ? aL0.a(aL0.a(new StringBuilder(), string), I18n.format(aFC.bz, new Object[0])).toString() : aL0.a(aL0.c(aL0.a(new StringBuilder(), string), (int)f), aFC.O).toString());
        }
        return null;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    static {
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u0017PgOXo2d*\rO\u0007\u0010y^\u001e\u001d3v";
        int n2 = "\u0017PgOXo2d*\rO\u0007\u0010y^\u001e\u001d3v".length();
        int n3 = 11;
        int n4 = -1;
        while (true) {
            char[] cArray;
            block5: {
                int n5;
                char[] cArray2;
                int n6;
                int n7;
                block4: {
                    int n8 = ++n4;
                    char[] cArray3 = string.substring(n8, n8 + n3).toCharArray();
                    int n9 = cArray3.length;
                    n7 = 0;
                    n6 = 64;
                    cArray2 = cArray3;
                    n5 = n9;
                    if (n9 <= 1) break block4;
                    cArray = cArray2;
                    n5 = n5;
                    if (n5 <= n7) break block5;
                }
                do {
                    cArray2 = cArray2;
                    int n10 = n7;
                    int cfr_ignored_0 = n7 % 7;
                    cArray2[n10] = (char)(cArray2[n10] ^ (n6 ^ 0x14));
                    ++n7;
                    n6 = n6;
                    cArray = cArray2;
                    n5 = n5;
                } while (n5 > n7);
            }
            stringArray[n++] = new String(cArray).intern();
            if ((n4 += n3) >= n2) {
                String[] stringArray2 = stringArray;
                r = stringArray2[1];
                aY = stringArray2[0];
                aW = LogManagerInvoker.c();
                bA = new Gson();
                M = new add_0();
                bq = new String[]{aFC.cm, aFC.dG, aFC.bI, aFC.hN};
                b1 = new String[]{aFC.al, aFC.hH, aFC.hq};
                a7 = new String[]{aFC.n, aFC.hc, aFC.eH};
                b7 = new String[]{aFC.gj, aFC.fc, aFC.cH};
                aO = new String[]{aFC.f4, aFC.hT, aFC.c5};
                bK = new String[]{aFC.cr, aFC.eS, aFC.c4};
                ah = new String[]{aFC.fg, aFC.dN};
                bx = new String[]{aFC.be, aFC.ei, aFC.e2};
                aU = new int[]{0, 1, 4, 2};
                aI = new int[]{3, 1, 2};
                h = new String[]{aFC.b0, aFC.dw, aFC.bL};
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private void a(aj2 aj22, float f) {
        int n;
        if (aj22 == aj2.CLOUD_HEIGHT) {
            this.bt = f;
            jv_0.f(this.bM.renderGlobal);
        }
        if (aj22 == aj2.AO_LEVEL) {
            this.al = f;
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.AA_LEVEL) {
            int n2 = (int)f;
            if (ys_2.aC()) {
                ys_2.b(IN.a(aFC.gi), IN.a(aFC.d2));
                return;
            }
            int[] nArray = new int[]{0, 2, 4, 6, 8, 12, 16};
            this.V = 0;
            int[] nArray2 = nArray;
            int n3 = nArray2.length;
            int n4 = 0;
            while (true) {
                int n5;
                if (n2 >= (n5 = nArray2[n4])) {
                    this.V = n5;
                }
                ++n4;
            }
        }
        if (aj22 == aj2.AF_LEVEL) {
            n = (int)f;
            if (n > 1 && ys_2.aC()) {
                ys_2.b(IN.a(aFC.ad), IN.a(aFC.s));
                return;
            }
            this.aN = 1;
            while (this.aN * 2 <= n) {
                this.aN *= 2;
            }
            this.aN = ys_2.a(this.aN, 1, 16);
            MCInvoker.w(this.bM);
        }
        if (aj22 == aj2.MIPMAP_TYPE) {
            n = (int)f;
            this.aa = ys_2.a(n, 0, 3);
            MCInvoker.w(this.bM);
        }
    }

    public GameSettings() {
        this.bg = my_0.c();
        this.bY = my_0.c();
        this.b2 = EnumChatVisibility.FULL;
        this.H = aFC.fB;
        this.at = 0;
        this.bi = 0;
        this.aX = 0;
        this.bl = true;
        this.p = true;
        this.cd = new aII(aFC.ds, 17, aFC.d8);
        this.ac = new aII(aFC.em, 30, aFC.dW);
        this.L = new aII(aFC.ga, 31, aFC.aN);
        this.ab = new aII(aFC.cE, 32, aFC.eU);
        this.bo = new aII(aFC.gr, 57, aFC.cl);
        this.A = new aII(aFC.di, 42, aFC.bt);
        this.bD = new aII(aFC.eZ, 29, aFC.dZ);
        this.a0 = new aII(aFC.cx, 18, aFC.dA);
        this.aj = new aII(aFC.dh, -99, aFC.hz);
        this.ak = new aII(aFC.dt, 16, aFC.b5);
        this.G = new aII(aFC.b8, -100, aFC.cR);
        this.b6 = new aII(aFC.b3, -98, aFC.fh);
        this.a = new aII(aFC.fm, 20, aFC.da);
        this.a9 = new aII(aFC.aJ, 15, aFC.cJ);
        this.bd = new aII(aFC.hM, 53, aFC.U);
        this.n = new aII(aFC.Q, 60, aFC.gU);
        this.a_ = new aII(aFC.fl, 63, aFC.fe);
        this.m = new aII(aFC.b7, 0, aFC.eh);
        this.c = new aII(aFC.bJ, 87, aFC.fE);
        this.aS = new aII(aFC.d6, 0, aFC.aj);
        this.keyBindStreamStartStop = new aII(aFC.ab, 64, aFC.bw);
        this.T = new aII(aFC.cd, 65, aFC.dK);
        this.bQ = new aII(aFC.W, 0, aFC.hd);
        this.bj = new aII(aFC.aA, 0, aFC.aP);
        this.E = new aII[]{new aII(aFC.G, 2, aFC.hx), new aII(aFC.x, 3, aFC.cn), new aII(aFC.eM, 4, aFC.c2), new aII(aFC.b_, 5, aFC.eo), new aII(aFC.dB, 6, aFC.J), new aII(aFC.eu, 7, aFC.cV), new aII(aFC.d_, 8, aFC.bk), new aII(aFC.i, 9, aFC.cv), new aII(aFC.dm, 10, aFC.ak)};
        this.y = 1;
        this.bJ = 0.8f;
        this.aa = 0;
        this.a1 = false;
        this.bU = false;
        this.aH = ys_2.n();
        this.s = ys_2.n();
        this.al = 1.0f;
        this.V = 0;
        this.aN = 1;
        this.bz = 0;
        this.bt = 0.0f;
        this.aL = 0;
        this.bv = 0;
        this.aZ = 0;
        this.f = 3;
        this.b5 = 4000;
        this.a3 = false;
        this.bs = false;
        this.bR = false;
        this.j = true;
        this.aB = true;
        this.cb = true;
        this.be = true;
        this.aK = 0;
        this.an = 1;
        this.b4 = false;
        this.bf = 0;
        this.B = false;
        this.aT = false;
        this.U = aFC.d1;
        this.bO = true;
        this.u = true;
        this.K = true;
        this.ad = true;
        this.bC = true;
        this.C = true;
        this.a5 = true;
        this.cc = 2;
        this.aC = true;
        this.ae = false;
        this.W = false;
        this.q = 0;
        this.P = true;
        this.aA = 3;
        this.bh = 0;
        this.bP = 0;
        this.o = true;
        this.bZ = true;
        this.as = true;
        this.bT = true;
        this.ay = true;
        this.bS = true;
        this.R = true;
        this.D = true;
        this.bG = true;
        this.au = true;
        this.e = true;
        this.bk = true;
        this.v = true;
        this.d = true;
        this.b8 = true;
        this.aP = (aII[])aoe_2.a((Object[])new aII[]{this.G, this.aj, this.cd, this.ac, this.L, this.ab, this.bo, this.A, this.bD, this.ak, this.a0, this.a, this.a9, this.b6, this.bd, this.n, this.a_, this.m, this.keyBindStreamStartStop, this.T, this.bQ, this.bj, this.c, this.aS}, this.E);
        this.aG = EnumDifficulty.NORMAL;
        this.ba = aFC.cg;
        this.aD = 70.0f;
        this.gameSettings = aFC.gu;
        this.bN = false;
    }

    private void b(aj2 aj22, int n) {
        if (aj22 == aj2.FOG_FANCY) {
            switch (this.y) {
                case 1: {
                    this.y = 2;
                    if (ys_2.aT()) break;
                    this.y = 3;
                    break;
                }
                case 2: {
                    this.y = 3;
                    break;
                }
                default: {
                    this.y = 1;
                }
            }
        }
        if (aj22 == aj2.FOG_START) {
            this.bJ += 0.2f;
            if (this.bJ > 0.81f) {
                this.bJ = 0.2f;
            }
        }
        if (aj22 == aj2.SMOOTH_FPS) {
            boolean bl = this.bU = !this.bU;
        }
        if (aj22 == aj2.SMOOTH_WORLD) {
            this.aH = !this.aH;
            ys_2.aA();
        }
        if (aj22 == aj2.CLOUDS) {
            ++this.bz;
            if (this.bz > 3) {
                this.bz = 0;
            }
            this.g();
            jv_0.f(this.bM.renderGlobal);
        }
        if (aj22 == aj2.TREES) {
            this.aL = GameSettings.b(this.aL, aU);
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.DROPPED_ITEMS) {
            ++this.aZ;
            if (this.aZ > 2) {
                this.aZ = 0;
            }
        }
        if (aj22 == aj2.RAIN) {
            ++this.bv;
            if (this.bv > 3) {
                this.bv = 0;
            }
        }
        if (aj22 == aj2.ANIMATED_WATER) {
            ++this.bh;
            if (this.bh == 1) {
                ++this.bh;
            }
            if (this.bh > 2) {
                this.bh = 0;
            }
        }
        if (aj22 == aj2.ANIMATED_LAVA) {
            ++this.bP;
            if (this.bP == 1) {
                ++this.bP;
            }
            if (this.bP > 2) {
                this.bP = 0;
            }
        }
        if (aj22 == aj2.ANIMATED_FIRE) {
            boolean bl = this.o = !this.o;
        }
        if (aj22 == aj2.ANIMATED_PORTAL) {
            boolean bl = this.bZ = !this.bZ;
        }
        if (aj22 == aj2.ANIMATED_REDSTONE) {
            boolean bl = this.as = !this.as;
        }
        if (aj22 == aj2.ANIMATED_EXPLOSION) {
            boolean bl = this.bT = !this.bT;
        }
        if (aj22 == aj2.ANIMATED_FLAME) {
            boolean bl = this.ay = !this.ay;
        }
        if (aj22 == aj2.ANIMATED_SMOKE) {
            boolean bl = this.bS = !this.bS;
        }
        if (aj22 == aj2.VOID_PARTICLES) {
            boolean bl = this.R = !this.R;
        }
        if (aj22 == aj2.WATER_PARTICLES) {
            boolean bl = this.D = !this.D;
        }
        if (aj22 == aj2.PORTAL_PARTICLES) {
            boolean bl = this.au = !this.au;
        }
        if (aj22 == aj2.POTION_PARTICLES) {
            boolean bl = this.e = !this.e;
        }
        if (aj22 == aj2.FIREWORK_PARTICLES) {
            boolean bl = this.bk = !this.bk;
        }
        if (aj22 == aj2.DRIPPING_WATER_LAVA) {
            boolean bl = this.v = !this.v;
        }
        if (aj22 == aj2.ANIMATED_TERRAIN) {
            boolean bl = this.d = !this.d;
        }
        if (aj22 == aj2.ANIMATED_TEXTURES) {
            boolean bl = this.b8 = !this.b8;
        }
        if (aj22 == aj2.RAIN_SPLASH) {
            boolean bl = this.bG = !this.bG;
        }
        if (aj22 == aj2.LAGOMETER) {
            boolean bl = this.a3 = !this.a3;
        }
        if (aj22 == aj2.SHOW_FPS) {
            boolean bl = this.bR = !this.bR;
        }
        if (aj22 == aj2.AUTOSAVE_TICKS) {
            this.b5 *= 10;
            if (this.b5 > 40000) {
                this.b5 = 40;
            }
        }
        if (aj22 == aj2.BETTER_GRASS) {
            ++this.f;
            if (this.f > 3) {
                this.f = 1;
            }
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.CONNECTED_TEXTURES) {
            ++this.cc;
            if (this.cc > 3) {
                this.cc = 1;
            }
            if (this.cc != 2) {
                MCInvoker.w(this.bM);
            }
        }
        if (aj22 == aj2.WEATHER) {
            boolean bl = this.j = !this.j;
        }
        if (aj22 == aj2.SKY) {
            boolean bl = this.aB = !this.aB;
        }
        if (aj22 == aj2.STARS) {
            boolean bl = this.cb = !this.cb;
        }
        if (aj22 == aj2.SUN_MOON) {
            boolean bl = this.be = !this.be;
        }
        if (aj22 == aj2.VIGNETTE) {
            ++this.aK;
            if (this.aK > 2) {
                this.aK = 0;
            }
        }
        if (aj22 == aj2.CHUNK_UPDATES) {
            ++this.an;
            if (this.an > 5) {
                this.an = 1;
            }
        }
        if (aj22 == aj2.CHUNK_UPDATES_DYNAMIC) {
            boolean bl = this.b4 = !this.b4;
        }
        if (aj22 == aj2.TIME) {
            ++this.bf;
            if (this.bf > 2) {
                this.bf = 0;
            }
        }
        if (aj22 == aj2.CLEAR_WATER) {
            this.B = !this.B;
            this.b();
        }
        if (aj22 == aj2.PROFILER) {
            boolean bl = this.bs = !this.bs;
        }
        if (aj22 == aj2.BETTER_SNOW) {
            this.aT = !this.aT;
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.SWAMP_COLORS) {
            this.bO = !this.bO;
            ajT.b();
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.RANDOM_MOBS) {
            this.u = !this.u;
            aux__0.a();
        }
        if (aj22 == aj2.SMOOTH_BIOMES) {
            this.K = !this.K;
            ajT.b();
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.CUSTOM_FONTS) {
            this.ad = !this.ad;
            FontRendererInvoker.a(this.bM.fontRendererObj, ys_2.W());
            FontRendererInvoker.a(this.bM.standardGalacticFontRenderer, ys_2.W());
        }
        if (aj22 == aj2.CUSTOM_COLORS) {
            this.bC = !this.bC;
            ajT.a();
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.CUSTOM_ITEMS) {
            this.aC = !this.aC;
            MCInvoker.w(this.bM);
        }
        if (aj22 == aj2.CUSTOM_SKY) {
            this.C = !this.C;
            kt_1.b();
        }
        if (aj22 == aj2.SHOW_CAPES) {
            boolean bl = this.a5 = !this.a5;
        }
        if (aj22 == aj2.NATURAL_TEXTURES) {
            this.ae = !this.ae;
            aMX.a();
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.FAST_MATH) {
            a07.q = this.W = !this.W;
        }
        if (aj22 == aj2.TRANSLUCENT_BLOCKS) {
            this.q = this.q == 0 ? 1 : (this.q == 1 ? 2 : (this.q == 2 ? 0 : 0));
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.LAZY_CHUNK_LOADING) {
            this.s = !this.s;
            ys_2.aP();
            if (!ys_2.n()) {
                this.s = false;
            }
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.FULLSCREEN_MODE) {
            List list = a7r_0.a(ys_2.z());
            if (this.U.equals(aFC.bU)) {
                this.U = (String)ListInvoker.get(list, 0);
            } else {
                ListInvoker.indexOf(list, this.U);
                this.U = aFC.cM;
            }
        }
        if (aj22 == aj2.DYNAMIC_FOV) {
            boolean bl = this.P = !this.P;
        }
        if (aj22 == aj2.DYNAMIC_LIGHTS) {
            this.aA = GameSettings.b(this.aA, aI);
            xh_1.a(this.bM.renderGlobal);
        }
        if (aj22 == aj2.HELD_ITEM_TOOLTIPS) {
            this.w = !this.w;
        }
    }

    public void l() {
        DisplayInvoker.setVSyncEnabled(this.x);
    }

    public static boolean a(aII aII2) {
        int n = GameSettingsInvoker.getKeyCode(aII2);
        return n >= -100 && n <= 255 && GameSettingsInvoker.getKeyCode(aII2) != 0 && (GameSettingsInvoker.getKeyCode(aII2) < 0 ? MouseInvoker.c(GameSettingsInvoker.getKeyCode(aII2) + 100) : KeyboardInvoker.a(GameSettingsInvoker.getKeyCode(aII2)));
    }

    private static int c(int n, int[] nArray) {
        for (int i = 0; i < nArray.length; ++i) {
            if (nArray[i] != n) continue;
            return i;
        }
        return -1;
    }

    private static int a(int n, int[] nArray) {
        GameSettings.c(n, nArray);
        return nArray[0];
    }

    public void b(aj2 aj22, float f) {
        this.a(aj22, f);
        if (aj22 == aj2.SENSITIVITY) {
            this.aw = f;
        }
        if (aj22 == aj2.FOV) {
            this.aD = f;
        }
        if (aj22 == aj2.GAMMA) {
            this.aE = f;
        }
        if (aj22 == aj2.FRAMERATE_LIMIT) {
            this.bI = (int)f;
            this.x = false;
            if (this.bI <= 0) {
                this.bI = (int)aDY.a(aj2.FRAMERATE_LIMIT);
                this.x = true;
            }
            this.l();
        }
        if (aj22 == aj2.CHAT_OPACITY) {
            this.I = f;
            kp_1.e(GW.f(this.bM.ingameGUI));
        }
        if (aj22 == aj2.CHAT_HEIGHT_FOCUSED) {
            this.ai = f;
            kp_1.e(GW.f(this.bM.ingameGUI));
        }
        if (aj22 == aj2.CHAT_HEIGHT_UNFOCUSED) {
            this.av = f;
            kp_1.e(GW.f(this.bM.ingameGUI));
        }
        if (aj22 == aj2.CHAT_WIDTH) {
            this.ao = f;
            kp_1.e(GW.f(this.bM.ingameGUI));
        }
        if (aj22 == aj2.CHAT_SCALE) {
            this.af = f;
            kp_1.e(GW.f(this.bM.ingameGUI));
        }
        if (aj22 == aj2.MIPMAP_LEVELS) {
            int n = this.F;
            this.F = (int)f;
            if ((float)n != f) {
                h9.a(MCInvoker.f(this.bM), this.F);
                TextureManagerInvoker.bindTexture(MCInvoker.E(this.bM), TextureMap.r);
                h9.a(MCInvoker.f(this.bM), false, this.F > 0);
                MCInvoker.o(this.bM);
            }
        }
        if (aj22 == aj2.BLOCK_ALTERNATIVES) {
            this.aV = !this.aV;
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.RENDER_DISTANCE) {
            this.bp = (int)f;
            jv_0.g(this.bM.renderGlobal);
        }
        if (aj22 == aj2.STREAM_BYTES_PER_PIXEL) {
            this.bu = f;
        }
        if (aj22 == aj2.STREAM_VOLUME_MIC) {
            this.ap = f;
            IStreamInvoker.g(MCInvoker.a(this.bM));
        }
        if (aj22 == aj2.STREAM_VOLUME_SYSTEM) {
            this.bn = f;
            IStreamInvoker.g(MCInvoker.a(this.bM));
        }
        if (aj22 == aj2.STREAM_KBPS) {
            this.b_ = f;
        }
        if (aj22 == aj2.STREAM_FPS) {
            this.bb = f;
        }
    }

    private void g() {
        switch (this.bz) {
            case 1: {
                this.by = 1;
                break;
            }
            case 2: {
                this.by = 2;
                break;
            }
            case 3: {
                this.by = 0;
                break;
            }
            default: {
                this.by = this.a4 ? 2 : 1;
            }
        }
    }

    public void a(aII aII2, int n) {
        GameSettingsInvoker.a(aII2, n);
        this.f();
    }

    private void b() {
        if (MCInvoker.B(this.bM) && MCInvoker.q(this.bM) != null) {
            tf_0.e = true;
        }
        aru_1.a(this, this.bM.world);
    }

    public GameSettings(Minecraft minecraft, File file) {
        this.bg = my_0.c();
        this.bY = my_0.c();
        this.b2 = EnumChatVisibility.FULL;
        this.H = aFC.dr;
        this.at = 0;
        this.bi = 0;
        this.aX = 0;
        this.bl = true;
        this.p = true;
        this.cd = new aII(aFC.eR, 17, aFC.fx);
        this.ac = new aII(aFC.cF, 30, aFC.bj);
        this.L = new aII(aFC.bX, 31, aFC.hC);
        this.ab = new aII(aFC.cK, 32, aFC.g5);
        this.bo = new aII(aFC.eq, 57, aFC.gD);
        this.A = new aII(aFC.b, 42, aFC.gs);
        this.bD = new aII(aFC.eE, 29, aFC.df);
        this.a0 = new aII(aFC.ed, 18, aFC.f);
        this.aj = new aII(aFC.aV, -99, aFC.bR);
        this.ak = new aII(aFC.eb, 16, aFC.eO);
        this.G = new aII(aFC.bT, -100, aFC.hE);
        this.b6 = new aII(aFC.hb, -98, aFC.b9);
        this.a = new aII(aFC.bY, 20, aFC.gy);
        this.a9 = new aII(aFC.gS, 15, aFC.b1);
        this.bd = new aII(aFC.f6, 53, aFC.hU);
        this.n = new aII(aFC.c3, 60, aFC.gn);
        this.a_ = new aII(aFC.ee, 63, aFC.dq);
        this.m = new aII(aFC.ag, 0, aFC.e0);
        this.c = new aII(aFC.hF, 87, aFC.bZ);
        this.aS = new aII(aFC.eV, 0, aFC.a0);
        this.keyBindStreamStartStop = new aII(aFC.bf, 64, aFC.a2);
        this.T = new aII(aFC.bd, 65, aFC.hJ);
        this.bQ = new aII(aFC.ch, 0, aFC.g4);
        this.bj = new aII(aFC.as, 0, aFC.aC);
        this.E = new aII[]{new aII(aFC.fN, 2, aFC.gc), new aII(aFC.bC, 3, aFC.a7), new aII(aFC.eC, 4, aFC.db), new aII(aFC.dg, 5, aFC.g), new aII(aFC.bK, 6, aFC.dc), new aII(aFC.eT, 7, aFC.C), new aII(aFC.ew, 8, aFC.hX), new aII(aFC.az, 9, aFC.eg), new aII(aFC.aF, 10, aFC.a3)};
        this.y = 1;
        this.bJ = 0.8f;
        this.aa = 0;
        this.a1 = false;
        this.bU = false;
        this.aH = ys_2.n();
        this.s = ys_2.n();
        this.al = 1.0f;
        this.V = 0;
        this.aN = 1;
        this.bz = 0;
        this.bt = 0.0f;
        this.aL = 0;
        this.bv = 0;
        this.aZ = 0;
        this.f = 3;
        this.b5 = 4000;
        this.a3 = false;
        this.bs = false;
        this.bR = false;
        this.j = true;
        this.aB = true;
        this.cb = true;
        this.be = true;
        this.aK = 0;
        this.an = 1;
        this.b4 = false;
        this.bf = 0;
        this.B = false;
        this.aT = false;
        this.U = aFC.F;
        this.bO = true;
        this.u = true;
        this.K = true;
        this.ad = true;
        this.bC = true;
        this.C = true;
        this.a5 = true;
        this.cc = 2;
        this.aC = true;
        this.ae = false;
        this.W = false;
        this.q = 0;
        this.P = true;
        this.aA = 3;
        this.bh = 0;
        this.bP = 0;
        this.o = true;
        this.bZ = true;
        this.as = true;
        this.bT = true;
        this.ay = true;
        this.bS = true;
        this.R = true;
        this.D = true;
        this.bG = true;
        this.au = true;
        this.e = true;
        this.bk = true;
        this.v = true;
        this.d = true;
        this.b8 = true;
        this.aP = (aII[])aoe_2.a((Object[])new aII[]{this.G, this.aj, this.cd, this.ac, this.L, this.ab, this.bo, this.A, this.bD, this.ak, this.a0, this.a, this.a9, this.b6, this.bd, this.n, this.a_, this.m, this.keyBindStreamStartStop, this.T, this.bQ, this.bj, this.c, this.aS}, this.E);
        this.aG = EnumDifficulty.NORMAL;
        this.ba = aFC.e5;
        this.aD = 70.0f;
        this.gameSettings = aFC.hf;
        this.bN = false;
        this.bM = minecraft;
        this.Q = new File(file, aFC.X);
        this.N = new File(file, aFC.fw);
        this.bI = (int)aDY.a(aj2.FRAMERATE_LIMIT);
        this.J = new aII(aFC.aR, 46, aFC.hK);
        this.aP = (aII[])aoe_2.b(this.aP, this.J);
        aDY.a(aj2.RENDER_DISTANCE, 32.0f);
        this.bp = 8;
        this.j();
        ys_2.a(this);
    }

    public float a(N6 n6) {
        return MapInvoker.b(this.bX, (Object)n6) ? axx_1.a((Float)MapInvoker.c(this.bX, (Object)n6)) : 1.0f;
    }

    public void a(N6 n6, float f) {
        MCInvoker.l(this.bM).a(n6, f);
        MapInvoker.c(this.bX, (Object)n6, axx_1.a(f));
    }

    private static int b(int n, int[] nArray) {
        GameSettings.c(n, nArray);
        return nArray[0];
    }

    private static String a(String[] stringArray, int n) {
        if (n >= stringArray.length) {
            n = 0;
        }
        return I18n.format(stringArray[n], new Object[0]);
    }

    public int h() {
        return this.bp >= 4 ? this.by : 0;
    }

    public Set m() {
        return MV.a(this.a6);
    }

    private float a(String string) {
        return string.equals(aFC.hV) ? 1.0f : (string.equals(aFC.dL) ? 0.0f : Float.parseFloat(string));
    }

    public float a(aj2 aj22) {
        return aj22 == aj2.CLOUD_HEIGHT ? this.bt : (aj22 == aj2.AO_LEVEL ? this.al : (aj22 == aj2.AA_LEVEL ? (float)this.V : (aj22 == aj2.AF_LEVEL ? (float)this.aN : (aj22 == aj2.MIPMAP_TYPE ? (float)this.aa : (aj22 == aj2.FRAMERATE_LIMIT ? ((float)this.bI == aDY.a(aj2.FRAMERATE_LIMIT) && this.x ? 0.0f : (float)this.bI) : (aj22 == aj2.FOV ? this.aD : (aj22 == aj2.GAMMA ? this.aE : (aj22 == aj2.SATURATION ? this.ce : (aj22 == aj2.SENSITIVITY ? this.aw : (aj22 == aj2.CHAT_OPACITY ? this.I : (aj22 == aj2.CHAT_HEIGHT_FOCUSED ? this.ai : (aj22 == aj2.CHAT_HEIGHT_UNFOCUSED ? this.av : (aj22 == aj2.CHAT_SCALE ? this.af : (aj22 == aj2.CHAT_WIDTH ? this.ao : (aj22 == aj2.FRAMERATE_LIMIT ? (float)this.bI : (aj22 == aj2.MIPMAP_LEVELS ? (float)this.F : (aj22 == aj2.RENDER_DISTANCE ? (float)this.bp : (aj22 == aj2.STREAM_BYTES_PER_PIXEL ? this.bu : (aj22 == aj2.STREAM_VOLUME_MIC ? this.ap : (aj22 == aj2.STREAM_VOLUME_SYSTEM ? this.bn : (aj22 == aj2.STREAM_KBPS ? this.b_ : (aj22 == aj2.STREAM_FPS ? this.bb : 0.0f))))))))))))))))))))));
    }

    public void d() {
        if (this.bM.player != null) {
            int n = 0;
            Iterator iterator = aS0.f(this.a6);
            while (dz_0.c(iterator)) {
                Object object = dz_0.b(iterator);
                n |= aMA.c((aea_1)((Object)object));
            }
            aDM.a(this.bM.player.connection, new C15PacketClientSettings(this.gameSettings, this.bp, this.b2, this.ax, n));
        }
    }

    public int e() {
        if (!NovolineInvoker.b(NovolineInvoker.getInstance())) {
            Camera camera = (Camera)ModuleInvoker.isEnable(ModuleRegistry.CAMERA);
            TargetStrafe targetStrafe = (TargetStrafe)ModuleInvoker.isEnable(ModuleRegistry.TARGETSTRAFE);
            if (alf_2.d(camera) || azd_2.b(targetStrafe)) {
                return 1;
            }
        }
        return this.am;
    }

    public void a(aea_1 aea_12) {
        if (!aS0.c(this.m(), (Object)aea_12)) {
            aS0.b(this.a6, (Object)aea_12);
        } else {
            aS0.a(this.a6, (Object)aea_12);
        }
        this.d();
    }

    public void a(aj2 aj22, int n) {
        this.b(aj22, n);
        if (aj22 == aj2.INVERT_MOUSE) {
            boolean bl = this.l = !this.l;
        }
        if (aj22 == aj2.GUI_SCALE) {
            this.z = this.z + n & 3;
            int n2 = this.z = this.z == 0 ? 1 : this.z;
        }
        if (aj22 == aj2.PARTICLES) {
            this.br = (this.br + n) % 3;
        }
        if (aj22 == aj2.VIEW_BOBBING) {
            boolean bl = this.aR = !this.aR;
        }
        if (aj22 == aj2.RENDER_CLOUDS) {
            this.by = (this.by + n) % 3;
        }
        if (aj22 == aj2.FORCE_UNICODE_FONT) {
            this.bN = !this.bN;
            FontRendererInvoker.setUnicodeFlag(this.bM.fontRendererObj, ad2_0.b(MCInvoker.i(this.bM)) || this.bN);
        }
        if (aj22 == aj2.FBO_ENABLE) {
            boolean bl = this.a8 = !this.a8;
        }
        if (aj22 == aj2.ANAGLYPH) {
            if (!this.bV && ys_2.aC()) {
                ys_2.b(IN.a(aFC.gx), IN.a(aFC.fA));
                return;
            }
            this.bV = !this.bV;
            MCInvoker.w(this.bM);
        }
        if (aj22 == aj2.GRAPHICS) {
            this.a4 = !this.a4;
            this.g();
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.AMBIENT_OCCLUSION) {
            this.k = (this.k + n) % 3;
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.CHAT_VISIBILITY) {
            this.b2 = ani_2.a((ani_2.b(this.b2) + n) % 3);
        }
        if (aj22 == aj2.STREAM_COMPRESSION) {
            this.b3 = (this.b3 + n) % 3;
        }
        if (aj22 == aj2.STREAM_SEND_METADATA) {
            boolean bl = this.t = !this.t;
        }
        if (aj22 == aj2.STREAM_CHAT_ENABLED) {
            this.at = (this.at + n) % 3;
        }
        if (aj22 == aj2.STREAM_CHAT_USER_FILTER) {
            this.bi = (this.bi + n) % 3;
        }
        if (aj22 == aj2.STREAM_MIC_TOGGLE_BEHAVIOR) {
            this.aX = (this.aX + n) % 2;
        }
        if (aj22 == aj2.CHAT_COLOR) {
            boolean bl = this.ax = !this.ax;
        }
        if (aj22 == aj2.CHAT_LINKS) {
            boolean bl = this.aq = !this.aq;
        }
        if (aj22 == aj2.CHAT_LINKS_PROMPT) {
            boolean bl = this.bF = !this.bF;
        }
        if (aj22 == aj2.SNOOPER_ENABLED) {
            boolean bl = this.b0 = !this.b0;
        }
        if (aj22 == aj2.TOUCHSCREEN) {
            boolean bl = this.Y = !this.Y;
        }
        if (aj22 == aj2.USE_FULLSCREEN) {
            boolean bl = this.bB = !this.bB;
            if (MCInvoker.u(this.bM) != this.bB) {
                MCInvoker.Z(this.bM);
            }
        }
        if (aj22 == aj2.ENABLE_VSYNC) {
            this.x = !this.x;
            DisplayInvoker.setVSyncEnabled(this.x);
        }
        if (aj22 == aj2.USE_VBO) {
            this.aQ = !this.aQ;
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.BLOCK_ALTERNATIVES) {
            this.aV = !this.aV;
            jv_0.m(this.bM.renderGlobal);
        }
        if (aj22 == aj2.REDUCED_DEBUG_INFO) {
            boolean bl = this.az = !this.az;
        }
        if (aj22 == aj2.ENTITY_SHADOWS) {
            this.p = !this.p;
        }
        this.f();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void f() {
        Object object;
        if (aC8.b(ail_0.l) && aDb.e(object = aDb.f(ail_0.ah, new Object[0]), ail_0.de, new Object[0])) {
            return;
        }
        try {
            object = new PrintWriter(new FileWriter(this.Q));
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.bv), this.l).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.fj), this.aw).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.ep), (this.aD - 70.0f) / 40.0f).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.e6), this.aE).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.gY), this.ce).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.d5), this.bp).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.gq), this.z).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.hQ), this.br).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.gT), this.aR).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.dD), this.bV).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.hI), this.bI).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.fI), this.a8).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.hA), aYj.a(this.aG)).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.br), this.a4).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.cP), this.k).toString());
            switch (this.by) {
                case 0: {
                    aO6.a((PrintWriter)object, aFC.hD);
                    break;
                }
                case 1: {
                    aO6.a((PrintWriter)object, aFC.fv);
                    break;
                }
                case 2: {
                    aO6.a((PrintWriter)object, aFC.dM);
                    break;
                }
            }
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.eW), a4W.a(bA, this.bg)).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.cq), a4W.a(bA, this.bY)).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.bc), this.ba).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.g8), this.gameSettings).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.hR), ani_2.b(this.b2)).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.eN), this.ax).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.gh), this.aq).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.dH), this.bF).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.a9), this.I).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.cz), this.b0).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.gK), this.bB).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.cb), this.x).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.fy), this.aQ).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.gB), this.i).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.hy), this.bm).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.v), this.O).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.g2), this.Y).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.M), this.b).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.ec), this.overrideHeight).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.eK), this.w).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.cQ), this.ai).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.bp), this.av).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.e), this.af).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.cO), this.ao).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.dF), this.b9).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.an), this.F).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.gR), this.bu).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.ah), this.ap).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.go), this.bn).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.cu), this.b_).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.fk), this.bb).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.k), this.b3).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.fH), this.t).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.ar), this.H).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.au), this.at).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.ct), this.bi).toString());
            aO6.a((PrintWriter)object, aL0.c(aL0.a(new StringBuilder(), aFC.bD), this.aX).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.ge), this.bN).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.a1), this.aV).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.dl), this.az).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.av), this.bl).toString());
            aO6.a((PrintWriter)object, aL0.a(aL0.a(new StringBuilder(), aFC.fp), this.p).toString());
            for (aII aII2 : this.aP) {
                aO6.a((PrintWriter)object, aL0.c(aL0.a(aL0.a(aL0.a(new StringBuilder(), aFC.gA), GameSettingsInvoker.f(aII2)), aFC.hr), GameSettingsInvoker.getKeyCode(aII2)).toString());
            }
            for (N6 n6 : N6.values()) {
                aO6.a((PrintWriter)object, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aFC.el), wt_0.b(n6)), aFC.cf), this.a(n6)).toString());
            }
            for (aea_1 aea_12 : aea_1.values()) {
                aO6.a((PrintWriter)object, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), aFC.fP), aMA.d(aea_12)), aFC.dC), aS0.c(this.a6, (Object)aea_12)).toString());
            }
            aO6.a((PrintWriter)object);
        }
        catch (Exception exception) {
            LoggerInvoker.a(aW, aFC.ex, exception);
        }
        this.a();
        this.d();
    }

    public String d(aj2 aj22) {
        String string = this.b(aj22);
        return string;
    }

    public void a(int n) {
        this.am = n;
    }

    public void a(boolean bl) {
        int n;
        this.bh = n = 0;
        this.bP = n;
        this.o = bl;
        this.bZ = bl;
        this.as = bl;
        this.bT = bl;
        this.ay = bl;
        this.bS = bl;
        this.R = bl;
        this.D = bl;
        this.bG = bl;
        this.au = bl;
        this.e = bl;
        this.bk = bl;
        this.br = 0;
        this.v = bl;
        this.d = bl;
        this.b8 = bl;
    }

    /*
     * Exception decompiling
     */
    public void j() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 80[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Exception decompiling
     */
    public void c() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [1[TRYBLOCK]], but top level block is 134[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static Exception a(Exception exception) {
        return exception;
    }
}

