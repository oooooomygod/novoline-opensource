/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.FontRendererInvoker;
import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SysInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.GameSettings;
import deobf.GuiScreen;
import deobf.MCInvoker;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Iterator;
import net.minecraft.client.Minecraft;

public class S7
extends GuiScreen {
    private static float[] v;
    private int w = -1;
    protected GuiScreen G;
    public static int B = 1;
    protected String z = dy_1.a;
    private static float[] D;
    public static int I = 2;
    public static int y = 4;
    private a8o_0 x;
    private boolean E = false;
    public static int C = 3;
    private static String[] H;
    public static int F = 0;
    private static String[] A;

    public static String a(int n) {
        a0D.k();
        return n == 2 ? dy_1.c : (n == 4 ? dy_1.E : IN.b());
    }

    @Override
    public void i() {
        super.i();
        if (!this.E) {
            a3c_0.k();
        }
    }

    public static String a(boolean bl) {
        String string = IN.d();
        IN.b();
        return string;
    }

    @Override
    public void g() {
        super.g();
        --this.w;
    }

    public Minecraft a() {
        return this.t;
    }

    @Override
    public void a(int n, int n2, float f) {
        a0D.k();
        this.h();
        this.x.a(n, n2, f);
        if (this.w <= 0) {
            this.x.c();
            this.w += 20;
        }
        this.b(this.q, aL0.a(aL0.a(new StringBuilder(), this.z), dy_1.b).toString(), this.n / 2, 15, 0xFFFFFF);
        String string = aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), dy_1.g), aVE.dP), dy_1.f), aVE.a), dy_1.H), aVE.am).toString();
        int n3 = FontRendererInvoker.a(this.q, string);
        if (n3 < this.n - 5) {
            this.b(this.q, string, this.n / 2, this.f - 40, 0x808080);
        }
        this.a(this.q, string, 5, this.f - 40, 0x808080);
        super.a(n, n2, f);
    }

    public void a(String string, int n, int n2, int n3) {
        this.b(this.q, string, n, n2, n3);
    }

    @Override
    protected void a(QG qG) {
        a0D.k();
        if (qG.g) {
            Object object;
            Object object2;
            if (qG instanceof qm_0) {
                object2 = (qm_0)qG;
                switch (agk_1.a[a0c.b((qm_0)object2).ordinal()]) {
                    case 1: {
                        a3c_0.p();
                        a3c_0.M();
                    }
                    case 2: {
                        aVE.ci = false;
                        a3c_0.M();
                        MCInvoker.o(this.t);
                    }
                    case 3: {
                        aVE.r = false;
                        a3c_0.M();
                        MCInvoker.o(this.t);
                    }
                    case 4: {
                        float f = aVE.aB;
                        object = D;
                        int n = S7.a(f, (float[])object);
                        if (S7.j()) {
                            --n;
                            n = ((Object)object).length - 1;
                        }
                        if (++n >= ((Object)object).length) {
                            n = 0;
                        }
                        aVE.aB = (float)object[n];
                        a3c_0.M();
                        a3c_0.F();
                    }
                    case 5: {
                        float f = aVE.bA;
                        float[] fArray = D;
                        int n = S7.a(f, fArray);
                        if (S7.j()) {
                            --n;
                            n = fArray.length - 1;
                        }
                        if (++n >= fArray.length) {
                            n = 0;
                        }
                        aVE.bA = fArray[n];
                        a3c_0.M();
                        a3c_0.ac();
                    }
                    case 6: {
                        float f = aVE.bV;
                        float[] fArray = v;
                        int n = S7.a(f, fArray);
                        if (S7.j()) {
                            --n;
                            n = fArray.length - 1;
                        }
                        if (++n >= fArray.length) {
                            n = 0;
                        }
                        aVE.bV = fArray[n];
                        a3c_0.M();
                    }
                    case 7: {
                        aLR.g(aVE.cn);
                        a3c_0.M();
                    }
                    case 8: {
                        aLR.g(aVE.dg);
                        a3c_0.Q();
                        a3c_0.M();
                        MCInvoker.o(this.t);
                    }
                    case 9: {
                        aVE.ea = !aVE.ea;
                    }
                    case 10: {
                        aVE.bE = !aVE.bE;
                    }
                    case 11: {
                        aVE.dm = aVE.ar = (aVE.db = (aVE.db + 1) % 3);
                        qG.k = aL0.a(aL0.a(new StringBuilder(), dy_1.i), aVE.a_[aVE.db]).toString();
                        OL.b();
                    }
                    case 12: {
                        aVE.cM = (aVE.cM + 1) % 2;
                        qG.k = aL0.a(aL0.a(new StringBuilder(), dy_1.P), aVE.bZ[aVE.cM]).toString();
                        OL.b();
                    }
                    case 13: {
                        aVE.au = (aVE.au + 1) % 2;
                        qG.k = aL0.a(aL0.a(new StringBuilder(), dy_1.A), aVE.bZ[aVE.au]).toString();
                        OL.b();
                    }
                    case 14: {
                        aVE.bS = !aVE.bS;
                        qG.k = aL0.a(aL0.a(new StringBuilder(), dy_1.K), S7.a(aVE.bS)).toString();
                        OL.b();
                    }
                }
                a0c.a((qm_0)object2);
            }
            switch (qG.m) {
                case 201: {
                    switch (S7.b()) {
                        case 1: {
                            object2 = StringInvoker.a(dy_1.M, new Object[]{zq_2.j(aVE.ak)});
                            try {
                                als_2.a(als_2.a(), (String)object2);
                                return;
                            }
                            catch (IOException iOException) {
                                a4E.b(iOException);
                            }
                        }
                        case 2: {
                            try {
                                als_2.a(als_2.a(), new String[]{dy_1.d, zq_2.j(aVE.ak)});
                                return;
                            }
                            catch (IOException iOException) {
                                a4E.b(iOException);
                            }
                        }
                    }
                    boolean bl = false;
                    try {
                        Class clazz = ara_2.a(dy_1.q);
                        object = VT.a(ara_2.a(clazz, dy_1.r, new Class[0]), null, new Object[0]);
                        VT.a(ara_2.a(clazz, dy_1.v, new Class[]{URI.class}), object, new Object[]{zq_2.l(new File(this.t.mcDataDir, dy_1.p))});
                    }
                    catch (Throwable throwable) {
                        aWR.c(throwable);
                        bl = true;
                    }
                    ys_2.a(dy_1.n);
                    SysInvoker.a(aL0.a(aL0.a(new StringBuilder(), dy_1.z), zq_2.j(aVE.ak)).toString());
                }
                case 202: {
                    a3c_0.k();
                    this.E = true;
                    MCInvoker.displayGuiScreen(this.t, this.G);
                }
                case 203: {
                    sx_0 sx_02 = new sx_0(this, ys_2.ax());
                    MCInvoker.displayGuiScreen(ys_2.at(), sx_02);
                }
                case 210: {
                    try {
                        object = ara_2.a(dy_1.x);
                        Object object3 = VT.a(ara_2.a((Class)object, dy_1.J, new Class[0]), null, new Object[0]);
                        VT.a(ara_2.a((Class)object, dy_1.j, new Class[]{URI.class}), object3, new Object[]{new URI(dy_1.h)});
                        break;
                    }
                    catch (Throwable throwable) {
                        aWR.c(throwable);
                    }
                }
            }
            this.x.a(qG);
        }
    }

    @Override
    public void l() {
        this.z = I18n.format(dy_1.D, new Object[0]);
        if (aVE.be == null) {
            a3c_0.Y();
        }
        int n = 120;
        int n2 = 20;
        int n3 = this.n - n - 10;
        int n4 = 30;
        int n5 = 20;
        int n6 = this.n - n - 20;
        this.x = new a8o_0(this, n6, this.f, n4, this.f - 50, 16);
        this.x.c(7, 8);
        ListInvoker.add(this.l, new qm_0(axm_2.ANTIALIASING, n3, n4, n, n2));
        ListInvoker.add(this.l, new qm_0(axm_2.NORMAL_MAP, n3, n5 + n4, n, n2));
        ListInvoker.add(this.l, new qm_0(axm_2.SPECULAR_MAP, n3, 2 * n5 + n4, n, n2));
        ListInvoker.add(this.l, new qm_0(axm_2.RENDER_RES_MUL, n3, 3 * n5 + n4, n, n2));
        ListInvoker.add(this.l, new qm_0(axm_2.SHADOW_RES_MUL, n3, 4 * n5 + n4, n, n2));
        ListInvoker.add(this.l, new qm_0(axm_2.HAND_DEPTH_MUL, n3, 5 * n5 + n4, n, n2));
        ListInvoker.add(this.l, new qm_0(axm_2.OLD_HAND_LIGHT, n3, 6 * n5 + n4, n, n2));
        ListInvoker.add(this.l, new qm_0(axm_2.OLD_LIGHTING, n3, 7 * n5 + n4, n, n2));
        int n7 = MathInvoker.b(150, n6 / 2 - 10);
        ListInvoker.add(this.l, new QG(201, n6 / 4 - n7 / 2, this.f - 25, n7, n2, IN.a(dy_1.k)));
        ListInvoker.add(this.l, new QG(202, n6 / 4 * 3 - n7 / 2, this.f - 25, n7, n2, I18n.format(dy_1.C, new Object[0])));
        ListInvoker.add(this.l, new QG(203, n3, this.f - 25, n, n2, IN.a(dy_1.m)));
        this.d();
    }

    public void d() {
        a0D.k();
        boolean bl = ys_2.aC();
        Iterator iterator = ListInvoker.iterator(this.l);
        if (dz_0.c(iterator)) {
            QG qG = (QG)dz_0.b(iterator);
            if (qG.m != 201 && qG.m != 202 && qG.m != axm_2.ANTIALIASING.ordinal()) {
                qG.g = bl;
            }
        }
    }

    public static int b() {
        a0D.r();
        String string = StringInvoker.i(SystemInvoker.c(dy_1.e));
        return StringInvoker.a(string, (CharSequence)dy_1.u) ? 1 : (StringInvoker.a(string, (CharSequence)dy_1.F) ? 2 : (StringInvoker.a(string, (CharSequence)dy_1.o) ? 3 : (StringInvoker.a(string, (CharSequence)dy_1.s) ? 3 : (StringInvoker.a(string, (CharSequence)dy_1.G) ? 4 : (StringInvoker.a(string, (CharSequence)dy_1.B) ? 4 : 0)))));
    }

    public static String b(float f) {
        return S7.a(f, v, H);
    }

    public static String a(float f) {
        return S7.a(f, D, A);
    }

    public static String a(float f, float[] fArray, String[] stringArray) {
        int n = S7.a(f, fArray);
        return stringArray[n];
    }

    public S7(GuiScreen guiScreen, GameSettings gameSettings) {
        this.G = guiScreen;
    }

    @Override
    public void c() throws IOException {
        super.c();
        this.x.g();
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static int a(float f, float[] fArray) {
        a0D.k();
        int n = 0;
        if (n < fArray.length) {
            float f2 = fArray[n];
            if (f2 >= f) {
                return n;
            }
            ++n;
        }
        return fArray.length - 1;
    }

    static {
        D = new float[]{0.5f, 0.70710677f, 1.0f, 1.4142135f, 2.0f};
        A = new String[]{dy_1.L, dy_1.I, dy_1.w, dy_1.O, dy_1.y};
        v = new float[]{0.0625f, 0.125f, 0.25f};
        H = new String[]{dy_1.t, dy_1.N, dy_1.l};
    }
}

