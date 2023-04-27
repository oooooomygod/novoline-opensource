/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.StringInvoker;
import cc.novoline.invoke.SystemInvoker;
import deobf.MCInvoker;
import net.minecraft.renderer.texture.TextureMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Properties;

/*
 * Renamed from net.aZp
 */
public class azp_0 {
    public static int f = 9;
    public boolean S = false;
    public int[] d = null;
    public il_0[] X = null;
    public static int j = 2;
    public int p = 0;
    public static int U = 4;
    public KM[] V = null;
    public int F = 1;
    public static int I = 2;
    public int[] a = null;
    public static int L = 4;
    public static int i = 32;
    public String[] b = null;
    public static int y = 6;
    public static int K = 1;
    public static int k = 8;
    public int R = 0;
    public static int G = 1;
    public static int T = 16;
    public aP2[] o = null;
    public String[] c = null;
    public static int D = 7;
    public static int W = 1;
    public static int z = 63;
    public static int t = 8;
    public int[] Q = null;
    public int H = 0;
    public static int B = 6;
    public int h = 1024;
    public static int N = 1;
    public static int O = 3;
    public String e = null;
    public static int l = 128;
    public int C = 1;
    public static int P = 2;
    public String r = null;
    public static int J = 0;
    public static int n = 60;
    public KM[] q = null;
    public static int g = 0;
    public static int x = 5;
    public static int m = 2;
    public int v = 63;
    public int A = 0;
    public int w = 0;
    public static int u = 128;
    public static int E = 3;
    public int M = 0;
    public static int s = 128;

    public boolean a(int n, int n2) {
        aP2.b();
        return !az9_0.a(n, n2, this.o) ? false : az9_0.a(n2, this.d);
    }

    private boolean h(String string) {
        aP2.b();
        if (this.b == null) {
            this.b = this.i(auf_0.W);
        }
        if (this.b.length != 1) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.Z), string).toString());
            return false;
        }
        return true;
    }

    public boolean a(il_0 il_02) {
        return az9_0.a(il_02, this.X);
    }

    private boolean t(String string) {
        aP2.b();
        if (this.b == null) {
            this.b = this.i(auf_0.ax);
        }
        if (this.b.length < 47) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.f), string).toString());
            return false;
        }
        return true;
    }

    private static KM m(String string) {
        aP2.b();
        TextureMap textureMap = MCInvoker.f(MCInvoker.f());
        KM kM = h9.a(textureMap, string);
        if (kM != null) {
            return kM;
        }
        kM = h9.a(textureMap, aL0.a(aL0.a(new StringBuilder(), auf_0.aw), string).toString());
        return kM;
    }

    private boolean k(String string) {
        aP2.b();
        if (this.b == null) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aO), string).toString());
            return false;
        }
        if (this.p > 0 && this.p <= 16) {
            if (this.R > 0 && this.R <= 16) {
                if (this.b.length != this.p * this.R) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.S), string).toString());
                    return false;
                }
                return true;
            }
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aQ), string).toString());
            return false;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.o), string).toString());
        return false;
    }

    private static String b(String string) {
        StringInvoker.c(string, 47);
        return auf_0.i;
    }

    private static int n(String string) {
        aP2.b();
        if (string == null) {
            return 1;
        }
        if (!string.equals(auf_0.aH) && !string.equals(auf_0.ai)) {
            if (!string.equals(auf_0.aN) && !string.equals(auf_0.ac)) {
                if (string.equals(auf_0.aW)) {
                    return 6;
                }
                if (string.equals(auf_0.a0)) {
                    return 3;
                }
                if (string.equals(auf_0.l)) {
                    return 4;
                }
                if (string.equals(auf_0.D)) {
                    return 5;
                }
                if (string.equals(auf_0.U)) {
                    return 7;
                }
                if (!string.equals(auf_0.ae) && !string.equals(auf_0.aB)) {
                    if (!string.equals(auf_0.aY) && !string.equals(auf_0.aC)) {
                        ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.af), string).toString());
                        return 0;
                    }
                    return 9;
                }
                return 8;
            }
            return 2;
        }
        return 1;
    }

    private boolean g(String string) {
        aP2.b();
        if (this.b == null) {
            this.b = this.i(auf_0.aj);
        }
        if (this.b.length != 4) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.A), string).toString());
            return false;
        }
        return true;
    }

    public int b() {
        int n;
        aP2.b();
        int n2 = -1;
        n2 = this.a(this.d, n2);
        if (this.o != null && (n = 0) < this.o.length) {
            aP2 aP22 = this.o[n];
            n2 = this.a(AM.a(aP22), n2);
            ++n;
        }
        return n2;
    }

    private static int s(String string) {
        aP2.b();
        if (string == null) {
            return 1;
        }
        if (string.equals(auf_0.F)) {
            return 2;
        }
        if (string.equals(auf_0.n)) {
            return 6;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aE), string).toString());
        return 1;
    }

    private static int j(String string) {
        aP2.b();
        if (string == null) {
            return 0;
        }
        if (string.equals(auf_0.ah)) {
            return 1;
        }
        if (string.equals(auf_0.aM)) {
            return 2;
        }
        if (string.equals(auf_0.aU)) {
            return 3;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.as), string).toString());
        return 128;
    }

    public boolean a(String string) {
        aP2.b();
        if (this.e != null && StringInvoker.c(this.e) > 0) {
            if (this.r == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aD), string).toString());
                return false;
            }
            if (this.o == null) {
                this.o = this.c();
            }
            if (this.c == null && this.o == null) {
                this.c = this.a();
            }
            if (this.o == null && this.c == null) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.Q), string).toString());
                return false;
            }
            if (this.w == 0) {
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aI), string).toString());
                return false;
            }
            if (this.b != null && this.b.length > 0) {
                if (this.H == 0) {
                    this.H = this.e();
                }
                if (this.H == 128) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.E), string).toString());
                    return false;
                }
                if (this.A > 0) {
                    ys_2.d(aL0.c(aL0.a(new StringBuilder(), auf_0.am), this.A).toString());
                    return false;
                }
                if ((this.v & 0x80) != 0) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.O), string).toString());
                    return false;
                }
                if ((this.F & 0x80) != 0) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.x), string).toString());
                    return false;
                }
                switch (this.w) {
                    case 1: {
                        return this.t(string);
                    }
                    case 2: {
                        return this.g(string);
                    }
                    case 3: {
                        return this.h(string);
                    }
                    case 4: {
                        return this.l(string);
                    }
                    case 5: {
                        return this.k(string);
                    }
                    case 6: {
                        return this.q(string);
                    }
                    case 7: {
                        return this.d(string);
                    }
                    case 8: {
                        return this.p(string);
                    }
                    case 9: {
                        return this.e(string);
                    }
                }
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.k), string).toString());
                return false;
            }
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.ao), string).toString());
            return false;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.a1), string).toString());
        return false;
    }

    private static String r(String string) {
        aP2.b();
        String string2 = string;
        int n = StringInvoker.c(string, 47);
        if (n >= 0) {
            string2 = StringInvoker.a(string, n + 1);
        }
        int n2 = StringInvoker.c(string2, 46);
        string2 = StringInvoker.b(string2, 0, n2);
        return string2;
    }

    public void a(TextureMap textureMap) {
        aP2.b();
        if (this.c != null) {
            this.V = azp_0.a(this.c, textureMap);
        }
        if (this.b != null) {
            this.q = azp_0.a(this.b, textureMap);
        }
    }

    private static int c(String string) {
        aP2.b();
        string = StringInvoker.i(string);
        if (!string.equals(auf_0.aF) && !string.equals(auf_0.ap)) {
            if (!string.equals(auf_0.s) && !string.equals(auf_0.t)) {
                if (string.equals(auf_0.K)) {
                    return 4;
                }
                if (string.equals(auf_0.az)) {
                    return 8;
                }
                if (string.equals(auf_0.aX)) {
                    return 32;
                }
                if (string.equals(auf_0.j)) {
                    return 16;
                }
                if (string.equals(auf_0.at)) {
                    return 60;
                }
                if (string.equals(auf_0.ag)) {
                    return 63;
                }
                ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.I), string).toString());
                return 128;
            }
            return 2;
        }
        return 1;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), auf_0.N), this.e), auf_0.L), this.r), auf_0.aJ), ys_2.a(this.o)), auf_0.Y), ys_2.a(this.c)).toString();
    }

    private boolean e(String string) {
        aP2.b();
        if (this.b == null) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.m), string).toString());
            return false;
        }
        if (this.b.length != 7) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.q), string).toString());
            return false;
        }
        return true;
    }

    private static int f(String string) {
        aP2.b();
        if (string == null) {
            return 63;
        }
        String[] stringArray = ys_2.a(string, auf_0.aT);
        int n = 0;
        int n2 = 0;
        if (n2 < stringArray.length) {
            String string2 = stringArray[n2];
            int n3 = azp_0.c(string2);
            n |= n3;
            ++n2;
        }
        return n;
    }

    private static KM[] a(String[] stringArray, TextureMap textureMap) {
        aP2.b();
        return null;
    }

    private aP2[] c() {
        aP2.b();
        int[] nArray = this.d();
        if (nArray == null) {
            return null;
        }
        int n = 0;
        aP2[] aP2Array = new aP2[nArray.length];
        if (n < aP2Array.length) {
            aP2Array[n] = new aP2(nArray[n]);
            ++n;
        }
        return aP2Array;
    }

    private int[] d() {
        int[] nArray;
        char c;
        aP2.b();
        if (!StringInvoker.e(this.e, auf_0.u)) {
            return null;
        }
        int n = StringInvoker.c(auf_0.y);
        int n2 = n;
        if (n2 < StringInvoker.c(this.e) && (c = StringInvoker.b(this.e, n2)) >= '0') {
            if (c > '9') {
                // empty if block
            }
            ++n2;
        }
        if (n2 == n) {
            return null;
        }
        String string = StringInvoker.b(this.e, n, n2);
        int n3 = ys_2.a(string, -1);
        if (n3 < 0) {
            nArray = null;
        } else {
            int[] nArray2 = new int[1];
            nArray = nArray2;
            nArray2[0] = n3;
        }
        return nArray;
    }

    public azp_0(Properties properties, String string) {
        kn_0 kn_02 = new kn_0(auf_0.ad);
        this.e = kn_02.d(string);
        this.r = kn_02.b(string);
        this.o = aNT.c(kn_02, dk_1.a(properties, auf_0.aS));
        this.d = aNT.b(kn_02, dk_1.a(properties, auf_0.h));
        this.c = this.o(dk_1.a(properties, auf_0.G));
        this.w = azp_0.n(dk_1.a(properties, auf_0.c));
        this.b = this.i(dk_1.a(properties, auf_0.J));
        this.H = azp_0.j(dk_1.a(properties, auf_0.aV));
        this.v = azp_0.f(dk_1.a(properties, auf_0.ar));
        this.X = aNT.d(kn_02, dk_1.a(properties, auf_0.e));
        this.M = aNT.a(kn_02, dk_1.a(properties, auf_0.ab), -1);
        this.h = aNT.a(kn_02, dk_1.a(properties, auf_0.ay), 1024);
        this.A = aNT.a(kn_02, dk_1.a(properties, auf_0.r));
        this.S = aNT.a(dk_1.a(properties, auf_0.aP));
        this.p = aNT.a(kn_02, dk_1.a(properties, auf_0.aK));
        this.R = aNT.a(kn_02, dk_1.a(properties, auf_0.a));
        this.a = aNT.b(kn_02, dk_1.a(properties, auf_0.a3));
        this.F = azp_0.s(dk_1.a(properties, auf_0.B));
    }

    private boolean q(String string) {
        aP2.b();
        if (this.b == null) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.C), string).toString());
            return false;
        }
        if (this.b.length != 4) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aZ), string).toString());
            return false;
        }
        return true;
    }

    public boolean a(KM kM) {
        return az9_0.a(kM, this.V);
    }

    private boolean d(String string) {
        aP2.b();
        if (this.b == null) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aL), string).toString());
            return false;
        }
        if (this.b.length != 1) {
            ys_2.d(auf_0.p);
            return false;
        }
        return true;
    }

    private int a(int[] nArray, int n) {
        aP2.b();
        return n;
    }

    private String[] o(String string) {
        aP2.b();
        if (string == null) {
            return null;
        }
        int n = 0;
        String[] stringArray = ys_2.a(string, auf_0.V);
        if (n < stringArray.length) {
            String string2 = stringArray[n];
            if (StringInvoker.c(string2, auf_0.al)) {
                string2 = StringInvoker.b(string2, 0, StringInvoker.c(string2) - 4);
            }
            stringArray[n] = string2 = aH3.a(string2, this.r);
            ++n;
        }
        return stringArray;
    }

    private boolean p(String string) {
        aP2.b();
        if (this.b == null) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.M), string).toString());
            return false;
        }
        if (this.b.length != 7) {
            ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.aG), string).toString());
            return false;
        }
        return true;
    }

    private boolean l(String string) {
        aP2.b();
        if (this.b != null && this.b.length > 0) {
            if (this.a != null) {
                int n;
                int[] nArray;
                if (this.a.length > this.b.length) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.T), string).toString());
                    nArray = new int[this.b.length];
                    SystemInvoker.a(this.a, 0, nArray, 0, nArray.length);
                    this.a = nArray;
                }
                if (this.a.length < this.b.length) {
                    ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.w), string).toString());
                    nArray = new int[this.b.length];
                    SystemInvoker.a(this.a, 0, nArray, 0, this.a.length);
                    n = aot_1.a(this.a);
                    int n2 = this.a.length;
                    if (n2 < nArray.length) {
                        nArray[n2] = n;
                        ++n2;
                    }
                    this.a = nArray;
                }
                this.Q = new int[this.a.length];
                int n3 = 0;
                n = 0;
                if (n < this.a.length) {
                    this.Q[n] = n3 += this.a[n];
                    ++n;
                }
                this.C = n3;
                if (this.C <= 0) {
                    ys_2.d(aL0.c(aL0.a(new StringBuilder(), auf_0.aq), n3).toString());
                    this.C = 1;
                }
            }
            return true;
        }
        ys_2.d(aL0.a(aL0.a(new StringBuilder(), auf_0.av), string).toString());
        return false;
    }

    private int e() {
        aP2.b();
        return this.o != null ? 1 : (this.c != null ? 2 : 128);
    }

    private String[] a() {
        azp_0.m(this.e);
        return null;
    }

    public static a4_0 a(String string, Collection collection) {
        Object object;
        aP2.b();
        Iterator iterator = ms_0.a(collection);
        if (dz_0.c(iterator) && string.equals(aPS.a((a4_0)(object = dz_0.b(iterator))))) {
            return (a4_0)object;
        }
        return null;
    }

    private String[] i(String string) {
        aP2.b();
        return null;
    }

    public boolean a(int n) {
        return az9_0.a(n, this.o);
    }
}

