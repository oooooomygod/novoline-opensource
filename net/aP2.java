/*
 * Decompiled with CFR 0.152.
 */
package net;

import net.aL0;
import net.aM3;
import net.afn_0;
import net.aqc_1;
import net.az9_0;
import net.ys_2;

public class aP2 {
    private static String c = "rljMVb";
    private int b;
    private int[] a;

    public void a(int n) {
        aP2.b();
        if (this.a != null && n >= 0 && n <= 15) {
            int n2 = 0;
            if (n2 < this.a.length) {
                if (this.a[n2] == n) {
                    return;
                }
                ++n2;
            }
            this.a = ys_2.a(this.a, n);
        }
    }

    public static void b(String string) {
        c = string;
    }

    public String toString() {
        return aL0.a(aL0.a(aL0.c(aL0.a(new StringBuilder(), aM3.b), this.b), aM3.a), ys_2.a(this.a)).toString();
    }

    public int[] c() {
        return this.a;
    }

    public aP2(int n) {
        this.b = -1;
        this.a = null;
        this.b = n;
    }

    public boolean a(int n, int n2) {
        aP2.b();
        return n != this.b ? false : az9_0.a(n2, this.a);
    }

    public int a() {
        return this.b;
    }

    public aP2(int n, int n2) {
        aP2.b();
        this.b = -1;
        this.a = null;
        this.b = n;
        if (n2 >= 0 && n2 <= 15) {
            this.a = new int[]{n2};
        }
    }

    static {
        if (aP2.b() == null) {
            aP2.b("rljMVb");
        }
    }

    public boolean a(afn_0 afn_02) {
        aP2.b();
        return afn_02.c() != this.b ? false : az9_0.a(aqc_1.a(afn_02), this.a);
    }

    public static String b() {
        return c;
    }

    public aP2(int n, int[] nArray) {
        this.b = -1;
        this.a = null;
        this.b = n;
        this.a = nArray;
    }
}

