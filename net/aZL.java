/*
 * Decompiled with CFR 0.152.
 */
package net;

import cc.novoline.invoke.MathInvoker;
import cc.novoline.invoke.StringInvoker;
import net.KM;
import net.aL0;
import net.aai_1;
import net.awr_0;
import net.qg_2;

public class aZL
implements Comparable {
    private boolean f;
    private static String d = "CL_00001055";
    private int g;
    private int a;
    private float e = 1.0f;
    private int b;
    private KM c;

    public int compareTo(Object object) {
        return this.a((aZL)object);
    }

    public int e() {
        return this.f ? aai_1.a((int)((float)this.a * this.e), this.g) : aai_1.a((int)((float)this.b * this.e), this.g);
    }

    public int a() {
        return this.f ? aai_1.a((int)((float)this.b * this.e), this.g) : aai_1.a((int)((float)this.a * this.e), this.g);
    }

    public aZL(KM kM, int n) {
        this.c = kM;
        this.b = qg_2.b(kM);
        this.a = qg_2.i(kM);
        this.g = n;
        this.f = aai_1.a(this.a, n) > aai_1.a(this.b, n);
    }

    public void c() {
        this.f = !this.f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1;
        char[] cArray = "v\u0013&\u001b\u0010GV\u0004oL\u001e".toCharArray();
        int n2 = 0;
        int n3 = 108;
        char[] cArray2 = cArray;
        int n4 = cArray.length;
        while (true) {
            n4 = n4;
            cArray2 = cArray2;
            int n5 = ++n2;
            int cfr_ignored_0 = n2 % 7;
            cArray2[n5] = (char)(cArray2[n5] ^ (n3 ^ 0x59));
            n3 = n3;
        }
    }

    public boolean d() {
        return this.f;
    }

    public void a(int n) {
        if (this.b > n && this.a > n) {
            this.e = (float)n / (float)MathInvoker.b(this.b, this.a);
        }
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.a(aL0.c(aL0.a(aL0.c(aL0.a(new StringBuilder(), awr_0.b), this.b), awr_0.c), this.a), awr_0.a), qg_2.g(this.c)), '}').toString();
    }

    public KM b() {
        return this.c;
    }

    public int a(aZL aZL2) {
        int n;
        if (this.a() == aZL2.a()) {
            if (this.e() == aZL2.e()) {
                if (qg_2.g(this.c) == null) {
                    return qg_2.g(aZL2.c) == null ? 0 : -1;
                }
                return StringInvoker.i(qg_2.g(this.c), qg_2.g(aZL2.c));
            }
            n = this.e() < aZL2.e() ? 1 : -1;
        } else {
            n = this.a() < aZL2.a() ? 1 : -1;
        }
        return n;
    }
}

