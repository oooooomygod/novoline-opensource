/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.ListInvoker;
import cc.novoline.invoke.StringInvoker;
import deobf.MCInvoker;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.D2;
import net.PB;
import net.Q6;
import net.XF;
import net.Z;
import net.a0X;
import net.a4E;
import net.a5K;
import net.aL0;
import net.aRS;
import net.abf_2;
import net.ajJ;
import net.ala_1;
import net.asy_0;
import net.auq_0;
import net.axx_1;
import net.ea_1;
import net.rr_1;
import net.tl_0;
import net.w8_0;
import net.zq_2;

public class aPP {
    public static int a;
    public String e;
    public String c;
    public static File g;
    public String f;
    public static List<aPP> h;
    public static List<PB> d;
    public String b;

    public static String a(String string, String string2) {
        D2.b();
        string2 = StringInvoker.b(string2, string, Z.aP);
        if (StringInvoker.a(string2, (CharSequence)Z.o)) {
            string2 = StringInvoker.a(string2, Z.P, Z.T);
        }
        if (StringInvoker.a(string2, (CharSequence)Z.w)) {
            string2 = StringInvoker.a(string2, (CharSequence)Z.ay, (CharSequence)Z.a0);
        }
        string2 = StringInvoker.h(string2);
        return string2;
    }

    public void f() throws IOException {
        String string;
        D2.b();
        if (this.f == null) {
            ListInvoker.clear(d);
            return;
        }
        File file = new File(g, this.f);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(zq_2.j(file)));
        ListInvoker.clear(d);
        String string2 = Z.aH;
        String string3 = auq_0.c(bufferedReader);
        if (StringInvoker.e(string3, Z.aq)) {
            string = string3;
            string = aPP.a(Z.g, string);
            ListInvoker.add(d, new PB(StringInvoker.i(string)));
        }
        if (StringInvoker.a(string3, (CharSequence)Z.ax)) {
            string = string3;
            string2 = aPP.a(Z.au, string);
        }
        if (StringInvoker.a(string3, (CharSequence)Z.Y)) {
            // empty if block
        }
        if (StringInvoker.a(string3, (CharSequence)Z.s)) {
            // empty if block
        }
        if (StringInvoker.a(string3, (CharSequence)Z.t) && ListInvoker.size(d) > 0) {
            ListInvoker.add(((PB)ListInvoker.get(aPP.d, (int)(ListInvoker.size(aPP.d) - 1))).b, aPP.b(string2, string3));
        }
        string3 = auq_0.c(bufferedReader);
        auq_0.a(bufferedReader);
        int n = 0;
        if (n < ListInvoker.size(d)) {
            ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), Z.I), ((PB)ListInvoker.get(aPP.d, (int)n)).a).toString());
            int n2 = 0;
            if (n2 < ListInvoker.size(((PB)ListInvoker.get(aPP.d, (int)n)).b)) {
                ea_1.a(System.out, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), Z.a8), ((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).f), Z.ae), ((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).h), Z.ad), ((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).d.name()), Z.aK), ((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).a != null ? ((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).a.name() : Z.am), ((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).g != null ? ((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).g.name() : Z.aV).toString());
                int n3 = 0;
                if (n3 < ListInvoker.size(((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).c)) {
                    w8_0 w8_02 = (w8_0)ListInvoker.get(((D2)ListInvoker.get(((PB)ListInvoker.get(aPP.d, (int)n)).b, (int)n2)).c, n3);
                    ea_1.a(System.out, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), Z.aQ), w8_02.b.name()), Z.a3), w8_02.a != null ? w8_02.a : axx_1.a(w8_02.c)), Z.aS).toString());
                    ++n3;
                }
                ++n2;
            }
            ++n;
        }
    }

    public void d() throws IOException {
        int n;
        D2.b();
        String string = Z.D;
        if (this.f == null) {
            this.f = aPP.a(this.b);
        }
        if ((n = 0) < ListInvoker.size(d)) {
            ++n;
            ListInvoker.b(new ListInvoker[2]);
        }
        File file = new File(g, aL0.a(aL0.a(new StringBuilder(), this.f), Z.ao).toString());
        zq_2.i(file);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        abf_2.a(bufferedWriter, aL0.a(aL0.a(aL0.a(new StringBuilder(), Z.U), this.b), Z.aw).toString());
        abf_2.a(bufferedWriter, aL0.a(aL0.a(aL0.a(new StringBuilder(), Z.a1), this.c), Z.aO).toString());
        abf_2.a(bufferedWriter, aL0.a(aL0.a(aL0.a(new StringBuilder(), Z.C), this.e), Z.j).toString());
        abf_2.b(bufferedWriter);
        int n2 = 0;
        if (n2 < ListInvoker.size(d)) {
            PB pB = (PB)ListInvoker.get(d, n2);
            abf_2.a(bufferedWriter, aL0.a(aL0.a(aL0.a(new StringBuilder(), Z.aI), pB.a), Z.av).toString());
            String string2 = null;
            int n3 = 0;
            if (n3 < ListInvoker.size(pB.b)) {
                D2 d2 = (D2)ListInvoker.get(pB.b, n3);
                if (ListInvoker.size(d2.c) > 0) {
                    if (string2 == null || !StringInvoker.d(string2, d2.f)) {
                        if (string2 != null) {
                            abf_2.a(bufferedWriter, aL0.a(aL0.a(new StringBuilder(), string), Z.y).toString());
                        }
                        abf_2.a(bufferedWriter, aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), Z.aZ), d2.f), Z.n).toString());
                        string2 = d2.f;
                    }
                    abf_2.a(bufferedWriter, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), string), string), Z.aU), d2.h), Z.M), d2.d == aRS.ROT ? Z.aC : (d2.d == aRS.SCALE ? Z.A : Z.J)), Z.ai), d2.a == ajJ.X ? Z.af : (d2.a == ajJ.Y ? Z.ap : (d2.a == ajJ.Z ? Z.ak : Z.aM))), Z.aB).toString());
                    int n4 = 0;
                    if (n4 < ListInvoker.size(d2.c)) {
                        w8_0 w8_02 = (w8_0)ListInvoker.get(d2.c, n4);
                        abf_2.a(bufferedWriter, w8_02.b == a0X.SET ? Z.aG : (w8_02.b == a0X.ADD ? Z.an : (w8_02.b == a0X.SUBSTRACT ? Z.a5 : (w8_02.b == a0X.MULTIPLY ? Z.aL : (w8_02.b == a0X.DIVIDE ? Z.B : Z.E)))));
                        abf_2.a(bufferedWriter, aL0.a(aL0.a(new StringBuilder(), Z.b), d2.g == asy_0.COS ? Z.aD : (d2.g == asy_0.SIN ? Z.H : Z.d)).toString());
                        abf_2.a(bufferedWriter, w8_02.a == null ? aL0.a(aL0.a(new StringBuilder(), Z.Q), w8_02.c).toString() : aL0.a(aL0.a(new StringBuilder(), Z.a6), w8_02.a).toString());
                        ++n4;
                    }
                    abf_2.a(bufferedWriter, aL0.a(aL0.a(new StringBuilder(), Z.S), d2.i).toString());
                    abf_2.b(bufferedWriter);
                    if (n3 == ListInvoker.size(pB.b) - 1) {
                        abf_2.a(bufferedWriter, aL0.a(aL0.a(new StringBuilder(), string), Z.m).toString());
                    }
                }
                ++n3;
            }
            abf_2.a(bufferedWriter, Z.O);
            ++n2;
        }
        abf_2.a(bufferedWriter);
    }

    public static void e() {
        g = new File(MCInvoker.f().mcDataDir, Z.h);
        D2.b();
        zq_2.p(g);
        a = 1;
        try {
            aPP.c();
            if (aPP.b() != null) {
                aPP.b().f();
            }
        }
        catch (IOException iOException) {
            a4E.b(iOException);
        }
    }

    public static aPP b() {
        D2.b();
        if (a > ListInvoker.size(h) - 1) {
            a = ListInvoker.size(h) - 1;
        }
        return (aPP)ListInvoker.get(h, a);
    }

    public static String a(String string) {
        String string2 = string;
        string2 = StringInvoker.i(string2);
        string2 = StringInvoker.a(string2, '.', ' ');
        string2 = StringInvoker.h(string2);
        string2 = StringInvoker.a(string2, (CharSequence)Z.aJ, (CharSequence)Z.ah);
        return aL0.a(aL0.a(new StringBuilder(), string2), Z.u).toString();
    }

    public static void a(rr_1 rr_12, String string, String string2) {
        D2.b();
        if (aPP.b(string) == null) {
            return;
        }
        Q6.a(aPP.b(string), (a5K)rr_12.q, string2, Z.aR);
        Q6.a(aPP.b(string), (a5K)rr_12.r, string2, Z.aN);
        Q6.a(aPP.b(string), (a5K)rr_12.j, string2, Z.F);
        Q6.a(aPP.b(string), (a5K)rr_12.h, string2, Z.N);
        Q6.a(aPP.b(string), (a5K)rr_12.o, string2, Z.c);
        Q6.a(aPP.b(string), (a5K)rr_12.l, string2, Z.aa);
        Q6.a(aPP.b(string), rr_12.L, string2, Z.v);
        Q6.a(aPP.b(string), rr_12.E, string2, Z.ar);
        Q6.a(aPP.b(string), rr_12.B, string2, Z.aF);
        Q6.a(aPP.b(string), rr_12.M, string2, Z.z);
        Q6.a(aPP.b(string), rr_12.A, string2, Z.e);
        Q6.a(aPP.b(string), rr_12.Q, string2, Z.a);
    }

    public static D2 b(String string, String string2) {
        D2.b();
        D2 d2 = new D2();
        d2.f = string;
        d2.h = Z.R;
        ArrayList arrayList = new ArrayList();
        ListInvoker.add(arrayList, new tl_0());
        String string3 = Z.az;
        boolean bl = false;
        int n = 0;
        if (n < StringInvoker.c(string2)) {
            if (StringInvoker.b(string2, n) == '@') {
                bl = true;
            }
            ++n;
        }
        string = StringInvoker.h(string);
        n = 0;
        if (n < ListInvoker.size(arrayList)) {
            ((tl_0)ListInvoker.get(arrayList, (int)n)).c = StringInvoker.h(((tl_0)ListInvoker.get(arrayList, (int)n)).c);
            if (StringInvoker.a(((tl_0)ListInvoker.get(arrayList, (int)n)).c, (CharSequence)Z.p)) {
                d2.g = asy_0.COS;
                ((tl_0)ListInvoker.get(arrayList, (int)n)).c = StringInvoker.a(((tl_0)ListInvoker.get(arrayList, (int)n)).c, Z.a9, Z.X);
                ((tl_0)ListInvoker.get(arrayList, (int)n)).c = StringInvoker.h(((tl_0)ListInvoker.get(arrayList, (int)n)).c);
            }
            if (StringInvoker.a(((tl_0)ListInvoker.get(arrayList, (int)n)).c, (CharSequence)Z.a_)) {
                d2.g = asy_0.SIN;
                ((tl_0)ListInvoker.get(arrayList, (int)n)).c = StringInvoker.a(((tl_0)ListInvoker.get(arrayList, (int)n)).c, Z.aX, Z.l);
                ((tl_0)ListInvoker.get(arrayList, (int)n)).c = StringInvoker.h(((tl_0)ListInvoker.get(arrayList, (int)n)).c);
            }
            if (StringInvoker.a(((tl_0)ListInvoker.get(arrayList, (int)n)).c, (CharSequence)Z.a2)) {
                ((tl_0)ListInvoker.get(arrayList, (int)n)).c = StringInvoker.a(((tl_0)ListInvoker.get(arrayList, (int)n)).c, (CharSequence)Z.L, (CharSequence)Z.r);
                ((tl_0)ListInvoker.get(arrayList, (int)n)).b = ((tl_0)ListInvoker.get(arrayList, (int)n)).c = StringInvoker.h(((tl_0)ListInvoker.get(arrayList, (int)n)).c);
                ((tl_0)ListInvoker.get(arrayList, (int)n)).c = Z.a7;
                ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), Z.W), ((tl_0)ListInvoker.get(arrayList, (int)n)).b).toString());
            }
            ((tl_0)ListInvoker.get(arrayList, (int)n)).a = StringInvoker.h(((tl_0)ListInvoker.get(arrayList, (int)n)).a);
            ea_1.a(System.out, aL0.a(aL0.a(aL0.a(aL0.a(aL0.a(new StringBuilder(), Z.ag), ((tl_0)ListInvoker.get(arrayList, (int)n)).c), Z.at), ((tl_0)ListInvoker.get(arrayList, (int)n)).a), Z.x).toString());
            ea_1.a(System.out, aL0.a(aL0.a(new StringBuilder(), Z.K), string2).toString());
            ListInvoker.add(d2.c, XF.a(new w8_0(ala_1.a(((tl_0)ListInvoker.get(arrayList, (int)n)).a), axx_1.a(((tl_0)ListInvoker.get(arrayList, (int)n)).c)), ((tl_0)ListInvoker.get(arrayList, (int)n)).b));
            ++n;
        }
        if (StringInvoker.a(string2, (CharSequence)Z.i)) {
            d2.d = aRS.ROT;
        }
        if (StringInvoker.a(string2, (CharSequence)Z.aY)) {
            d2.d = aRS.SCALE;
        }
        if (StringInvoker.a(string2, (CharSequence)Z.aA)) {
            d2.d = aRS.PREROT;
        }
        if (StringInvoker.a(string2, (CharSequence)Z.aW)) {
            d2.a = ajJ.X;
        }
        if (StringInvoker.a(string2, (CharSequence)Z.G)) {
            d2.a = ajJ.Y;
        }
        if (StringInvoker.a(string2, (CharSequence)Z.al)) {
            d2.a = ajJ.Z;
        }
        d2.i = axx_1.a(string3);
        if (ListInvoker.b() != null) {
            D2.b(new int[2]);
        }
        return d2;
    }

    private static IOException a(IOException iOException) {
        return iOException;
    }

    public static void c() throws IOException {
        File[] fileArray = zq_2.h(g);
        ListInvoker.clear(h);
        D2.b();
        ListInvoker.add(h, aPP.a());
        File[] fileArray2 = fileArray;
        int n = fileArray2.length;
        int n2 = 0;
        if (n2 < n) {
            File file = fileArray2[n2];
            if (StringInvoker.c(zq_2.j(file), Z.ac)) {
                aPP aPP2 = new aPP();
                aPP2.a(file);
                boolean cfr_ignored_0 = aPP2.f != null & aPP2.b != null;
            }
            ++n2;
        }
        if (a > ListInvoker.size(h) - 1) {
            a = ListInvoker.size(h) - 1;
        }
    }

    public static PB b(String string) {
        D2.b();
        int n = 0;
        if (n < ListInvoker.size(d)) {
            if (StringInvoker.d(((PB)ListInvoker.get(aPP.d, (int)n)).a, string)) {
                return (PB)ListInvoker.get(d, n);
            }
            ++n;
        }
        return null;
    }

    static {
        h = new ArrayList<aPP>();
        a = 0;
        d = new ArrayList<PB>();
    }

    public static aPP a() {
        aPP aPP2 = new aPP();
        aPP2.f = null;
        aPP2.b = Z.k;
        aPP2.c = Z.aj;
        aPP2.e = Z.f;
        return aPP2;
    }

    public void a(File file) throws IOException {
        String string;
        D2.b();
        this.f = zq_2.q(file);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(zq_2.j(file)));
        String string2 = auq_0.c(bufferedReader);
        if (StringInvoker.e(string2, Z.aE)) {
            string = string2;
            this.b = aPP.a(Z.ab, string);
        }
        if (StringInvoker.e(string2, Z.aT)) {
            string = string2;
            this.c = aPP.a(Z.V, string);
        }
        if (StringInvoker.e(string2, Z.Z)) {
            string = string2;
            this.e = aPP.a(Z.a4, string);
        }
        string2 = auq_0.c(bufferedReader);
        auq_0.a(bufferedReader);
    }
}

